package lection5;

import java.util.Random;

/**
 * Created by алексей on 27.06.2017.
 */
public class Zombie extends Enemy {
    final int DAMAGE_ZOMBIE = 10;
    final int CHANCE_ZOMBIE = 30;


    Zombie(int health) {
        super(health);
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            Random random = new Random();
            if (random.nextInt(100) < CHANCE_ZOMBIE) {
                health = 100;
                System.out.println("Зомби воскрес");
                return true;
            } else {
                return false;
            }
        }
    }

    public void attackHero(Hero unitHero) {
        System.out.println("Зомби ест героя");
        unitHero.takeDamage(DAMAGE_ZOMBIE);
    }
}
