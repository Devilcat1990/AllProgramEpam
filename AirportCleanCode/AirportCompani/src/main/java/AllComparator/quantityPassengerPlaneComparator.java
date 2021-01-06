package AllComparator;

import Planes.Plane;

import java.util.Comparator;

public class quantityPassengerPlaneComparator implements Comparator <Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.getQuantityPassengerPlane()- o2.getQuantityPassengerPlane();
    }
}
