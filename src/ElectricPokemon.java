import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {


    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }
@Override
    public String getType() {
        return "electric";
    }
    List<String> getAttacks() {    return attacks;}



    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");

    }
    void thunder(Pokemon name, Pokemon enemy){
        System.out.println( "do damage");
    }

}
