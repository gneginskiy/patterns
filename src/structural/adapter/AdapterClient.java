package structural.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        TargetInterface targetInterfaceObj = new AdapteeToTargetInterfaceAdaptor(adaptee);
        new TargetInterfaceObjectsPrinter(targetInterfaceObj).printContent();
    }
}
