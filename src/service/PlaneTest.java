package service;

import model.Plane;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class PlaneTest {

    public static final String URL = "test.txt";

    public static void main(String[] args) throws Exception {
        String[] lines = FileService.readFile(URL);
        Plane[] convert = PlaneService.convert(lines);
        Plane max = PlaneService.max(convert);

        LocalDate date = LocalDate.now();
        int year = date.getYear();

        for (Plane plane : convert) {
            FileService.writeFile(plane.getModel(), plane.getModel() + "," + plane.getCountry() + "," + (year - plane.getYear()));
        }

        System.out.println(max);

    }
}

