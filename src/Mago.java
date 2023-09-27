public class Mago extends Personagem{
    //atributos
    String magia;
    int alcance;
    String tipo = "Mago";

    @Override
    public int causarDano() {
        return 20;
    }

    @Override    
    public void receberDano(int dano) {
        System.out.println("Sofreu " + dano + " de dano!");
    }

    @Override
    public void descreverPersonagem() {
        System.out.println(nome + "e do tipo Mago e possui magia de " + magia + " com alcance de "
                + alcance + " e esta no nivel " + nivel + ". Tem " + forca + " de forca. Possui " + inteligencia
                + " de inteligencia e " + agilidade + " de agilidade. Tem o total de " + vida
                + " de HP. Seu atributo de defesa e de " + defesa+".");
    }
}
