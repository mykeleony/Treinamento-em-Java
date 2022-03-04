package poo.polimorfismo.sobrescrita.folha_pagamento;

public class EmpregadoAvulso extends Empregado {
    private double pagamento;

    // Construtor:
    public EmpregadoAvulso(String cpf, String rg, double pagamento) {
        super(cpf, rg);
        this.pagamento = pagamento;
    }

    
    @Override
    public double pagamentoMensal() {
        return pagamento;
    }


    /* Métodos de acesso e modificação */
    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

}
