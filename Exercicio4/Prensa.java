package Exercicio4;

public class Prensa extends Maquina {

    public Prensa(String codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println(getNome() + " está realizando conformação.");
    }

}
