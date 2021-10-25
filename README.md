# Arquitetura de Software IF67K ES74 2021-02

## Atividade #2 - Desenvolvimento de GUI

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

A estruturação básica foi feita pensando em como projetos web em que trabalhei são montados, utilizando de componentes.

A pasta principal será a /view/, nela será inserida a tela principal, esta tela principal utilizará os componentes do pacote /componentesView/.


Dentro de /componentesView/ teremos 3 pacotes, /componentesGenericos/, /correcaoEFontesNutrientes/ e /valoresIdeais/. O pacote de componentes genéricos deverá conter possíveis componentes que serão utilizados tanto em /correcaoEFontesNutrientes/ e /valoresIdeais/. 

O pacote /valoresIdeais/ deverá conter os componentes necessários para a criação dos componentes que serão encaixado na tela principal da view e que deverão gerar os valores ideais para cada um dos nutrientes, também há um pacote de componentes para possíveis componentes utilizados na composição desta funcionalidade.

O pacote /correcaoEFontesNutrientes/ segue uma estrutura similar, mas com 4 subpacotes em seu interior. O primeiro está relacionado a /componentesGenericos/ que pocerão ser utilizados em qualquer um dos outros pacotes que representam os elementos utilizados na planilha de correção de solos, sendo eles *cálcio e magnésio*, *fósforo* e *potássio*, cada um destes deverão cumprir as funções de correção/recuperação assim como a conversão para as respectivas unidades de medidas além de geraros valores das fontes. 

Os três pacotes referentes a elementos possuem a mesma estrutura de conter o elemento principal dentro dele e um subpacote de componentes para melhor visualização e organização em caso de haver diversos componentes a serem utilizados no elemento.


### Nota: ?/10
