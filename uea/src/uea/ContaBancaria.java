package uea;

public class ContaBancaria {
	private int numerodaconta;
	private Cliente cliente;
	private double money;
	
	public ContaBancaria(int numerodaconta, Cliente cliente) {
		this.numerodaconta = numerodaconta;
		this.cliente = cliente;
		this.money = 0.0; //money empty
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			money += valor;
			System.out.println("Deposit with sucess. new valour: "+money);
		}else {
			System.out.println("invalid.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && money >= valor) {
			money -= valor;
			System.out.println("exit with sucess. new valour: " +money);
		}else {
			System.out.println("invalid.");
		}
	}
	
	public int getNumerodaconta() {
		return numerodaconta;
	}
	public void setNumerodaconta(int numerodaconta) {
		this.numerodaconta = numerodaconta;
	}
	
	public double getMoney() {
		return money;
	}
	public Cliente getCliente() {
		return cliente;
	}
}