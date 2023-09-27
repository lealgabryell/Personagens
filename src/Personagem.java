// import java.util.ArrayList;

public class Personagem {
    // Atributos
    protected String nome;
    protected int nivel;
    protected int forca;
    protected int inteligencia;
    protected int agilidade;
    protected int vida;
    protected int defesa;
    protected String tipo;
    // public ArrayList<Personagem> personagens = new ArrayList<Personagem>();

    // public Personagem(String nome, int nivel, int forca, int inteligencia, int
    // agilidade, int vida, int defesa) {
    // this.nome = nome;
    // this.nivel = nivel;
    // this.forca = forca;
    // this.inteligencia = inteligencia;
    // this.agilidade = agilidade;
    // this.vida = vida;
    // this.defesa = defesa;
    // }

    public int causarDano() {
        return 100;
    }

    public void receberDano(int dano) {
        System.out.println("Sofreu " + dano + " de dano!");
    }

    public void descreverPersonagem() {
        System.out.println(nome + " esta no nivel " + nivel + " e tem " + forca + " de forca. Possui " + inteligencia
                + " de inteligencia e " + agilidade + " de agilidade. Tem o total de " + vida
                + " de HP. Seu atributo de defesa sao de " + defesa);
    }

    public String toString() {
        return "Personagem: " + nome + "\nTipo: " + tipo + "\nNivel: " + nivel + "\nForca: " + forca
                + "\nInteligencia: " + inteligencia
                + "\nAgilidade: " + agilidade + "\n";
    }
}
