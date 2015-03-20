package org.jbpm.designer.uml.codegen.util.emulated;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.uml.codegen.util.EmfAssociationUtil;
import org.jbpm.designer.uml.codegen.util.EmfWorkspace;

public class AssociationClassToEnd extends AbstractEmulatedProperty {
	private Property property;
	private EndToAssociationClass otherEnd;

	public AssociationClassToEnd(Property property) {
		super(property.getAssociation(), property);
		this.property = property;
	}

	@Override
	public boolean isComposite() {
		return property.isComposite();
	}

	@Override
	public boolean isNavigable() {
		return true;
	}

	@Override
	public int getUpper() {
		return 1;
	}

	@Override
	public int getLower() {
		return 1;
	}

	@Override
	public String getName() {
		if (property.getAssociation().getMemberEnds().indexOf(property) == 1 && property.getName().equals(property.getOtherEnd().getName())) {
			return property.getName() + "1";
		}
		return property.getName();
	}

	@Override
	public boolean isOrdered() {
		return false;
	}

	@Override
	public boolean isUnique() {
		return true;
	}

	@Override
	public Type getType() {
		return property.getType();
	}

	public String getId() {
		return EmfWorkspace.getId(property.getAssociation()) + "@" + EmfWorkspace.getId(property);
	}

	public boolean shouldEmulate() {
		return EmfAssociationUtil.isClass(property.getAssociation());
	}

	public void setOtherEnd(EndToAssociationClass otherEnd) {
		this.otherEnd = otherEnd;
	}

	@Override
	public EndToAssociationClass getOtherEnd() {
		return otherEnd;
	}

	public Property getOriginalProperty() {
		return property;
	}

}
