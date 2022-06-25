# Projeto-Lombok 

Primeiro projeto utilizando a biblioteca Lombok

Projeto feito utilizando o tutorial presente no seguinte link: https://www.youtube.com/watch?v=v6Ea3_GnKG0&list=PL6oD2syjfW7CchnxJKhJ8IiY61efkyL8h 

Algumas anotações e para que servem: 

- @Getter e Setter </br> 
- Com estas anotações não se faz mais necessária a criação dos métodos de recuperação e configuração das propriedades das classes. 

- @ToString	</br> 
- Não há mais necessidade de iniciar um debugger para ver os campos. Basta deixar que o lombok gere o toString(). 

- @EqualsAndHashCode </br> 
- Método equals e hashCode são gerados automaticamente para os campos do objeto de forma fácil e simples. 

- @Data </br> 
  Todos juntos agora: Um atalho para @ToString, @EqualsAndHashCode,@Getter em todos os campos, e @Setter em todos os campos não-finais. 
  Você ainda pode obter um construtor livre para inicializar seus campos finals! 

- @Acessors </br> 
  - A opção *fluente* nos dá acessores que não possuem um prefixo get ou set;
  - A opção *chain* nos dá setters que retornam this; 
  - A opção de *prefixo* nos permite informar ao Lombok quais prefixos devem ser ignorados. 

- @SLF4J </br> 
  A Simple Logging Facade for Java permite desacoplar o código que é usado para criar eventos de log da implementação que será responsável
  por processá-los e armazená-los da maneira que desejarmos. 
 
- @CustomLog </br>
  Faz com que o lombok gere um campo de registrador com base em uma implementação de registrador personalizada. 
 
- @Cleanup </br> 
  Gestão de recursos automática: Chame com segurança os métodos close()sem problemas. 

- @Synchronized	</br> 
  synchronized’s corretos. Não exponha seus locks. 

- @SneakThrows </br> 
  Para lançar exceções onde antes não se era comum lançar.
