<h1>Enums</h1>

<p>Enums são uma forma de representar constantes pré-definidas e que não se alterarão.</p>

------

<h2>Objetivos do estudo</h2>
<p>Entender a aplicabilidade dos enums e como seus dados podem ser registrados no banco de dados.</p>
<h2>Modelo das classes utilizadas como exemplo:</h2>

![modelo-entidades](https://github.com/MarhlonKorb/enums-springboot/blob/master/img/model-entities.png)

<p>No exemplo acima foram criadas duas classes. Uma é a entidade Order, que tem os atributos responsáveis por serem registrados no banco de dados e a outra classe é o enum de exemplo.</p>

<p>Pelo fato do Java não aceitar herança múltipla, classes Enum não podem ser instanciadas, nesse caso são tratadas como constantes literais.</p>

<h2>Modelo do fluxo de pedido:</h2>

![ciclo-order](https://github.com/MarhlonKorb/enums-springboot/blob/master/img/ciclo-order.png)

1. A solicitação do pedido é recebida;

2. O status no banco de dados da entidade Order é alterada para aguardando pagamento;

3. Status é alterado para pago;

4. Status alterado para enviado;

5. Status alterado para entregue ou cancelado, dando fim ao ciclo do pedido.

   <b>É importante ressaltar que pelo fato de um enum poder ser tanto um número serial quanto uma dado que pode retornar uma Enum de String, que você poderá utilizar da forma que precisar, seja no backend registrando-o como um numeral no banco de dados, ou no front end como uma informação para sua interface gráfica.</b>

<h2>Modelo da classe Enum</h2>

<img src="https://github.com/MarhlonKorb/enums-springboot/blob/master/img/class-enum.png"/>

<p>Métodos get e set inseridos dentro da classe Order para retornar um Enum e verificar o enum que está sendo recebido se é diferente de nulo.</p>

![](https://github.com/MarhlonKorb/enums-springboot/blob/master/img/methods-verify-variable-received.png)

<p>Método que garante que o enum que está sendo passado para dentro do método é um enum existente, ou seja, que foi inserido na classe enum que está sendo utilizada.</p>

![method-verify-code-enum](https://github.com/MarhlonKorb/enums-springboot/blob/master/img/method-verify-code-enum.png)

<h3>Tecnologias utilizadas no estudo: </h3>

- Linguagem Java;
- Spring Boot;
- Banco de dados H2(local).

<h3>Clone meu repositório</h3>

```
gh repo clone MarhlonKorb/enums-springboot
```
