Senha para a base de dados: senhared

Para utilizar o banco é necessário:
  (1) Criar o usuário (red) no postgresql;
  => sudo -u postgres createuser -D -A -P red
  (2) Restaurar a Base de Dados;
  => sudo pg_restore --host localhost --port 5432 --username red --dbname projetoInformatica /home/p3rs3us/Documents/dbs[bkps] (trocar por caminho onde estiver o backup dbs[bkp]).

+ Para realizar o backup em um arquivo|:
  => sudo pg_dump --host localhost --port 5432 --username red --format tar --file /home/p3rs3us/Documents/dbs[bkp] projetoInformatica (trocar por onde quiser que seja salvo o backup).

+ Acessar pelo terminal o Prompt do Postgre:
  => sudo -u postgres psql postgres

+ Para fazer o Banco ser acessado pela rede, fora do localhost:
  => Editar: sudo nano /etc/postgresql/9.4/main/postgresql.conf 
  => Procurar a linha:
       listen_addresses = 'localhost' | substituir 'localhost' por '*'

A classe que exibe a interface gráfica está no pacote: visao e se chama TelaLogin.

Antes de executar o Projeto pode ser necessário adicionar uma biblioteca extra para manipular o Banco de Dados.
  => Clique com o botão direito do mouse em biblioteca > Importar... > PostgreSQL JDBC Driver.

Após ter restaurado o banco de dados selecione a classe TelaLogin e tecle shift + F6 para executar a aplicação.

Usuário para utilizar como teste no TelaLogin:
  => u: luxD
  => s: 123456789
