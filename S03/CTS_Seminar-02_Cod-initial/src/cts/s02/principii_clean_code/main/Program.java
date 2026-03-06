package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AngajatReader;
import cts.s02.principii_clean_code.readers.AplicantReader;
import cts.s02.principii_clean_code.readers.ElevReader;
import cts.s02.principii_clean_code.readers.StudentReader;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		List<Aplicant> listaStudenti = new ArrayList<>();
		AplicantReader aplicantReader = new StudentReader();
		try {
			listaStudenti = aplicantReader.citireAplicanti("C:/CTS/S03/CTS_Seminar-02_Cod-initial/studenti.txt");
			for(Aplicant aplicant : listaStudenti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		List<Aplicant> listaAngajati = new ArrayList<>();
		AplicantReader aplicantReader1 =new AngajatReader();
		listaAngajati = aplicantReader1.citireAplicanti("C:/CTS/S03/CTS_Seminar-02_Cod-initial/angajati.txt");
		for(Aplicant aplicant:listaAngajati)
			System.out.println(aplicant.toString());


		List<Aplicant> listaElevi = new ArrayList<>();
		AplicantReader aplicantReader2 =new ElevReader();
		listaElevi = aplicantReader2.citireAplicanti("C:/CTS/S03/CTS_Seminar-02_Cod-initial/elevi.txt");
		for(Aplicant aplicant:listaElevi)
			System.out.println(aplicant.toString());
	}

}
