package main.Models.BaseClass;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;

/**
 * Base class for all appliances with basic info on it
 */
public abstract class Appliance {
    private String brandName;
    private Double price;
    private String colour;
    private Double powerUsage;
    private SizeClassification size;
    private PowerType powerType;
    private Location location;

    public String getBrandName() {
        return brandName;
    }

    public Double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Double getPowerUsage() {
        return powerUsage;
    }

    public SizeClassification getSize() {
        return size;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public Location getLocation() {
        return location;
    }

    public Appliance(String brandName, double price, String colour, double powerUsage,
                     SizeClassification size, PowerType powerType, Location location) {
        verify(price);
        verify(powerUsage);
        this.brandName = brandName;
        this.price = price;
        this.colour = colour;
        this.powerUsage = powerUsage;
        this.size = size;
        this.powerType = powerType;
        this.location = location;
    }

    private void verify(double value){
        if (value < 0) {
            throw new IllegalArgumentException(value + " is invalid value! It must be greater than 0 .");
        }
    }

}
