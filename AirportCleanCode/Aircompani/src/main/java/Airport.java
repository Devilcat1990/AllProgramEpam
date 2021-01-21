import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import Planes.ExperimentalPlane;
import models.MilitaryType;

import java.util.*;

// version: 1.2
// made by Vitali Shulha edited Yauheni Navumau
// 4-Jan-2019

public class Airport {
    //=================FIELDS=================
    private List<? extends Plane> planes;
    //=================CONSTRUCTORS=================
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
    //=================METHODS=================
    public List<PassengerPlane> getPassengerPlaneList() {
        List<PassengerPlane> passengerPlaneList = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlaneList.add((PassengerPlane) plane);
            }
        }
        return passengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlanesList() {
        List<MilitaryPlane> militaryPlanesList = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanesList.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanesList;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlaneList();
        PassengerPlane planeFirstIndex = passengerPlanes.get(0);
            for (PassengerPlane plane: passengerPlanes) {
                if (planeFirstIndex.getPassengersCapacity() < plane.getPassengersCapacity()){
                    planeFirstIndex=plane;
                }
            }
        return planeFirstIndex;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanesList() {
        List<MilitaryPlane> transportMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanesList();
        for (MilitaryPlane plane: militaryPlanes) {
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanesList.add(plane);
            }
        }
        return transportMilitaryPlanesList;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanesList() {
        List<MilitaryPlane> bomberMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanesList();
        for (MilitaryPlane plane: militaryPlanes) {
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanesList.add(plane);
            }
        }
        return bomberMilitaryPlanesList;

    }

    public List<ExperimentalPlane> getExperimentalPlanesList() {
        List<ExperimentalPlane> experimentalPlanesList = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanesList.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanesList;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return planes.toString();
    }



}
