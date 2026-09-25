package padroesestruturais.decorator;

public class PizzaSimples implements Pizza{
    @Override
    public String getDescricao() {
        return "Pizza Simples";
    }

    @Override
    public Double getPreco() {
        return 40.00;
    }
}