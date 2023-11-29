package locais.taverna;

import java.util.Scanner;

public class Taverna {
    Descanso d = new Descanso();
    int escolhaTaverna;
    Scanner ler = new Scanner(System.in);

    public int MenuTaverna() {
        System.out.println("-----------------------------");
        System.out.println("1 - descansar");
        System.out.println("2 - quadro de missoes");
        System.out.println("3 - comprar poçooes");
        System.out.println("4 - Sair da taverna");
        System.out.println("-----------------------------");
        escolhaTaverna = ler.nextInt();

        switch (escolhaTaverna) {
            case 1:
                d.Descanso();
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

