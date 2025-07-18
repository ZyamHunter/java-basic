public class OrientacaoObjetos {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Bruno", 30);
        Pessoa p3 = new Pessoa("Yam", 26);
        System.out.println(p1.apresentar());
        System.out.println(p2.apresentar());
        System.out.println(p3.apresentar());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String apresentar() {
        return "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
    }
}
