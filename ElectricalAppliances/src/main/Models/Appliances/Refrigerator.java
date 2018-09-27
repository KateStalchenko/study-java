package main.Models.Appliances;

import main.Enums.Location;
import main.Enums.PowerType;
import main.Enums.SizeClassification;
import main.Interfaces.ISwitchable;
import main.Models.BaseClass.Appliance;

public class Refrigerator extends Appliance implements ISwitchable {
    private int storageVolume;
    private int temperature;
    private boolean switchedOn;

    public int getStorageVolume() {
        return storageVolume;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public Refrigerator(String brandName, double price, String colour, double powerUsage,
                        SizeClassification size, PowerType powerType,
                        Location location, int storageVolume, int temperature, boolean switchedOn) {
        super(brandName, price, colour, powerUsage, size, powerType, location);
        verifyTemperature(temperature);
        verifyStorageVolume(storageVolume);
        this.storageVolume = storageVolume;
        this.temperature = temperature;
        this.switchedOn = switchedOn;
    }

    private final int MinStorageVolume = 0;
    private final int MaxStorageVolume = 500;

    private void verifyStorageVolume(int volume) {
        if (volume < MinStorageVolume || volume > MaxStorageVolume) {
            throw new IllegalArgumentException(volume + String.format(" is invalid value! It must be greater than %d and less than %d.", MinStorageVolume, MaxStorageVolume));
        }
    }

    private final int MinTemperature = -15;
    private final int MaxTemperature = 10;

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
        return isSwitchedOn();
    }

}
