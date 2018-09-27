package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class HairDryer extends Appliance implements ISwitchable {
    private boolean switchedOn;
    private int power;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public int getPower() {
        return power;
    }

    public HairDryer(String brandName, double price, String colour, double powerUsage,
                     SizeClassification size, PowerType powerType,
                     Location location, boolean switchedOn, int power) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        this.switchedOn = switchedOn;
        this.power = power;
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
