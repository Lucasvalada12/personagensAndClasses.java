

import classes.*;
import classes.Personagens;

import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);

    public Personagens escolherClasse() {

        Personagens p = null;
        System.out.println("Sua jornada começa agora, escolha 4 personagens para começar!");
        for (int i = 0; i < 4; i++) {
            System.out.println("[1] - Cavaleiro");
            System.out.println("[2] - Mago");
            System.out.println("[3] - Clerigo");
            System.out.println("[4] - Arqueira");
            System.out.println("[5] - Ladino");
            int classe = ler.nextInt();

            if (classe == 1) {
                Cavaleiro k = new Cavaleiro();
                System.out.println("Você escolheu o Cavaleiro!");
                continue;
            } else if (classe == 2) {
                Mago m = new Mago();
                System.out.println("Você escolheu o Mago!");
                continue;
            } else if (classe == 3) {
                Clerigo c = new Clerigo();
                System.out.println("Você escolheu o Clerigo!");
                continue;
            } else if (classe == 4) {
                Arqueira a = new Arqueira();
                System.out.println("Você escolheu a Arqueira!");
                continue;
            } else if (classe == 5) {
                Ladino l = new Ladino();
                System.out.println("Você escolheu o Ladino!");
                continue;
            } else {
                System.out.println("Opção invalida!");
            }


            return null;
        }
        return null;
    }
}

