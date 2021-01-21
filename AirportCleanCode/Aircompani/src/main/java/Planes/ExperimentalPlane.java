package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{
    //=================FIELDS=================
    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;
    //=================CONSTRUCTORS=================
    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }
    //=================METHODS=================
    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }
    //=========toString and equals and hashCode===
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString()+
                " type=" + type +
                " classificationLevel=" + classificationLevel;
    }
}
