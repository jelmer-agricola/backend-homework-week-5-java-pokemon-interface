import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {


   List<String> attacks = Arrays.asList("inferno", "fireLash", "pyroBall", "flamethrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    @Override
    public String getType() {
        return "fire";
    }
    List<String> getAttacks() {    return attacks;}


    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }
//    tijdelijke oplossing do damage
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }


}
