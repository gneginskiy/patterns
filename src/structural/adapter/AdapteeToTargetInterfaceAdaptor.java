package structural.adapter;

public class AdapteeToTargetInterfaceAdaptor implements TargetInterface {
    private final Adaptee adaptee;


    AdapteeToTargetInterfaceAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public char[] getCharsData() {
        return adaptee.getDataString().toCharArray();
    }
}
