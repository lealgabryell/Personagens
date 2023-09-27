public class Arqueiro extends Personagem {
    // Atributos
    String arcoEflecha;
    double alcance;

    @Override
    public int causarDano() {
        return 15;
    }

    @Override    
    public void receberDano(int dano) {
        System.out.println("Sofreu " + dano + " de dano!");
    }

    @Override
    public void descreverPersonagem() {
        System.out.println(
                nome + "e do tipo " + tipo + " e possui um arco e flecha de " + arcoEflecha + " com alcance de "
                        + alcance + " metros " + " e esta no nivel " + nivel + ". Esse personagem tem " + forca
                        + " de forca e possui " + inteligencia
                        + " de inteligencia e " + agilidade + " de agilidade. Tem o total de " + vida
                        + " de HP. Seu atributo de defesa e de " + defesa+".");
    }

}
