/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lei
 */
public interface TabletRelatable {
    public String findLargestDisplayTablet(Tablet[] tablets);
    public String findLowestCostTablet(Tablet[] tablets);
    public String findNumberOfCreatedTabletTypes(Tablet[] tablets);
    public String findLightestWeightTabletType(Tablet[] tablets);
}
