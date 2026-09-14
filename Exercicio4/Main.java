package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Maquina> maquinas = new ArrayList<>();
        maquinas.add(new Esteira("ESQ-01", "Esteira A", "ativa"));
        maquinas.add(new RoboIndustrial("ROB-01", "Robo B", "ativo"));
        maquinas.add(new Prensa("PRE-01", "Prensa C", "ativa"));

        for (Maquina m : maquinas) {
            m.operar();
        }
    }
}
