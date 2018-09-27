package main.Home;

import main.Enums.DisplayTechnology;
import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Models.Appliances.*;
import main.Models.BaseClass.Appliance;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides with ready appliances data
 */
public class AppliancesMock {
    private static AcousticSystem acousticSystem = new AcousticSystem("SoundLG", 250, "black",
            17, SizeClassification.smallAppliances, PowerType.wire, Location.livingroom,
            20, true);
    private static Computer computer = new Computer("Asus", 2560, "black", 300,
            SizeClassification.smallAppliances, PowerType.wire, Location.hall, true, 5);
    private static ElectricCooker electricCooker = new ElectricCooker("Indesit", 3520, "grey",
            500, SizeClassification.majorAppliances, PowerType.wire, Location.kitchen,
            false, 0);
    private static ElectricKettle electricKettle = new ElectricKettle("Viva", 23, "white",
            25, SizeClassification.smallAppliances, PowerType.wire, Location.kitchen, true);
    private static HairDryer hairDryer = new HairDryer("Raventa", 243.21, "red", 21,
            SizeClassification.smallAppliances, PowerType.wire, Location.bathroom, false, 0);
    private static Microwave microwave = new Microwave("Atlant", 65.90, "white", 245,
            SizeClassification.smallAppliances, PowerType.wire, Location.kitchen, true);
    private static Refrigerator refrigerator = new Refrigerator("LG", 1203, "red", 256,
            SizeClassification.majorAppliances, PowerType.wire, Location.kitchen, 350, 6,
            true);
    private static Toaster toaster = new Toaster("Raymond", 25, "black", 100,
            SizeClassification.smallAppliances, PowerType.wire, Location.kitchen, false);
    private static TvSet tvSet = new TvSet("Samsung", 1300, "black", 268,
            SizeClassification.majorAppliances, PowerType.wire, Location.livingroom, DisplayTechnology.OLED,
            true, 29);
    private static WashingMachine washingMachine = new WashingMachine("LG", 1900, "white",
            420, SizeClassification.majorAppliances, PowerType.wire, Location.bathroom,
            false, 10);

    static public List<Appliance> GetAppliances() {
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(acousticSystem);
        appliances.add(computer);
        appliances.add(electricCooker);
        appliances.add(electricKettle);
        appliances.add(hairDryer);
        appliances.add(microwave);
        appliances.add(refrigerator);
        appliances.add(toaster);
        appliances.add(tvSet);
        appliances.add(washingMachine);
        return appliances;
    }
}
