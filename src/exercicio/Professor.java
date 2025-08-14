package exercicio;

public class Professor {
    private String disciplina;
    private String nome;
    private int aulasMinistradas;
    private double salarioPorAula;

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

    public double getSalarioPorAula() {
        return salarioPorAula;
    }

    public void setSalarioPorAula(double salarioPorAula) {
        this.salarioPorAula = salarioPorAula;
    }
    
    public Professor(String nome, String disciplina, double salarioPorAula){
      if(!nome.isEmpty()) this.nome = nome;
      if(!disciplina.isEmpty()) this.disciplina = disciplina;
      if(salarioPorAula > 0) this.salarioPorAula = salarioPorAula;
      aulasMinistradas = 0;
    }
    
    public void ministrou(int aulas){
        aulasMinistradas += aulas;
    }
    
    public void novoMes(){
      aulasMinistradas = 0;
    }
    
    public double calcSalario(){
        return salarioPorAula * aulasMinistradas;
    }
    
    public void exibirDados(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Disciplina do professor: " + disciplina);
        System.out.println("Aulas Ministradas pelo professor: " + aulasMinistradas);
        System.out.println("Salário do professor: " + calcSalario());
    }
}
