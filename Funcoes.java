

import classes.*;

import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);

    public Personagens escolherClasse() {
        Personagens p = null;
        System.out.println("Your journey begins here, choose your class.");
        System.out.println("[1] - Cavaleiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Clerigo");
        System.out.println("[4] - Arqueira");
        System.out.println("[5] - Ladino");
        int classe = ler.nextInt();
        switch (classe) {
            case 1:
                Cavaleiro k = new Cavaleiro();
                p = k;
                break;
            case 2:
                Mago m = new Mago();
                p = m;
                break;
            case 3:
                Clerigo c = new Clerigo();
                p = c;
                break;
            case 4:
                Arqueira a = new Arqueira();
                p = a;
                break;
            case 5:
                Ladino l = new Ladino();
                p = l;
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }


        return p;
    }
}

