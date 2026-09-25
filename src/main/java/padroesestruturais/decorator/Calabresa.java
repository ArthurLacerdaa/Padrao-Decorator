package padroesestruturais.decorator;

public class Calabresa extends PizzaDecorator {


    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", adicionando calabresa";
    }

    @Override
    public Double getPreco() {
        return pizza.getPreco() +  3.00;
    }
}
