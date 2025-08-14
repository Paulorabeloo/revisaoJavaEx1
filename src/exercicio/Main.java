package exercicio;

public class Main {
 
    public static void main(String[] args) {
        Professor professor1 = new Professor("Lucas", "POO", 350);
        professor1.ministrou(40);
        professor1.exibirDados();
        
        professor1.novoMes();
        professor1.exibirDados();

    }
}
