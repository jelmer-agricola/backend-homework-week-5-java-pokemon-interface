import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

    String town;


    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.town = town;
    }

    public String getTown() {
        return town;
    }
}
