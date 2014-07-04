/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lei
 */
public class NexusTablet extends Tablet{
    public static int nexusTabletCounter = 0;

    /**
     * No-arg constructor
     */
    public NexusTablet() {
        ++nexusTabletCounter;
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
    public NexusTablet(String manufacturer, String modelNumber, double displaySize, short memory, boolean hasWifi, boolean hasMobileCarrier, float weight, float cost){
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.displaySize = displaySize;
        this.memory = memory;
        this.hasWifi = hasWifi;
        this.hasMobileCarrier = hasMobileCarrier;
        this.weight = weight;
        this.cost = cost;
        ++nexusTabletCounter;
    }

    @Override
    public String toString() {
        return "NexusTablet,\t" + super.toString() + "\n";
    }
    
    /**
     * This method will get the number of NexusTablets created
     * @return 
     */
    public static int getNexusTablet(){
        return nexusTabletCounter;
    }
}
