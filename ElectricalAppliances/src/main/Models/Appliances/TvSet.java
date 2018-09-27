package main.Models.Appliances;

import main.Enums.DisplayTechnology;
import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISleep;
import main.Interfaces.ISwitchable;
import main.Interfaces.IVolumeChanger;
import main.Models.BaseClass.Appliance;

public class TvSet extends Appliance implements ISwitchable, ISleep, IVolumeChanger {
    private DisplayTechnology displayTechnology;
    private boolean switchedON;
    private int volume;

    public DisplayTechnology getDisplayTechnology() {
        return displayTechnology;
    }

    public boolean isSwitchedON() {
        return switchedON;
    }

    public int getVolume() {
        return volume;
    }

    public TvSet(String brandName, double price, String colour, double powerUsage,
                 SizeClassification size, PowerType powerType, Location location,
                 DisplayTechnology displayTechnology, boolean switchedON, int volume) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        verifyVolume(volume);
        this.displayTechnology = displayTechnology;
        this.switchedON = switchedON;
        this.volume = volume;
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
        switchedON = isTurnedOn;
    }

    @Override
    public boolean getState() {
        return isSwitchedON();
    }

    @Override
    public void setSleep(int minutes) {
        System.out.printf("Your TV set will go in sleep mode in %d minutes", minutes);
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
