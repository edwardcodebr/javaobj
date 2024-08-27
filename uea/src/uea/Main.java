package uea;

public class Main {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Eduardo Correa", "123.456.789-00", "Street A, 123");
		Cliente cliente2 = new Cliente("Lucas Fernando", "987.654.321-00", "Park B, 123");
		
		Agencia agencia = new Agencia("Central Agency USA.");
		
		ContaBancaria conta1 = new ContaBancaria(1, cliente1);
		ContaBancaria conta2 = new ContaBancaria(2, cliente2);
		
		agencia.adicionarConta(conta1);
		agencia.adicionarConta(conta2);
		
		conta1.depositar(3000.00);
		conta1.sacar(400.00);
		
		conta2.depositar(3000.00);
		conta2.sacar(800.00);
	}
}
