package Planes;

import java.util.Objects;

public class FighterPlane extends Plane{
//================Fields========================
private int quantityRockets;
//==============Constructor=====================

    public FighterPlane(String nameModelPlane, int maxSpeedPlane, int fuelConsumptionPlane, TypePlane type, int quantityRockets) {
        super(nameModelPlane, maxSpeedPlane, fuelConsumptionPlane, type);
        this.quantityRockets = quantityRockets;
    }

//============Method====================

    public int getQuantityRockets() {
        return quantityRockets;
    }

    public void setQuantityRockets(int quantityRockets) {
        this.quantityRockets = quantityRockets;
    }

//=========toString and equals==============

    @Override
    public String toString() {
        return "\n========================================================================\n"+"Истребитель"+
                super.toString()+
                ";  Количество ракет в самолете=" + quantityRockets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FighterPlane)) return false;
        if (!super.equals(o)) return false;
        FighterPlane that = (FighterPlane) o;
        return quantityRockets == that.quantityRockets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityRockets);
    }
}
//================Fields========================
//==============Constructor=====================
//============Method====================
//=========toString and equals==============