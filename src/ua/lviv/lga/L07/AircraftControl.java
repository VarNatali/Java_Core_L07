package ua.lviv.lga.L07;

public class AircraftControl {
    public void movementUp() {
        System.out.println("Рух вверх на " + Math.round(Math.random() * 100) + " km");

    }

    public void movementDown() {
        System.out.println("Рух вниз на " + Math.round(Math.random() * 100) + " km");

    }


    public void moveToLeft() {
        System.out.println("Поворот ліворуч на " + Math.round(Math.random() * 100) + " km");

    }

    public void moveToRight() {
        System.out.println("Поворот праворуч на " + Math.round(Math.random() * 100) + " km");

    }
}
