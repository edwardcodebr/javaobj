package user;

public class AutenticacaoControle {
	private int contador;

	public int getContador() {
		return contador;
	}

	public void efetuarLogin(Gerente g1, int senha) {
		if (g1.autenticar(senha)) {
			contador++;
		}
}

	public void efetuarLogin(Diretor d1, int senha) {
		// TODO Auto-generated method stub
		contador++;
	}

	public void efetuarLogin(Cliente c1, int senha) {
		// TODO Auto-generated method stub
		contador++;
	}

	public int getContador1() {
		// TODO Auto-generated method stub
		return contador;
	}   
}
