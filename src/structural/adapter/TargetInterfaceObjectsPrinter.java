package structural.adapter;

import java.util.stream.Stream;

public class TargetInterfaceObjectsPrinter {
    private final TargetInterface targetInterfaceObj;

    public TargetInterfaceObjectsPrinter(TargetInterface targetInterfaceObj) {
        this.targetInterfaceObj = targetInterfaceObj;
    }

    public void printContent() {
        Stream.of(targetInterfaceObj.getCharsData()).forEach(System.out::print);
    }
}
