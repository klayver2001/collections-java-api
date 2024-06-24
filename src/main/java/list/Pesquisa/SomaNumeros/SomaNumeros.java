package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SomaNumeros {
    /* Atributo : Lista de numeros inteiros */
    private final List<Integer> listaNumeros;
    private final Random random;

    /* Inicia a lista de numeros * Construtor */
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
        this.random = new Random();
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        for (int i = 0; i < 20; i++) {
            somaNumeros.adicionarNumeroAleatorio(10000);
        }

        System.out.println("Lista de números: " + somaNumeros.exibirNumeros());
        System.out.println("Quantidade de números: " + somaNumeros.quantidadeNumerosLista());
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontraMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontraMenorNumero());

    }


    /* Método que adiciona numeros a lista de numeros */
    public void adicionarNumeroAleatorio(int numerolimite) {
        int numeroAleatorio = random.nextInt(numerolimite) + 1;
        this.listaNumeros.add(numeroAleatorio);
    }

    /* Método, calcula a soma dos numeros da lista */
    public int calcularSoma() {
        int soma = 0;
        for (int numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    /* Método autodescritivo, atenção aos exception */
    public int encontraMaiorNumero() {
        if (listaNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        return Collections.max(listaNumeros);
    }

    public int encontraMenorNumero() {
        if (listaNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        return Collections.min(listaNumeros);
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(listaNumeros); // Retorna uma cópia da lista para evitar modificações externas
    }
    public int quantidadeNumerosLista(){
        return listaNumeros.size();
    }

}
