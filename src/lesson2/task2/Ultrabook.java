package lesson2.task2;

public class Ultrabook extends Laptop {
    private float inch;

    public Ultrabook() {
    }

    public Ultrabook(String operatingSystem, int ram, boolean withSSD, boolean touchpad, float inch) {
        super(operatingSystem, ram, withSSD, touchpad);
        this.inch = inch;
    }

    public float getInch() {
        return inch;
    }

    public void setInch(float inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "inch=" + inch +
                "} " + super.toString();
    }
}
