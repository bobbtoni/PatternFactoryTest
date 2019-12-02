package transports;

import base.Transport;

public class Motorcycle extends Transport {


    public Motorcycle(Integer numberOfWheels, Integer maxSpeed) {
        super(numberOfWheels, maxSpeed);
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Уникальные характеристики мотоцикла";
    }
}
