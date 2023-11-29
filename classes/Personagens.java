package classes;

public abstract class Personagens {
         int vida;
    int armadura;
     int ataque;
     int mana;
     int velocidade;
     int dinheiro;
     int experiencia;
     int vidaMax;
     String nome;
     String missoes;

    // Construtor
    public Personagens(String nome, int vida, int armadura, int ataque, int mana, int velocidade, int dinheiro, int experiencia, int vidaMax, String missoes) {
        this.nome = nome;
        this.vida = vida;
        this.armadura = armadura;
        this.ataque = ataque;
        this.mana = mana;
        this.velocidade = velocidade;
        this.dinheiro = dinheiro;
        this.experiencia = experiencia;
        this.vidaMax = vidaMax;
        this.missoes = missoes;
    }

    protected Personagens() {
    }


    // Getters e Setters para cada atributo
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMissoes() {
        return missoes;
    }

    public void setMissoes(String missoes) {
        this.missoes = missoes;
    }


}

