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
        System.out.println(name.getName() + " performed LeafStorm " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a SolarBeam on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " gaines 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a LeechSeed on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(name.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(enemy.getHp() + 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                System.out.println(name.getName() + " gaines 50 hp");
                enemy.setHp(enemy.getHp() - 50);
                name.setHp(enemy.getHp() + 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(name.getName() + " gaines 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(enemy.getHp() + 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(name.getName() + " gaines 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(enemy.getHp() + 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a LeaveBlade on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");    }


}
