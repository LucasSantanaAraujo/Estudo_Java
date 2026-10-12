# EstudoJava

Repositório de estudo de Java, construído do zero. Serve de registo da progressão
desde a lógica de programação até à programação orientada a objetos, com o objetivo
final de desenvolvimento *backend* em Java.

## Objetivos

- Consolidar lógica de programação e raciocínio algorítmico
- Dominar a sintaxe e as bibliotecas base do Java
- Compreender estruturas de dados e análise de complexidade
- Aplicar programação orientada a objetos em contextos práticos
- Preparar a base para projetos com Spring Boot e arquitetura de microserviços

## Organização

```
src/
├── fundamentos/   Sintaxe, tipos, variáveis, entrada e saída
├── logica/        Condições, ciclos, decomposição de problemas
├── algoritmos/    Pesquisa, ordenação, recursividade
├── estruturas/    Arrays, listas, pilhas, filas, mapas, árvores
└── poo/           Classes, encapsulamento, herança, polimorfismo, interfaces
```

Cada pasta é um *package* Java. Cada exercício vive numa classe própria com o
método `main`, para poder ser executado de forma isolada.

## Como executar

No IntelliJ, abrir a classe pretendida e correr com `Shift + F10`.

Pela linha de comandos, a partir da raiz do repositório:

```bash
javac -d out src/fundamentos/HelloWorld.java
java -cp out fundamentos.OlaMundo
```

## Progresso

| Área | Estado |
|------|--------|
| Fundamentos | Em curso |
| Lógica | Por iniciar |
| Algoritmos | Por iniciar |
| Estruturas de dados | Por iniciar |
| POO | Por iniciar |
