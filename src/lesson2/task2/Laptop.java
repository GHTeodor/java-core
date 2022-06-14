package lesson2.task2;

public class Laptop extends PC {
    private boolean touchpad;

    public Laptop() {
    }

    public Laptop(String operatingSystem, int ram, boolean withSSD, boolean touchpad) {
        super(operatingSystem, ram, withSSD);
        this.touchpad = touchpad;
    }

    public boolean isTouchpad() {
        return touchpad;
    }

    public void setTouchpad(boolean touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad=" + touchpad +
                "} " + super.toString();
    }
}
