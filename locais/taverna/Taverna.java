package locais.taverna;

import classes.Descanso;
import classes.Missoes;

import java.util.Scanner;

public class Taverna {
    Descanso d = new Descanso();
    Missoes m = new Missoes("null",0,0,0);
    int escolhaTaverna;
    Scanner ler = new Scanner(System.in);

    public int MenuTaverna() {
        System.out.println("Bem vindos a taverna do alegrinho dourado");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Descansar");
        System.out.println("2 - Quadro de Missões");
        System.out.println("3 - Comprar poções");
        System.out.println("4 - Sair da taverna");
        System.out.println("-----------------------------");
        escolhaTaverna = ler.nextInt();

        switch (escolhaTaverna) {
            case 1:
                //d.recuperarVida();
                break;
            case 2:
                m.MenuMissao();
                break;
            case 3:

                break;
            case 4:


                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
        return 0;
    }
}