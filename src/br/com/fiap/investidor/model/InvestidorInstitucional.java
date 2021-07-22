package br.com.fiap.investidor.model;

import java.util.Date;

public class InvestidorInstitucional extends InvestidorPJ {


    private String nomeResponsalvelLegal;


    public InvestidorInstitucional(String nome, double patrimonio, String nomeResponsalvelLegal) {
        super(nome, patrimonio);
        this.nomeResponsalvelLegal = nomeResponsalvelLegal;
    }

    public InvestidorInstitucional(String nomeResponsalvelLegal) {
        super();
        this.nomeResponsalvelLegal = nomeResponsalvelLegal;
    }

    public String getNomeResponsalvelLegal() {
        return nomeResponsalvelLegal;
    }

    public void setNomeResponsalvelLegal(String nomeResponsalvelLegal) {
        this.nomeResponsalvelLegal = nomeResponsalvelLegal;
    }
}
