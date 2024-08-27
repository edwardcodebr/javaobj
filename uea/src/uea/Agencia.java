package uea;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private String name;
	private List<ContaBancaria> contas;
	
	public Agencia(String name) {
		this.name = name;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
		System.out.println("account added sucess. number of account: " +conta.getNumerodaconta());
	}
	
	public ContaBancaria buscarConta(int numerodaconta) {
		for (ContaBancaria conta : contas) {
			if (conta.getNumerodaconta() == numerodaconta) {
				return conta;
			}
		}
		System.out.println("account not found.");
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}