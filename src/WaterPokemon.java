import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "water";
    }

    List<String> getAttacks() {
        return attacks;
    }


    void surf(Pokemon name, Pokemon enemy) {
        System.out.println("do damage");

    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println("do damage");

    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println("do damage");

    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println("do damage");

    }

}


