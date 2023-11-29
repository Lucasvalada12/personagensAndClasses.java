import inventario.Inventario;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner ler = new Scanner(System.in);
    Inventario i = new Inventario();
    public int menu() {

        System.out.println("---------------------------------------");
        System.out.println("Escolha a opçao desejada:");
        System.out.println("1 - ir a Taverna");
        System.out.println("2 - inventario");
        System.out.println("3 - viajar de cidade");
        System.out.println("4 - Status dos personagens");
        System.out.println("5 - ir ao Fereiro");
        System.out.println("6 - inventario");
        System.out.println("7 - Sair do jogo");
        System.out.println("---------------------------------------");
        int menus = ler.nextInt();

        switch (menus) {
            case 1:
                break;
            case 2:
                i.inventario();

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                break;
            case 6:

                break;
            case 7:

                break;
            default:

                break;
        }
        return menus;
    }
}
