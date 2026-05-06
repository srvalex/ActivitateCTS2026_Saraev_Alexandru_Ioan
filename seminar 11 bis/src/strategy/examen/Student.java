package strategy.examen;

public class Student {
    private SustinereExamen modSustinere;

    public Student(SustinereExamen modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student() {
        this.modSustinere = new ExamenOral();
    }


    public void setModSustinere(SustinereExamen mod){
        modSustinere = mod;
    }

    public void examinare() {
        modSustinere.sustinereExamen();
    }
}
