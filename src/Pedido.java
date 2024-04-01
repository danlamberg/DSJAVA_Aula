import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int numero;
    private String pessoa;
    private String endereco;
    private List<Pizza> pizzas;

    Pedido(int numero, String pessoa, String endereco){
        this.setNumero(numero);
        this.setPessoa(pessoa);
        this.setEndereco(endereco);
        this.pizzas = new ArrayList<Pizza>();
    }

    void adicionarPizza(Pizza novaPizza){
        this.pizzas.add(novaPizza);
    }

    void verPedido(){
        System.out.println("Pedido Número: " + this.getNumero());
        System.out.println("Cliente: " + this.getPessoa());
        System.out.println("Entregar em: " + this.getEndereco());
        for (Pizza pizza : pizzas) {
            pizza.verPizza();
        }
    }

    void setNumero(int numero){
        this.numero = numero;
    }
    void setPessoa (String pessoa){
        this.pessoa = pessoa;
    }
    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    int getNumero(){
        return this.numero;
    }
    String getPessoa(){
        return this.pessoa;
    }
    String getEndereco(){
        return endereco;
    }
}