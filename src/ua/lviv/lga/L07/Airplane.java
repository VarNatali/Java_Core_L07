package ua.lviv.lga.L07;

abstract class Airplane {
    private int length;
    private int width;
    private int weight;

    public Airplane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void startingEngines(int min, int max) {
        System.out.println("До злету залишилося " + (Math.round(Math.random() * (max - min + 1)) + min) + " c");
    }


    public void planeTakeoff() {
        System.out.println("На повному баку літак пролетить " + (Math.random() * 1000 + 1) + " km");
    }

    public void landingPlane() {
        System.out.println("Літак іде на посадку. кацапстан знищено ");
    }


}
