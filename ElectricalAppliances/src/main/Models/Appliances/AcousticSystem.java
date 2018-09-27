package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Interfaces.IVolumeChanger;
import main.Models.BaseClass.Appliance;

public class AcousticSystem extends Appliance implements ISwitchable, IVolumeChanger {
    private int volume;
    private boolean switchedOnState;

    public int getVolume() {
        return volume;
    }

    public boolean isSwitchedOnState() {
        return switchedOnState;
    }

    public AcousticSystem(String brandName, double price, String colour, double powerUsage,
                          SizeClassification size, PowerType powerType,
                          Location location, int volume, boolean switchedOnState) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        verifyVolume(volume);
        this.volume = volume;
        this.switchedOnState = switchedOnState;
    }

    private final int MaxVolume = 100;
    private final int MinVolume = 0;

    private void verifyVolume(int value) {
        if (value < MinVolume || value > MaxVolume) {
            throw new IllegalArgumentException(value + String.format(" is invalid value! It must be greater than %d and less than %d.", MinVolume, MaxVolume));
        }
    }

    @Override
    public void setStateOn(boolean isTurnedOn) {
        switchedOnState = isTurnedOn;
    }

    @Override
    public boolean getState() {
        return switchedOnState;
    }

    @Override
    public int setVolumePlus() {
        if (volume < MaxVolume) {
            volume++;
        }
        return volume;
    }

    @Override
    public int setVolumeMinus() {
        if (volume + 1 > MinVolume) {
            volume--;
        }
        return volume;
    }
}
