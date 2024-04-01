import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getInputInt(String texto){
        Scanner leitor = new Scanner(System.in);

        System.out.println(texto);
        String valorDigitado = leitor.nextLine();

        return Integer.parseInt(valorDigitado);
    }

    public static void main(String[] args) {
        List<Pizza> cardapio = new ArrayList<Pizza>();
        cardapio.add(new Pizza("Muzzarela", 19.90f, "Queijo Muzzarela"));
        cardapio.add(new Pizza("Calabresa", 29.90f, "Calabresa", "Queijo"));
        cardapio.add(new Pizza("Frango com queijo", 19.90f, "Frango e Queijo"));

        String nome = getInputString("Digite seu nome: ");
        String endereco = getInputString("Digite seu endereço: ");
        int numeroPizza = getInputInt("Qual pizza você deseja? ");

        Pedido novoPedido = new Pedido(1, nome, endereco);
        novoPedido.adicionarPizza(cardapio.get(numeroPizza - 1));
        novoPedido.verPedido();
    }

    public static String getInputString(String texto){
        Scanner leitor = new Scanner(System.in);

        System.out.println(texto);
        return leitor.nextLine();
    }
}