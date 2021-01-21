package Planes;

import java.util.Objects;

public class BomberPlane extends Plane{
    //================Fields========================
    private int quantityTonBomb;
//==============Constructor=====================

    public BomberPlane(String nameModelPlane, int maxSpeedPlane, int fuelConsumptionPlane, TypePlane type, int quantityTonBomb) {
        super(nameModelPlane, maxSpeedPlane, fuelConsumptionPlane, type);
        this.quantityTonBomb = quantityTonBomb;
    }

//============Method====================

    public int getQuantityTonBomb() {
        return quantityTonBomb;
    }

    public void setQuantityTonBomb(int quantityTonBomb) {
        this.quantityTonBomb = quantityTonBomb;
    }

//=========toString and equals==============

    @Override
    public String toString() {
        return "\n========================================================================\n"+"Бомбардировщик" +super.toString()+
                ";  Количество тон бомб=" + quantityTonBomb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BomberPlane)) return false;
        if (!super.equals(o)) return false;
        BomberPlane that = (BomberPlane) o;
        return quantityTonBomb == that.quantityTonBomb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityTonBomb);
    }
}
