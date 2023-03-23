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


    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed surf attack on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");    }

    public void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed hydro-pump on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");    }

    public void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed hydro-canon on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");    }

    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed rain-dance " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " gains 20 hp");
                enemy.setHp(enemy.getHp() + 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> System.out.println("has no effect on " + enemy.getName());
            case "grass" -> {
                System.out.println(enemy.getName() + " gains 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");    }

}


