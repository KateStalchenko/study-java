package main;

import main.Enums.Location;
import main.Filter.AppliancesFilter;
import main.Home.AppliancesMock;
import main.Home.Home;
import main.Models.BaseClass.Appliance;
import main.Filter.ApplianceSort;

import java.util.List;

/**
 * Examples of filtering, sorting and managing appliances
 */

public class Main {
    public static void main(String[] args) {
        Home myHome = new Home();
        myHome.AddListAppliances(AppliancesMock.GetAppliances());
        List<Appliance> myAppliances = myHome.getListAppliances();

        double totalPowerUsage = myHome.GetTotalPowerUsage();

        List<Appliance> sortedListByPowerUsage = ApplianceSort.sortListByPowerUsage(myAppliances);

        AppliancesFilter filter = new AppliancesFilter.Builder()
                .withLocation(Location.kitchen)
                .withSwitchedState(true)
                .build();
        List<Appliance>  applianceSorted = filter.filter(myAppliances);
    }
}
