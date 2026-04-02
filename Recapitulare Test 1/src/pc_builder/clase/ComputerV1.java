package pc_builder.clase;

public class ComputerV1 {
    // Required
    private String cpu;
    private String motherboard;
    private int ramGb;
    // Optional
    private String gpu;           // may be null (integrated graphics)
    private int storageGb;        // default 0
    private boolean hasWifi;      // default false
    private boolean hasBluetooth; // default false
    private String coolingSystem; // may be null (stock cooler)
}
