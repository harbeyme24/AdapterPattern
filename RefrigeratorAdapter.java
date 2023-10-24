package AdapterPattern;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator ref;

    public RefrigeratorAdapter(Refrigerator ref)   {
        this.ref = ref;
    }

    @Override
    public void plugIn() {
        ref.startCooling();
    }
}
