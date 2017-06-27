package lection5;

<<<<<<< HEAD
import java.util.Random;

/**
 * Created by алексей on 26.06.2017.
 */
public class Warrior extends Hero {

    final int DAMAGE_WARRIOR = 30;
    final int DAMAGE_SUPER = 70;
    final int CHANCE_SUPER_KICK = 40;

    Warrior(String name, int health) {
        super(name, health);

    }

    @Override
    public void attackEnemy(Enemy unit) {
        Random random = new Random();
        if (random.nextInt(100) > CHANCE_SUPER_KICK) {
            System.out.print(name + " Наносит удар мечом по врагу");
            unit.takeDamage(DAMAGE_WARRIOR);
        } else {
            System.out.print(name + " Наносит СУПЕР УДАР по врагу");
            unit.takeDamage(DAMAGE_SUPER);
        }

    }
}
=======
/**
 * Created by алексей on 26.06.2017.
 */
public class Warrior extends Hero{

int damageWarrior=25;
    Warrior(String name) {
        super(name);
    }

    @Override
      public void attackEnemy(Enemy damage) {
        System.out.println(name + " Наносит удар по врагу топором");
        damage.takeDamage(damageWarrior);
    }
}
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
