package tabelas;

public class Simbolo {
	private Categoria categoria;
    private int tipo;
    private String valor;
    private int endereco;
    
    public Simbolo(Categoria categoria, int tipo, String valor, int endereco) {
		super();
		this.categoria = categoria;
		this.tipo = tipo;
		this.valor = valor;
		this.endereco = endereco;
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

	public int getEndereco() {
		return endereco;
	}

	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
}