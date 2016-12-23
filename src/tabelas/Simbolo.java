package tabelas;

public class Simbolo {
	private Categoria categoria;
    private int tipo;
    private String valor;
    
    public Simbolo(Categoria categoria, int tipo, String valor) {
		super();
		this.categoria = categoria;
		this.tipo = tipo;
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}