package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class Toaster extends Appliance implements ISwitchable {
    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public Toaster(String brandName, double price, String colour, double powerUsage,
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
        return isSwitchedOn();
    }

}
