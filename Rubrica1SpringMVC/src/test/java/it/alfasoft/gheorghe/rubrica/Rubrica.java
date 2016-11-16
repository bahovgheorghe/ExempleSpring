package it.alfasoft.gheorghe.rubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	
	private String nomeRubrica;
	private List<Voce> contati = new ArrayList<>();
	
	public Rubrica(){}
	
	public Rubrica(String nome){
		this.nomeRubrica = nome;
	}

	public String getNomeRubrica() {
		return nomeRubrica;
	}

	public void setNomeRubrica(String nomeRubrica) {
		this.nomeRubrica = nomeRubrica;
	}

	public List<Voce> getVoci() {
		return contati;
	}

	public void setVoci(List<Voce> contati) {
		this.contati = contati;
	}
	
	public Voce getVoceByName(String nome){
		Voce voce = null;
		for(Voce contati : contati){
			if(contati.getNome().equals(nome)){
				voce = contati;
			}
			continue;
		}
		return voce;
	}
}
