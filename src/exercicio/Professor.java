package exercicio;

public class Professor {
    private String disciplina;
    private String nome;
    private int aulasMinistradas;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Professor(String nome, String disciplina){
      if(!nome.isEmpty()) this.nome = nome;
      if(!disciplina.isEmpty()) this.disciplina = disciplina;
      aulasMinistradas = 0;
    }
    
    public void ministrou(int aulas){
        aulasMinistradas += aulas;
    }
    
    public void novoMes(){
      aulasMinistradas = 0;
    }
    
    public void ExibirDados(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Disciplina do professor: " + disciplina);
        System.out.println("Aulas Ministradas pelo professor: " + aulasMinistradas);
    }
}
