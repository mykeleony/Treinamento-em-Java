package poo.polimorfismo.sobrescrita.folha_pagamento;

public class EmpregadoHorista extends Empregado {
    private double valorHora;
    private double horasTrabalhadas;
    
    EmpregadoHorista(String cpf, String rg, double valorHora, double horasTrabalhadas) {
        super(cpf, rg);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double pagamentoMensal() {
        return valorHora*horasTrabalhadas;
    }
    
    /* Métodos acessadores e modificadores: */
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
