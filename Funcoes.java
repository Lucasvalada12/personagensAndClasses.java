
import classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);

    public List<Personagens> escolherPersonagens() {
        List<Personagens> personagensEscolhidos = new ArrayList<>();
        System.out.println("Sua jornada começa agora, escolha 4 personagens para começar!");

        while (personagensEscolhidos.size() < 4) {
            System.out.println("[1] - Cavaleiro");
            System.out.println("[2] - Mago");
            System.out.println("[3] - Clerigo");
            System.out.println("[4] - Arqueira");
            System.out.println("[5] - Ladino");
            int classe = ler.nextInt();

            Personagens personagem = null;

            switch (classe) {
                case 1:
                    personagem = new Cavaleiro();
                    break;
                case 2:
                    personagem = new Mago();
                    break;
                case 3:
                    personagem = new Clerigo();
                    break;
                case 4:
                    personagem = new Arqueira();
                    break;
                case 5:
                    personagem = new Ladino();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (personagem != null && !personagensEscolhidos.contains(personagem)) {
                personagensEscolhidos.add(personagem);
                System.out.println("Você escolheu " + personagem.getClass().getSimpleName() + "!");
            } else {
                System.out.println("Opção inválida ou personagem já escolhido!");
            }
        }

        return personagensEscolhidos;
    }
}
