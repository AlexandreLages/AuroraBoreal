package semantica;

public class Variavel {
	private int enredeco;
	private String tipo;
	
	public Variavel(int enredeco, String tipo) {
		super();
		this.enredeco = enredeco;
		this.tipo = tipo;
	}

	public int getEnredeco() {
		return enredeco;
	}

	public void setEnredeco(int enredeco) {
		this.enredeco = enredeco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}