package it.prova.postadipaesestreamlambda;

// Destinatario(nome, cognome, eta, indirizzo, boolean possessoreDiContoCorrente, postaDiPaese

public class Destinatario {

	private Long id;
	private String nome;
	private String cognome;
	private Integer eta;
	private String indirizzo;
	private Boolean possessoreDiContoCorrente;
	private PostaDiPaese postaDiPaese;

	public Destinatario() {
		super();
	}

	public Destinatario(Long id, String nome, String cognome, Integer eta, String indirizzo,
			Boolean possessoreDiContoCorrente, PostaDiPaese postaDiPaese) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
		this.postaDiPaese = postaDiPaese;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Boolean getPossessoreDiContoCorrente() {
		return possessoreDiContoCorrente;
	}

	public void setPossessoreDiContoCorrente(Boolean possessoreDiContoCorrente) {
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
	}

	public PostaDiPaese getPostaDiPaese() {
		return postaDiPaese;
	}

	public void setPostaDiPaese(PostaDiPaese postaDiPaese) {
		this.postaDiPaese = postaDiPaese;
	}

	@Override
	public String toString() {
		return "Destinatario [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzo="
				+ indirizzo + ", possessoreDiContoCorrente=" + possessoreDiContoCorrente + "]";
	}

}