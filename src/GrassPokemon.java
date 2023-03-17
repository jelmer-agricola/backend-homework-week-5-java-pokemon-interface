import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");



    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }
@Override
    public String getType() {
        return "grass";
    }

    List<String> getAttacks() {    return attacks;}

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }


}
