import java.util.*;

public class Listas {
    public static void main(String[] args) {
        // Inteiros
        List<Integer> numeros = criarListaExemplo();
        System.out.println("Lista ordenada: " + ordenarLista(numeros));
        System.out.println("Após remover o número 2: " + removerElemento(numeros, 2));
        System.out.println("Após adicionar 10: " + adicionarElemento(numeros, 10));
        System.out.println("Após remover 1: " + removerElemento(numeros, 1));
        System.out.println("Lista invertida: " + inverterLista(numeros));
        exibirElementos(numeros);
        exibirTamanho(numeros);
        verificarElemento(numeros, 9);
        exibirMaiorMenorSoma(numeros);

        // Letras
        List<Character> letras = criarListaLetras();
        exibirListaLetras("Lista de letras", letras);
        System.out.println("Quantidade de vogais: " + contarVogais(letras));
        System.out.println("Concatenação das letras: " + concatenarLetras(letras));

        // Números negativos
        List<Integer> negativos = criarListaNegativos();
        exibirLista("Lista de negativos", negativos);
        System.out.println("Quantidade de negativos: " + contarNegativos(negativos));
        System.out.println("Menor negativo: " + menorNegativo(negativos));
        System.out.println("Lista tornada positiva: " + tornarPositivos(negativos));

        // Números fracionários
        List<Double> fracionarios = criarListaFracionarios();
        System.out.println("Lista de fracionários: " + fracionarios);
        System.out.println("Soma dos fracionários: " + somaFracionarios(fracionarios));
        System.out.println("Média dos fracionários: " + mediaFracionarios(fracionarios));
        System.out.println("Menor fracionário: " + menorFracionario(fracionarios));
        System.out.println("Maior fracionário: " + maiorFracionario(fracionarios));
    }

    // --- Métodos para listas de inteiros (Integer) ---

    // Cria uma lista de inteiros
    public static List<Integer> criarListaExemplo() {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(9);
        lista.add(1);
        lista.add(7);
        exibirLista("Lista original", lista);
        return lista;
    }

    // Exibe a lista de inteiros
    public static void exibirLista(String mensagem, List<Integer> lista) {
        System.out.println(mensagem + ": " + lista);
    }

    // Ordena a lista de inteiros
    public static List<Integer> ordenarLista(List<Integer> lista) {
        Collections.sort(lista);
        return lista;
    }

    // Verifica se um valor está na lista de inteiros
    public static void verificarElemento(List<Integer> lista, int valor) {
        boolean contem = lista.contains(valor);
        System.out.println("A lista contém o número " + valor + "? " + contem);
    }

    // Exibe todos os elementos da lista de inteiros
    public static void exibirElementos(List<Integer> lista) {
        System.out.print("Elementos da lista: ");
        for (int n : lista) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Exibe o tamanho da lista de inteiros
    public static void exibirTamanho(List<Integer> lista) {
        System.out.println("Tamanho da lista: " + lista.size());
    }

    // Exibe maior, menor e soma dos elementos da lista de inteiros
    public static void exibirMaiorMenorSoma(List<Integer> lista) {
        System.out.println("Maior elemento: " + maiorElemento(lista));
        System.out.println("Menor elemento: " + menorElemento(lista));
        System.out.println("Soma dos elementos: " + somaElementos(lista));
    }


    // Adiciona um elemento à lista de inteiros e retorna a lista
    public static List<Integer> adicionarElemento(List<Integer> lista, int valor) {
        lista.add(valor);
        return lista;
    }


    // Remove um elemento da lista de inteiros (primeira ocorrência) e retorna a lista
    public static List<Integer> removerElemento(List<Integer> lista, int valor) {
        lista.remove(Integer.valueOf(valor));
        return lista;
    }

    // Retorna o maior elemento da lista de inteiros
    public static int maiorElemento(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia. Não é possível obter o maior elemento.");
        }
        return Collections.max(lista);
    }

    // Retorna o menor elemento da lista de inteiros
    public static int menorElemento(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia. Não é possível obter o menor elemento.");
        }
        return Collections.min(lista);
    }

    // Soma todos os elementos da lista de inteiros
    public static int somaElementos(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (int n : lista) {
            soma += n;
        }
        return soma;
    }


    // Inverte a lista de inteiros e retorna a lista
    public static List<Integer> inverterLista(List<Integer> lista) {
        Collections.reverse(lista);
        return lista;
    }
    // --- Métodos para listas de letras (Character) ---

    // Cria uma lista de letras
    public static List<Character> criarListaLetras() {
        List<Character> letras = new ArrayList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        return letras;
    }

    // Exibe a lista de letras
    public static void exibirListaLetras(String mensagem, List<Character> lista) {
        System.out.println(mensagem + ": " + lista);
    }

    // Conta quantas vogais há na lista de letras
    public static long contarVogais(List<Character> lista) {
        return lista.stream().filter(c -> "AEIOUaeiou".indexOf(c) >= 0).count();
    }

    // Concatena as letras em uma String
    public static String concatenarLetras(List<Character> lista) {
        StringBuilder sb = new StringBuilder();
        for (char c : lista) {
            sb.append(c);
        }
        return sb.toString();
    }


    // --- Métodos para listas de números negativos (Integer) ---

    // Cria uma lista de números negativos
    public static List<Integer> criarListaNegativos() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-1);
        lista.add(-5);
        lista.add(-10);
        lista.add(-3);
        lista.add(-7);
        return lista;
    }

    // Conta quantos números negativos existem na lista
    public static long contarNegativos(List<Integer> lista) {
        return lista.stream().filter(n -> n < 0).count();
    }

    // Retorna o menor (mais negativo) valor da lista
    public static int menorNegativo(List<Integer> lista) {
        return lista.stream().min(Integer::compareTo).orElse(0);
    }

    // Torna todos os números positivos (valor absoluto)
    public static List<Integer> tornarPositivos(List<Integer> lista) {
        List<Integer> positivos = new ArrayList<>();
        for (int n : lista) {
            positivos.add(Math.abs(n));
        }
        return positivos;
    }

    // --- Métodos para listas de números fracionários (Double) ---

    // Cria uma lista de números fracionários
    public static List<Double> criarListaFracionarios() {
        List<Double> lista = new ArrayList<>();
        lista.add(1.5);
        lista.add(-2.75);
        lista.add(3.14);
        lista.add(-0.99);
        lista.add(10.01);
        return lista;
    }

    // Soma todos os elementos da lista de fracionários
    public static double somaFracionarios(List<Double> lista) {
        double soma = 0.0;
        for (double d : lista) {
            soma += d;
        }
        return soma;
    }

    // Calcula a média dos elementos da lista de fracionários
    public static double mediaFracionarios(List<Double> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        return somaFracionarios(lista) / lista.size();
    }

    // Retorna o menor valor (mais negativo) da lista de fracionários
    public static double menorFracionario(List<Double> lista) {
        return lista.stream().min(Double::compareTo).orElse(0.0);
    }

    // Retorna o maior valor da lista de fracionários
    public static double maiorFracionario(List<Double> lista) {
        return lista.stream().max(Double::compareTo).orElse(0.0);
    }
}
