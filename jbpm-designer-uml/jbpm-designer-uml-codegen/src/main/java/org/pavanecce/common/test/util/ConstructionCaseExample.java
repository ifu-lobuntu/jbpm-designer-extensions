package org.pavanecce.common.test.util;

import java.io.IOException;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.jbpm.designer.uml.codegen.util.NameConverter;

public class ConstructionCaseExample  implements UmlExample{
	private String testName;
	private Class roomPlan;
	private Class wallPlan;
	private Class wall;
	private Class housePlan;
	private Class house;
	private Class constructionCase;
	private Enumeration houseStatus;
	private ResourceSet rst;
	private Model primitiveTypes;
	private Model simpleTypes;
	private Class roofPlan;
	private Model model;

	public static enum Multiplicity {
		ZERO_OR_ONE(0, 1), ONE(1, 1), ZERO_OR_MANY(0, -1);
		int lower;
		int upper;

		private Multiplicity(int lower, int upper) {
			this.lower = lower;
			this.upper = upper;
		}
	}

	public static final Multiplicity ZERO_OR_ONE = Multiplicity.ZERO_OR_ONE;
	public static final Multiplicity ZERO_OR_MANY = Multiplicity.ZERO_OR_MANY;
	public static final Multiplicity ONE = Multiplicity.ONE;

	public ConstructionCaseExample(String name) {
		this.testName = name;
		rst = new ResourceSetImpl();
		new ClassDiagramProfileImpl().prepareResourceSet(rst);
		Resource r = rst.createResource(URI.createFileURI("tmp.uml"));
		setModel(UMLFactory.eINSTANCE.createModel());
		getModel().setName("test");
		r.getContents().add(getModel());
        primitiveTypes = (Model) rst.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), true).getContents().get(0);
        simpleTypes = (Model) rst.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), true).getContents().get(0);
		createConstructionCase();
		house = (Class) getModel().createOwnedType("House", UMLPackage.eINSTANCE.getClass_());
		createOneToOne(constructionCase, house, AggregationKind.COMPOSITE_LITERAL, true);
		housePlan = (Class) getModel().createOwnedType("HousePlan", UMLPackage.eINSTANCE.getClass_());
		house.createOwnedAttribute("description", primitiveTypes.getOwnedType("String"));
		roofPlan = (Class) getModel().createOwnedType("RoofPlan", UMLPackage.eINSTANCE.getClass_());
		createOneToOne(constructionCase, housePlan, AggregationKind.COMPOSITE_LITERAL, true);
		createOneToOne(housePlan, roofPlan, AggregationKind.COMPOSITE_LITERAL, false);
		createOneToOne(house, roofPlan, AggregationKind.NONE_LITERAL, false);
		wall = (Class) getModel().createOwnedType("Wall", UMLPackage.eINSTANCE.getClass_());
		createOneToMany(house, wall, CollectionKind.SET_LITERAL, AggregationKind.COMPOSITE_LITERAL);
		wallPlan = (Class) getModel().createOwnedType("WallPlan", UMLPackage.eINSTANCE.getClass_());
		wallPlan.createOwnedAttribute("shortDescription", primitiveTypes.getOwnedType("String"));
		roofPlan.createOwnedAttribute("shortDescription", primitiveTypes.getOwnedType("String"));
		createOneToOne(wallPlan, wall, AggregationKind.NONE_LITERAL, false);
		createOneToMany(housePlan, wallPlan, CollectionKind.SET_LITERAL, AggregationKind.COMPOSITE_LITERAL);
		createOneToMany(house, wallPlan, CollectionKind.SET_LITERAL, AggregationKind.NONE_LITERAL);
		roomPlan = (Class) getModel().createOwnedType("RoomPlan", UMLPackage.eINSTANCE.getClass_());
		roomPlan.createOwnedAttribute("name", primitiveTypes.getOwnedType("String"));
		createOneToMany(housePlan, roomPlan, CollectionKind.SET_LITERAL, AggregationKind.COMPOSITE_LITERAL);
		createManyToMany(roomPlan, wallPlan, CollectionKind.SET_LITERAL);
		houseStatus = (Enumeration) getModel().createOwnedEnumeration("HouseStatus");
		houseStatus.createOwnedAttribute("exists", primitiveTypes.getOwnedType("Boolean"));
		houseStatus.createOwnedAttribute("sequence", primitiveTypes.getOwnedType("Integer"));
		createHouseStatusLiteral("Planned", false, 1);
		createHouseStatusLiteral("InProgress", true, 2);
		createHouseStatusLiteral("Finished", true, 3);
		house.createOwnedAttribute("status", houseStatus).setLower(0);
		try {
			getModel().eResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createHouseStatusLiteral(String name, boolean exists, int sequence) {
		EnumerationLiteral lit = houseStatus.createOwnedLiteral(name);
		Slot sequenceSlot = lit.createSlot();
		sequenceSlot.setDefiningFeature(houseStatus.getOwnedAttribute("sequence", null));
		LiteralInteger sequenceValue = UMLFactory.eINSTANCE.createLiteralInteger();
		sequenceValue.setValue(sequence);
		sequenceSlot.getValues().add(sequenceValue);
		Slot existsSlot = lit.createSlot();
		existsSlot.setDefiningFeature(houseStatus.getOwnedAttribute("exists", null));
		LiteralBoolean existsValue = UMLFactory.eINSTANCE.createLiteralBoolean();
		existsValue.setValue(exists);
		existsSlot.getValues().add(existsValue);
	}

	protected void createConstructionCase() {
		constructionCase = (Class) getModel().createOwnedType("ConstructionCase", UMLPackage.eINSTANCE.getClass_());
		constructionCase.createOwnedAttribute("name", primitiveTypes.getOwnedType("String"));
		Property startDate = constructionCase.createOwnedAttribute("startDate", simpleTypes.getOwnedType("DateTime"));
		startDate.setLower(0);
		;
		Property isActive = constructionCase.createOwnedAttribute("active", primitiveTypes.getOwnedType("Boolean"));
		isActive.setLower(0);
		;
		Property numberOfWalls = constructionCase.createOwnedAttribute("numberOfWalls", primitiveTypes.getOwnedType("Integer"));
		numberOfWalls.setLower(0);
		Property pricePerSquareMetre = constructionCase.createOwnedAttribute("pricePerSquareMetre", primitiveTypes.getOwnedType("Double"));
		pricePerSquareMetre.setLower(0);
		Property picture = constructionCase.createOwnedAttribute("picture", simpleTypes.getOwnedType("Base64Binary"));
		picture.setLower(0);
	}

	public Class getConstructionCase() {
		return constructionCase;
	}

	private void createOneToMany(Class from, Class to, CollectionKind collectionKind, AggregationKind aggregationKind) {
		createAssociation(from, to, collectionKind, aggregationKind, aggregationKind == AggregationKind.COMPOSITE_LITERAL ? ONE : ZERO_OR_ONE, ZERO_OR_MANY);
	}

	private void createManyToMany(Class from, Class to, CollectionKind collectionKind) {
		createAssociation(from, to, collectionKind, AggregationKind.NONE_LITERAL, ZERO_OR_MANY, ZERO_OR_MANY);
	}

	private void createOneToOne(Class from, Class to, AggregationKind aggregationKind, boolean required) {
		createAssociation(from, to, CollectionKind.SET_LITERAL, aggregationKind, aggregationKind == AggregationKind.COMPOSITE_LITERAL ? ONE : ZERO_OR_ONE,
				required ? ONE : ZERO_OR_ONE);

	}

	protected void createAssociation(Class from, Class to, CollectionKind collectionKind, AggregationKind aggregationKind, Multiplicity fromMultiplicity,
			Multiplicity toMultiplicity) {
		Association ass = (Association) from.getPackage().createOwnedType(from.getName() + to.getName(), UMLPackage.eINSTANCE.getAssociation());
		Property toEnd = ass.createNavigableOwnedEnd(calcName(to, toMultiplicity), to);
		toEnd.setUpper(toMultiplicity.upper);
		toEnd.setLower(toMultiplicity.lower);
		toEnd.setAggregation(aggregationKind);
		toEnd.setIsUnique(collectionKind == CollectionKind.SET_LITERAL || collectionKind == CollectionKind.ORDERED_SET_LITERAL);
		toEnd.setIsOrdered(collectionKind == CollectionKind.SEQUENCE_LITERAL || collectionKind == CollectionKind.ORDERED_SET_LITERAL);
		Property fromEnd = ass.createNavigableOwnedEnd(calcName(from, fromMultiplicity), from);
		fromEnd.setUpper(fromMultiplicity.upper);
		fromEnd.setLower(fromMultiplicity.lower);
	}

	protected String calcName(Class to, Multiplicity toMultiplicity) {
		String name = NameConverter.decapitalize(to.getName());
		if (toMultiplicity == ZERO_OR_MANY) {
			name = name + "s";
		}
		return name;
	}




	public Class getRoomPlans() {
		return roomPlan;
	}

	public Class getWallPlans() {
		return wallPlan;
	}

	public Class getWall() {
		return wall;
	}

	public Class getHousePlan() {
		return housePlan;
	}

	public Class getHouse() {
		return house;
	}

	public String getTestName() {
		return this.testName;
	}

	public Classifier getType(String string) {
		TreeIterator<Notifier> allContents = rst.getAllContents();
		while (allContents.hasNext()) {
			Notifier notifier = allContents.next();
			if (notifier instanceof Classifier && ((Classifier) notifier).getName().equals(string)) {
				return (Classifier) notifier;
			}
		}
		return null;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}