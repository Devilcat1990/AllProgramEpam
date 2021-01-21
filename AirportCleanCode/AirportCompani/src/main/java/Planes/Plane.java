package Planes;

import java.util.Comparator;
import java.util.Objects;

public class Plane {
    //================Fields========================
    private String nameModelPlane;
    private int maxSpeedPlane;
    private int fuelConsumptionPlane;
    private TypePlane type;
    //==============Constructor=====================

    public Plane(String nameModelPlane, int maxSpeedPlane, int fuelConsumptionPlane, TypePlane type) {
        this.nameModelPlane = nameModelPlane;
        this.maxSpeedPlane = maxSpeedPlane;
        this.fuelConsumptionPlane = fuelConsumptionPlane;
        this.type = type;
    }

    //============Method====================

    public String getNameModelPlane() {
        return nameModelPlane;
    }

    public void setNameModelPlane(String nameModelPlane) {
        this.nameModelPlane = nameModelPlane;
    }

    public int getMaxSpeedPlane() {
        return maxSpeedPlane;
    }

    public void setMaxSpeedPlane(int maxSpeedPlane) {
        this.maxSpeedPlane = maxSpeedPlane;
    }

    public int getFuelConsumptionPlane() {
        return fuelConsumptionPlane;
    }

    public void setFuelConsumptionPlane(int fuelConsumptionPlane) {
        this.fuelConsumptionPlane = fuelConsumptionPlane;
    }

    public TypePlane getType() {
        return type;
    }

    public void setType(TypePlane type) {
        this.type = type;
    }
    public static class speedPlaneComparator implements Comparator<Plane>
    {
        @Override
        public int compare(Plane o1, Plane o2) {
            return o1.getMaxSpeedPlane()- o2.getMaxSpeedPlane();
        }
    }
    //=========toString and equals==============

    @Override
    public String toString() {
        return  "   Тип самолета: " + type +
                ";  Название модели= " + nameModelPlane +
                ";  \nМаксимальная скорость=" + maxSpeedPlane +
                ";  Потирбление горючего=" + fuelConsumptionPlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeedPlane == plane.maxSpeedPlane &&
                fuelConsumptionPlane == plane.fuelConsumptionPlane &&
                Objects.equals(nameModelPlane, plane.nameModelPlane) &&
                type == plane.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameModelPlane, maxSpeedPlane, fuelConsumptionPlane, type);
    }
}
