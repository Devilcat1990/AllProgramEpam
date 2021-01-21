package Planes;

import java.util.Objects;

public class CargoPlane extends Plane {
    //================Fields========================
    private int capacityCargoPlaneTon;
//==============Constructor=====================

    public CargoPlane(String nameModelPlane, int maxSpeedPlane, int fuelConsumptionPlane, TypePlane type, int capacityCargoPlaneTon) {
        super(nameModelPlane, maxSpeedPlane, fuelConsumptionPlane, type);
        this.capacityCargoPlaneTon = capacityCargoPlaneTon;
    }

//============Method====================

    public int getCapacityCargoPlaneTon() {
        return capacityCargoPlaneTon;
    }

    public void setCapacityCargoPlaneTon(int capacityCargoPlaneTon) {
        this.capacityCargoPlaneTon = capacityCargoPlaneTon;
    }

//=========toString and equals==============


    @Override
    public String toString() {
        return "\n========================================================================\n"+"Грузовой самолет"+super.toString()+
                ";  Количество тон груза в самолете=" + capacityCargoPlaneTon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return capacityCargoPlaneTon == that.capacityCargoPlaneTon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacityCargoPlaneTon);
    }
}
