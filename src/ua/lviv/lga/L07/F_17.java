package ua.lviv.lga.L07;

public class F_17 extends Airplane implements Speciable {
    private int maxSpeed;
    private String color;
    AircraftControl ac = new AircraftControl();

    public F_17(int length, int width, int weight, int maxSpeed, String color) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void Up() {
        ac.movementUp();
    }

    public void Down() {
        ac.movementDown();
    }

    public void ToLeft() {
        ac.moveToLeft();
    }

    public void ToRight() {
        ac.moveToLeft();
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Прискорена швидкість " + (this.maxSpeed + Math.round(Math.random() * 100)) + " km/год");
    }

    @Override
    public void stealthTechnology() {
        System.out.println("літака не буде видно " + Math.round(Math.random() * 10) + " с");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Буде скинуто  " + (Math.round(Math.random() * 9 + 1)) + " бомб");
    }


}
