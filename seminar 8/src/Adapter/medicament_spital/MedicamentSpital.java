package Adapter.medicament_spital;

public class MedicamentSpital {
    protected boolean verificaReteta() {
        return true;
    }

    public void cumparaMedicament(){
        System.out.println(verificaReteta() ? "Medicament cumparat" : "Reteta invalida");
    }
}
