package it.prova.postadipaesestreamlambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<PostaDiPaese> listaPostaDiPaeseMOCK = MockData.POSTADIPAESE_LIST;

		// Tutte le poste il cui indirizzo contenga ("mi")
		System.out.println("1. Tutte le poste il cui indirizzo contenga (\"mi\")");
		List<PostaDiPaese> listaPosteCheContengonoMi = listaPostaDiPaeseMOCK.stream()
				.filter(p -> p.getIndirizzoSede().contains("mi")).collect(Collectors.toList());

		listaPosteCheContengonoMi.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- PROSSIMO TEST ----------");
		System.out.println("\n");

		// Tutte le poste che sono state aperte dopo il primo Marzo 2019
		System.out.println("2. Tutte le poste che sono state aperte dopo il primo Marzo 2019");
		List<PostaDiPaese> listaPosteCheSonoStateAperteDopoIlPrimoMarzo = listaPostaDiPaeseMOCK.stream().filter(p -> {
			try {
				return p.getDataApertura().compareTo(new SimpleDateFormat("dd-MM-yyyy").parse("01-03-2019")) > 0;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}).collect(Collectors.toList());

		listaPosteCheSonoStateAperteDopoIlPrimoMarzo.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- PROSSIMO TEST ----------");
		System.out.println("\n");

		// Lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20
		System.out.println("3. Lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20");
		List<String> listaIndirizziPosteNumeroDipendentiMaggioreVenti = listaPostaDiPaeseMOCK.stream()
				.filter(p -> p.getNumeroDipendenti() > 20).map(p -> p.getIndirizzoSede()).collect(Collectors.toList());

		listaIndirizziPosteNumeroDipendentiMaggioreVenti.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- PROSSIMO TEST ----------");
		System.out.println("\n");

		// Lista di indirizzi di destinatari di poste con almeno 10 dipendenti
		System.out.println("4. La lista di indirizzi di destinatari di poste con almeno 10 dipendenti");
		List<String> listaIndirizziDestinatariDiPosteConDieciDipendenti = listaPostaDiPaeseMOCK.stream()
				.filter(p -> p.getNumeroDipendenti() > 10)
				.flatMap(p -> p.getDestinatari().stream().map(x -> x.getIndirizzo())).collect(Collectors.toList());

		listaIndirizziDestinatariDiPosteConDieciDipendenti.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- PROSSIMO TEST ----------");
		System.out.println("\n");

		// Lista di destinatari possessori di conto corrente ma appartenenti a poste con
		// numero dipendenti compreso tra 50 e 100
		System.out.println(
				"5. Lista di destinatari possessori di conto corrente ma appartenenti a poste con numero dipendenti compreso tra 50 e 100");
		List<Destinatario> listaDestinariConContoCorrentePosteDipendetiTraCinquaECento = listaPostaDiPaeseMOCK.stream()
				.filter(p -> p.getNumeroDipendenti() > 50 && p.getNumeroDipendenti() < 100)
				.flatMap(p -> p.getDestinatari().stream().filter(x -> x.getPossessoreDiContoCorrente() == true))
				.collect(Collectors.toList());

		listaDestinariConContoCorrentePosteDipendetiTraCinquaECento.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- PROSSIMO TEST ----------");
		System.out.println("\n");
		
		// Lista delle età dei destinatari delle poste che contengano nel campo denominazione la stringa ‘Centrale’ e siano state aperta almeno dal primo gennaio 2000.
		System.out.println("6. Lista delle età dei destinatari delle poste che contengano nel campo denominazione la stringa ‘Centrale’ e siano state aperta almeno dal primo gennaio 2000;");
		List<Integer> listaDestinariConContiCorrenti = listaPostaDiPaeseMOCK
				.stream()
				.filter( p -> {
					try {
						return p.getDenominazione().contains("centrale") && p.getDataApertura().compareTo(new SimpleDateFormat("dd-mm-yyyy").parse("01-01-2000")) > 0;
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return false;
				})
				.flatMap( p -> p.getDestinatari().stream().map(x -> x.getEta()))
				.collect(Collectors.toList());
		
		listaDestinariConContiCorrenti.forEach(p -> System.out.println(p));
		System.out.println("\n");
		System.out.println("---------- FINE TEST ----------");
		System.out.println("\n");
	}

}
