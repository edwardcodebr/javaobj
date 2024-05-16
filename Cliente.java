package user;

public class Cliente implements IUser {
	private int senha;
	private String nome;
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public boolean autenticar(int senha) {
		return false;
	}
}
