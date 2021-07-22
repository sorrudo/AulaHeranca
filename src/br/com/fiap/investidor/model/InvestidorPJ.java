package br.com.fiap.investidor.model;

import java.util.Date;

public class InvestidorPJ extends Investidor{

    private String cnpj;

    public InvestidorPJ() {
        this.cnpj = cnpj;
    }

    public InvestidorPJ(String paramCnpj, String paramNome, double paramPatrimonio) {
        cnpj = paramCnpj;
        super.setNome(paramNome);
        super.setPatrimonio(paramPatrimonio);
    }

    public InvestidorPJ(int investidorId, String nome, double patrimonio) {
        super(investidorId, nome, patrimonio);
    }

    public InvestidorPJ(String nome, double patrimonio) {
        super(nome, patrimonio);
    }

    public InvestidorPJ(int investidorId, String nome, double patrimonio, String cnpj) {
        super(investidorId, nome, patrimonio);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
