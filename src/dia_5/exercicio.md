# 📝 Exercício – Sistema de Escola

> Crie um mini sistema de classes para representar pessoas em uma escola.

---

## Requisitos:

1.  **Classe Pessoa**
    *   **Atributos:** `nome` (String), `idade` (int)
    *   **Método:** `apresentar()` → imprime nome e idade

2.  **Classe Aluno** (herda de Pessoa)
    *   **Atributos adicionais:** `matricula` (String), `nota` (double)
    *   **Método:** `exibirNota()` → imprime nome e nota

3.  **Classe Professor** (herda de Pessoa)
    *   **Atributos adicionais:** `disciplina` (String), `salario` (double)
    *   **Método:** `exibirSalario()` → imprime nome, disciplina e salário

4.  **Main**
    *   Crie 2 alunos diferentes e 1 professor.
    *   Chame os métodos de apresentação (`apresentar`) e os métodos específicos (`exibirNota`, `exibirSalario`).

---

### 💡 Dicas:

*   Use `extends` para herança.
*   Use `super()` no construtor das classes filhas para inicializar os atributos da Pessoa.
*   Teste a execução no console para ver se cada método imprime a informação correta.