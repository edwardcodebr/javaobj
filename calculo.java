package aula.java.uau;

public class calculo {
	public static void main(String[] args) {
		calculoopen calculo = new calculoopen();
		calculo.setSalario(1300);
		Gerente chefao = new Gerente();
		chefao.setSalario(5000);
		System.out.println("bonus do funcionario:" +
		calculo.getBonus());
		System.out.println("bonus do chefe:" +
		chefao.getBonus());
}
}