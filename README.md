SISTEMA SIMULADOR DE INTERNET BANKING

*---- AVISO ----*

- Para utilizar este Sistema é necessario JAVA 8/JRE 1.8.0 e IDE Eclipse, de preferencia distribuição NEON ou superior.
- É necessario conexão com a internet para usar este Sistema.
- Para evitar que os avaliadores deste trabalho tenham que instalar e/ou criar Bancos de Dados, a parte de BD deste software fica em um servidor do azure.
- Observem que por estar em um servidor Azure qualquer um pode ver o que foi inserido no banco, por isso não utilizem dados reais ou que possam lhe compremeter enquanto usa este Sistema, eu estarei observando as movimentações no banco de dados durante o periodo de avaliação para evitar problemas.

*--- INFORMAÇÕES DE USO ---*

- No primeiro uso entre em "Primeiro acesso" para cadastrar um usuario, lembre-se do login e senha para depois acessar o sistema, para fins de testes a opção "Saldo da Conta" vai estar disponivel (isso obviamente não existe em um IB real).
- Existem 4 opções de operações:

  - Transferencia
    - A ideia inicial é transferir valores de uma conta para outra, note que é necessario digitar agencia, conta e cpf validos para isso (crie outros usuarios conforme necessario), a identificação é uma descrição do usuario e serve para posteriormente identificar a transação no extrato.
  
  - Extrato
    - Exibe todas as movimentações de valores na conta.
    
  - Pagamento
    - Não é necessario um codigo de barras valido para isso, apenas uma numeração qualquer ja serve, o valor é a prioridade para depois ser adicionado no extrato.
    
  - Recarga
    - Requisitos similares ao pagamento.
    
