package poo.polimorfismo.sobrescrita.folha_pagamento;

public class EmpregadoMensalista extends Empregado {
    private double salario;
    private double taxaEncargosTrab;

    public EmpregadoMensalista(String cpf, String rg, double salario, double taxaEncargosTrab) {
        super(cpf, rg);
        this.salario = salario;
        this.taxaEncargosTrab = taxaEncargosTrab;
    }

    @Override
    double pagamentoMensal() {
        return salario*taxaEncargosTrab;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
