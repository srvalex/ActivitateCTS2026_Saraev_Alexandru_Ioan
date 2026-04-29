package pc_builder.builder;

import pc_builder.clase.ComputerV2;

public interface AbstractPcBuilderV2 {
    AbstractPcBuilderV2 setCPU(String cpuName);
    AbstractPcBuilderV2 setMotherboard(String motherboard);
    AbstractPcBuilderV2 setRamStorage(int ramStorage);
    AbstractPcBuilderV2 setGPU(String gpuName);
    AbstractPcBuilderV2 setStorage(int storageGb);
    AbstractPcBuilderV2 setWifi(boolean hasWifi);
    AbstractPcBuilderV2 setBluetooth(boolean bluetooth);
    AbstractPcBuilderV2 setCoolingSystem(String coolingSystem);
    ComputerV2 build();
}
