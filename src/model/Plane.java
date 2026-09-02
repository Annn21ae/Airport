package model;

public class Plane {

    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private double weight;
    private double wingspan;
    private double topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (getYear() > 1903 && getYear() < 2021) {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (getHours() > 0 && getHours() < 10000) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (getWeight() > 10000 && getWeight() < 160000) {
            this.weight = weight;
        }
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        if (getWingspan() < 10 && getWingspan() > 45) {
            this.wingspan = wingspan;
        }
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (getTopSpeed() > 0 && getTopSpeed() < 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
