import classes.Personagens;
import classes.StatusPersonagem;
import inventario.Inventario;
import locais.Caverna;
import locais.taverna.Taverna;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    Taverna t = new Taverna();
    Scanner ler = new Scanner(System.in);
    Inventario i = new Inventario();
    StatusPersonagem s = new StatusPersonagem();
    boolean continual = true;
    List<Personagens> Personagens;
    StatusPersonagem.ListaPersonagens listaPersonagens = new StatusPersonagem.ListaPersonagens();
    Caverna c = new Caverna();


    public int menu() {
        listaPersonagens.adicionarPersonagem(new Personagens("Cavaleiro")); // Substitua Personagem() pelo construtor correto
        listaPersonagens.adicionarPersonagem(new Personagens("Mago"));
        listaPersonagens.adicionarPersonagem(new Personagens("Clerigo"));
        listaPersonagens.adicionarPersonagem(new Personagens("Arqueira"));


        while (continual) {
            System.out.println("---------------------------------------");
            System.out.println("Escolha a opçao desejada:");
            System.out.println("1 - ir a Taverna");
            System.out.println("2 - inventario");
            System.out.println("3 - viajar de cidade");
            System.out.println("4 - Status dos personagens");
            System.out.println("5 - ir ao Fereiro");
            System.out.println("6 - Status dos Personagens");
            System.out.println("7 - Sair do jogo");
            System.out.println("---------------------------------------");
            int menus = ler.nextInt();

            switch (menus) {
                case 1:
                    t.MenuTaverna();
                    break;
                case 2:
                    i.inventario();

                    break;
                case 3:
                    //c.explorarCaverna();

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:

                    s.mostrarStatus(listaPersonagens.getPersonagens());

                    break;
                case 7:
                    continual = false;

                    break;
                default:

                    break;
            }

        }
        return menu();
    }
}
