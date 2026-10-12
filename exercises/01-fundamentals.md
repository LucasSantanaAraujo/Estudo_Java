# Ficha 1 — Fundamentos

*Package*: `fundamentals`

Esta ficha cobre o essencial antes de haver estruturas de dados: escrita no ecrã,
variáveis, operadores, condições, ciclos, métodos e recursividade. Inclui os onze
exercícios da ficha PL1 de DSSMV, assinalados com `[PL1]`.

## Como trabalhar

Cada exercício é uma classe própria dentro do *package* `fundamentals`, com o nome
indicado no enunciado e com um método `main` para poderes executá-la isoladamente.

Antes de escreveres qualquer linha, responde a três perguntas no papel:

1. O que entra? (que dados o programa precisa de receber)
2. O que sai? (o que tem de aparecer no ecrã)
3. Que passos levam de um ao outro?

Só depois abres o IntelliJ. Esta ordem é o hábito mais importante que vais ganhar —
é precisamente a decomposição de problemas que dizes que te falta, e não se treina
a escrever código, treina-se antes de o escrever.

Faz um *commit* por exercício resolvido.

---

## A — Saída, variáveis e tipos

### 1. PersonalCard
Escreve um programa que imprima no ecrã o teu nome, idade, curso e instituição, cada
um em sua linha. Guarda cada valor numa variável do tipo adequado antes de o imprimir.

### 2. VariableSwap
Declara duas variáveis inteiras com valores diferentes. Imprime-as, troca o conteúdo
entre elas e imprime novamente. Resolve sem usar qualquer método da biblioteca Java.

### 3. RectangleArea
Lê do teclado a largura e a altura de um rectângulo e imprime a área e o perímetro.
Usa a classe `Scanner`.

### 4. SecondsConverter
Dado um número total de segundos, converte-o para horas, minutos e segundos e imprime
no formato `HH:MM:SS`. Exemplo: `3725` resulta em `01:02:05`.

### 5. TemperatureConverter `[PL1 1.2]`
Escreve um método que converta uma temperatura de Fahrenheit para Celsius, segundo a
fórmula `C = (F - 32) * 5 / 9`. Atenção ao tipo de dados usado na divisão.

### 6. AverageOfThree
Lê três números reais e imprime a média aritmética com duas casas decimais.

### 7. IntegerDivision
Dados dois inteiros, imprime o quociente inteiro e o resto da divisão. Depois imprime
também o resultado da divisão real entre os dois.

---

## B — Operadores e expressões aritméticas

### 8. LastDigit
Dado um número inteiro, imprime apenas o seu último algarismo. Resolve sem converter
o número para texto.

### 9. SumOfTwoDigits
Dado um número de dois algarismos, imprime a soma dos dois algarismos. Exemplo: `47`
resulta em `11`.

### 10. CircleMetrics
Dado o raio de uma circunferência, calcula e imprime a área e o perímetro. Usa a
constante `Math.PI`.

### 11. HexagonArea `[PL1 1.10]`
Escreve um método que calcule a área de um hexágono regular de lado `s`, dada por
`A = (3 * raiz(3) * s²) / 2`.

### 12. RegularPolygonArea `[PL1 1.11]`
Escreve um método que calcule a área de um polígono regular de `n` lados, cada um de
comprimento `s`. A fórmula envolve a tangente de um ângulo em radianos — procura-a e
verifica o resultado com o exercício anterior, que é o caso de `n = 6`.

### 13. DistanceBetweenPoints
Dados dois pontos `(x1, y1)` e `(x2, y2)`, calcula a distância euclidiana entre eles.

---

## C — Condições

### 14. EvenOrOdd `[PL1 1.1]`
Escreve um método que receba um número inteiro e indique se é par ou ímpar.

### 15. SignOfNumber
Dado um número, imprime se é positivo, negativo ou zero.

### 16. LargestOfThree
Dados três números, imprime o maior. Resolve usando apenas comparações, sem recorrer
a `Math.max`.

### 17. LeapYear
Dado um ano, determina se é bissexto. Um ano é bissexto se for divisível por 4, excepto
se for divisível por 100, a não ser que também seja divisível por 400.

### 18. GradeClassifier
Dada uma nota entre 0 e 20, imprime a classificação qualitativa: `Insuficiente` até 9,
`Suficiente` de 10 a 13, `Bom` de 14 a 16, `Muito Bom` de 17 a 18 e `Excelente` acima
disso. Valida também notas fora do intervalo.

### 19. TriangleValidity
Dados três comprimentos, determina se podem formar um triângulo. A condição é que a
soma de quaisquer dois lados seja maior do que o terceiro.

### 20. TriangleType
Partindo do exercício anterior, classifica o triângulo em equilátero, isósceles ou
escaleno.

### 21. VowelOrConsonant
Dado um carácter, determina se é uma vogal, uma consoante ou outro tipo de carácter.

### 22. SimpleCalculator
Lê dois números e um operador (`+`, `-`, `*`, `/`) e imprime o resultado da operação.
Usa `switch`. Trata o caso da divisão por zero.

### 23. DayOfWeekName
Dado um inteiro de 1 a 7, imprime o nome do dia da semana correspondente. Usa `switch`.

---

## D — Ciclos

### 24. CountToN
Dado um inteiro `n`, imprime todos os números de 1 até `n`, um por linha.

### 25. SumFirstN
Dado um inteiro `n`, calcula a soma de todos os inteiros de 1 até `n`. Depois confirma
o resultado com a fórmula `n * (n + 1) / 2`.

### 26. MultiplicationTable
Dado um inteiro `n`, imprime a tabuada do `n`, de `n x 1` até `n x 10`.

### 27. CountDigits
Dado um inteiro, conta quantos algarismos tem. Resolve com um ciclo, sem converter
para texto.

### 28. GetNumberDigits `[PL1 1.3]`
Escreve um método que decomponha um inteiro na sequência dos seus algarismos
individuais, imprimindo-os pela ordem correcta. Exemplo: `4071` produz `4 0 7 1`.

### 29. ReverseNumber
Dado um inteiro, constrói e imprime o número com os algarismos pela ordem inversa.
Exemplo: `1234` resulta em `4321`.

### 30. PalindromeNumber
Dado um inteiro, determina se é um palíndromo, isto é, se se lê igual nos dois sentidos.
Reaproveita a lógica do exercício anterior.

### 31. PowerOfNumber
Dados uma base e um expoente inteiro não negativo, calcula a potência usando um ciclo,
sem recorrer a `Math.pow`.

### 32. Factorial `[PL1 1.6]`
Escreve um método que calcule o factorial de um número. Por definição, `0! = 1` e
`n! = n * (n-1)!`. Resolve de forma iterativa. Testa com valores grandes e observa a
partir de que ponto o resultado deixa de fazer sentido — e percebe porquê.

### 33. IsPrime
Dado um inteiro maior do que 1, determina se é primo. Depois melhora a tua solução para
só testar divisores até à raiz quadrada do número, e percebe porque é que isso basta.

### 34. PrimesUpToN
Imprime todos os números primos de 2 até `n`.

### 35. PerfectNumber `[PL1 1.7]`
Um número perfeito é igual à soma dos seus divisores próprios. O primeiro é 6, porque
`1 + 2 + 3 = 6`; o seguinte é 28. Escreve um método que verifique se um dado número é
perfeito.

### 36. GreatestCommonDivisor `[PL1 1.9]`
Implementa o algoritmo de Euclides para calcular o máximo divisor comum de dois
inteiros positivos, segundo o pseudocódigo da ficha PL1.

### 37. LeastCommonMultiple
Calcula o mínimo múltiplo comum de dois inteiros. Reaproveita o método do exercício
anterior em vez de começar do zero.

### 38. MinAndMax
Lê `n` números do teclado, um de cada vez, e no fim imprime o menor e o maior. Não podes
guardar os números — tens de decidir à medida que os lês.

### 39. NumberGuessingGame
O programa escolhe um número aleatório entre 1 e 100 com a classe `Random`. O utilizador
tenta adivinhar e o programa responde se o número secreto é maior ou menor, até acertar.
No fim, imprime o número de tentativas.

### 40. MenuDrivenCalculator
Programa com um menu que se repete até o utilizador escolher sair. As opções são somar,
subtrair, multiplicar, dividir e sair. Usa `do-while`.

---

## E — Séries e acumuladores

### 41. WeightedSum `[PL1 1.4]`
Escreve um método que calcule o somatório de `i * A / B`, para `i` de 1 até `n`, sendo
`A` e `B` valores dados.

### 42. GeometricSeries `[PL1 1.5]`
Escreve um método que calcule a soma dos primeiros `n` termos da série `1/2^i`, com `i`
de 1 até `n`. Experimenta valores crescentes de `n` e observa o valor para que a soma
converge.

### 43. HarmonicSeries
Calcula a soma dos primeiros `n` termos de `1/i`. Compara o comportamento com o do
exercício anterior e repara que esta série não converge.

### 44. ComputePi `[PL1 1.8]`
Calcula uma aproximação de π pela série `4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ...)`. O sinal
alterna: soma quando o denominador módulo 4 é 1, subtrai quando é 3. Corre com
denominador máximo de 100000, 1000000 e mais, e compara com `Math.PI`.

### 45. Fibonacci
Imprime os primeiros `n` termos da sucessão de Fibonacci, em que cada termo é a soma dos
dois anteriores, começando em 0 e 1. Resolve com um ciclo.

---

## F — Ciclos encaixados e padrões

### 46. SquareOfStars
Dado `n`, imprime um quadrado de `n` por `n` asteriscos.

### 47. RightTriangleStars
Dado `n`, imprime um triângulo rectângulo de asteriscos, com uma estrela na primeira
linha e `n` na última.

### 48. PyramidOfStars
Dado `n`, imprime uma pirâmide centrada de asteriscos com `n` linhas. O desafio está nos
espaços à esquerda, não nas estrelas.

### 49. MultiplicationGrid
Imprime a tabuada completa de 1 a 10 em forma de grelha alinhada, com cabeçalho de linha
e de coluna.

### 50. ChessboardPattern
Dado `n`, imprime um tabuleiro `n` por `n` alternando os caracteres `#` e `.`.

---

## G — Recursividade

### 51. FactorialRecursive
Reescreve o exercício 32 de forma recursiva. Identifica claramente o caso base e o caso
recursivo antes de escreveres.

### 52. SumDigitsRecursive
Calcula a soma dos algarismos de um número de forma recursiva.

### 53. GcdRecursive
Reescreve o algoritmo de Euclides de forma recursiva. Compara o tamanho das duas versões.

### 54. PowerRecursive
Calcula a potência de forma recursiva. Depois melhora-a: se o expoente for par,
`x^n = (x^(n/2))²`. Conta quantas chamadas cada versão faz.

### 55. FibonacciRecursive
Calcula o `n`-ésimo termo de Fibonacci de forma recursiva. Experimenta `n = 45` e repara
no tempo que demora. Depois percebe porquê, comparando com a versão iterativa do
exercício 45.

### 56. TowersOfHanoi
Três hastes e `n` discos de tamanhos diferentes, empilhados por ordem decrescente na
primeira haste. O objectivo é mover a pilha inteira para a terceira haste, movendo um
disco de cada vez e nunca colocando um disco maior sobre um menor. Imprime a sequência
de movimentos. Este é o exercício mais difícil da ficha e é totalmente normal precisares
de ajuda — o salto conceptual aqui é grande.

---

## Soluções

Estão em `src/solutions/fundamentals/`. Não as abras antes de teres a tua própria versão
a funcionar. Depois de resolveres, compara: o objectivo não é veres se acertaste, é
perceberes se há maneiras diferentes de chegar ao mesmo sítio e porque é que uma pode ser
preferível à outra.
