import check.TransportTypeException;
import drivers.DbDrivers;
import transport.DbTransport;
import transport.Mechanic;
import transport.Sto;
import transport.Transport;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws TransportTypeException {

        DbTransport transport = new DbTransport();
        DbDrivers drivers = new DbDrivers();
        Sto stoDepartment = new Sto();

        transport.getDriverCarName(0, "C"); // Общие сведения и готовность;
        transport.getDriverCarName(2, "D");
        System.out.println(" ");

        transport.getDriverCarName(1, "B");
        drivers.getStartDrivingB(1);
        transport.getDriverBbestLap(1, "5m 36sec");
        drivers.getRefuelB(1);
        Transport.startMoving();
        drivers.getStopB(1);
        System.out.println("Финиш \n");

        transport.printType(2, "B");        // Определение типа авто;
        transport.printType(0, "C");
        transport.printType(3, "D");
        System.out.println(" ");

        try {                                         // Прохождение диагностики;
            transport.testingAvto(0, "B");
            transport.testingAvto(1, "C");
            transport.testingAvto(3, "D");
        } catch (TransportTypeException e) {
//            System.err.println(e + "\n");           // Exception на диагностику "Bus";
        }

        transport.creationtListOfCompetition();       // Лист участников соревнований;
        System.out.println(" ");

        transport.repair(1);                       // Ремонт произведён;
        transport.doingTo(4);                      // "ТО" произведено;
        System.out.println(" ");


        stoDepartment.addingToSto(3);       // Добавление транспорта на "СТО";
        stoDepartment.addingToSto(9);
        stoDepartment.addingToSto(2);
        stoDepartment.addingToSto(6);
        stoDepartment.addingToSto(11);
        stoDepartment.addingToSto(0);
        System.out.println(" ");

        stoDepartment.testingOnSto();                  // Прохождение "ТО".
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        stoDepartment.testingOnSto();
        System.out.println(" ");

        // Создание Мар: ключ - бренд авто; значение - механик обслуживающий данный авто. Вывод в консоль.

        Map<String, Mechanic> listAvtoMech = new HashMap<>();
        listAvtoMech.put(transport.participants.get(0).getBrand(), transport.participants.get(0).getMechanic());
        listAvtoMech.put(transport.participants.get(8).getBrand(), transport.participants.get(8).getMechanic());
        listAvtoMech.put(transport.participants.get(5).getBrand(), transport.participants.get(5).getMechanic());
        listAvtoMech.put(transport.participants.get(11).getBrand(), transport.participants.get(11).getMechanic());

        for (Map.Entry<String, Mechanic> listPrintMap : listAvtoMech.entrySet()){
            System.out.println(listPrintMap.getKey() + " " + listPrintMap.getValue());
        }
    }
}