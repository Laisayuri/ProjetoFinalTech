# ProjetoFinalTech

O projeto tem como o objetivo criar um gerenciamento de clientes e contas bancárias, onde será s disponibilizada uma API que forneça dados de clientes e contas (inicialmente para
consulta).

OBJETIVOS

Será construida uma API Spring BOOT que possuindo 2 endpoints principais:

● Recuperação de todas as contas bancárias <br />
● Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)

ESPECIFICAÇÕES

Tecnologias que serão usadas para este projeto:

Banco de Dados: MySQL
API: SpringBoot

Modelagem de Dados:

Todo cliente possui os seguintes dados para serem cadastrados <br />
● codigo interno <br />
● nome <br />
● cpf <br />
● telefone <br />
● email

Toda conta bancária possui os seguintes dados <br />
● numero <br />
● agência <br />
● tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento) <br />
● saldo <br />
● titular da conta <br />

ENTREGÁVEIS

Será entregue endpoint para consulta de todas as contas:

/contas <br />
Endpoint para consultas do detalhe da conta <br />
/contas/{id} <br />
Todos os dados devem ser retornados em formato JSON.


Por:

- Lucas Eduardo Carlos Cravo
- Natalico Junior
- Lais Yasunaka
- Diego Justino
- Jonatha Teixeira
- Denise Regert Mocellin
