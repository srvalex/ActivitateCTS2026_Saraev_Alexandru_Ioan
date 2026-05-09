package adapter.AdapterObiecete.Format;

public class AdaptorVgaLaHDMI extends HDMI{

    private VGA vgaDeAdaptat;

    public AdaptorVgaLaHDMI(String rezolutieMaxima, int fps, VGA vgaDeAdaptat) {
        super(rezolutieMaxima, fps);
        this.vgaDeAdaptat = vgaDeAdaptat;
    }

    @Override
    public void transmiteFluxVideoHDMI() {
//        System.out.println("Fluxul original este VGA, insa este adaptat la HDMI. Se trnasmite la rezolutia "+ this.vgaDeAdaptat.getRezolutieMaxima()
//        + " la o viteza de " +this.vgaDeAdaptat.getFps() + " FPS");
        this.vgaDeAdaptat.transmiteFluxVideoVGA();
    }
}
