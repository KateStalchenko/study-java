package main.Home;

import main.Models.BaseClass.Appliance;
import java.util.ArrayList;
import java.util.List;

/**
 * Used to store and menage appliances in home
 */
public class Home {
    private List<Appliance> applianceList = new ArrayList<>();

    public void AddAppliance(Appliance appliance) {
        applianceList.add(appliance);
    }

    public void AddListAppliances(List<Appliance> applianceList) {
        this.applianceList.addAll(applianceList);
    }

    public List<Appliance> getListAppliances() {
        return applianceList;
    }

    /**
     * Calculates total power usage by all appliances in home
     * @return total power usage by all appliances in home
     */
    public double GetTotalPowerUsage() {
        double totalPower = 0;
        for (Appliance appl : applianceList) {
            totalPower += appl.getPowerUsage();
        }
        return totalPower;
    }


}
