package transports;

import base.Transport;

public class Car extends Transport {
    public Car(Integer numberOfWheels, Integer maxSpeed) {
        super("автомобиль", numberOfWheels, maxSpeed);
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Уникальные характеристики автомобиля";
    }
}
