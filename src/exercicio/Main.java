package exercicio;

public class Main {
 
    public static void main(String[] args) {
        Professor professor1 = new Professor("Lucas", "POO");
        professor1.ministrou(60);
        professor1.ExibirDados();
        
        professor1.novoMes();
        professor1.ExibirDados();
    }
}
