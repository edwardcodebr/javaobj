package aula.java.uau;

public class calculoopen {
	private int Salario;
	private String gerente;
	private String chefao;
	private double salariofuncionario;
	public double getSalariofuncionario() {
		return salariofuncionario;
	}
	public void setSalariofuncionario(double salariofuncionario) {
		this.salariofuncionario = salariofuncionario;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		this.Salario = salario;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public String getChefao() {
		return chefao;
	}
	public void setChefao(String chefao) {
		this.chefao = chefao;
	}
	public double getBonus() {
		return getSalario() * 1.5;
	}
	
	
}
