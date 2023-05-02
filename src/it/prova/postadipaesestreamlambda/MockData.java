package it.prova.postadipaesestreamlambda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MockData {

	public static final List<PostaDiPaese> POSTADIPAESE_LIST = new ArrayList<PostaDiPaese>();

	static {

		try {

			PostaDiPaese roma = new PostaDiPaese(1L, "Roma", "Via Appia Ottimia, 123",
					new SimpleDateFormat("dd-MM-yyyy").parse("10-11-2023"), 50);
			Destinatario marioDiroma = new Destinatario(1L, "Mario", "Rossi", 35, "Via Appia Nuova, 124", true, roma);
			roma.getDestinatari().add(marioDiroma);
			Destinatario giuliaDiRoma = new Destinatario(2L, "Giulia", "Verdi", 28, "Via Appia Nuova, 125", false,
					roma);
			roma.getDestinatari().add(giuliaDiRoma);

			PostaDiPaese milano = new PostaDiPaese(2L, "Milano", "Via della Spiga, 1",
					new SimpleDateFormat("dd-MM-yyyy").parse("10-11-2023"), 30);
			Destinatario andreaDiMilano = new Destinatario(3L, "Andrea", "Bianchi", 43, "Via della Spiga, 2", true,
					milano);
			milano.getDestinatari().add(andreaDiMilano);
			Destinatario lauraDiMilano = new Destinatario(4L, "Laura", "Neri", 26, "Via della Spiga, 3", false, milano);
			milano.getDestinatari().add(lauraDiMilano);

			PostaDiPaese torino = new PostaDiPaese(3L, "Torino", "Via Lagrange, 10",
					new SimpleDateFormat("dd-MM-yyyy").parse("10-11-2023"), 20);
			Destinatario lucaDiTorino = new Destinatario(5L, "Luca", "Rossi", 37, "Via Lagrange, 11", true, torino);
			torino.getDestinatari().add(lucaDiTorino);
			Destinatario chiaraDiTorino = new Destinatario(6L, "Chiara", "Verdi", 31, "Via Lagrange, 12", false,
					torino);
			torino.getDestinatari().add(chiaraDiTorino);

			POSTADIPAESE_LIST.add(roma);
			POSTADIPAESE_LIST.add(milano);
			POSTADIPAESE_LIST.add(torino);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
