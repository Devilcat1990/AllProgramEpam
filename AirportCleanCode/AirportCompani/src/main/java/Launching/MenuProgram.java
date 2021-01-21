package Launching;


import static CheckInput.CheckInputValuesInteger.InputValuesInt;

public class MenuProgram {
    public static int menu() {
        System.out.println("\nОСНОВНОЕ МЕНЮ\n");
        System.out.println("1: Вывести список всех самолетов компании.");
        System.out.println("2: Посчитать общую грузоподьемность всех самолетов.");
        System.out.println("3: Посчитать общую вместимость пасажиров всех самолетов.");
        System.out.println("4: найти самолеты соответствующие заданному диапазону потребления горючего.");
        System.out.println("5: Отсортировать и вывести самолеты компании по скорости.");
        System.out.println("6: Выход.");
        System.out.print("Пожалуйста сделайте выбор: ");
        int choice = InputValuesInt();
        System.out.println(" ");
        return choice;
    }
}
