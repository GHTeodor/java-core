package lesson2.task2;

public class Workstation extends Laptop {
    private boolean bluetooth;

    public Workstation() {
    }

    public Workstation(String operatingSystem, int ram, boolean withSSD, boolean touchpad, boolean bluetooth) {
        super(operatingSystem, ram, withSSD, touchpad);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "bluetooth=" + bluetooth +
                "} " + super.toString();
    }
}
