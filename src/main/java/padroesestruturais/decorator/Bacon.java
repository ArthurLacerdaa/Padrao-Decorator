package padroesestruturais.decorator;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", adicionando bacon";
    }

    @Override
    public Double getPreco() {
        return pizza.getPreco() + 3.50;
    }
}
