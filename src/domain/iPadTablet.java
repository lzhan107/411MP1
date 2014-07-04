/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lei
 */
public class iPadTablet extends Tablet{
    private static int iPadTabletCounter = 0;

    /**
     * No-arg constructor
     */
    public iPadTablet() {
        ++iPadTabletCounter;
    }
    
    /**
     * Full-arg constructor
     * @param manufacturer
     * @param modelNumber
     * @param displaySize
     * @param memory
     * @param hasWifi
     * @param hasMobileCarrier
     * @param weight
     * @param cost 
     */
    public iPadTablet(String manufacturer, String modelNumber, double displaySize, short memory, boolean hasWifi, boolean hasMobileCarrier, float weight, float cost){
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.displaySize = displaySize;
        this.memory = memory;
        this.hasWifi = hasWifi;
        this.hasMobileCarrier = hasMobileCarrier;
        this.weight = weight;
        this.cost = cost;
        ++iPadTabletCounter;
    }

    @Override
    public String toString() {
        return "iPadTablet\t" + super.toString() + "\n";
    }
    
    /**
     * This method will get the number of iPadTablets created
     * @return 
     */
    public static int getiPadTabletCounter(){
        return iPadTabletCounter;
    }
}
