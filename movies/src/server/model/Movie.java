package server.model;

import java.util.Date;

public class Movie {
	
	private String name;
	private String diretor;
	private String elenco;
	private Date anoLancamento;
	private String genero;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public Date getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}