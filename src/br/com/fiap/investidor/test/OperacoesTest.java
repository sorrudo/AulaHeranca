package br.com.fiap.investidor.test;

import br.com.fiap.investidor.business.OperacoesPfBusiness;
import br.com.fiap.investidor.business.OperacoesPjBusiness;

public class OperacoesTest {
    public static void main(String[] args) {
        OperacoesPfBusiness cliente = new OperacoesPfBusiness();
        OperacoesPjBusiness cliente2 = new OperacoesPjBusiness();
        cliente.aplicar();
        cliente2.aplicar();
        cliente2.encerrarInvestimento();

    }
}
