package AdapterPattern;

public class Refrigerator {
    private boolean cooling = false;

    public void plugIn() {
        System.out.println("Refrigerator is plugged in.");
        cooling = true;
    }
}
