# Arquitetura de Software IF67K ES74 2021-02

## Atividade #2 - Desenvolvimento de GUI

### Lista de telas:

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



### Proposta: 

> #### INTRODUÇÃO
>Esta atividade dá continuidade ao desenvolvimento da arquitetura do aplicativo para correção de solos. O objetivo dessa atividade é desenvolver a interface gráfica com o usuário (GUI) do aplicativo para correção de solos. A GUI constitui uma parte da arquitetura de deploy da aplicação, e é fortemente influenciada pelas técnicas e tecnologias usadas no desenvolvimento. Posteriomente, essa GUI será ligada ao restante da aplicação já desenvolvida.
>
> #### POR ONDE COMEÇAR?
>
>Primeiro, comece criando seu próprio repositório público no Github. Envie o link do repositório que você criou aqui nessa atividade do Moodle. Assim, você não corre o risco de perder o prazo de envio.
>Segundo, analise cuidadosamente a pasta Equilíbrio e Correção na CTC, da planilha de correção de solos. Essa pasta representa a GUI que precisa ser implementada.
>Depois, crie um projeto no repositório do Github usando a tecnologia escolhida. Você tem liberdade de escolher a tecnologia que quiser usar - tanto linguagem quanto framework. >Estabeleça um plano de implementação que considere os princípios de desenvolvimento já usados na primeira parte da arquitetura, sempre favorecendo a manutenabilidade.
>A GUI deve ser funcional. Simule a apresentação de dados e execução das operações.
>
> #### COMMITS
>
>Assim como aconteceu na atividade anterior, você deve fazer commits sempre que uma parte da atividade estiver completada. Isso mostra a evolução do código e serve como base para avaliar o engajamento na atividade. Por exemplo, suponha que você estava escrevendo três métodos para fazer o cálculo da quantidade necessária de cálcio/magnésio. Assim que tiver um primeiro protótipo dos métodos, faça um commit. Lembre-se que os commits devem mostrar a evolução do seu código, como se fosse uma estória - tem começo, meio e fim.
>A mensagem do seu commit precisa ser descritiva. No exemplo dado a acima, uma possível mensagem seria: Criado procedimentos para cálculo de cálcio/magnésio. Você pode adicionar mais detalhes no commit sempre que necessário, mas o título da mensagem deve sempre ser curto e descritivo.
>
>*Sempre tente esclarecer no seu commit a razão que levou à sua decisão. Isso é fundamental para essa disciplina, mas essa prática não é menos importante na vida real.*
>
>*O número de commits NÃO impacta de forma alguma na nota. Quem faz 15 commits não ganha mais nota do que quem faz 3 commits, por exemplo. O que é importante para a nota é a descrição clara do commit e a coesão em cada commit.*
>
> #### TESTE DE SOFTWARE
> 
> Assim como na arquitetura já desenvolvida, essa nova parte da arquitetura deve seguir princípios essenciais de bom desenvolvimento, conforme apresentados nos vídeos deixados na semana 01 e 02. Teste de software é um princípio essencial que deve estar presente na arquitetura.
> 
> ***A não existência de testes válidos para avaliar a funcionalidade da arquitetura desenvolvida invalida o componente de completude da nota, resultando para esse componente a nota 0,0 (zero).***
> 
> #### ENTREGA E ACOMPANHAMENTO
> 
> O desenvolvimento do código continua sendo acompanhado pelo Github. Por isso, você deve usar sua conta e repositório no Github.
>Todo o acompanhamento será feito semanalmente, por meio do código e da documentação no README.md, a partir do envio dessa atividade. Por isso, se mantenha atento nos comentários que devo deixar no seu código, no Github. Veja exemplos de documentação aqui e aqui.
>.
>*Diferente do que aconteceu na atividade anterir, o envio do link NÃO assume que a atividade está completada. Nessa atividade, o acompanhamento acontece ao mesmo tempo que o desenvolvimento. O professor vai avaliar o que foi desenvolvido a cada semana e, eventualmente, questionar e fazer sugestões.*
>
>
> #### AVALIAÇÃO
> 
> 
> Diferente da atividade anterior, a nota dessa atividade considera: (i) completude (6,0); (ii) fundamentos arquiteturais - principios de desenvolvimento e organização da arquitetura (4,0).
> 
> 
> *Assim como na atividade anterior, essa atividade deve ser desenvolvida de forma individual.*


### Explicação da arquitetura:

A estruturação final foi decidida por apresentar um arquivo principal chamado de PaginaPrincipal.java onde ficarão 4 guias distintas para cada uma das funcionalidades do projeto, sendo elas: Cálculo de Valores Ideais, Cálculo de Recuperação/Correção e Fontes dos nutrientes Fósforo, Potássio e Cálcio e Magnésio (com os ultimos dois em uma única página, pela documentação da proposta).

Todo o conteúdo visual e estrutural das guias está no arquivo da página principal com as funcionalidades dos botões e dos campos de input/output sendo alocadas para pacotes exclusivos de cada nutriente. Para explicações da lágica de evolução do projeto, por favor verificar os commits.

### Nota: 8/10


#### Comentários do professor
>	Bom trabalho, Lucas. Infelizmente, a documentação não contém as telas, nem instruções de execução. O projeto não usa o Maven, o gerenciador de build usado no projeto original. Dessa forma, não consegui compilar e executar localmente. Como consequência, não consigo ver se a GUI está funcional.
>
>A organização da arquitetura está boa, e você usou alguns princípios de reuso. Os testes ainda deixam a desejar e sugiro que você se aprofunde nisso em uma próxima oportunidade.
