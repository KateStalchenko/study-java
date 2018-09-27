package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class ElectricKettle extends Appliance implements ISwitchable {
    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public ElectricKettle(String brandName, double price, String colour, double powerUsage,
                          SizeClassification size, PowerType powerType,
                          Location location, boolean switchedOn) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        this.switchedOn = switchedOn;
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
