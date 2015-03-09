package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rules {
    private List<CardinalityRule> cardinalityRules;
    private List<ConnectionRule> connectionRules;
    private List<ContainmentRule> containmentRules;
    private List<MorphingRule> morphingRules;
    private List<LayoutRule> layoutRules;
    public List<CardinalityRule> getCardinalityRules() {
        return cardinalityRules;
    }
    public void setCardinalityRules(List<CardinalityRule> cardinalityRules) {
        this.cardinalityRules = cardinalityRules;
    }
    public List<ConnectionRule> getConnectionRules() {
        return connectionRules;
    }
    public void setConnectionRules(List<ConnectionRule> connectionRules) {
        this.connectionRules = connectionRules;
    }
    public List<ContainmentRule> getContainmentRules() {
        return containmentRules;
    }
    public void setContainmentRules(List<ContainmentRule> containmentRules) {
        this.containmentRules = containmentRules;
    }
    public List<MorphingRule> getMorphingRules() {
        return morphingRules;
    }
    public void setMorphingRules(List<MorphingRule> morphingRules) {
        this.morphingRules = morphingRules;
    }
    public List<LayoutRule> getLayoutRules() {
        return layoutRules;
    }
    public void setLayoutRules(List<LayoutRule> layoutRules) {
        this.layoutRules = layoutRules;
    }

}
