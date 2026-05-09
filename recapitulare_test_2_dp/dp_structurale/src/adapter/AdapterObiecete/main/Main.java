package adapter.AdapterObiecete.main;

import adapter.AdapterObiecete.Format.AdaptorVgaLaHDMI;
import adapter.AdapterObiecete.Format.HDMI;
import adapter.AdapterObiecete.Format.VGA;

public class Main {

    public static void transmiteFluxVgaPrinHDMI(HDMI adaptorHDMI){
        adaptorHDMI.transmiteFluxVideoHDMI();
    }


    public static void main(String[] args) {
        HDMI hdmi = new HDMI("2440 x 1080",120);
        VGA vga = new VGA("1920 x 720", 5,30);

        HDMI adaptorVgaLaHDMI = new AdaptorVgaLaHDMI("-1",0,vga);

        hdmi.transmiteFluxVideoHDMI();
        vga.transmiteFluxVideoVGA();
        adaptorVgaLaHDMI.transmiteFluxVideoHDMI();
        transmiteFluxVgaPrinHDMI(adaptorVgaLaHDMI);
    }
}
