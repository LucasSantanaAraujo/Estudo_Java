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
só depois descobres que o Java já a tinha.

Os únicos métodos da `String` sempre permitidos são `length()` e `charAt()`. Métodos da
classe `Character` — `Character.toLowerCase`, `Character.isLetter`, `Character.isDigit`
— são sempre permitidos, porque não é isso que está em causa.

---

## Cada exercício tem a assinatura do método indicada

Em todos os enunciados vais encontrar uma linha **Método:** com a assinatura exacta que
se espera. Escreve o método com esse nome, esses parâmetros e esse tipo de retorno.

Isso não é capricho. Os exercícios dos níveis seguintes vão chamar os métodos dos
anteriores pelo nome, e se as assinaturas não baterem certo nada encaixa.

O `main` existe só para ler do teclado, chamar o método e imprimir o resultado. Nenhuma
lógica vive lá dentro.

---

## Como reutilizar métodos entre ficheiros

A partir do exercício 19 vais precisar de chamar métodos que escreveste noutros
ficheiros. Como todas as classes desta ficha estão no mesmo *package* `strings`, **não
precisas de nenhum `import`** — basta escrever o nome da classe seguido do método:

```java
String inverted = StringUtils.reverse("ola");
int vowels = CountVowels.countVowels("programacao");
```

O `import` só é preciso quando a classe está noutro *package*. É por isso que escreves
`import java.util.Scanner;` mas nunca escreveste nada para usar as tuas próprias classes
do *package* `fundamentals` entre si.

Para isto funcionar, o método tem de ser `public static`. O `public` permite que seja
visto de fora da classe; o `static` permite chamá-lo sem criares um objecto. Na ficha de
POO vais perceber exactamente o que é que o `static` está a dizer.

---

## Como trabalhar

Um ficheiro `.java` por exercício, com o nome indicado, dentro do *package* `strings`.

Antes de escreveres, responde no papel: o que entra, o que sai, que passos ligam um ao
outro. Em exercícios de texto acrescenta sempre uma quarta pergunta: **o que acontece se
a string estiver vazia?**

Uma nota sobre isso, porque é fonte de confusão: `scanner.nextLine()` nunca devolve
`null`. Se o utilizador carregar em Enter sem escrever nada, devolve `""` — uma *string*
que existe e tem zero caracteres. Para testar se está vazia, usa `text.length() == 0`.

Faz um *commit* por exercício.

---

## Nível 1 — Percorrer e contar

Neste nível só tens de aprender a andar ao longo de uma *string*. O padrão é sempre o
mesmo e vais escrevê-lo tantas vezes que deixa de exigir pensamento.

Em todos eles, guarda o carácter numa variável logo à entrada do ciclo em vez de
chamares `charAt(i)` várias vezes na mesma iteração:

```java
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
    // usa c daqui para a frente
}
```

### 1. GetCharacter `[PL2 1.1]`
Devolve o carácter que está numa dada posição da *string*.

**Método:** `public static char getCharacter(String text, int index)`

Testa primeiro com um índice fora do intervalo e vê a excepção que aparece. Depois
acrescenta a verificação **dentro do método**, lançando uma
`IllegalArgumentException` com uma mensagem clara.

A validação tem de estar no método, não no `main`. O método é que conhece as suas
próprias regras; quem o chama não tem obrigação de as adivinhar.

### 2. PrintEachCharacter
Imprime cada carácter numa linha própria, precedido do seu índice. Para `"Java"` sai
`0: J`, `1: a`, `2: v`, `3: a`. Repara que o primeiro índice é zero.

**Método:** `public static void printEachCharacter(String text)`

O tipo de retorno é `void` porque este método imprime em vez de devolver. É o único do
nível 1 em que isso é adequado — e repara que é adequado precisamente porque imprimir
*é* o objectivo do exercício.

### 3. CountVowels
Conta quantas vogais existem na *string*, tratando maiúsculas e minúsculas como iguais.

**Método:** `public static int countVowels(String text)`

Usa `Character.toLowerCase(c)` para não teres de testar as dez variantes.

### 4. CountSpecificCharacter `[PL2 1.3]`
Conta quantas vezes um dado carácter aparece na *string*.

**Método:** `public static int countCharacter(String text, char target)`

### 5. CountLettersAndDigits
Conta separadamente letras, algarismos e outros caracteres.

**Métodos:**
```java
public static int countLetters(String text)
public static int countDigits(String text)
public static int countOthers(String text)
```

Três métodos, não um. Cada um responde a uma pergunta e pode ser usado sozinho.

Experimenta a tua solução com `"ação123"` e repara no que acontece aos caracteres
acentuados. Depois experimenta com `Character.isLetter(c)` em vez de
`c >= 'a' && c <= 'z'` e compara. Em Java, `Character.isLetter` conhece o alfabeto
completo, incluindo acentos.

### 6. FirstAndLastCharacter
Devolve o primeiro e o último carácter.

**Métodos:**
```java
public static char firstCharacter(String text)
public static char lastCharacter(String text)
```

Se a *string* estiver vazia, lança `IllegalArgumentException`.

Não percorras a *string* para isto. O primeiro carácter está sempre no índice `0` e o
último em `length() - 1` — vais lá directo. Percorrer um milhão de caracteres para
descobrir dois cujas posições já conheces é trabalho desperdiçado.

### 7. RepeatString
Devolve a *string* repetida `n` vezes. Para `"ab"` e `n = 3` devolve `"ababab"` — uma
única *string* de seis caracteres, não três linhas no ecrã.

**Método:** `public static String repeat(String text, int times)`

Sem usar o método `repeat` da classe `String`. Usa `StringBuilder` (ver a nota no fim
da ficha). Se `times` for negativo, lança `IllegalArgumentException`; se for zero,
devolve `""`.

### 8. CountUpperAndLower
Conta letras maiúsculas e minúsculas.

**Métodos:**
```java
public static int countUpperCase(String text)
public static int countLowerCase(String text)
```

---

## Nível 2 — Transformar

Agora já não contas: constróis uma *string* nova a partir da original. Lê a nota sobre
`StringBuilder` no fim da ficha antes de começares o exercício 9.

### 9. ReverseString `[PL2 1.4]`
Devolve a *string* com os caracteres pela ordem inversa.

**Método:** `public static String reverse(String text)`

Sem usar métodos da classe `String` além de `length` e `charAt`.

### 10. ToLowerCaseManual `[PL2 1.5]`
Converte todas as letras para minúsculas.

**Método:** `public static String toLowerCase(String text)`

Sem usar `toLowerCase` — nem o da `String`, nem o da `Character`. Pista: em Java um
`char` é também um número. Imprime `(int) 'A'` e `(int) 'a'` e repara na diferença.

### 11. ToUpperCaseManual
O inverso.

**Método:** `public static String toUpperCase(String text)`

### 12. SwapCase
Troca maiúsculas por minúsculas e vice-versa. O que não for letra fica como está.

**Método:** `public static String swapCase(String text)`

### 13. RemoveSpaces
Devolve a *string* sem nenhum espaço.

**Método:** `public static String removeSpaces(String text)`

### 14. RemoveVowels
Devolve a *string* sem nenhuma vogal.

**Método:** `public static String removeVowels(String text)`

### 15. ReplaceCharacter
Substitui todas as ocorrências de um carácter por outro, sem usar `replace`.

**Método:** `public static String replace(String text, char oldChar, char newChar)`

### 16. TrimManual
Remove os espaços do início e do fim, mantendo os do meio. Sem usar `trim`.

**Método:** `public static String trim(String text)`

Primeiro exercício em que vais precisar de dois índices a andar em sentidos opostos.
Uma *string* só com espaços deve devolver `""`.

### 17. StringUtils
Não é um exercício novo: é uma arrumação.

Cria a classe `StringUtils` e junta nela, como métodos `public static`, as soluções dos
exercícios 9, 10, 13 e 16:

```java
public static String reverse(String text)
public static String toLowerCase(String text)
public static String removeSpaces(String text)
public static String trim(String text)
```

A classe não tem `main`. A partir daqui, sempre que um exercício precisar de uma destas
operações, chama a `StringUtils` em vez de voltares a escrever o ciclo. Vais usá-la nos
exercícios 19, 20, 25, 32 e 43.

Isto chama-se extrair uma classe utilitária, e é a primeira vez que vais escrever código
cujo propósito é ser usado por outro código em vez de resolver um problema directamente.

---

## Nível 3 — Comparar e procurar

### 18. CompareStrings `[PL2 1.2]`
Verifica se duas *strings* são iguais.

**Método:** `public static boolean areEqual(String a, String b)`

Compara caractere a caractere com um ciclo, sem usar `equals`.

**Antes disso, faz esta experiência.** Escreve um programa que declare
`String a = "Java";` e `String b = "Java";` e imprima `a == b`. Depois lê as duas do
teclado com o `Scanner`, escreve `Java` nas duas, e imprime `a == b` outra vez. Os
resultados são diferentes.

Descobre porquê antes de continuares. É a armadilha que apanha toda a gente que aprende
Java, e a razão pela qual o `equals` existe.

### 19. CompareIgnoreCase
Compara duas *strings* ignorando maiúsculas e minúsculas.

**Método:** `public static boolean areEqualIgnoreCase(String a, String b)`

Chama `StringUtils.toLowerCase` nas duas e depois `CompareStrings.areEqual`.

### 20. IsPalindromeString
Verifica se uma *string* é um palíndromo, ignorando espaços e maiúsculas, para que
`"Ana ama anã"` conte.

**Método:** `public static boolean isPalindrome(String text)`

Chama `StringUtils.removeSpaces`, `StringUtils.toLowerCase` e `StringUtils.reverse`.
A solução inteira deve caber em três ou quatro linhas se reutilizares bem.

### 21. FindWord `[PL2 1.6]`
Devolve o índice onde uma *string* começa dentro de outra, ou `-1` se não existir.

**Método:** `public static int indexOf(String text, String word)`

Sem usar `indexOf`. É o exercício mais difícil do nível. A ideia: para cada posição
possível na *string* grande, verifica se a partir dali os caracteres batem todos certo
com a pequena.

### 22. ContainsSubstring
Diz se uma *string* contém outra.

**Método:** `public static boolean contains(String text, String word)`

Chama `FindWord.indexOf` e compara com `-1`. Uma linha. Não repitas a lógica.

### 23. CountSubstringOccurrences
Conta quantas vezes uma *string* aparece dentro de outra.

**Método:** `public static int countOccurrences(String text, String word)`

Decide e documenta num comentário o que fazes com sobreposições: em `"aaaa"`, quantas
vezes aparece `"aa"`?

### 24. StartsWithEndsWith
**Métodos:**
```java
public static boolean startsWith(String text, String prefix)
public static boolean endsWith(String text, String suffix)
```

Sem usar `startsWith` nem `endsWith`.

### 25. AreAnagrams
Duas palavras são anagramas se tiverem os mesmos caracteres por ordem diferente, como
`"amor"` e `"roma"`. Ignora espaços e maiúsculas.

**Método:** `public static boolean areAnagrams(String a, String b)`

Duas estratégias possíveis: ordenar os caracteres das duas e comparar, ou contar quantas
vezes cada letra aparece em cada uma. Pensa nas duas antes de escolher. Podes usar
`Arrays.sort` se seguires a primeira.

### 26. LongestCommonPrefix
Devolve o maior prefixo comum a duas *strings*. Para `"programming"` e `"progress"`
devolve `"progr"`.

**Método:** `public static String longestCommonPrefix(String a, String b)`

---

## Nível 4 — Trabalhar com palavras

A partir daqui podes usar `split`, porque o foco deixa de ser percorrer caracteres e
passa a ser organizar texto.

### 27. CountWords
Conta quantas palavras tem uma frase. `"ola    mundo"` tem duas palavras, não cinco.

**Método:** `public static int countWords(String text)`

### 28. LongestWord
Devolve a palavra mais comprida. Em caso de empate, a primeira.

**Método:** `public static String longestWord(String text)`

### 29. ReverseWordOrder
Inverte a ordem das palavras mantendo cada palavra legível. `"o gato dorme"` passa a
`"dorme gato o"`.

**Método:** `public static String reverseWordOrder(String text)`

### 30. CapitalizeEachWord
Primeira letra de cada palavra em maiúscula, as restantes em minúscula.

**Método:** `public static String capitalizeEachWord(String text)`

### 31. CountWordOccurrences
Conta quantas vezes uma palavra aparece numa frase. A palavra `"o"` não deve ser contada
dentro de `"ovo"` — tem de ser palavra inteira.

**Método:** `public static int countWord(String text, String word)`

### 32. FormatText `[PL2 1.7]`
Dada uma *string*: remove espaços do início e do fim, reduz múltiplos espaços entre
palavras a um só, põe a primeira letra de cada palavra em maiúscula e as restantes em
minúscula.

`"   o GATO   dorme  "` tem de dar `"O Gato Dorme"`.

**Método:** `public static String format(String text)`

Resolve chamando `StringUtils.trim` e `CapitalizeEachWord.capitalizeEachWord`. Se te
apetecer escrever um ciclo novo, pára e pergunta-te se já não resolveste esse pedaço.

### 33. AcronymBuilder
Constrói um acrónimo com as iniciais das palavras, ignorando palavras com menos de três
letras. `"Instituto Superior de Engenharia do Porto"` dá `"ISEP"`.

**Método:** `public static String buildAcronym(String text)`

### 34. InitialsFormatter
Devolve o primeiro nome por extenso e as iniciais dos restantes.
`"Lucas Santana Araujo"` dá `"Lucas S. A."`.

**Método:** `public static String formatInitials(String fullName)`

---

## Nível 5 — Validar e converter

### 35. IsNumeric
Verifica se a *string* contém apenas algarismos. A *string* vazia não é numérica.

**Método:** `public static boolean isNumeric(String text)`

### 36. StringToInt
Converte uma *string* num `int`, sem usar `Integer.parseInt`. Trata o sinal negativo. Se
não for válida, lança `IllegalArgumentException`.

**Método:** `public static int toInt(String text)`

Pista: o carácter `'7'` não vale 7. Imprime `(int) '7'` e descobre que conta tens de
fazer.

### 37. IntToString
O inverso, sem usar `String.valueOf` nem concatenação com `""`.

**Método:** `public static String toText(int number)`

Reaproveita o raciocínio de decomposição em algarismos da ficha 1.

### 38. ValidatePassword
**Métodos:**
```java
public static boolean isValid(String password)
public static void printProblems(String password)
```

Regras: pelo menos 8 caracteres, uma maiúscula, uma minúscula, um algarismo e um
carácter que não seja letra nem algarismo. O segundo método imprime quais falham.

### 39. ValidateEmail
Tem exactamente um `@`, pelo menos um carácter antes dele, e depois dele um `.` com pelo
menos um carácter de cada lado. Sem expressões regulares.

**Método:** `public static boolean isValidEmail(String email)`

### 40. MaskString
Esconde todos os caracteres excepto os últimos `visible`, substituindo-os por `*`. Para
`"4716123456789012"` com `visible = 4` devolve `"************9012"`.

**Método:** `public static String mask(String text, int visible)`

### 41. PadString
**Métodos:**
```java
public static String padLeft(String text, int totalLength, char padChar)
public static String padRight(String text, int totalLength, char padChar)
```

Se a *string* já for suficientemente comprida, devolve-a inalterada.

### 42. CensorWord
Substitui todas as ocorrências de uma palavra por asteriscos do mesmo comprimento.

**Método:** `public static String censor(String text, String word)`

---

## Nível 6 — Desafios

Bem mais difíceis do que tudo o que vem antes. Não te assustes se precisares de parar e
desenhar o problema no papel.

### 43. CaesarCipher
Desloca cada letra um número fixo de posições no alfabeto. Com deslocamento 3, `'a'`
passa a `'d'` e `'z'` dá a volta e passa a `'c'`.

**Métodos:**
```java
public static String encrypt(String text, int shift)
public static String decrypt(String text, int shift)
```

Preserva maiúsculas e minúsculas, deixa inalterado o que não for letra. A parte
complicada é a volta ao princípio do alfabeto — o operador `%` é teu amigo.

O `decrypt` deve chamar o `encrypt` com o deslocamento simétrico em vez de repetir a
lógica. Testa que encriptar e depois desencriptar devolve o texto original.

### 44. CharacterFrequency
Conta quantas vezes cada letra aparece e imprime só as que aparecem.

**Métodos:**
```java
public static int[] countFrequency(String text)
public static void printFrequency(String text)
```

O primeiro devolve um *array* de 26 inteiros, um por letra do alfabeto. Faz
corresponder cada letra a uma posição: `'a'` à posição 0, `'b'` à 1, e assim por diante.
A conta é `c - 'a'`.

Este exercício é a ponte para a ficha dos *arrays*.

### 45. FirstNonRepeatingCharacter
Devolve o primeiro carácter que aparece exactamente uma vez. Em `"programming"` é `'p'`.
Se não existir nenhum, devolve `'\0'` e documenta isso num comentário.

**Método:** `public static char firstNonRepeating(String text)`

### 46. RemoveDuplicateCharacters
Remove caracteres repetidos, mantendo a primeira ocorrência. `"programming"` dá
`"progamin"`.

**Método:** `public static String removeDuplicates(String text)`

### 47. IsIsogram
Verifica se uma palavra não tem nenhuma letra repetida.

**Método:** `public static boolean isIsogram(String text)`

### 48. RunLengthEncode
Comprime substituindo sequências do mesmo carácter pelo carácter seguido do número de
repetições. `"aaabbbcd"` dá `"a3b3c1d1"`. Se a compressão não encurtar, devolve a
*string* original.

**Método:** `public static String encode(String text)`

### 49. RunLengthDecode
O inverso: `"a3b3c1d1"` devolve `"aaabbbcd"`.

**Método:** `public static String decode(String text)`

Testa os dois em conjunto: codificar e depois descodificar tem de devolver exactamente a
*string* original. Esta técnica chama-se *round trip* e é das formas mais fiáveis de
testar um par de operações inversas.

### 50. BalancedBrackets
Verifica se os parênteses estão equilibrados, considerando `()`, `[]` e `{}`. `"{[()]}"`
está equilibrado; `"{[(])}"` não está, apesar de ter o mesmo número de cada tipo.

**Método:** `public static boolean isBalanced(String text)`

Pensa no problema antes de programar: o que tens de lembrar enquanto percorres a
*string*? Esse "lembrar por ordem, e tirar sempre o último que puseste" chama-se pilha,
e vais construí-la de raiz na ficha das estruturas de dados.

### 51. NumberToWords
Converte um número de 0 a 999 na escrita por extenso em português. `472` dá
`"quatrocentos e setenta e dois"`.

**Método:** `public static String toWords(int number)`

O mais difícil não é programar, é organizar os casos especiais: de 11 a 15 as palavras
são irregulares, 100 exacto é `"cem"` mas 101 é `"cento e um"`, e as regras do `"e"` não
são uniformes. Escreve os casos todos no papel antes de abrires o IntelliJ.

### 52. WordWrap
Divide o texto em linhas de largura máxima dada, sem cortar nenhuma palavra ao meio.

**Método:** `public static String wrap(String text, int width)`

É o algoritmo que o teu editor de texto corre a cada tecla que carregas.

---

## Nota sobre StringBuilder

Em Java, uma *string* é **imutável**: depois de criada, não se altera. Quando escreves
`texto = texto + "a"`, o Java não acrescenta nada ao `texto` — cria uma *string*
completamente nova com o conteúdo das duas e aponta a variável para ela.

Dentro de um ciclo isto é um problema sério. Para montar uma *string* de mil caracteres,
um de cada vez, o Java cria mil *strings* intermédias e deita-as todas fora menos a
última.

O `StringBuilder` existe para isso. É um construtor de *strings* que se pode alterar:

```java
StringBuilder result = new StringBuilder();

for (int i = 0; i < text.length(); i++) {
    result.append(text.charAt(i));
}

return result.toString();
```

Cria-se com `new StringBuilder()`, acrescenta-se com `append`, e no fim converte-se para
`String` com `toString()`.

Usa-o em todos os exercícios que construam texto. E repara que acabaste de usar `new` —
estás a criar um objecto. Na ficha de POO vais aprender a escrever as classes que estão
do outro lado dessa palavra.

---

## Soluções

Ficam em `src/solutions/strings/`, fora do repositório. Pede-mas nível a nível, à medida
que acabas.
