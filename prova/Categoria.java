package prova;

public class Categoria {
	 private static int contador = 0;
	    private int codigo;
	    private String nome;

	    public Categoria(String nome) {
	        this.codigo = ++contador;
	        this.nome = nome;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    @Override
	    public String toString() {
	        return "Categoria{" +
	                "codigo=" + codigo +
	                ", nome='" + nome + '\'' +
	                '}';
	    }
}
