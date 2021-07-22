package br.com.fiap.investidor.model;


public class InvestidorPF extends Investidor {

    private String cpf;

    public InvestidorPF() {
            super();
    }

    public InvestidorPF(String paramCpf, String paramNome, double paramPatrimonio) {
            cpf = paramCpf;
            super.setNome(paramNome);
            super.setPatrimonio(paramPatrimonio);
    }

    public InvestidorPF(int investidorId, String nome, double patrimonio) {
            super(investidorId, nome, patrimonio);
    }

    public InvestidorPF(String nome, double patrimonio) {
            super(nome, patrimonio);
    }


    public String getCpf() {
            return cpf;
    }


}