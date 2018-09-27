package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class WashingMachine extends Appliance implements ISwitchable {
    private boolean switchedOn;
    private int peakLoad;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public int getPeakLoad() {
        return peakLoad;
    }

    public WashingMachine(String brandName, double price, String colour, double powerUsage,
                          SizeClassification size, PowerType powerType,
                          Location location, boolean switchedOn, int peakLoad) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        this.switchedOn = switchedOn;
        this.peakLoad = peakLoad;
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
