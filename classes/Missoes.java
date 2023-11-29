package classes;

import java.util.Scanner;

public class Missoes {
    String objetivo;
    int quantidadeInimigos;
    int recompensaOuro;
    int recompensaExperiencia;
    boolean concluida;

    public Missoes(String objetivo, int quantidadeInimigos, int recompensaOuro, int recompensaExperiencia) {
        this.objetivo = objetivo;
        this.quantidadeInimigos = quantidadeInimigos;
        this.recompensaOuro = recompensaOuro;
        this.recompensaExperiencia = recompensaExperiencia;
        this.concluida = false;
    }

    public void MenuMissao() {
        Jogador jogador = new Jogador();
        int i;

        Missoes missao1 = new Missoes("Abater 5 inimigos", 5, 20, 50);
        Missoes missao2 = new Missoes("Encontrar um item especial", 1, 30, 70);
        Missoes missao3 = new Missoes("Explorar uma área perigosa", 4, 80, 100);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------------------------------");
            System.out.println("Escolha uma missão:");
            System.out.println("1. um vilarejo proximo foi atacado e os goblisns fizeran dele sua fortaleza,\n os moradores estao pagando 20 peças de ouro\n para matar os 5 goblis.");
            System.out.println("2. um feiticeiro esta pagando 30 peças de ouro para quem o trouxer 3 olhos de aranha da caverna");
            System.out.println("3. O taverneiro teve sua filha sequestrada por hobgoblis, quem a trazer de volta recebera 80 de ouro\n objetivo: Matar 3 hobgoblis e seu chefe");
            System.out.println("4. concluir Missao");
            System.out.println("-------------------------------");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    jogador.aceitarMissao(missao1);
                    break;
                case 2:
                    jogador.aceitarMissao(missao2);
                    break;
                case 3:
                    jogador.aceitarMissao(missao3);
                    break;
                case 4:
                    System.out.println("Simulação: Quantos inimigos foram abatidos?");
                    int inimigosAbatidos = scanner.nextInt();
                    jogador.completarMissao(inimigosAbatidos);
                    i = 0;

                    System.out.println("Ouro atual: " + jogador.ouro);
                    System.out.println("Experiência atual: " + jogador.experiencia);
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }


        } while (concluida);
    }

    class Jogador extends Personagens {
        public Missoes missaoAtual;
        int ouro;
        int experiencia;

        public Jogador() {
            this.ouro = 0;
            this.experiencia = 0;
            this.missaoAtual = null;
        }

        public void aceitarMissao(Missoes missao) {
            if (missaoAtual == null) {
                this.missaoAtual = missao;
                System.out.println("Missão aceita: " + missao.objetivo);
            } else {
                System.out.println("Você já possui uma missão ativa!");
            }
        }

        public void completarMissao(int inimigosAbatidos) {
            if (missaoAtual != null && !missaoAtual.concluida) {
                if (inimigosAbatidos >= missaoAtual.quantidadeInimigos) {
                    this.ouro += missaoAtual.recompensaOuro;
                    this.experiencia += missaoAtual.recompensaExperiencia;
                    missaoAtual.concluida = true;
                    System.out.println("Missão completada! Recompensa: " + missaoAtual.recompensaOuro + " de ouro e " + missaoAtual.recompensaExperiencia + " de experiência.");
                } else {
                    System.out.println("Missão não completa. Continue!");
                }
            } else {
                System.out.println("Você não possui nenhuma missão ativa!");
            }
        }
    }
}
