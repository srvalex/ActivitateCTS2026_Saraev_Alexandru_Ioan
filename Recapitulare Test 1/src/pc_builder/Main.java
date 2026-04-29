package pc_builder;

import pc_builder.builder.AbstractPcBuilderV1;
import pc_builder.builder.BuilderV1;
import pc_builder.clase.ComputerV1;
import pc_builder.clase.ComputerV2;

public class Main {
    public static void main(String[] args) {
//        ComputerV1 comp = new ComputerV1("Core I5","Asus B250",8);
//        System.out.println(comp.toString());
        AbstractPcBuilderV1 builder = new BuilderV1(new ComputerV1("Core I5","Asus B250",8));
        ComputerV1 calc1 = builder.setBluetooth(false).setCoolingSystem("Water Cooled").setGPU("RTX 3060").setCPU("Core I9").build();
        ComputerV2.InnerBuilder builder2= new ComputerV2.InnerBuilder("Core I5","Asus B250",8);
        ComputerV2 comp = builder2.setBluetooth(false).setCoolingSystem("Air cooled").setGPU("1650ti").setWifi(true).build();
        System.out.println(calc1.toString());
        System.out.println(comp.toString());

    }
}
