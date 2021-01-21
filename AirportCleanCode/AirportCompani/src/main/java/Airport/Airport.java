package Airport;

import Planes.CargoPlane;
import Planes.PasengersPlane;
import Planes.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {
    //=================Fields====================
    private String nameAirportCompany;
    private ArrayList<Plane> listAirportPlane=new ArrayList<>();
    //====================Constructor====================
    public Airport(String nameAirportCompany){
        this.nameAirportCompany=nameAirportCompany;
    }
//=====================Method========================

    public List<Plane> getListAirportPlane() {
        return listAirportPlane;
    }
    //МЕТОД ДЛЯ ДОБАВЛЕНИЯ НОВЫХ САМОЛЕТОВ В АВИОКОМПАНИЮ
    public void setToListAirportPlane(Plane plane) {
        listAirportPlane.add(plane);
    }
    //МЕТОД ДЛЯЯ ПОСЧЕТА ОБЩЕЙ ГРУЗОПОДЬЕМНЫОСТИ АВИОКОМПАНИИ
    public int getTotalCapacityCargoPlaneTon(){
        int totalCargo=0;
        for (Plane plane:listAirportPlane) {
            if (plane instanceof CargoPlane)
            {
                totalCargo+=((CargoPlane) plane).getCapacityCargoPlaneTon();
            }
        }
        return totalCargo;
    }
    //МЕТОД ДЛЯ ПОДСЧЕТА ОБЩЕГО КОЛИЧЕСТВА ПАСАЖИРОВ АВИОКОМПАНИИ
    public int getTotalQuantityPassengerPlane() {
        int totalQuantity=0;
        for (Plane plane:listAirportPlane) {
            if(plane instanceof PasengersPlane)
            {
                totalQuantity+=((PasengersPlane) plane).getQuantityPassengerPlane();
            }
        }
        return totalQuantity;
    }
    //МЕТОД ДЛЯ ПОИСКА САМОЛЕТОВ ПО ЗАДАННОМУ ДИАПАЗОНУ ПОТРЕБЛЕНИЯ ГОРЮЧЕГО
    public void getToPrintPlaneInTheRange(int firstCordRange, int secondCordRange){
        for (Plane plane:listAirportPlane) {
            if(plane.getFuelConsumptionPlane()>firstCordRange && plane.getFuelConsumptionPlane()<secondCordRange)
            {
                System.out.println(plane.toString());
            }
        }
    }
    public void sortAirportListSpeed(){
        listAirportPlane.sort(new Plane.speedPlaneComparator());
    }
    //================toString and equals================

    @Override
    public String toString() {
        return  "Название компании:" + nameAirportCompany  +
                "\nСписок самолетов компании: " + listAirportPlane.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(nameAirportCompany, airport.nameAirportCompany) &&
                Objects.equals(listAirportPlane, airport.listAirportPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAirportCompany, listAirportPlane);
    }
}
