package user;

public class Teste {

    public static void main(String[] args) {
        AutenticacaoControle controle = new AutenticacaoControle();
        Diretor d1 = new Diretor(1234);
        Diretor d2 = new Diretor(5678);
        Gerente g1 = new Gerente(9999);
        Gerente g2 = new Gerente(7777);
        Cliente c1 = new Cliente();
        c1.setSenha(5555);

        controle.efetuarLogin(d1, 1234);
        controle.efetuarLogin(g1, 9999);
        controle.efetuarLogin(c1, 5555);

        System.out.println("Usuários logados: " + controle.getContador());
    }
}
