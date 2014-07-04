/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import domain.GalaxyTablet;
import domain.NexusTablet;
import domain.Tablet;
import domain.iPadTablet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;

/**
 *
 * @author Lei
 */
public class MP1Driver {
    private static final int MAX_OBJECTS = 20;//Constants for the number of all tablet objects
    private static final int MAX_TYPES = 3;//Constants for the number of all type tablets
    private static final int NUMBER_OF_MODELS = 10;//Constants for the number of tablet models
    private static String[] types = {"iPadTablet", "GalaxyTablet", "NexusTablet"};
    private static Tablet[] tablets = new Tablet[20];
    //String array for iPad product information
    private static String[] iPads = {"Apple\t,MC769LL/A,9.7,16,true,true,1.3,417.98",  
        "Apple\t,MC705LL/A,9.7,16,true,true,1.4,515.00",
        "Apple\t,MB292LL/A,9.7,16,true,true,1.5,459.00",
        "Apple\t,MC979LL/A,9.7,16,true,true,1.3,414.00",
        "Apple\t,MC706LL/A,9.7,32,true,true,1.4,575.00",
        "Apple\t,MD329LL/A,9.7,32,true,true,1.4,580.00",
        "Apple\t,MC916LL/A,9.7,64,true,true,1.3,549.99",
        "Apple\t,MC926LL/A,9.7,64,true,true,1.3,548.99",
        "Apple\t,MC707LL/A,9.7,64,true,true,1.4,710.00",
        "Apple\t,MC980LL/A,9.7,8,true,true,2.0,547.99"};
    //String array for GalaxyPad product information
    private static String[] GalaxyPads = {"Samsung\t,GT-P3113TSYXAR,7.0,8,true,true,1.5,210.00", 
        "Samsung\t,GT-P5113\t,10.1,16,true,true,1.3,399.00",
        "Samsung\t,GT-P6210\t,7.0,16,true,true,0.8,205.99",
        "Samsung\t,GT-P7500\t,10.1,16,true,true,1.2,595.00",
        "Samsung\t,GT-N8013\t,10.3,32,true,true,1.3,499.99",
        "Samsung\t,GT-N8013\t,10.3,32,true,true,1.31,549.99",
        "Samsung\t,GT-P5113\t,10.1,16,true,true,1.28,399.99",
        "Samsung\t,GT-P3113\t,7.6,8,true,false,0.76,249.99",
        "Samsung\t,GT-P3021\t,7.8,16,true,ture,1.2,313.98",
        "Samsung\t,GT-N7077\t,10.2,32,true,true,1.3,545.00"};
    //String array for NexusPad product information
    private static String[] NexusPads = {"Google\t,Nexus7\t,7.81,16,true,true,0.8,273.80",
        "Google\t,Nexus7\t,7.0,16,true,true,0.8,237.00",
        "Google\t,Nexus7\t,7.2,32,true,true,1.2,454.00",
        "Google\t,Nexus7\t,7.2,8,true,true,1.2,254.00",
        "Google\t,Nexus7\t,10.1,32,true,true,1.2,654.00",
        "Google\t,Nexus7\t,9.2,32,true,true,1.2,464.00",
        "Google\t,Nexus7\t,7.6,32,true,true,1.2,484.00",
        "Google\t,Nexus7\t,8.5,16,true,true,1.2,354.00",
        "Google\t,Nexus7\t,9.2,32,true,true,1.2,424.00",
        "Google\t,Nexus7\t,10.1,32,true,true,1.3,674.00"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 0; i < MAX_OBJECTS; i++) {
            Random random = new Random();
            int index = random.nextInt(MAX_TYPES);
            String type = types[index];
            switch (type) {
                case "iPadTablet": {
                    int iPadModelIndex = random.nextInt(NUMBER_OF_MODELS);//Select one random model from the 10 iPad models
                    String[] iPadDetails = iPads[iPadModelIndex].split(",");//Split product specifications in the array
                    String manufacturer = iPadDetails[0];
                    String modelNumber = iPadDetails[1];
                    double displaySize = Double.parseDouble(iPadDetails[2]);
                    short memory = Short.parseShort(iPadDetails[3]);
                    boolean hasWifi = Boolean.parseBoolean(iPadDetails[4]);
                    boolean hasMobileCarrier = Boolean.parseBoolean(iPadDetails[5]);
                    float weight = Float.parseFloat(iPadDetails[6]);
                    float cost = Float.parseFloat(iPadDetails[7]);
                    //Pass the specifications to the full-arg constructor
                    tablets[i] = new iPadTablet(manufacturer, modelNumber, displaySize, memory, hasWifi, hasMobileCarrier, weight, cost);
                    break;
                }
                case "GalaxyTablet": {
                    int GalaxyPadIndex = random.nextInt(NUMBER_OF_MODELS);//Select one random model from the 10 GalaxyPad models
                    String[] GalaxyPadDetails = GalaxyPads[GalaxyPadIndex].split(",");//Split product specifications in the array
                    String manufacturer = GalaxyPadDetails[0];
                    String modelNumber = GalaxyPadDetails[1];
                    double displaySize = Double.parseDouble(GalaxyPadDetails[2]);
                    short memory = Short.parseShort(GalaxyPadDetails[3]);
                    boolean hasWifi = Boolean.parseBoolean(GalaxyPadDetails[4]);
                    boolean hasMobileCarrier = Boolean.parseBoolean(GalaxyPadDetails[5]);
                    float weight = Float.parseFloat(GalaxyPadDetails[6]);
                    float cost = Float.parseFloat(GalaxyPadDetails[7]);
                    //Pass the specifications to the full-arg constructor
                    tablets[i] = new GalaxyTablet(manufacturer, modelNumber, displaySize, memory, hasWifi, hasMobileCarrier, weight, cost);
                    break;
                }
                case "NexusTablet": {
                    int NexusPadIndex = random.nextInt(NUMBER_OF_MODELS);//Select one random model from the 10 NexusPad models
                    String[] NexusPadDetails = NexusPads[NexusPadIndex].split(",");//Split product specifications in the array
                    String manufacturer = NexusPadDetails[0];
                    String modelNumber = NexusPadDetails[1];
                    double displaySize = Double.parseDouble(NexusPadDetails[2]);
                    short memory = Short.parseShort(NexusPadDetails[3]);
                    boolean hasWifi = Boolean.parseBoolean(NexusPadDetails[4]);
                    boolean hasMobileCarrier = Boolean.parseBoolean(NexusPadDetails[5]);
                    float weight = Float.parseFloat(NexusPadDetails[6]);
                    float cost = Float.parseFloat(NexusPadDetails[7]);
                    //Pass the specifications to the full-arg constructor
                    tablets[i] = new NexusTablet(manufacturer, modelNumber, displaySize, memory, hasWifi, hasMobileCarrier, weight, cost);
                    break;
                }
                default:
                    break;
            }
        }
        
        System.out.println("-Test Result");
        System.out.printf("\n\n");
        System.out.println("->Display all the tablets");
        System.out.println();
        //Using toString() method to print out the product details for all 20 tablets
        System.out.printf("%12s %25s %21s %18s %8s %9s %18s %8s %7s", "TabletName","Manufacturer","ModelNumber","DisplaySize","Memory","hasWifi","hasMobileCarrier","Weight","Cost");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (Tablet t : tablets) {
           System.out.println(t.toString());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        //Finding out the numbers of each tablet types
        String numberOfCreatedTabletTypes = tablets[0].findNumberOfCreatedTabletTypes(tablets);
        System.out.println(numberOfCreatedTabletTypes);
        //Finding out the largest tablet
        String largestTablet = tablets[0].findLargestDisplayTablet(tablets);
        System.out.println(largestTablet);
        //Finding out the lowest cost tablet
        String lowestCostTablet = tablets[0].findLowestCostTablet(tablets);
        System.out.println(lowestCostTablet);
        //Finding out the lighest weight tablet
        String lightestWeightTablet = tablets[0].findLightestWeightTabletType(tablets);
        System.out.println(lightestWeightTablet);
    }
}
