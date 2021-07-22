package br.com.fiap.investidor.test;


import br.com.fiap.investidor.model.InvestidorPF;
import br.com.fiap.investidor.model.InvestidorPJ;

public class InvestidorGeralTest {

        public static void main(String[] args) {
            InvestidorPF invPf = new InvestidorPF("191","Leonardo",20000000.50);
            InvestidorPJ invPJ = new InvestidorPJ("123", "Lucas", 20000001.30);
            InvestidorPJ inv1 = new InvestidorPJ(1,"cida", 215000.51);
            System.out.println(invPf);
            System.out.println(invPJ);

        }

    }
