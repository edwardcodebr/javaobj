package prova;

public class Produto {
	 private String nome;
	    private Categoria categoria;

	    public Produto(String nome, Categoria categoria) {
	        this.nome = nome;
	        this.categoria = categoria;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }

	    @Override
	    public String toString() {
	        return "Nome: " + nome + ", Categoria: " + categoria.getNome();
	    }
}
