package base;

import java.io.PrintWriter;

public abstract class Transport {
    private String name;
    private Integer numberOfWheels;
    private Integer maxSpeed;

    // Constructors
    public Transport(String name, Integer numberOfWheels, Integer maxSpeed) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Метод для получения уникальных характеристик
     * @return - уникальные харакетристики транспорта
     */
    public abstract String getUniqueCharacteristics();

    /**
     * Вывод информации в заданный поток
     * @param printWriter - поток вывода
     */
    public void printInfo(PrintWriter printWriter){
        printWriter.println("Наименование транспорта: " + name);
        printWriter.println("Кол-во колес: " + numberOfWheels);
        printWriter.println("Максимльная скорость: " + maxSpeed + "км/ч");
        printWriter.println(getUniqueCharacteristics());
        printWriter.println();
        printWriter.flush();
    }


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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
