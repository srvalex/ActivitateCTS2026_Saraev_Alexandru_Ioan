package pc_builder.clase;

import pc_builder.builder.AbstractPcBuilderV2;
import pc_builder.builder.AbstractPcBuilderV2;

public class ComputerV2 {
    // Required
    private String cpu;
    private String motherboard;
    private int ramGb;
    // Optional
    private String gpu = null;           // may be null (integrated graphics)
    private int storageGb = 0;        // default 0
    private boolean hasWifi = false;      // default false
    private boolean hasBluetooth = false; // default false
    private String coolingSystem = "stock"; // may be null (stock cooler)

    private ComputerV2(String cpu, String motherboard, int ramGb) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ramGb = ramGb;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComputerV1{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", motherboard='").append(motherboard).append('\'');
        sb.append(", ramGb=").append(ramGb);
        sb.append(", gpu='").append(gpu).append('\'');
        sb.append(", storageGb=").append(storageGb);
        sb.append(", hasWifi=").append(hasWifi);
        sb.append(", hasBluetooth=").append(hasBluetooth);
        sb.append(", coolingSystem='").append(coolingSystem).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public void setStorageGb(int storageGb) {
        this.storageGb = storageGb;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public static class InnerBuilder implements AbstractPcBuilderV2 {
        
        ComputerV2 computerV2;
        public InnerBuilder (String cpu, String motherboard, int ram) {
            computerV2 = new ComputerV2(cpu,motherboard,ram);
        }

        @Override
        public AbstractPcBuilderV2 setCPU(String cpuName) {
            this.computerV2.setCpu(cpuName);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setMotherboard(String motherboard) {
            this.computerV2.setMotherboard(motherboard);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setRamStorage(int ramStorage) {
            this.computerV2.setRamGb(ramStorage);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setGPU(String gpuName) {
            this.computerV2.setGpu(gpuName);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setStorage(int storageGb) {
            this.computerV2.setStorageGb(storageGb);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setWifi(boolean hasWifi) {
            this.computerV2.setHasWifi(hasWifi);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setBluetooth(boolean bluetooth) {
            this.computerV2.setHasBluetooth(bluetooth);
            return this;
        }

        @Override
        public AbstractPcBuilderV2 setCoolingSystem(String coolingSystem) {
            this.computerV2.setCoolingSystem(coolingSystem);
            return this;
        }

        @Override
        public ComputerV2 build() {
            return this.computerV2;
        }
    }
}
