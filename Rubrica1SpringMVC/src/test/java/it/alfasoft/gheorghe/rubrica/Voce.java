package it.alfasoft.gheorghe.rubrica;

public class Voce {
	
	private String cognome;
	private String nome;
	private String cell;
	
	public Voce(){}
	
	public Voce(String cognome, String nome, String cell){
		this.cognome = cognome;
		this.nome = nome;
		this.cell = cell;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String telefono) {
		this.cell = telefono;
	}
}
