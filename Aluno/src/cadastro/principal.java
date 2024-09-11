package cadastro;

public class principal{
	  public static void main(String[] args){
	    cadastro aluno1 = new cadastro("João", 1, 20, "Informática", "Masculino");
	    aluno1.nome();
	    aluno1.matricula();
	    aluno1.idade();
	    aluno1.curso();
	    aluno1.sexo();
	    cadastro aluno2 = new cadastro("Maria", 2, 21, "Informática", "Feminino");
	    aluno2.nome();
	    aluno2.matricula();
	    aluno2.idade();
	    aluno2.curso();
	    aluno2.sexo();
	    cadastro aluno3 = new cadastro("Pedro", 3, 22, "Fisica", "Masculino");
	    aluno3.nome();
	    aluno3.matricula();
	    aluno3.idade();
	    aluno3.curso();
	    aluno3.sexo();

	    System.out.println("Lista de alunos de PPO.");
	    System.out.println("Aluno 1");
	    System.out.println("Nome: " +aluno1.nome);
	    System.out.println("Matricula: " +aluno1.matricula);
	    System.out.println("idade: " +aluno1.idade);
	    System.out.println("Curso: " +aluno1.curso);
	    System.out.println(" ");
	    System.out.println("Aluno 2");
	    System.out.println("Nome: " +aluno2.nome);
	    System.out.println("Matricula: " +aluno2.matricula);
	    System.out.println("idade: " +aluno2.idade);
	    System.out.println("Curso: " +aluno2.curso);
	    System.out.println(" ");
	    System.out.println("Aluno 3");
	    System.out.println("Nome: " +aluno3.nome);
	    System.out.println("Matricula: " +aluno3.matricula);
	    System.out.println("idade: " +aluno3.idade);
	    System.out.println("Curso: " +aluno3.curso);
	  }
	}