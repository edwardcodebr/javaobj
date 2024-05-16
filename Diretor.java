package user;

public class Diretor extends Funcionario{
	private int senha;

	public Diretor(double salario) {
		setSalario(salario);
	}

	public Diretor(int senha) {
		setSenha(senha);
	}

	@Override
	public double getBonus() {
		return getSalario() * 2;
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
