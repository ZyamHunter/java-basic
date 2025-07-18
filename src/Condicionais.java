public class Condicionais {
    public static void main(String[] args) {
        int valor = 7;
        System.out.println("Exemplo if-else simples:");
        if (valor > 5) {
            System.out.println("O valor é maior que 5");
        } else {
            System.out.println("O valor não é maior que 5");
        }

        System.out.println("\nExemplo if-else-if:");
        int idade = 18;
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        System.out.println("\nExemplo condicional avançada (método):");
        System.out.println(verificaParOuImpar(10));
        System.out.println(verificaNota(8.5));

        // Exemplos dos métodos avançados
        System.out.println("\nExemplo validarSenha:");
        System.out.println(validarSenha("Senha123!"));
        System.out.println(validarSenha("fraca"));

        System.out.println("\nExemplo classificarTriangulo:");
        System.out.println(classificarTriangulo(3, 3, 3));
        System.out.println(classificarTriangulo(3, 4, 4));
        System.out.println(classificarTriangulo(3, 4, 5));
        System.out.println(classificarTriangulo(1, 2, 3));

        System.out.println("\nExemplo faixaEtaria:");
        System.out.println(faixaEtaria(-1));
        System.out.println(faixaEtaria(1));
        System.out.println(faixaEtaria(5));
        System.out.println(faixaEtaria(15));
        System.out.println(faixaEtaria(30));
        System.out.println(faixaEtaria(70));

        System.out.println("\nExemplo calcularImposto:");
        System.out.println(calcularImposto(-100));
        System.out.println(calcularImposto(1500));
        System.out.println(calcularImposto(2500));
        System.out.println(calcularImposto(3500));
        System.out.println(calcularImposto(5000));

        System.out.println("\nExemplo analisarLista:");
        int[] lista = {1, -2, 0, 5, -7, 0, 3};
        System.out.println(analisarLista(lista));
    }

    // Método que retorna se o número é par ou ímpar
    public static String verificaParOuImpar(int n) {
        if (n % 2 == 0) {
            return n + " é par";
        } else {
            return n + " é ímpar";
        }
    }

    // Método que avalia uma nota e retorna conceito
    public static String verificaNota(double nota) {
        if (nota >= 9) {
            return "Excelente";
        } else if (nota >= 7) {
            return "Bom";
        } else if (nota >= 5) {
            return "Regular";
        } else {
            return "Insuficiente";
        }
    }

    // Método que valida uma senha forte
    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "Senha fraca: menos de 8 caracteres";
        } else if (!senha.matches(".*[A-Z].*")) {
            return "Senha fraca: deve conter letra maiúscula";
        } else if (!senha.matches(".*[a-z].*")) {
            return "Senha fraca: deve conter letra minúscula";
        } else if (!senha.matches(".*\\d.*")) {
            return "Senha fraca: deve conter número";
        } else if (!senha.matches(".*[!@#$%&*].*")) {
            return "Senha fraca: deve conter caractere especial (!@#$%&*)";
        } else {
            return "Senha forte";
        }
    }

    // Método que classifica um triângulo
    public static String classificarTriangulo(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Não é um triângulo";
        } else if (a == b && b == c) {
            return "Triângulo equilátero";
        } else if (a == b || a == c || b == c) {
            return "Triângulo isósceles";
        } else {
            return "Triângulo escaleno";
        }
    }

    // Método que retorna faixa etária detalhada
    public static String faixaEtaria(int idade) {
        if (idade < 0) {
            return "Idade inválida";
        } else if (idade < 2) {
            return "Bebê";
        } else if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }

    // Método que calcula imposto progressivo
    public static String calcularImposto(double salario) {
        if (salario < 0) {
            return "Salário inválido";
        } else if (salario <= 2000) {
            return "Isento de imposto";
        } else if (salario <= 3000) {
            return "Imposto: " + (salario * 0.08);
        } else if (salario <= 4500) {
            return "Imposto: " + (salario * 0.18);
        } else {
            return "Imposto: " + (salario * 0.28);
        }
    }

    // Método que analisa uma lista de inteiros e retorna a contagem de positivos, negativos e zeros
    public static String analisarLista(int[] lista) {
        int positivos = 0, negativos = 0, zeros = 0;
        for (int n : lista) {
            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        return "Positivos: " + positivos + ", Negativos: " + negativos + ", Zeros: " + zeros;
    }
}
