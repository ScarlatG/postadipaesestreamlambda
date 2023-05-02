package it.prova.postadipaesestreamlambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// PostaDiPaese (denominazione, indirizzoSede, dataApertura, numeroDipendenti, destinatari)

public class PostaDiPaese {

	private Long id;
	private String denominazione;
	private String indirizzoSede;
	private Date dataApertura;
	private Integer numeroDipendenti;

	private List<Destinatario> destinatari = new ArrayList<Destinatario>();

	public PostaDiPaese() {
		super();
	}

	public PostaDiPaese(Long id, String denominazione, String indirizzoSede, Date date, Integer numeroDipendenti) {
		super();
		this.id = id;
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = date;
		this.numeroDipendenti = numeroDipendenti;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Integer getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(Integer numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public List<Destinatario> getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}

	@Override
	public String toString() {
		return "PostaDiPaese [id=" + id + ", denominazione=" + denominazione + ", indirizzoSede=" + indirizzoSede
				+ ", dataApertura=" + dataApertura + ", numeroDipendenti=" + numeroDipendenti + "]";
	}

}