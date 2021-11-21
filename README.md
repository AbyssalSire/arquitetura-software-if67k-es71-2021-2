# Arquitetura de Software IF67K ES74 2021-02

## Atividade #3 - Desenvolvimento de GUI

### Lista de telas:

Todas as telas foram montadas o mais parecido possível com a planilha original de correção de solos, para facilitar a transição dos usuários.


#### Página de cálculo de valores ideais:
![image](https://user-images.githubusercontent.com/40677401/141005937-0d7bbcd8-6c4c-437b-b3ac-6ad0ae3611d8.png)


#### Página de cálculo de recuperação/correção e fonte de Fósforo
![image](https://user-images.githubusercontent.com/40677401/141006118-8fec89c5-2fab-4b9a-9e70-d5d3f659e729.png)


#### Página de cálculo de recuperação/correção e fonte de Potássio
![image](https://user-images.githubusercontent.com/40677401/141006141-f08ace2e-2ca1-43ee-94cb-e98019e0435f.png)


#### Página de cálculo de recuperação/correção e fonte de Cálcio e Magnésio
![image](https://user-images.githubusercontent.com/40677401/141006171-90028d7b-8041-49d7-87b9-e0c4c1e65e8c.png)


#### Testes realizados com JUnit5:
![image](https://user-images.githubusercontent.com/40677401/141006389-819319f5-33ce-4f9f-9d07-9a75b2576842.png)

### Para rodar o APP basta abrir o projeto no Eclipse e selecionar a opção "Run as -> Java Application"
![image](https://user-images.githubusercontent.com/40677401/142780908-7f321c08-ce53-4c36-930e-a7c120439c03.png)

Para rodar os testes é necessário importar o lombok.jar

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

