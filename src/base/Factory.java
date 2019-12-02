package base;

import transports.Bus;
import transports.Car;
import transports.Motorcycle;
import transports.Scooter;

import java.util.Random;

public class Factory {
    private Random random;

    // Constructor
    public Factory() {
        random = new Random();
    }

    /**
     * Создание объектов транспорта на основе его типа
     * @param type - тип транспорта
     * @return - объект транспорта
     */
    public Transport getTransport(Integer type){
        Transport transport = null;
        switch (type){
            case 0: transport = new Motorcycle(random.nextInt(1) + 2, random.nextInt(150) + 100);
            break;
            case 1: transport = new Scooter(random.nextInt(1) + 2, random.nextInt(30) + 10);
            break;
            case 2: transport = new Car(4, random.nextInt(250) + 150);
            break;
            case 3: transport = new Bus(random.nextInt(2) == 1 ? 6 : 8, random.nextInt(200) + 100);
            break;
        }
        return transport;
    }
}
