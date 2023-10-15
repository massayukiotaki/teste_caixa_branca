<h1>teste_caixa_branca</h1>
<h2>Documentação:</h2> 
<p> A documentação, não foi citada e/ou descrita no código, não há comentários e nenhuma instrução.</p>
<h2>Nomenclatura de Variáveis e Constantes</h2>
<p>A nomenclatura de variáveis e constantes não possuem uma nomenclatura clara ou mais descritiva. Por exemplo, a variável result, que poderia ser mais descritiva e indicar dee forma mais clara sua função.</p>
<h2>Legibilidade e Organização</h2>
<p>Ao analisar a legibilidade e a organização do código, é possivel reparar que os blocos try-catch vazios, pois não fornecem informações úteis sobre exceções. E também, o código não apresenta uma boa formatação, a concatenação de strings dificultam a legibilidade e a organização. Um código mais organizado e legível facilitaria a manutenção.</p>
<h2>Arquitetura</h2>
<p>É difícil avaliar o critério 'arquitetura', apenas através do código apresentado. No entanto, é possível notar que há a falta de algumas boas práticas, como por exemplo a a conexão com o banco de dados e a lógica de negócios estão misturadas na classe 'User', o que não corresponde a uma boa prática.</p>
<h2>Fechamento de Conexões</h2>
<p>O código não fecha corretamente a conexão com o banco de dados após o uso. É essencial fechar as conexões, instruções e resultados quando não forem mais necessários, para evitar vazamentos de recursos.</p>
<h2>Utilização de Ferramentas como FindBugs</h2>
<p>Sim, é uma boa prática usar ferramentas de análise de código estático como FindBugs, para assim, identificar potenciais problemas e vulnerabilidades no código. </p>
<h2>Grafo de Fluxo</h2>
<img src="/teste_caixa_branc/img/Fluxo_Grafo.png">
<h2>Calculo da complexidade ciclomática</h2>
<p>V(G) = E - N + 2</p>
<p>V(G) =  19 - 17 + 2</p>
<p>V(G) = 4</p>
<h2>Base de caminhos</h2>
<p>1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 16, 17</p>
<p>1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 15, 17</p>
<p>1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 17</p>
<p>1, 2, 3, 5, 17</p>
<h2>Documentação</h2>
<p>A documentação do código Java, nada mais é que a adição de comentários, explicando cada sentença do código, como classe, método e variáveis.</p>

