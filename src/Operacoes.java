
public class Operacoes {
    public static void main(String[] args) {
        double min = 1;
        double max = 10;
        double num1 = gerarNumeroAleatorio(min, max);
        double num2 = gerarNumeroAleatorio(min, max);

        System.out.println("Soma: " + soma(num1, num2));
        System.out.println("Subtracao: " + subtrai(num1, num2));
        System.out.println("Multiplicacao: " + multiplica(num1, num2));
        System.out.println("Divisao: " + divide(num1, num2));
    }

    public static double gerarNumeroAleatorio(double min, double max) {
        return min + Math.random() * (max - min);
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static String divide(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Nao e possivel dividir por zero";
        }
    }
}
