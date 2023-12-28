package ua.lviv.lga.L07;

public class ApplicationFly {
    public static void main(String[] args) {
        F_17 f17 = new F_17(120, 12, 120, 950, "сірий");
        f17.startingEngines(20, 68);
        f17.planeTakeoff();
        f17.Up();
        f17.ToLeft();
        f17.Down();
        f17.ToRight();
        f17.stealthTechnology();
        f17.nuclearStrike();
        f17.turboAcceleration();
        f17.landingPlane();


    }
}
