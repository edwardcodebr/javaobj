package cadastro;

public class cadastro{
	  public String nome;
	  public int matricula;
	  public int idade;
	  public String curso;
	  public String sexo;
	  public cadastro(String nome, int matricula, int idade, String curso, String sexo){
	    this.nome = nome;
	    this.matricula = matricula;
	    this.idade = idade;
	    this.curso = curso;
	    this.sexo = sexo;
	  }
	 
	  public String nome(){
	    return nome;
	  }

	  public int matricula(){
	    return matricula;
	  }

	  public int idade() {
	    return idade;
	  }

	  public String curso() {
	    return curso;
	  }

	  public String sexo() {
	    return sexo;
	  }
	}