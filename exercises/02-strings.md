# Ficha 2 — Strings

*Package*: `strings`

Esta ficha cobre o tratamento de texto. Inclui os sete exercícios da secção 1 da ficha
PL2 de DSSMV, assinalados com `[PL2]`.

## Porque é que esta ficha vem antes de POO

Uma *string* é o primeiro tipo com que vais trabalhar que não é um número nem um
booleano. É uma **sequência de caracteres** — e aprender a percorrer uma sequência,
elemento a elemento, é exactamente a mecânica que vais usar em *arrays*, em listas e em
tudo o que venha depois.

Além disso, em Java uma *string* é um **objecto**, não um tipo primitivo. Quando
escreves `texto.length()` estás a chamar um método sobre um objecto. Vais passar esta
ficha inteira a usar objectos sem dar por isso, e quando chegarmos a POO já terás
intuição sobre o que é um objecto antes de teres de aprender a construir um.

---

## A regra de ouro desta ficha

A classe `String` do Java já traz quase tudo feito. Há um `reverse`, um `toLowerCase`,
um `contains`, um `trim`. Se os usares logo, esta ficha despacha-se numa tarde e não
aprendes nada.

Por isso, **sempre que o enunciado disser "sem usar métodos da classe String", resolve
com um ciclo e `charAt()`.** Primeiro constróis a coisa à mão, percebes o que custa, e
só depois descobres que o Java já a tinha. É a diferença entre saber usar uma
ferramenta e saber o que ela faz.

Os únicos métodos sempre permitidos são `length()` e `charAt()`. São as duas operações
básicas sobre uma sequência: saber quantos elementos tem e ir buscar o elemento de uma
dada posição. Tudo o resto constróis tu, salvo indicação em contrário.

---

## Como reutilizar métodos entre ficheiros

A partir do exercício 18 vais precisar de chamar métodos que escreveste noutros
ficheiros. Como todas as classes desta ficha estão no mesmo *package* `strings`, **não
precisas de nenhum `import`** — basta escrever o nome da classe seguido do método:

```java
String inverted = StringUtils.reverse("ola");
```

O `import` só é preciso quando a classe está noutro *package*. É por isso que escreves
`import java.util.Scanner;` mas nunca escreveste nada para usar as tuas próprias
classes do *package* `fundamentals` entre si.

Para isto funcionar, o método tem de ser `public static`. O `public` permite que seja
visto de fora da classe; o `static` permite chamá-lo sem criares um objecto. Na ficha de
POO vais perceber exactamente o que é que o `static` está a dizer — por agora é a
palavra que te deixa escrever `StringUtils.reverse(...)` em vez de teres de construir um
`StringUtils` primeiro.

---

## Como trabalhar

Um ficheiro `.java` por exercício, com o nome indicado no enunciado, dentro do *package*
`strings`. A lógica vai sempre num método `public static`; o `main` só trata de ler do
teclado e escrever no ecrã.

Antes de escreveres, responde no papel: o que entra, o que sai, que passos ligam um ao
outro. Em exercícios de texto acrescenta sempre uma quarta pergunta: **o que acontece se
a string estiver vazia ou for `null`?**

Faz um *commit* por exercício.

---

## Nível 1 — Percorrer e contar

Neste nível só tens de aprender a andar ao longo de uma *string*. O padrão é sempre o
mesmo e vais escrevê-lo tantas vezes que deixa de exigir pensamento.

### 1. GetCharacter `[PL2 1.1]`
Escreve um método que receba uma *string* e um índice e devolva o carácter nessa
posição. Testa com um índice fora do intervalo e vê o que acontece; depois acrescenta
uma verificação que impeça o programa de rebentar.

### 2. PrintEachCharacter
Imprime cada carácter de uma *string* numa linha própria, precedido do seu índice.
Para `"Java"` deve sair `0: J`, `1: a`, `2: v`, `3: a`. Repara que o primeiro índice é
zero, não um.

### 3. CountVowels
Conta quantas vogais existem numa *string*. Trata maiúsculas e minúsculas como iguais.

### 4. CountSpecificCharacter `[PL2 1.3]`
Escreve um método que conte quantas vezes um dado carácter aparece numa *string*.

### 5. CountLettersAndDigits
Dada uma *string*, conta separadamente quantas letras, quantos algarismos e quantos
outros caracteres tem.

### 6. FirstAndLastCharacter
Devolve o primeiro e o último carácter de uma *string*. Trata o caso da *string* vazia.

### 7. RepeatString
Dada uma *string* e um número `n`, devolve a *string* repetida `n` vezes. Resolve com
um ciclo, sem usar o método `repeat`.

### 8. CountUpperAndLower
Conta quantas letras maiúsculas e quantas minúsculas existem numa *string*.

---

## Nível 2 — Transformar

Agora já não contas: constróis uma *string* nova a partir da original. A técnica é
acumular num `StringBuilder` e devolver no fim. Lê a secção "Nota sobre StringBuilder"
no fim desta ficha antes de começares o exercício 9.

### 9. ReverseString `[PL2 1.4]`
Devolve uma *string* com os caracteres pela ordem inversa. Sem usar métodos da classe
`String` além de `length` e `charAt`.

### 10. ToLowerCaseManual `[PL2 1.5]`
Converte todas as letras de uma *string* para minúsculas, sem usar `toLowerCase`.
Pista: em Java um `char` é também um número. Experimenta imprimir `(int) 'A'` e
`(int) 'a'` e repara na diferença entre os dois valores.

### 11. ToUpperCaseManual
O inverso do anterior, sem usar `toUpperCase`.

### 12. SwapCase
Troca maiúsculas por minúsculas e vice-versa. Caracteres que não sejam letras ficam
como estão.

### 13. RemoveSpaces
Devolve a *string* sem nenhum espaço.

### 14. RemoveVowels
Devolve a *string* sem nenhuma vogal.

### 15. ReplaceCharacter
Substitui todas as ocorrências de um carácter por outro, sem usar `replace`.

### 16. TrimManual
Remove os espaços do início e do fim de uma *string*, mantendo os do meio. Sem usar
`trim`. Este é o primeiro exercício em que vais precisar de dois índices a andar em
sentidos opostos.

### 17. StringUtils
Não é um exercício novo: é uma arrumação.

Cria uma classe `StringUtils` e junta nela, como métodos `public static`, as soluções
que já escreveste para os exercícios 9, 10, 13 e 16 — `reverse`, `toLowerCase`,
`removeSpaces` e `trim`. A classe não precisa de `main`.

A partir daqui, sempre que um exercício precisar de uma destas operações, chama a
`StringUtils` em vez de voltares a escrever o ciclo. Vais usá-la nos exercícios 20, 25,
32 e 43, entre outros.

Isto chama-se extrair uma classe utilitária, e é a primeira vez que vais escrever código
cujo propósito é ser usado por outro código em vez de resolver um problema directamente.

---

## Nível 3 — Comparar e procurar

### 18. CompareStrings `[PL2 1.2]`
Escreve um método que verifique se duas *strings* são iguais.

**Faz primeiro isto:** escreve um programa que declare `String a = "Java";` e
`String b = "Java";` e imprima `a == b`. Depois lê as duas do teclado com o `Scanner`,
escreve `Java` nas duas, e imprime `a == b` outra vez. Os resultados são diferentes.

Descobre porquê antes de continuares. É a armadilha que apanha absolutamente toda a
gente que aprende Java, e a razão pela qual o `equals` existe.

### 19. CompareIgnoreCase
Compara duas *strings* ignorando maiúsculas e minúsculas, sem usar
`equalsIgnoreCase`. Reutiliza o `StringUtils.toLowerCase`.

### 20. IsPalindromeString
Verifica se uma *string* é um palíndromo. Ignora espaços e maiúsculas, para que
`"Ana ama anã"` conte. Reutiliza os métodos da `StringUtils`.

### 21. FindWord `[PL2 1.6]`
Escreve um método que devolva o índice onde uma *string* começa dentro de outra, ou
`-1` se não existir. Sem usar `indexOf`.

Este é o exercício mais difícil do nível. A ideia: para cada posição possível na
*string* grande, verifica se a partir dali os caracteres batem todos certo com a
*string* pequena.

### 22. ContainsSubstring
Devolve `true` ou `false` conforme uma *string* contenha outra. Reutiliza o método do
exercício 21 em vez de repetires a lógica.

### 23. CountSubstringOccurrences
Conta quantas vezes uma *string* aparece dentro de outra. Decide e documenta o que
fazes com sobreposições: em `"aaaa"`, quantas vezes aparece `"aa"`?

### 24. StartsWithEndsWith
Dois métodos: um que diga se uma *string* começa por outra, outro que diga se termina.
Sem usar `startsWith` nem `endsWith`.

### 25. AreAnagrams
Duas palavras são anagramas se tiverem exactamente os mesmos caracteres por ordem
diferente, como `"amor"` e `"roma"`. Ignora espaços e maiúsculas.

Há duas estratégias possíveis e vale a pena pensares nas duas antes de escolheres: ou
ordenas os caracteres das duas e comparas, ou contas quantas vezes cada letra aparece em
cada uma. Podes usar `Arrays.sort` se seguires a primeira.

### 26. LongestCommonPrefix
Dadas duas *strings*, devolve o maior prefixo comum às duas. Para `"programming"` e
`"progress"` devolve `"progr"`.

---

## Nível 4 — Trabalhar com palavras

A partir daqui podes usar `split`, porque o foco deixa de ser percorrer caracteres e
passa a ser organizar texto.

### 27. CountWords
Conta quantas palavras tem uma frase. Cuidado com espaços a mais: `"ola    mundo"` tem
duas palavras, não cinco.

### 28. LongestWord
Devolve a palavra mais comprida de uma frase. Se houver empate, devolve a primeira.

### 29. ReverseWordOrder
Inverte a ordem das palavras de uma frase, mantendo cada palavra legível.
`"o gato dorme"` passa a `"dorme gato o"`.

### 30. CapitalizeEachWord
Põe a primeira letra de cada palavra em maiúscula e as restantes em minúscula.

### 31. CountWordOccurrences
Conta quantas vezes uma dada palavra aparece numa frase. A palavra `"o"` não deve ser
contada dentro de `"ovo"` — tem de ser uma palavra inteira.

### 32. FormatText `[PL2 1.7]`
Escreve um método que, dada uma *string*:

- remova os espaços do início e do fim;
- reduza múltiplos espaços entre palavras a um só;
- ponha a primeira letra de cada palavra em maiúscula;
- ponha as restantes letras de cada palavra em minúscula.

`"   o GATO   dorme  "` tem de dar `"O Gato Dorme"`.

Este exercício junta quatro coisas que já fizeste em separado. Resolve-o chamando os
métodos que já tens — `StringUtils.trim`, o do exercício 30 — em vez de escreveres tudo
de novo. Se te apetecer escrever um ciclo novo, pára e pergunta-te se já não resolveste
esse pedaço antes.

### 33. AcronymBuilder
Constrói um acrónimo a partir das iniciais das palavras.
`"Instituto Superior de Engenharia do Porto"` dá `"ISEP"` — repara que palavras curtas
como `"de"` e `"do"` são ignoradas. Define e documenta a tua regra.

### 34. InitialsFormatter
Dado um nome completo, devolve o primeiro nome por extenso e as iniciais dos restantes.
`"Lucas Santana Araujo"` dá `"Lucas S. A."`.

---

## Nível 5 — Validar e converter

### 35. IsNumeric
Verifica se uma *string* contém apenas algarismos. A *string* vazia não é numérica.

### 36. StringToInt
Converte uma *string* num `int`, sem usar `Integer.parseInt`. Trata o sinal negativo.
Se a *string* não for válida, lança uma `IllegalArgumentException`.

Pista: o carácter `'7'` não vale 7. Experimenta imprimir `(int) '7'` e descobre que
conta tens de fazer.

### 37. IntToString
O inverso: converte um `int` numa *string* sem usar `String.valueOf` nem concatenação
com `""`. Reaproveita o raciocínio de decomposição em algarismos da ficha 1.

### 38. ValidatePassword
Verifica se uma palavra-passe cumpre todas estas regras, e indica quais falham:

- pelo menos 8 caracteres;
- pelo menos uma letra maiúscula;
- pelo menos uma minúscula;
- pelo menos um algarismo;
- pelo menos um carácter que não seja letra nem algarismo.

### 39. ValidateEmail
Verifica se uma *string* parece um endereço de correio electrónico: tem exactamente um
`@`, tem pelo menos um carácter antes dele, e depois dele há um `.` com pelo menos um
carácter de cada lado. Sem expressões regulares.

### 40. MaskString
Esconde todos os caracteres de uma *string* excepto os últimos quatro, substituindo-os
por `*`. Para `"4716123456789012"` devolve `"************9012"`.

### 41. PadString
Dois métodos: um que acrescente caracteres à esquerda até a *string* atingir um dado
comprimento, outro que o faça à direita. Se já for suficientemente comprida, devolve-a
inalterada.

### 42. CensorWord
Substitui todas as ocorrências de uma palavra por asteriscos do mesmo comprimento,
preservando o resto da frase.

---

## Nível 6 — Desafios

Estes são bem mais difíceis do que tudo o que vem antes. Não te assustes se precisares
de parar e desenhar o problema no papel — é suposto.

### 43. CaesarCipher
A cifra de César desloca cada letra um número fixo de posições no alfabeto. Com
deslocamento 3, `'a'` passa a `'d'` e `'z'` dá a volta e passa a `'c'`.

Escreve dois métodos, `encrypt` e `decrypt`. Preserva maiúsculas e minúsculas e deixa
inalterado tudo o que não for letra.

A parte complicada é a volta ao princípio do alfabeto. O operador `%` é teu amigo.

### 44. CharacterFrequency
Conta quantas vezes cada letra aparece numa *string* e imprime só as que aparecem pelo
menos uma vez. Usa um *array* de 26 inteiros, um por letra, e faz corresponder cada
letra a uma posição desse *array*.

Este exercício é a ponte para a ficha dos *arrays*.

### 45. FirstNonRepeatingCharacter
Devolve o primeiro carácter que aparece exactamente uma vez. Em `"programming"` é
`'p'`; em `"aabb"` não existe nenhum.

### 46. RemoveDuplicateCharacters
Remove caracteres repetidos, mantendo a primeira ocorrência de cada um.
`"programming"` dá `"progamin"`.

### 47. IsIsogram
Verifica se uma palavra não tem nenhuma letra repetida.

### 48. RunLengthEncode
Comprime uma *string* substituindo sequências do mesmo carácter pelo carácter seguido
do número de repetições. `"aaabbbcd"` dá `"a3b3c1d1"`.

Repara que para algumas *strings* o resultado fica maior do que o original. Acrescenta
uma regra: se a compressão não encurtar, devolve a *string* original.

### 49. RunLengthDecode
O inverso do anterior: `"a3b3c1d1"` devolve `"aaabbbcd"`.

Testa os dois em conjunto: codificar e depois descodificar tem de devolver exactamente a
*string* original. Esta técnica de verificação chama-se *round trip* e é uma das formas
mais fiáveis de testar um par de operações inversas.

### 50. BalancedBrackets
Verifica se os parênteses de uma expressão estão equilibrados, considerando `()`, `[]` e
`{}`. `"{[()]}"` está equilibrado; `"{[(])}"` não está, apesar de ter o mesmo número de
cada tipo.

Pensa no problema antes de programar: o que é que tens de lembrar enquanto percorres a
*string*? Esse "lembrar por ordem, e tirar sempre o último que puseste" tem um nome —
chama-se pilha — e vais construí-la de raiz na ficha das estruturas de dados.

### 51. NumberToWords
Converte um número de 0 a 999 na sua escrita por extenso em português. `472` dá
`"quatrocentos e setenta e dois"`.

O mais difícil aqui não é programar, é organizar os casos especiais: de 11 a 15 as
palavras são irregulares, o 100 exacto é `"cem"` mas 101 é `"cento e um"`, e as regras
do `"e"` não são uniformes. Escreve os casos todos no papel antes de abrires o IntelliJ.

### 52. WordWrap
Dada uma frase e uma largura máxima em caracteres, divide o texto em linhas sem cortar
nenhuma palavra ao meio. Imprime o resultado.

É o algoritmo que o teu editor de texto corre a cada tecla que carregas.

---

## Nota sobre StringBuilder

Em Java, uma *string* é **imutável**: depois de criada, não se altera. Quando escreves
`texto = texto + "a"`, o Java não acrescenta nada ao `texto` — cria uma *string*
completamente nova com o conteúdo das duas e aponta a variável para ela.

Dentro de um ciclo isto é um problema sério. Para montar uma *string* de mil caracteres,
um carácter de cada vez, o Java cria mil *strings* intermédias e deita-as todas fora
menos a última.

O `StringBuilder` existe precisamente para isso. É um construtor de *strings* que se
pode alterar:

```java
StringBuilder result = new StringBuilder();

for (int i = 0; i < text.length(); i++) {
    result.append(text.charAt(i));
}

return result.toString();
```

Três coisas a reter: cria-se com `new StringBuilder()`, acrescenta-se com `append`, e no
fim converte-se para `String` com `toString()`.

Usa-o em todos os exercícios do nível 2 em diante que construam texto. E repara que
acabaste de usar `new` — estás a criar um objecto. Na ficha de POO vais aprender a
escrever as classes que estão do outro lado dessa palavra.

---

## Soluções

Ficam em `src/solutions/strings/`, fora do repositório como da outra vez. Pede-mas
quando chegares lá — não as quero no teu caminho antes de tempo.
