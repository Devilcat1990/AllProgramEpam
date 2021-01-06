package Planes;

import java.util.Objects;

public class Plane {
    private int quantityPassengerPlane;
    private int capacityCargoPlaneTon;
    private int maxSpeedPlane;
    private int fuelConsumptionPlane;

    public int getQuantityPassengerPlane() {
        return quantityPassengerPlane;
    }

    public int getCapacityCargoPlane() {
        return capacityCargoPlaneTon;
    }

    public int getMaxSpeedPlane() {
        return maxSpeedPlane;
    }

    public int getFuelConsumptionPlane() {
        return fuelConsumptionPlane;
    }

    public void setQuantityPassengerPlane(int quantityPassengerPlane) {
        this.quantityPassengerPlane = quantityPassengerPlane;
    }

    public void setCapacityCargoPlane(int capacityCargoPlane) {
        this.capacityCargoPlaneTon = capacityCargoPlane;
    }

    public void setMaxSpeedPlane(int maxSpeedPlane) {
        this.maxSpeedPlane = maxSpeedPlane;
    }

    public void setFuelConsumptionPlane(int fuelConsumptionPlane) {
        this.fuelConsumptionPlane = fuelConsumptionPlane;
    }

    public Plane(int quantityPassengerPlane, int capacityCargoPlane, int maxSpeedPlane, int fuelConsumptionPlane) {
        this.quantityPassengerPlane = quantityPassengerPlane;
        this.capacityCargoPlaneTon = capacityCargoPlane;
        this.maxSpeedPlane = maxSpeedPlane;
        this.fuelConsumptionPlane = fuelConsumptionPlane;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "quantityPassengerPlane=" + quantityPassengerPlane +
                ", capacityCargoPlane=" + capacityCargoPlaneTon +
                ", maxSpeedPlane=" + maxSpeedPlane +
                ", fuelConsumptionPlane=" + fuelConsumptionPlane +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return quantityPassengerPlane == plane.quantityPassengerPlane &&
                capacityCargoPlaneTon == plane.capacityCargoPlaneTon &&
                maxSpeedPlane == plane.maxSpeedPlane &&
                fuelConsumptionPlane == plane.fuelConsumptionPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityPassengerPlane, capacityCargoPlaneTon, maxSpeedPlane, fuelConsumptionPlane);
    }
}
