package AdapterPattern;

public class Laptop {

    private boolean charging = false;

    public void plugIn() {
        System.out.println("Laptop is plugged in.");
        charging = true;
    }
}
