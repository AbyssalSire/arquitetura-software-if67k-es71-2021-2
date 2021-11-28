# Arquitetura de Software IF67K ES74 2021-02

## Atividade #3 - Desenvolvimento de GUI

### Lista de telas:

Todas as telas foram montadas o mais parecido possível com a planilha original de correção de solos, para facilitar a transição dos usuários.


#### Página de cálculo de valores ideais:
![image](https://user-images.githubusercontent.com/40677401/143790740-439dca20-e62f-4786-973b-9099ef3c1c22.png)

#### Página de cálculo de recuperação/correção e fonte de Fósforo
![image](https://user-images.githubusercontent.com/40677401/143790751-6ff1b4c3-991d-4e46-9f90-5bc4acb2d681.png)


#### Página de cálculo de recuperação/correção e fonte de Potássio
![image](https://user-images.githubusercontent.com/40677401/143790757-6abdc375-8c85-4f5d-82a2-f8ac89c71633.png)


#### Página de cálculo de recuperação/correção e fonte de Cálcio e Magnésio
![image](https://user-images.githubusercontent.com/40677401/143790769-c66272c1-ee86-4b61-8058-9b87ebdebaed.png)

Arquivo build.xml foi gerado utilizando Ant.

Caso queira rodar o projeto utilizando o Eclipe (IDE utilizada pra seu desenvolvimento) será necessário importar o lombok.jar

#### Utilização da aplicação
Assim como na planilha original o usuário deverá preencher os valores no solo na guia Valores Ideais, e então clicar no botão "Calcular", após esta etapa o usuário está livre para utilização do resto da aplicação.

A alteração dos tipos de terreno e tipos de fontes é feita por meio de um JComboBox, e campos deixados vazios serão substituídos com o valor 1.

### Proposta: 

> #### INTRODUÇÃO
>Esta atividade dá continuidade ao desenvolvimento da arquitetura do aplicativo para correção de solos. O objetivo dessa atividade é integrar a interface gráfica com o usuário (GUI) do aplicativo para correção de solos, desenvolvida na Atividade #2, com o restante da arquitetura, desenvolvida anteriormente.
>
> #### POR ONDE COMEÇAR?
>
>Diferente das atividades anteriores, o início dessa atividade varia de acordo com o resultado da Atividade #2. Por isso, cada estudante deve avaliar qual o melhor caminho a tomar. Nesse momento, temos dois projetos diferentes, potencialmente em linguagens de programação diferentes, em dois repositórios diferentes.
>O ponto fundamental dessa atividade é que o aplicativo, como um todo, deve ser funcional: deve ser possível executar o aplicativo, inserir dados na GUI e obter resultados precisos tais como seriam obtidos na planilha.
>
> #### COMMITS
>
>Assim como aconteceu nas atividades anteriores, você deve fazer commits sempre que uma parte da atividade estiver completada. Isso mostra a evolução do código e serve como base para avaliar o engajamento na atividade. Por exemplo, suponha que você estava escrevendo três métodos para fazer o cálculo da quantidade necessária de cálcio/magnésio. Assim que tiver um primeiro protótipo dos métodos, faça um commit. Lembre-se que os commits devem mostrar a evolução do seu código, como se fosse uma estória - tem começo, meio e fim.
>A mensagem do seu commit precisa ser descritiva. No exemplo dado a acima, uma possível mensagem seria: Criado procedimentos para cálculo de cálcio/magnésio. Você pode adicionar mais detalhes no commit sempre que necessário, mas o título da mensagem deve sempre ser curto e descritivo.
>
>
> 
> #### ENTREGA E ACOMPANHAMENTO
> 
>O desenvolvimento do código continua sendo acompanhado pelo Github. Por isso, você deve usar sua conta e repositório no Github.
>Todo o acompanhamento será feito semanalmente, por meio do código e da documentação no README.md, a partir do envio dessa atividade. Por isso, se mantenha atento nos comentários que devo deixar no seu código, no Github. Veja exemplos de documentação aqui e aqui.
>.
>
> #### AVALIAÇÃO
> 
> 
>Assim como na atividade anterior, a nota dessa atividade considera: (i) completude (6,0); (ii) fundamentos arquiteturais - principios de desenvolvimento e organização da arquitetura (4,0).
> 
> 


### Explicação da arquitetura:

A estruturação final foi decidida por apresentar um arquivo principal chamado de PaginaPrincipal.java onde ficarão 4 guias distintas para cada uma das funcionalidades do projeto, sendo elas: Cálculo de Valores Ideais, Cálculo de Recuperação/Correção e Fontes dos nutrientes Fósforo, Potássio e Cálcio e Magnésio (com os ultimos dois em uma única página, pela documentação da proposta).

Todo o conteúdo visual e estrutural das guias está no arquivo da página principal com as funcionalidades dos botões e dos campos de input/output sendo alocadas para pacotes exclusivos de cada nutriente. Para explicações da lágica de evolução do projeto, por favor verificar os commits.


### Nota: ?/10


#### Comentários do professor


### Notas finais do autor com relação a funcionalidades não implementadas:
>Coisas que não consegui entender na planilha:
>Elementos que utilizam guias distintas como por exemplo a tupla O179 da guia EQUILIVRIO E CORREÇÃO NA CTC, que possui a fórmula ='Memória de cálculo'!G111+'Memória de cálculo'!I105
>
>Ou ainda em Memória de cálculo tupla F117 com fórmula =F113*'EQUILIBRIO E CORREÇÃO NA CTC'!H5
>
>Não fui capaz de identificar qual parte do código já feito realiza estas etapas.


