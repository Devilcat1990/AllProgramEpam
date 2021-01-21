package Planes;

import java.util.Comparator;
import java.util.Objects;

public class PasengersPlane extends Plane {
    //================Fields========================
    private int quantityPassengerPlane;
    //==============Constructor=====================

    public PasengersPlane(String nameModelPlane, int maxSpeedPlane, int fuelConsumptionPlane, TypePlane type, int quantityPassengerPlane) {
        super(nameModelPlane, maxSpeedPlane, fuelConsumptionPlane, type);
        this.quantityPassengerPlane = quantityPassengerPlane;
    }

    //============Method====================

    public int getQuantityPassengerPlane() {
        return quantityPassengerPlane;
    }

    public void setQuantityPassengerPlane(int quantityPassengerPlane) {
        this.quantityPassengerPlane = quantityPassengerPlane;
    }

    //=========toString and equals==============


    @Override
    public String toString() {
        return "\n========================================================================\n"+
                "Пасажирский самолет;"+super.toString()+
                ";  Количество пасажиров в самолете=" + quantityPassengerPlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasengersPlane)) return false;
        if (!super.equals(o)) return false;
        PasengersPlane that = (PasengersPlane) o;
        return quantityPassengerPlane == that.quantityPassengerPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityPassengerPlane);
    }
}
