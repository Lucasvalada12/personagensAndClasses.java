package classes;

import java.util.ArrayList;
import java.util.List;

public class StatusPersonagem {

        public void mostrarStatus(List<Personagens> personagens) {
            System.out.println("Status dos Personagens:");
            for (Personagens personagem : personagens) {
                System.out.println("Nome: " + personagem.getNome());
                System.out.println("Vida: " + personagem.getVida());
                System.out.println("Armadura: " + personagem.getArmadura());
                System.out.println("Ataque: " + personagem.getAtaque());
                System.out.println("Mana: " + personagem.getMana());
                System.out.println("Velocidade: " + personagem.getVelocidade());
                System.out.println("Dinheiro: " + personagem.getDinheiro());
                System.out.println("Experiência: " + personagem.getExperiencia());
                System.out.println("------------------------");
            }
        }
    public static class ListaPersonagens {
        private List<Personagens> personagens;

        public ListaPersonagens() {
            this.personagens = new ArrayList<>();
        }

        public void adicionarPersonagem(Personagens personagem) {
            personagens.add(personagem);
        }

        public List<Personagens> getPersonagens() {
            return personagens;
        }
    }
    }

