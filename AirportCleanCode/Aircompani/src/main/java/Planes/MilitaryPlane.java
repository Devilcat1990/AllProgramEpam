package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{
    //=================FIELDS=================
    private MilitaryType type;
    //=================CONSTRUCTORS=================
    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }
    //=================METHODS=================
    public MilitaryType getType() {
        return type;
    }

    public void setType(MilitaryType type) {
        this.type = type;
    }

    //=========toString and equals and hashCode===
    @Override
    public String toString() {
        return super.toString() +
                " type=" + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
