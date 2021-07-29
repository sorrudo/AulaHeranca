package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.InvestidorPF;

import java.util.ArrayList;
import java.util.List;

public class InvestidorListTest {
    public static void main(String[] args) {
        InvestidorPF i1 = new InvestidorPF("Marihá", 100);
        InvestidorPF i2 = new InvestidorPF("Jorge", 1000);
        InvestidorPF i3 = new InvestidorPF("Gulia", 1100);

        List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
        investidores.add(i1);
        investidores.add(i2);
        investidores.add(i3);

        for (InvestidorPF investidorPF: investidores){
            System.out.println(investidorPF);
        }


    }
}
