package lection5;

import java.util.Random;

/**
 * Created by алексей on 26.06.2017.
 */
public class Mage extends Hero {
    final int DAMAGE_MAGE = 15;
    final int CHANCE_DESTROY_ENEMY = 40;

    Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy unit) {
        Random random = new Random();
        if (random.nextInt(100) > CHANCE_DESTROY_ENEMY) {
            System.out.print(name + " Делает магическое заклинание врага");
            unit.takeDamage(DAMAGE_MAGE);
        } else {
            System.out.print(name + "  Уничтожает врага");
            unit.health = 0;
        }
    }
}
