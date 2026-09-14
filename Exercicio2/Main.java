package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Funcionario op = new Operador("João", "OP-01", 2000, 10, 25.0);
        Funcionario sup = new Supervisor("Marcia", "SUP-01", 4000, 1500);

        op.exibirDados();
        System.out.println("Salário: " + op.calcularSalario());

        System.out.println();

        sup.exibirDados();
        System.out.println("Salário: " + sup.calcularSalario());
    }
}
