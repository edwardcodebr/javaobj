package user;

public class Gerente extends Funcionario{
	private int senha;

	public Gerente(double salario) {
		setSalario(salario);
	}

	public Gerente(int senha) {
		setSenha(senha);
	}

	@Override
	public double getBonus() {
		return getSalario() * 1.5;
	}

	@Override
	public boolean autenticar(int senha) {
		return getSenha() == senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
