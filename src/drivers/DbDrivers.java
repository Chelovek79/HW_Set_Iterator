package drivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DbDrivers {

    DriverB[] driverB = {new DriverB("Санников И.П.", true, 5.0),
            new DriverB("Алексеев Ф.С.", true, 7.0),
            new DriverB("Суровый В.И.", true, 15.5)};

    DriverC[] driverC = {new DriverC("Русанов Г.Л.", true, 7.5),
            new DriverC("Прохин К.К.", true, 6.5),
            new DriverC("Суровый В.И.", true, 15.5)};

    DriverD[] driverD = {new DriverD("Малышев О.С.", true, 7.5),
            new DriverD("Васильев И.Д.", true, 6.5),
            new DriverD("Суровый В.И.", true, 15.5)};

    public List<Driver> driversList = new ArrayList<>();
    {
        driversList.addAll(Arrays.asList(driverB).subList(0, 3));
        driversList.addAll(Arrays.asList(driverC).subList(0, 3));
        driversList.addAll(Arrays.asList(driverD).subList(0, 3));
    }


    public String getNameDriverB(int i) {
        return driverB[i].getFio();
    }

    public String getNameDriverC(int i) {
        return driverC[i].getFio();
    }

    public String getNameDriverD(int i) {
        return driverD[i].getFio();
    }

    public DriverB getDriverB(int i) {
        return driverB[i];
    }

    public DriverC getDriverC(int i) {
        return driverC[i];
    }

    public DriverD getDriverD(int i) {
        return driverD[i];
    }

    public void getStartDrivingB(int i) {
        driverB[i].startDriving();
    }

    public void getRefuelB(int i) {
        driverB[i].refuel();
    }

    public void getStopB(int i) {
        driverB[i].stopDriving();
    }
}



