public class Lacos {
    public static void main(String[] args) {
        System.out.println("Exemplo de laço for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nExemplo de laço while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nExemplo de laço do-while:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
    }
}
