package br.com.fiap.investimento.test;

import java.util.ArrayList;

public class StringListTest {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Flávio");
        lista.add("Jośe");
        lista.add("Silvio");
        lista.set(0, "Moreni");
        for (String nome : lista) {
            System.out.println(nome);
        }
        lista.add("Jorge");

    }
}
