package base;

public abstract class Transport {
    private Integer numberOfWheels;
    private Integer maxSpeed;

    // Constructors
    public Transport(Integer numberOfWheels, Integer maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Метод для получения уникальных характеристик
     * @return - уникальные харакетристики транспорта
     */
    public abstract String getUniqueCharacteristics();


    // Getters and Setters
    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public Integer getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
