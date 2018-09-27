package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class ElectricCooker extends Appliance implements ISwitchable{
    private boolean switchedOn;
    private int temperature;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public ElectricCooker(String brandName, double price, String colour, double powerUsage,
                          SizeClassification size, PowerType powerType,
                          Location location, boolean switchedOn, int temperature) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        verifyTemperature(temperature);
        this.switchedOn = switchedOn;
        this.temperature = temperature;
    }

    private final int MinTemperature = 0;
    private final int MaxTemperature = 6;

    private void verifyTemperature(int temperature) {
        if (temperature < MinTemperature || temperature > MaxTemperature) {
            throw new IllegalArgumentException(temperature + String.format(" is invalid value! It must be greater than %d and less than %d.", MinTemperature, MaxTemperature));
        }
    }

    @Override
    public void setStateOn(boolean isTurnedOn) {
        switchedOn = isTurnedOn;
    }

    @Override
    public boolean getState() {
        return switchedOn;
    }
}
