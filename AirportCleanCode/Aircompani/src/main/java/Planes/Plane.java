package Planes;

import java.util.Objects;

abstract public class Plane {
    //=================FIELDS=================
    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    //=================CONSTRUCTORS=================
    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    //=================METHODS=================
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return this.maxLoadCapacity;
    }
    //=========toString and equals and hashCode===
    @Override
    public String toString() {
        return "\n----------------------------------------------------------------------------------\n"+
                "model=" + model +
                " maxSpeed=" + maxSpeed +
                "\nmaxFlightDistance=" + maxFlightDistance +
                " maxLoadCapacity=" + maxLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
