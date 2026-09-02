package service;

import model.Plane;

public class PlaneService {

    public void task1(Plane plane) {
        System.out.println("model:" + plane.getModel());
        System.out.println("country:" + plane.getCountry());
        System.out.println("year:" + plane.getYear());
        System.out.println("hours:" + plane.getHours());
        System.out.println("military:" + plane.isMilitary());
        System.out.println("weight:" + plane.getWeight());
        System.out.println("wingspan:" + plane.getWingspan());
        System.out.println("topSpeed:" + plane.getTopSpeed());
        System.out.println("seats:" + plane.getSeats());
        System.out.println("cost:" + plane.getCountry());
    }

    public void task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost() + plane.getTopSpeed());
        } else {
            System.out.println(plane.getModel() + plane.getCountry());
        }
    }

    public int task3(Plane a, Plane b) {
        if (a.getYear() < b.getYear()) {
            return b.getYear();
        } else {
            return a.getYear();

        }
    }

    public double task4(Plane b, Plane c) {
        if (b.getWingspan() > c.getWingspan()) {
            return b.getWingspan();
        } else {
            return c.getWingspan();
        }
    }

    public void task5(Plane a, Plane b, Plane c) {
        if (a.getSeats() < b.getSeats() && a.getSeats() < c.getSeats()) {
            System.out.println(a.getCost());
        } else if (b.getSeats() < a.getSeats() && b.getSeats() < c.getSeats()) {
            System.out.println(b.getCountry());
        } else {
            System.out.println(c.getCountry());
        }
    }

    public void task6(Plane[] planes) {

        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
                task1(planes[i]);
            }
        }
    }

    public void task7(Plane[] planes) {

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() >= 100) {
                task1(planes[i]);
            }
        }
    }

    public Plane task8 (Plane [] planes) {
        Plane min = planes[0];

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() < min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    public Plane task9 ( Plane [] planes) {
        Plane min = planes[0];

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getCost() < min.getCost()) {
                min = planes[i];
            }
        }
        return min;
    }

    public void task10 ( Plane [] planes) {

        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length; j++) {
                Plane temp = planes[j];
                planes[j] = planes[j - 1];
                planes[j -1] = temp;
            }
        }
        for (Plane x: planes) {
            System.out.println (x);
        }
    }
}
