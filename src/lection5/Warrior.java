package lection5;

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
