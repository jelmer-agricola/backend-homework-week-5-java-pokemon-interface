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

    List<String> getAttacks() {
        return attacks;
    }


    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + " with a ThunderPunch!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + " with a electroBall!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "hits " + enemy.getName() + " with VoltTackle");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "hits " + enemy.getName() + " with Thunder!!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 100hp");
                enemy.setHp(enemy.getHp() - 100);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");

    }
}
