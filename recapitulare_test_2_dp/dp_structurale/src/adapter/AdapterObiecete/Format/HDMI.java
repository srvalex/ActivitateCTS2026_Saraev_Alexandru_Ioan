package adapter.AdapterObiecete.Format;

public class HDMI {
    private String rezolutieMaxima;
    private int fps;

    public HDMI(String rezolutieMaxima, int fps) {
        this.rezolutieMaxima = rezolutieMaxima;
        this.fps = fps;
    }


    public void transmiteFluxVideoHDMI() {
        System.out.println("Acest HDMI transmite flux video la o rezolutie de " + this.rezolutieMaxima +" cu "+this.fps + " FPS");
    }
}
