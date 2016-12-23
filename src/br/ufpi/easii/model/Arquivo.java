package br.ufpi.easii.model;

public class Arquivo {

		private String nome;
		private String fonte;
		private String path;
			
		public Arquivo(){}
		
		public String getFonte() {
			return fonte;
		}
		public void setFonte(String fonte) {
			this.fonte = fonte;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
}
