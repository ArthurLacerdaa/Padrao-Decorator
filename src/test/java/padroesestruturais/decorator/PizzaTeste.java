package padroesestruturais.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaTeste {

    @Test
    void deveRetorarPizzaSimples(){
        Pizza pizza = new PizzaSimples();

        Assertions.assertEquals(40.00, pizza.getPreco());
    }

    @Test
    void deveRetornarDescricaoPizzaComBacon() {
        Pizza pizza = new Bacon(new PizzaSimples());

        Assertions.assertEquals("Pizza Simples, adicionando bacon",  pizza.getDescricao()
        );
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijo() {
        Pizza pizza = new Queijo(new PizzaSimples());

        Assertions.assertEquals("Pizza Simples, adicionando queijo",  pizza.getDescricao()
        );
    }

    @Test
    void deveRetornarDescricaoPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaSimples());

        Assertions.assertEquals("Pizza Simples, adicionando calabresa",  pizza.getDescricao()
        );
    }


    @Test
    void deveRetornarPrecoPizzaComQueijo(){
        Pizza pizza = new Queijo(new PizzaSimples());

        Assertions.assertEquals(42.50, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComCalabresa(){
        Pizza pizza = new Calabresa(new PizzaSimples());

        Assertions.assertEquals(43.00, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBacon(){
        Pizza pizza = new Bacon(new PizzaSimples());

        Assertions.assertEquals(43.50, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoEBacon(){
        Pizza pizza = new Queijo(new Bacon(new PizzaSimples()));

        Assertions.assertEquals(46.00, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComBaconECalabresa(){
        Pizza pizza = new Bacon(new Calabresa(new PizzaSimples()));

        Assertions.assertEquals(46.50, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoCalabresaBacon(){
        Pizza pizza = new Queijo(new Calabresa(new Bacon(new PizzaSimples())));
        Assertions.assertEquals(49.00, pizza.getPreco());
    }


}