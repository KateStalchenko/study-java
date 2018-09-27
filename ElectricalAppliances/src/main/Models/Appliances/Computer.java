package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISleep;
import main.Interfaces.ISwitchable;
import main.Interfaces.IVolumeChanger;
import main.Models.BaseClass.Appliance;

public class Computer extends Appliance implements ISleep, ISwitchable, IVolumeChanger {
    private boolean switchedON;
    private int volume;

    public boolean isSwitchedON() {
        return switchedON;
    }

    public int getVolume() {
        return volume;
    }

    public Computer(String brandName, double price, String colour, double powerUsage,
                    SizeClassification size, PowerType powerType,
                    Location location, boolean switchedON, int volume) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        verifyVolume(volume);
        this.switchedON = switchedON;
        this.volume = volume;
    }

    @Override
    public void setSleep(int minutes) {
        System.out.printf("Your computer will go in sleep mode in %d minutes", minutes);
    }

    @Override
    public void setStateOn(boolean isTurnedOn) {
        switchedON = isTurnedOn;
    }

    @Override
    public boolean getState() {
        return switchedON;
    }

    private final int MaxVolume = 100;
    private final int MinVolume = 0;

    private void verifyVolume(int value) {
        if (value < MinVolume || value > MaxVolume) {
            throw new IllegalArgumentException(value + String.format(" is invalid value! It must be greater than %d and less than %d.", MinVolume, MaxVolume));
        }
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
