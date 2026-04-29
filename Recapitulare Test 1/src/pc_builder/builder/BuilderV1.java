package pc_builder.builder;

import pc_builder.clase.ComputerV1;

public class BuilderV1 implements AbstractPcBuilderV1{
    private ComputerV1 calculator;

    public BuilderV1 (ComputerV1 calculator){
        this.calculator = new ComputerV1(calculator.getCpu(), calculator.getMotherboard(),calculator.getRamGb());
    }

    @Override
    public AbstractPcBuilderV1 setCPU(String cpuName) {
        this.calculator.setCpu(cpuName);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setMotherboard(String motherboard) {
        this.calculator.setMotherboard(motherboard);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setRamStorage(int ramStorage) {
        this.calculator.setRamGb(ramStorage);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setGPU(String gpuName) {
        this.calculator.setGpu(gpuName);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setStorage(int storageGb) {
        this.calculator.setStorageGb(storageGb);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setWifi(boolean hasWifi) {
        this.calculator.setHasWifi(hasWifi);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setBluetooth(boolean bluetooth) {
        this.calculator.setHasBluetooth(bluetooth);
        return this;
    }

    @Override
    public AbstractPcBuilderV1 setCoolingSystem(String coolingSystem) {
        this.calculator.setCoolingSystem(coolingSystem);
        return this;
    }

    @Override
    public ComputerV1 build() {
        return this.calculator;
    }
}
