package Launching;

import AllComparator.quantityPassengerPlaneComparator;
import Planes.Plane;

import java.util.ArrayList;
import java.util.List;

public class Launch {
    public static void main(String[] args) {
        Plane boing=new Plane(20,40,60,100);
        System.out.println(boing);
        List<Plane> listPlane=new ArrayList<>();
        listPlane.add(new Plane(1,2,3,4));
        listPlane.add(new Plane(23,45,432,22));
        listPlane.add(boing);
        System.out.println(listPlane);
        listPlane.sort(new quantityPassengerPlaneComparator());
        System.out.println(listPlane);


    }
}
