package transports;

import base.Transport;

public class Scooter extends Transport {

    public Scooter(Integer numberOfWheels, Integer maxSpeed) {
        super(numberOfWheels, maxSpeed);
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Уникальные характеристики самоката";
    }
}
