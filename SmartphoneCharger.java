package AdapterPattern;

public class SmartphoneCharger {

    private boolean charging = false;

    public void plugIn() {
        System.out.println("Smartphone Charger is plugged in.");
        charging = true;
    }

}
