package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorArrayTest {
    public static void main(String[] args) {
        InvestidorPF[] investidores = new InvestidorPF[5];
        investidores[0] = new InvestidorPF("Radam", 2000);
        investidores[1] = new InvestidorPF("Rodrigo", 40050);
        investidores[2] = new InvestidorPF("Fabiana", 3500);
        investidores[3] = new InvestidorPF("Geovana", 2546);
        investidores[4] = new InvestidorPF("Jorge", 875620);



        for (InvestidorPF investidorPF : investidores){
            System.out.println(investidorPF);
        }
    }
}
