import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer codBebida;
        boolean flag = false;
        System.out.println("---------|MENU BEBIDAS|---------\n1- Coca-Cola - R$ 5\n2 - Coca-Cola 0 - R$ 4.50\n"
                + "3 - Pepsi - R$ 4,40\n4 - Guaraná Antarctica - R$ 3,50\n5 - Fanta Laranja - R$ 4,23\n" +
                "6 - Água - R$ 2,50\n0 - SAIR DO MENU");
        try {
        do {
            System.out.println("Digite o codigo da bebida: ");
            codBebida = sc.nextInt();
            imprimirValorBebida(codBebida);
            flag = (codBebida >= 0 && codBebida <= 6) ? true : false;
        }while (!flag);
        }catch(InputMismatchException e){
            System.out.println("Erro de entrada de dados. Reinicie o programa.");
        }
        sc.close();
    }

    private static void imprimirValorBebida(Integer codBebida) {
        if (codBebida.equals(Bebidas.COCA_COLA.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.COCA_COLA.getNome(), Bebidas.COCA_COLA.getPreco());
        } else if (codBebida.equals(Bebidas.COCA_COLA_ZERO.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.COCA_COLA_ZERO.getNome(), Bebidas.COCA_COLA_ZERO.getPreco());
        } else if (codBebida.equals(Bebidas.PEPSI.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.PEPSI.getNome(), Bebidas.PEPSI.getPreco());
        } else if (codBebida.equals(Bebidas.GUARANA_ANTARTICA.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.GUARANA_ANTARTICA.getNome(), Bebidas.GUARANA_ANTARTICA.getPreco());
        } else if (codBebida.equals(Bebidas.FANTA_LARANJA.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.FANTA_LARANJA.getNome(), Bebidas.FANTA_LARANJA.getPreco());
        } else if (codBebida.equals(Bebidas.AGUA.getCodigo())) {
            System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.AGUA.getNome(), Bebidas.AGUA.getPreco());
        } else if (codBebida == 0) {
        System.out.println("Voce esta saindo do menu. Obrigado pela preferencia!");
        }else {
        System.out.println("Codigo da bebida nao encontrado. Digite novamente um numero entre 1 e 6!");
        }
    }
}
