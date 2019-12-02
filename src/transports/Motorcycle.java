package transports;

import base.Transport;

public class Motorcycle extends Transport {


    public Motorcycle(Integer numberOfWheels, Integer maxSpeed) {
        super("мотоцикл", numberOfWheels, maxSpeed);
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Уникальные характеристики мотоцикла";
    }
}
