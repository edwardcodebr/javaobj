package user;

public class Funcionario {
	private String nome;
	private String email;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario2) {
		this.salario = salario2;
	}
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean autenticar(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
