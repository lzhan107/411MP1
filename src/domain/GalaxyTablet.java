/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lei
 */
public class GalaxyTablet extends Tablet{
    public static int galaxyTabletCounter = 0;

    /**
     * No-arg constructor
     */
    public GalaxyTablet() {
        ++galaxyTabletCounter;
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
    public GalaxyTablet(String manufacturer, String modelNumber, double displaySize, short memory, boolean hasWifi, boolean hasMobileCarrier, float weight, float cost){
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.displaySize = displaySize;
        this.memory = memory;
        this.hasWifi = hasWifi;
        this.hasMobileCarrier = hasMobileCarrier;
        this.weight = weight;
        this.cost = cost;
        ++galaxyTabletCounter;
    }

    @Override
    public String toString() {
        return "GalaxyTablet,\t" + super.toString() + "\n";
    }
    
    /**
     * This method will get the number of GalaxyTablets created
     * @return 
     */
    public static int getGalaxyTabletCounter(){
        return galaxyTabletCounter;
    }
}
