1. Supondo que a população de um país A seja de 55.000 habitantes e tem
uma taxa de crescimento mensal de 0,3%. A população de um país B tem
160.000 habitantes e tem uma taxa de crescimento mensal de 0,18%.
Faça um programa que calcule e escreva o número de meses necessários
para que a população do país A ultrapasse ou iguale a população do país
B, mantidas as taxas de crescimento.

2. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50

3. Desenvolver um programa que efetue a soma de todos os números
ímpares que são múltiplos de três e que se encontram no conjunto dos
números de 1 até 500.

4. Desenvolver um programa que leia a altura de 15 pessoas. Este
programa deverá calcular e mostrar:
a. A menor altura do grupo;
b. A maior altura do grupo;

5. Escrever um algoritmo que leia uma quantidade desconhecida de
números e conte quantos deles estão nos seguintes intervalos: [0-25],
[26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
for lido um número negativo.

6. Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
a) os atributos
nome (String)
qtdAtual (int)
qtdMinima (int).
b) um construtor sem parâmetros e outro contendo os parâmetros (nome,
qtdAtual, e qtdMinima).
c) os métodos com as seguintes assinaturas:
mudarNome(nome)
mudarQtdMinima(qtdMinima)
repor(qtd)
darBaixa(qtd)

mostrar()
precisaRepor().
d) os atributos qtdAtual e qtdMinima jamais poderão ser negativos. O método
repor aumenta qtdAtual de acordo com o parâmetro qtd. O método darBaixa
diminui qtdAtual de acordo com o parâmetro qtd. O método mostrar() retorna
uma String contendo o nome do produto, sua quantidade mínima, sua
quantidade atual. O método precisaRepor retorna true caso a quantidade
atual esteja menor ou igual a quantidade mínima e false, caso contrário.

7. Escreva uma classe UsaEstoque que vai instanciar os 3 objetos a seguir:
estoque1
nome: Impressora Jato de Tinta
qtdAtual: 13
qtdMinima: 6
estoque2
nome: Monitor LCD 17 polegadas
qtdAtual: 11
qtdMinima: 13
estoque3
nome: Mouse Ótico
qtdAtual: 6
qtdMinima: 2
Depois disso, execute as seguintes operações na seguinte ordem:
a) Dar baixa em 5 unidades de estoque1.
b) Fazer a reposição de 7 unidades de estoque2.
c) Dar baixa em 4 unidades de estoque3.
d) Exibir a saída do método precisaRepor dos 3 objetos.
e) Exibir a saída do método mostra para apresentar as informações sobre
os 3 objetos.