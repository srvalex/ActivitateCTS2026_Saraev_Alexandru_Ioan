package adapter.AdapterObiecete.Format;

public class VGA {
    private String rezolutieMaxima;
    private int lungimeCablu;
    private int fps;

    public VGA(String rezolutieMaxima, int lungimeCablu, int fps) {
        this.rezolutieMaxima = rezolutieMaxima;
        this.lungimeCablu = lungimeCablu;
        this.fps = fps;
    }

    public int getFps() {
        return fps;
    }

    public String getRezolutieMaxima() {
        return rezolutieMaxima;
    }

    public void transmiteFluxVideoVGA() {
        System.out.println("Acest VGA transmite flux video la o rezolutie de " + this.rezolutieMaxima +" cu "+this.fps + " FPS");
    }
}
