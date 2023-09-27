public class Guerreiro extends Personagem{
    //atributos
    String armadura;
    String espada;

    @Override
    public int causarDano() {
        return 30;
    }

    @Override    
    public void receberDano(int dano) {
        System.out.println("Sofreu " + dano + " de dano!");
    }

    @Override
    public void descreverPersonagem() {
        System.out.println(nome + "e do tipo Guerreiro e possui uma armadura de " + armadura + " com espada de "
                + espada + " e esta no nivel " + nivel + ". Tem " + forca + " de forca. Possui " + inteligencia
                + " de inteligencia e " + agilidade + " de agilidade. Tem o total de " + vida
                + " de HP. Seu atributo de defesa e de " + defesa+".");
    }
}
