package tabelas;

import java.util.HashMap;

public class Funcao {
	
	private int tipoRetorno;
	private HashMap<String, Simbolo> parametros;
	private String valorRetorno;

	public int getTipoRetorno() {
		return tipoRetorno;
	}

	public void setTipoRetorno(int tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	public HashMap<String, Simbolo> getParametros() {
		return parametros;
	}

	public void setParametros(HashMap<String, Simbolo> parametros) {
		this.parametros = parametros;
	}

	public String getValorRetorno() {
		return valorRetorno;
	}

	public void setValorRetorno(String valorRetorno) {
		this.valorRetorno = valorRetorno;
	}


}
