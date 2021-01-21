package Launching;

import Airport.Airport;
import Planes.CargoPlane;
import Planes.FighterPlane;
import Planes.PasengersPlane;
import Planes.TypePlane;

import static CheckInput.CheckInputValuesInteger.InputValuesInt;
import static Launching.MenuProgram.menu;

public class Launch {

    public static void main(String[] args) {
        Airport airport=new Airport("Просвет");
        airport.setToListAirportPlane(new CargoPlane("c-40", 500, 600, TypePlane.CivilPane, 2000));
        airport.setToListAirportPlane(new PasengersPlane("Boing-740", 600, 500, TypePlane.CivilPane, 500));
        airport.setToListAirportPlane(new PasengersPlane("Boing-500", 400, 300, TypePlane.CivilPane, 300));
        airport.setToListAirportPlane(new FighterPlane("F-15", 800, 450, TypePlane.MilitaryPlane, 10));
        airport.setToListAirportPlane(new CargoPlane("c-47", 450, 650, TypePlane.MilitaryPlane, 1500));
        airport.setToListAirportPlane(new FighterPlane("Raptor-1", 760, 600, TypePlane.MilitaryPlane, 12));
        boolean exit = true;
        do {
            switch (menu()) {
                case 1:
                    System.out.println("Список всех самолетов в Авиокомпании\n"+airport);
                    break;
                case 2:
                    System.out.println("Общая грузоподьемность всех самолетов в Аэропорту ="+airport.getTotalCapacityCargoPlaneTon());
                    break;
                case 3:
                    System.out.println("Общая вместимость пасажиров в Авиокомпании ="+airport.getTotalQuantityPassengerPlane());
                    break;
                case 4:
                    System.out.println("Введите первую координату диапозона расхода топлива: ");
                    int firstCordRange=InputValuesInt();
                    System.out.println("Введите вторую координату диапозана расхода топлива: ");
                    int secondCordRange=InputValuesInt();
                    System.out.printf("Самолеты в диапозоне потребления горючего от %d до %d",firstCordRange,secondCordRange);
                    airport.getToPrintPlaneInTheRange(firstCordRange,secondCordRange);
                    break;
                case 5:
                    airport.sortAirportListSpeed();
                    System.out.println("Список отсортированый по скорости:"+airport);
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("Вы выбрали не существующий пункт меню!!");
            }
        } while (exit);


    }
}
