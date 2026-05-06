package seminar_2.seminar_3_cts.main;

import seminar_2.seminar_3_cts.clase.Aplicant;
import seminar_2.seminar_3_cts.clase.readere.AngajatiReader;
import seminar_2.seminar_3_cts.clase.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
            AplicantReader angajatiReader = new AngajatiReader("src/seminar_2/angajati.txt");
			listaAngajati = angajatiReader.readAplicanti();
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatut();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
