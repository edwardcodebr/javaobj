package aula.java.uau;

public class Gerente extends calculoopen{
	private int senha;
	public double getBonus() {
		return getSalario() * 0.15;
	}
	
	public boolean autenticar(int senha) {
		return this.senha == senha;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
