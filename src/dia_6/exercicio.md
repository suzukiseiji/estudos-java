# 📝 Exercício do Dia 6

> Crie um pequeno sistema de cadastro de pessoas com as seguintes regras:

---

## Requisitos:

1.  **Refatoração e Encapsulamento:**
    *   Refatore suas classes (`Pessoa`, `Funcionario`, `Gerente`, `Aluno`, `Professor`).
    *   Todos os atributos devem ser **privados** (`private`).
    *   O acesso aos atributos deve ser feito exclusivamente através de **getters e setters**.

2.  **Validação de Dados:**
    *   Adicione uma validação de idade na classe `Pessoa`.
    *   O `setter` de idade deve impedir a atribuição de valores negativos.
    *   Caso um valor negativo seja informado, lance uma `IllegalArgumentException`.

3.  **Sobrescrita de Métodos:**
    *   Utilize a anotação `@Override` no método `apresentar()` em pelo menos **duas** classes filhas (ex: `Gerente` e `Professor`).
    *   O método sobrescrito deve mostrar informações específicas da classe filha, diferentes da implementação na classe `Pessoa`.

4.  **Classe Principal e Polimorfismo:**
    *   No método `main`, crie uma `ArrayList<Pessoa>`.
    *   Adicione na lista um objeto de cada tipo:
        *   1 `Pessoa`
        *   1 `Funcionario`
        *   1 `Gerente`
        *   1 `Aluno`
        *   1 `Professor`
    *   Percorra a lista com um loop (`for-each`) e chame o método `apresentar()` para cada objeto, demonstrando o **polimorfismo** em ação.

5.  **Tratamento de Exceções:**
    *   Teste a criação de uma `Pessoa` com idade negativa.
    *   Utilize um bloco `try/catch` para capturar a `IllegalArgumentException` e exibir uma mensagem de erro amigável.