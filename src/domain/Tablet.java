/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


/**
 *
 * @author Lei
 */
public abstract class Tablet implements TabletRelatable {
    protected String manufacturer;
    protected String modelNumber;
    protected double displaySize;
    protected short memory;
    protected boolean hasWifi;
    protected boolean hasMobileCarrier;
    protected float weight;
    protected float cost;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public short getMemory() {
        return memory;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public boolean isHasMobileCarrier() {
        return hasMobileCarrier;
    }

    public float getWeight() {
        return weight;
    }

    public float getCost() {
        return cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public void setMemory(short memory) {
        this.memory = memory;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setHasMobileCarrier(boolean hasMobileCarrier) {
        this.hasMobileCarrier = hasMobileCarrier;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * This method receives an array of tablets, and returns the tablet with the largest displaySize
     * @param tablets
     * @return 
     */
    @Override
    public String findLargestDisplayTablet(Tablet[] tablets) {
        int indexOfLargest = 0;
        double largest = 0.0;
        for (int i = 1; i < tablets.length; i++) {
            if (tablets[i].getDisplaySize() > largest) {
                largest = tablets[i].getDisplaySize();
                indexOfLargest = i;
            }
        }
        return "->The largest tablet is: " + tablets[indexOfLargest].getModelNumber() + ", and it's size is " + tablets[indexOfLargest].getDisplaySize()+" inches";
    }

    /**
     * This method receives an array of tablets, and returns the tablet with the lowest cost
     * @param tablets
     * @return 
     */
    @Override
    public String findLowestCostTablet(Tablet[] tablets) {
        int indexOfLowest = 0;
        float lowest = tablets[0].getCost();
        for (int i = 1; i < tablets.length; i++) {
            if (tablets[i].getCost() < lowest) {
                lowest = tablets[i].getCost();
                indexOfLowest = i;
            }
        }
        return "->The lowest cost tablet is: " + tablets[indexOfLowest].getModelNumber() + ", and it's cost is " + tablets[indexOfLowest].getCost()+" dollars";
    }

    /**
     * This method receives an array of tablets, and returns the numbers of tablets for each type
     * @param tablets
     * @return 
     */
    @Override
    public String findNumberOfCreatedTabletTypes(Tablet[] tablets) {
        return "->The number of iPadTablet is " + iPadTablet.getiPadTabletCounter() + "   "
                + "The number of GalaxyTablet is " + GalaxyTablet.getGalaxyTabletCounter() + "   "
                + "The number of NexusTablet is " + NexusTablet.getNexusTablet();
    }

    /*
     * This method receives an array of tablets, and returns the tablet with the lighest weight
     */
    @Override
    public String findLightestWeightTabletType(Tablet[] tablets) {
        int indexOfLighest = 0;
        float lighest = tablets[0].getWeight();
        for (int i = 1; i < tablets.length; i++) {
            if (tablets[i].getWeight() < lighest) {
                lighest = tablets[i].getWeight();
                indexOfLighest = i;
            }
        }
        return "->The lightest weight tablet is " + tablets[indexOfLighest].getModelNumber() + ", and it's weight is " + tablets[indexOfLighest].getWeight()+ " pounds";
    }

    @Override
    public String toString() {
        return "  "+manufacturer + "\t" + modelNumber + "\t" + displaySize + "\t" + memory + "\t" + hasWifi + "\t" + hasMobileCarrier + "\t" + weight + "\t" + cost;
    }
}
