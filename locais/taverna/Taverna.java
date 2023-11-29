package locais.taverna;

import classes.Descanso;

import java.util.Scanner;

public class Taverna {
    Descanso d = new Descanso();
    int escolhaTaverna;
    Scanner ler = new Scanner(System.in);

    public int MenuTaverna() {
        System.out.println("Bem vindos a taverna do alegrinho dourado");
        System.out.println("-----------------------------");
        System.out.println("escolha uma das opçoes:");
        System.out.println("1 - descansar");
        System.out.println("2 - quadro de missoes");
        System.out.println("3 - comprar poçooes");
        System.out.println("4 - Sair da taverna");
        System.out.println("-----------------------------");
        escolhaTaverna = ler.nextInt();

        switch (escolhaTaverna) {
            case 1:
               // d.recuperarVida();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
        return 0;

    }

}

