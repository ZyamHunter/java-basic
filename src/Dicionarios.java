import java.util.HashMap;
import java.util.Map;

public class Dicionarios {
    public static void main(String[] args) {
        // Exemplo de criação de um dicionário (HashMap)
        Map<String, Integer> idadePessoas = new HashMap<>();
        idadePessoas.put("Ana", 25);
        idadePessoas.put("Bruno", 30);
        idadePessoas.put("Carlos", 22);

        System.out.println("Idades:");
        for (String nome : idadePessoas.keySet()) {
            System.out.println(nome + ": " + idadePessoas.get(nome));
        }

        // Exemplo de métodos dicionados
        System.out.println("\nBuscar idade de Bruno: " + buscarIdade(idadePessoas, "Bruno"));
        System.out.println("Remover Carlos: " + removerPessoa(idadePessoas, "Carlos"));
        System.out.println("Existe Ana? " + existePessoa(idadePessoas, "Ana"));
        System.out.println("Total de pessoas: " + contarPessoas(idadePessoas));
    }

    // Método para buscar idade de uma pessoa
    public static Integer buscarIdade(Map<String, Integer> mapa, String nome) {
        return mapa.getOrDefault(nome, null);
    }

    // Método para remover uma pessoa do dicionário
    public static boolean removerPessoa(Map<String, Integer> mapa, String nome) {
        return mapa.remove(nome) != null;
    }

    // Método para verificar se uma pessoa existe no dicionário
    public static boolean existePessoa(Map<String, Integer> mapa, String nome) {
        return mapa.containsKey(nome);
    }

    // Método para contar o número de pessoas no dicionário
    public static int contarPessoas(Map<String, Integer> mapa) {
        return mapa.size();
    }

    // Método que cria e retorna um dicionário já preenchido
    public static Map<String, Integer> criarDicionarioPreenchido() {
        Map<String, Integer> mapa = new HashMap<>(Map.of("Maria", 28, "João", 35, "Paula", 19));
        return mapa;
    }
}
