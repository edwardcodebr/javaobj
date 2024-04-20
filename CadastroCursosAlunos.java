import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroCursosAlunos {
    private ArrayList<String> listaCursos;
    private ArrayList<String> listaAlunos;

    public CadastroCursosAlunos() {
        this.listaCursos = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
    }

    public boolean cadastrarCurso() {
        String nomeCurso = JOptionPane.showInputDialog(null, "Informe o nome do curso: (Engenharia da Computação, Engenharia Civil, Engenharia Quimica, Engenharia de Software, Engenharia de Produção, Engenharia Naval, Sistema de Informação.");
        if (nomeCurso != null && !nomeCurso.isEmpty()) {
            this.listaCursos.add(nomeCurso);
            return true;
        }
        return false;
    }

    public String buscarCurso(String nomeCurso) {
        for (String curso : this.listaCursos) {
            if (curso.equals(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }

    public void listarCursos() {
        StringBuilder cursos = new StringBuilder("Cursos cadastrados:\n");
        for (String curso : this.listaCursos) {
            cursos.append(curso).append("\n");
        }
        JOptionPane.showMessageDialog(null, cursos.toString());
    }

    public static void main(String[] args) {
        CadastroCursosAlunos cadastro = new CadastroCursosAlunos();

        // Exemplo de cadastro de cursos
        boolean cursoCadastrado = cadastro.cadastrarCurso();
        if (cursoCadastrado) {
            JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar curso.");
        }

        // Exemplo de listagem de cursos
        cadastro.listarCursos();

        // Exemplo de busca por curso
        String cursoBuscado = cadastro.buscarCurso("Engenharia da Computação");
        String cursoBuscado1 = cadastro.buscarCurso("Engenharia Civil");
        String cursoBuscado2 = cadastro.buscarCurso("Engenharia Quimica");
        String cursoBuscado3 = cadastro.buscarCurso("Engenharia de Software");
        String cursoBuscado4 = cadastro.buscarCurso("Engenharia de Produção");
        String cursoBuscado5 = cadastro.buscarCurso("Engenharia Naval");
        String cursoBuscado6 = cadastro.buscarCurso("Sistema de Informação");
        if (cursoBuscado != null) {
            JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoBuscado + cursoBuscado1 + cursoBuscado2 + cursoBuscado3 + cursoBuscado4 + cursoBuscado5 + cursoBuscado6);   
        }
            if (cursoBuscado1 != null) {
                JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoBuscado1);   
            }
                if (cursoBuscado2 != null) {
                    JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoBuscado2);   
                }
                    if (cursoBuscado3 != null) {
                        JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoBuscado3);   
                    }
                        if (cursoBuscado4 != null) {
                            JOptionPane.showMessageDialog(null, "Curso encontrado: "  + cursoBuscado4);   
                        }
                            if (cursoBuscado5 != null) {
                                JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoBuscado5 );   
                            }
                                if (cursoBuscado6 != null) {
                                    JOptionPane.showMessageDialog(null, "Curso encontrado: " +cursoBuscado6);       
        } else {
            JOptionPane.showMessageDialog(null, "Curso não encontrado.");
        }
    }
}
