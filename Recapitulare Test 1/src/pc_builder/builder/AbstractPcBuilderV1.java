package pc_builder.builder;

import pc_builder.clase.ComputerV1;

public interface AbstractPcBuilderV1 {
    AbstractPcBuilderV1 setCPU(String cpuName);
    AbstractPcBuilderV1 setMotherboard(String motherboard);
    AbstractPcBuilderV1 setRamStorage(int ramStorage);
    AbstractPcBuilderV1 setGPU(String gpuName);
    AbstractPcBuilderV1 setStorage(int storageGb);
    AbstractPcBuilderV1 setWifi(boolean hasWifi);
    AbstractPcBuilderV1 setBluetooth(boolean bluetooth);
    AbstractPcBuilderV1 setCoolingSystem(String coolingSystem);
    ComputerV1 build();
}
