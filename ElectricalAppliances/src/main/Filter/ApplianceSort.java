package main.Filter;

import main.Models.BaseClass.Appliance;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used to sort list of appliances
 */
public class ApplianceSort {
    /**
     * Sort by ascending of power usage
     *
     * @param applianceList list of appliances to sort
     * @return sorted by ascending list
     */
    public static List<Appliance> sortListByPowerUsage(List<Appliance> applianceList) {
        List<Appliance> sortedList = applianceList.stream()
                .sorted(Comparator.comparingDouble(Appliance::getPowerUsage))
                .collect(Collectors.toList());
        return sortedList;
    }

}
