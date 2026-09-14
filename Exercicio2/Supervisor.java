package Exercicio2;

public class Supervisor extends Funcionario {

    private double bonus;

    public Supervisor(String nome, String matricula, double salarioBase, double bonus) {
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: " + bonus);
    }

}
