package pc_builder.clase;

public class ComputerV1 {
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

    public ComputerV1(String cpu, String motherboard, int ramGb) {
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
}
