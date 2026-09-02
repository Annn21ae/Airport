import model.Plane;
import service.PlaneService;

public class AiroportTest {
    public void main(String[] args) {

        PlaneService planes = new PlaneService();

        Plane a = new Plane();
        a.setModel("AAAA");
        a.setCountry("Abbb");
        a.setYear(1999);
        a.setHours(578);
        a.setMilitary(true);
        a.setWeight(785.67);
        a.setWingspan(38);
        a.setTopSpeed(578);
        a.setSeats(45);
        a.setCost(345.65);

        Plane b = new Plane();
        b.setModel("BBBB");
        b.setCountry("Baaa");
        b.setYear(2003);
        b.setHours(478);
        b.setMilitary(true);
        b.setWeight(465.37);
        b.setWingspan(35);
        b.setTopSpeed(378);
        b.setSeats(18);
        b.setCost(567.87);

        Plane c = new Plane();
        c.setModel("VVVV");
        c.setCountry("WWWW");
        c.setYear(2020);
        c.setHours(5976);
        c.setMilitary(false);
        c.setWeight(678.67);
        c.setWingspan(15);
        c.setTopSpeed(784);
        b.setSeats(50);
        a.setCost(789.864);

    }
}
