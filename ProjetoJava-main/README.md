# ProjetoJava
Projeto para dia 03.06
# Proposta
O projeto deve representar parte de um sistema de vendas de produtos ou de serviços. Cada
dupla deve definir o tema de seu projeto (por exemplo, venda de roupas, supermercado,
aluguel de filmes, serviços de oficina mecânica, serviços de montagem de computadores,
venda de veículos, papelaria, serviços de estética, etc.).
a) Crie um cadastro de clientes para seu sistema. Nesse cadastro deve ter:

a. Uma classe “Pessoa”, abstrata.
b. Uma interface “IPessoa”, com pelo menos um método chamado “exibir”, que deve
exibir todos os dados de um cliente.
c. Uma classe “Cliente”, que herda de “Pessoa” e implementa a interface, com pelo
menos cinco atributos, entre eles um atributo “nome” e outro “idade”. Os demais
ficam à sua escolha, de acordo com o tema definido pela dupla.
d. O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão
de clientes. Utilize tratamento de exceção para validar os campos (por exemplo,
ao tentar cadastrar um cliente com idade negativa). Se necessário, crie exceções
específicas.

b) Crie um cadastro de funcionários para seu sistema. Nesse cadastro deve ter:

a. Uma classe “Funcionário”, que herda de “Pessoa” e implementa a interface, com
pelo menos cinco atributos, entre eles um atributo “nome” e outro “idade”. Os
demais ficam à sua escolha, de acordo com o tema definido pela dupla. O método
“exibir” deve exibir todos os dados de um funcionário.
b. O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão
de funcionários. Utilize tratamento de exceção para validar os campos (por
exemplo, ao tentar cadastrar um funcionário com idade negativa). Se necessário,
crie exceções específicas.

c) Crie um cadastro de produtos para seu sistema. Nesse cadastro deve ter:

a. Uma classe “Produto”, que deve ter pelo menos cinco atributos, entre eles um
atributo “descrição” e outro “preço”. Fique à vontade para criar superclasses ou
interfaces, se achar necessário.
b. O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão
de produtos. Utilize tratamento de exceção para validar os campos (por exemplo,
ao tentar cadastrar um produto com preço negativo). Se necessário, crie exceções
específicas.

d) Implemente um sistema de busca de clientes. O sistema deve realizar a busca por parte do
nome (por exemplo, se o usuário digitar “jos” o sistema deve trazer todos os clientes
cadastrados cujos nomes começam com “jos” - José, Josiane, etc.). Implemente o mesmo
sistema de busca para Funcionário.
e) Implemente um sistema de busca de produtos/serviços. O sistema deve realizar a busca por
parte da descrição (assim como o nome do cliente ou funcionário). O sistema também deve
realizar busca por pelo menos mais dois atributos de Produto/Serviço (por exemplo, busca
por código e busca por preço. Não é necessário combiná-los entre si).
f) O programa deve ter métodos que informem: (i) o cliente de maior idade do sistema; (ii) o
mais jovem; (iii) a quantidade de clientes maiores de 60 anos; (iv) a quantidade de clientes
menores de 18 anos; (v) a idade média dos clientes.
g) O programa deve ter métodos que informem: (i) o produto ou serviço mais caro do sistema;
(ii) o mais barato; (iii) a média de preço; (iv) a quantidade de produtos/serviços com preço
acima da média.
h) Para melhor usabilidade do programa, implemente um menu com as opções e permita que o
usuário informe os dados a serem cadastrados ou procurados.

# Concepções pessoais <hr> Tema: Loja de Vestimentas(camisetas, calças, tênis) <hr> 
