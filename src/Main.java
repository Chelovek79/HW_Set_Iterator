import check.TransportTypeException;
import drivers.DbDrivers;
import drivers.Driver;
import transport.DbTransport;
import transport.Mechanic;
import transport.Sto;
import transport.Transport;

import java.util.*;

public class Main {

    public static void main(String[] args) throws TransportTypeException {

        DbTransport transport = new DbTransport();
        DbDrivers drivers = new DbDrivers();
        Sto stoDepartment = new Sto();

        Set<String> listDriver = new HashSet<>();
        listDriver.add(drivers.driversList.get(8).getFio());
        listDriver.add(drivers.driversList.get(3).getFio());
        listDriver.add(drivers.driversList.get(7).getFio());
        listDriver.add(drivers.driversList.get(5).getFio());
        listDriver.add(drivers.driversList.get(2).getFio());
        listDriver.add(drivers.driversList.get(1).getFio());
        listDriver.add(drivers.driversList.get(7).getFio());
        System.out.println(listDriver);

        Iterator<String> itListDriver = listDriver.iterator();

        while (itListDriver.hasNext()){
            System.out.println(itListDriver.next());
        }
    }
}