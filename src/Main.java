import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<Personagem>();
        // Adicionando personagens a lista
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.nome = "Elyndor Bow&Arrow";
        arqueiro.tipo = "Arqueiro";
        arqueiro.arcoEflecha = "madeira magica";
        arqueiro.alcance = 15;
        arqueiro.nivel = 12;
        arqueiro.forca = 75;
        arqueiro.inteligencia = 50;
        arqueiro.agilidade = 70;
        arqueiro.vida = 45;
        arqueiro.defesa = 15;
        personagens.add(arqueiro);

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.nome = "Ragnar The Ruthless";
        guerreiro.tipo = "Guerreiro";
        guerreiro.armadura = "Ferro Elixidrico";
        guerreiro.espada = "Inoxidante das profundezas cavernosas";
        guerreiro.nivel = 12;
        guerreiro.forca = 90;
        guerreiro.inteligencia = 30;
        guerreiro.agilidade = 50;
        guerreiro.vida = 75;
        guerreiro.defesa = 80;
        personagens.add(guerreiro);

        Mago mago = new Mago();
        mago.nome = "Zyzar The Wizard";
        mago.tipo = "Mago";
        mago.magia = "FireBalls";
        mago.alcance = 8;
        mago.nivel = 12;
        mago.forca = 50;
        mago.inteligencia = 80;
        mago.agilidade = 60;
        mago.vida = 55;
        mago.defesa = 90;
        personagens.add(mago);

        arqueiro.descreverPersonagem();
        System.out.println("\n");
        guerreiro.descreverPersonagem();
        System.out.println("\n");
        mago.descreverPersonagem();
        System.out.println("\n");

        // for (Personagem i : personagens) {
        // System.out.println(i);
        // }

        System.out.println("O " + arqueiro.tipo + " " + arqueiro.nome + " atacou " + guerreiro.tipo + " "
                + guerreiro.nome + " e causou " + arqueiro.causarDano() + " de dano! A vida do " + guerreiro.tipo
                + " agora esta com " + (guerreiro.vida - arqueiro.causarDano()) + " de HP");

        List<Personagem> ordemAlfabetica = personagens.stream()
                .sorted(Comparator.comparing(personagem -> personagem.nome))
                .collect(Collectors.toList());

        System.out.println("\nPersonagens em ordem alfabetica: \n");
        for (Personagem i : ordemAlfabetica) {
            System.out.println(i);
        }
    }
}
