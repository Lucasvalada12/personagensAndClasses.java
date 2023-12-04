package locais;
import java.util.Random;
import java.util.Scanner;

public class Caverna {



        private char[][] mapa;
        private int jogadorX, jogadorY;
        private Random random = new Random();

        public Caverna() {
            mapa = new char[5][5]; // Tamanho arbitrário para exemplo (5x5)
            jogadorX = 0;
            jogadorY = 0;
            inicializarMapa();
        }

        private void inicializarMapa() {
            // Preencher o mapa com salas vazias representadas por '.'
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    mapa[i][j] = '.';
                }
            }

            // Definir algumas salas especiais (exemplo: 'C' para combate, 'T' para tesouro)
            mapa[1][1] = 'C';
            mapa[2][3] = 'T';
        }

        public void jogar() {
            Scanner scanner = new Scanner(System.in);
            boolean jogando = true;

            while (jogando) {
                exibirMapa();
                System.out.println("Escolha a direção (w - cima, a - esquerda, s - baixo, d - direita, q - sair): ");
                char direcao = scanner.next().charAt(0);

                switch (direcao) {
                    case 'w':
                        mover(-1, 0);
                        break;
                    case 'a':
                        mover(0, -1);
                        break;
                    case 's':
                        mover(1, 0);
                        break;
                    case 'd':
                        mover(0, 1);
                        break;
                    case 'q':
                        jogando = false;
                        System.out.println("Saindo da caverna.");
                        break;
                    default:
                        System.out.println("Direção inválida!");
                }

                if (jogando) {
                    explorarSala();
                }
            }
        }

        private void exibirMapa() {
            for (char[] linha : mapa) {
                for (char sala : linha) {
                    System.out.print(sala + " ");
                }
                System.out.println();
            }
        }

        private void mover(int offsetX, int offsetY) {
            int novoX = jogadorX + offsetX;
            int novoY = jogadorY + offsetY;

            if (novoX >= 0 && novoX < mapa.length && novoY >= 0 && novoY < mapa[0].length) {
                jogadorX = novoX;
                jogadorY = novoY;
            } else {
                System.out.println("Você não pode ir nessa direção!");
            }
        }

        private void explorarSala() {
            char salaAtual = mapa[jogadorX][jogadorY];

            if (salaAtual == 'C') {
                System.out.println("Você entrou em uma sala de combate!");
                // Simulação de 20% de chance de encontrar um tesouro
                if (random.nextInt(100) < 20) {
                    System.out.println("Você encontrou um tesouro!");
                } else {
                    System.out.println("Não há tesouro aqui, prepare-se para o combate!");
                }
                // Implementar lógica de combate se necessário
            } else if (salaAtual == 'T') {
                System.out.println("Você encontrou um tesouro!");
            } else {
                System.out.println("Esta sala está vazia...");
            }
        }
   /* private void explorarSala() {
        char salaAtual = mapa[jogadorX][jogadorY];

        if (salaAtual == 'C') {
            System.out.println("Você entrou em uma sala de combate!");
            combate();
        } else if (salaAtual == 'T') {
            System.out.println("Você encontrou um tesouro!");
        } else {
            System.out.println("Esta sala está vazia...");
        }
    }

    private void combate() {
        // Simulação de um inimigo com 50 de vida
        int vidaInimigo = 50;
        int vidaJogador = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Um monstro apareceu!");
        while (vidaInimigo > 0 && vidaJogador > 0) {
            System.out.println("\nSua vida: " + vidaJogador);
            System.out.println("Vida do monstro: " + vidaInimigo);
            System.out.println("\nEscolha sua ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int danoJogador = random.nextInt(20) + 10; // Dano entre 10 e 29
                    int danoInimigo = random.nextInt(15) + 5; // Dano entre 5 e 19

                    vidaInimigo -= danoJogador;
                    vidaJogador -= danoInimigo;

                    System.out.println("Você causou " + danoJogador + " de dano ao monstro!");
                    System.out.println("O monstro causou " + danoInimigo + " de dano a você!");
                    break;
                case 2:
                    System.out.println("Você tentou fugir!");
                    int chanceFuga = random.nextInt(100);

                    if (chanceFuga < 50) {
                        System.out.println("Você conseguiu fugir!");
                        return;
                    } else {
                        System.out.println("Você não conseguiu fugir!");
                        danoInimigo = random.nextInt(20) + 10; // Dano entre 10 e 29
                        vidaJogador -= danoInimigo;
                        System.out.println("O monstro atacou você enquanto fugia, causando " + danoInimigo + " de dano!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        }

        if (vidaInimigo <= 0) {
            System.out.println("Você derrotou o monstro!");
        } else {
            System.out.println("Você foi derrotado pelo monstro...");
        }
    }*/



}





