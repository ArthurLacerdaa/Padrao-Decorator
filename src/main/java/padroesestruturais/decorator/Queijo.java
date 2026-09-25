package padroesestruturais.decorator;

public class Queijo extends PizzaDecorator{

    public Queijo(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", adicionando queijo";
    }

    @Override
    public Double getPreco() {
        return pizza.getPreco() + 2.50;
    }
}