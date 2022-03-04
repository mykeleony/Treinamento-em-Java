package poo.polimorfismo.sobrescrita.folha_pagamento;

import java.util.ArrayList;
import java.util.List;

public abstract class Empregado {
    private String cpf;
    private String rg;

    Empregado(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    abstract double pagamentoMensal();

    
    public static void main(String[] args) {
        List<Empregado> corpoTrabalho = new ArrayList<>(); 

        corpoTrabalho.add(new EmpregadoAvulso("123.456.789-05", "12.546.546-X", 7000));
        corpoTrabalho.add(new EmpregadoHorista("456.485.542-44", "45.542.214-X", 100, 30));
        corpoTrabalho.add(new EmpregadoMensalista("546.482.315-74", "82.123.418-X", 5000, 1.8));

        double custoTotal = 0;

        for(Empregado e: corpoTrabalho)
            custoTotal += e.pagamentoMensal();
        
        System.out.println("A folha de pagamento deste mês custará "+custoTotal);
    }
}
