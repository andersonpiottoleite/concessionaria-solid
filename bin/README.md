# SOLID

* 5 PRINCIPIOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS (esses principios podem ser considerados boas práticas).

SOLID é um acrônimo criado por Michael Feathers.
Ele criou esse acrostico, após observar que cinco princípios da orientação a objetos e design de código — Criados por Robert C. Martin (Tio Bob). 

Principios:

S — Single Responsiblity Principle (Princípio da responsabilidade única)

O — Open-Closed Principle (Princípio Aberto-Fechado)

L — Liskov Substitution Principle (Princípio da substituição de Liskov)

I — Interface Segregation Principle (Princípio da Segregação da Interface)

D — Dependency Inversion Principle (Princípio da inversão da dependência)

-----------------------------------------------------------------------------------------------------------------------------------------------


NO CAFÉ DE HOJE (27/10/2023), VAMOS VER O 'S' DO SOLID:

S — Single Responsiblity Principle (Princípio da responsabilidade única)

Vamos analisar o problema e propor a solução?

BENEFICIOS:

* Código mais limpo.
* Melhora a manutenção, centraliza o código em um só lugar.
* Melhora o aproveitamento de código.
* Alta coesão nas classes.
* Baixo acomplamento.


-----------------------------------------------------------------------------------------------------------------------------------------------


NO CAFÉ DE HOJE (03/11/2023), VAMOS VER O 'O' DO SOLID:

O — Open-Closed Principle (Princípio Aberto-Fechado)

Aberto para externsão e fechado para alterações.

Vamos analisar o problema e propor a solução?

BENEFICIOS:

* Evita alterações na classe e consequentemente reduz a quantidade de novos bugs.
* Preserva o primeiro principio da responsabilidade unica.
* Proporciona maior coesão.
* Facilita os testes.



-----------------------------------------------------------------------------------------------------------------------------------------------




NO CAFÉ DE HOJE (10/11/2023), VAMOS VER O 'L' e o 'I' DO SOLID:

L — Liskov Substitution Principle (Princípio da substituição de Liskov)

I — Interface Segregation Principle (Princípio da Segregação da Interface)

* Primeiro vamos ver o 'L'...
L — Liskov Substitution Principle (Princípio da substituição de Liskov)

Uma classe filha quando chamada por polimorfismo (através de um variável da Classe Pai ou de um Interface), 
deve manter um comportamento adequado.
Caso contrário o principio 'L' é quebrado.

Exemplo:

Invocarmos metodos que não fazem nada, o que simplesmente lançam exceptions,
é um sinal que devemos segrevar/dividir nossa classe base ou interface, em unidades mais coesas e que façam mais sentido.

* Agora vamos ver o 'I'...

O 'I' é a solução para a quebra do 'L'.
I — Interface Segregation Principle (Princípio da Segregação da Interface)

Quando comportamentos indesejados acontecerem em nossa aplciação, metodos que não fazem nada, o que simplesmente lançam exceptions,
é um sinal que devemos segrevar/dividir nossa classe base ou interface, em unidades mais coesas e que façam mais sentido.


BENEFICIOS:

* Proporciona confiança ao se usar Polimorfismo.
* Mantem a coesão das classes, e proporciona herança ou implementações adequadas (É UM).


-----------------------------------------------------------------------------------------------------------------------------------------------



PARA SABER MAIS:
- https://www.baeldung.com/solid-principles




