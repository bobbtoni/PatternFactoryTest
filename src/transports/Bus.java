package transports;

import base.Transport;

public class Bus extends Transport {

    public Bus(Integer numberOfWheels, Integer maxSpeed) {
        super(numberOfWheels, maxSpeed);
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Уникальные характеристики автобуса";
    }
}
