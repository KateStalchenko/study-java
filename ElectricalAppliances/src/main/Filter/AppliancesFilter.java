package main.Filter;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used to filter Appliances with specified parameters
 */
public class AppliancesFilter {
    private Boolean isSwitchedOn;
    private String brandName;
    private String colour;
    private Double price;
    private Double powerUsage;
    private SizeClassification size;
    private PowerType powerType;
    private Location location;

    private AppliancesFilter() {
    }

    /**
     * Builder is used to create object of ApplianceFilter class with specified filter parameters
     */
    public static class Builder {
        private AppliancesFilter filter;

        public Builder() {
            filter = new AppliancesFilter();
        }

        public AppliancesFilter build() {
            return filter;
        }

        public Builder withSwitchedState(boolean isSwitchedOnState) {
            filter.isSwitchedOn = isSwitchedOnState;
            return this;
        }

        public Builder withBrandName(String name) {
            filter.brandName = name;
            return this;
        }

        public Builder withColour(String objectColour) {
            filter.colour = objectColour;
            return this;
        }

        public Builder withPrice(double objectPrice) {
            filter.price = objectPrice;
            return this;
        }

        public Builder withPowerUsage(double objectPowerUsage) {
            filter.powerUsage = objectPowerUsage;
            return this;
        }

        public Builder withSizeClassification(SizeClassification objectSize) {
            filter.size = objectSize;
            return this;
        }

        public Builder withPowerType(PowerType objectPowerType) {
            filter.powerType = objectPowerType;
            return this;
        }

        public Builder withLocation(Location objectLocation) {
            filter.location = objectLocation;
            return this;
        }
    }

    /**
     * Filter List of Appliances according to specified filter parameters
     * @param appliances List of Appliances
     * @return filtered List
     */
    public List<Appliance> filter(List<Appliance> appliances) {
        appliances = filterByName(appliances);
        appliances = filterByPrice(appliances);
        appliances = filterByColour(appliances);
        appliances = filterByPowerUsage(appliances);
        appliances = filterByPowerType(appliances);
        appliances = filterBySize(appliances);
        appliances = filterByLocation(appliances);
        appliances = filterBySwitchedState(appliances);
        return appliances;
    }

    private List<Appliance> filterByName(List<Appliance> appliances) {
        if (brandName == null || brandName.isEmpty()) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getBrandName().contains(brandName))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterByPrice(List<Appliance> appliances) {
        if (price == null || price.isNaN()) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getPrice().equals(price))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterByColour(List<Appliance> appliances) {
        if (colour == null || colour.isEmpty()) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getColour().contains(colour))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterByPowerUsage(List<Appliance> appliances) {
        if (powerUsage == null || powerUsage.isNaN()) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getPowerUsage().equals(powerUsage))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterByPowerType(List<Appliance> appliances) {
        if (powerType == null) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getPowerType().equals(powerType))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterBySize(List<Appliance> appliances) {
        if (size == null) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getSize().equals(size))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterByLocation(List<Appliance> appliances) {
        if (location == null) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance.getLocation().equals(location))
                .collect(Collectors.toList());
    }

    private List<Appliance> filterBySwitchedState(List<Appliance> appliances) {
        if (isSwitchedOn == null) {
            return appliances;
        }
        return appliances.stream()
                .filter(appliance -> appliance instanceof ISwitchable &&
                        ((ISwitchable) appliance).getState() == isSwitchedOn)
                .collect(Collectors.toList());
    }
}