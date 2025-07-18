
# Projeto Java Básico

Este projeto reúne exemplos práticos dos principais conceitos da linguagem Java, organizado em arquivos temáticos para facilitar o estudo e a prática.

## Estrutura das Pastas

- `src`: contém todos os arquivos-fonte Java organizados por tema
- `lib`: pasta para dependências externas (se necessário)
- `bin`: saída dos arquivos compilados

## Arquivos e Temas Abordados

- **App.java**: Operações aritméticas básicas e entrada de dados
- **Listas.java**: Manipulação de listas, arrays e métodos utilitários
- **Operacoes.java**: Operações matemáticas com números aleatórios
- **Condicionais.java**: Exemplos de condicionais simples e avançadas, métodos para validação, classificação e análise de listas
- **Dicionarios.java**: Uso de dicionários (Map/HashMap), busca, remoção, verificação e criação de mapas já preenchidos
- **Lacos.java**: Exemplos de laços de repetição (for, while, do-while)
- **Arquivos.java**: Leitura e escrita de arquivos texto
- **OrientacaoObjetos.java**: Introdução à orientação a objetos, criação de classes e instâncias
- **Excecoes.java**: Tratamento de exceções com try-catch e métodos que lançam exceções

## Como Executar

1. Compile o arquivo desejado:
   ```
   javac -d bin src/NomeDoArquivo.java
   ```
2. Execute a classe:
   ```
   java -cp bin NomeDoArquivo
   ```
   Exemplo:
   ```
   javac -d bin src/Condicionais.java
   java -cp bin Condicionais
   ```

## Dicas

- Explore cada arquivo para ver exemplos práticos e sugestões de exercícios.
- Modifique e teste os métodos para fixar o aprendizado.
- Consulte os comentários no código para entender cada parte.

## Gerenciamento de Dependências

O projeto não depende de bibliotecas externas, mas você pode adicionar arquivos `.jar` na pasta `lib` se desejar.

---
Projeto criado para estudos e prática dos fundamentos de Java.
