package lection5;

import java.util.Random;

/**
 * Created by алексей on 27.06.2017.
 */
public class Dragon extends Enemy {
    final int DAMAGE_DRAGON=15;
    final int CHANCE_THREE_FIRE=30;
    Dragon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero unitHero) {
        Random random = new Random();
        if (random.nextInt(100) > CHANCE_THREE_FIRE) {
            System.out.println("Дракон поливает пламенем героя");
            unitHero.takeDamage(DAMAGE_DRAGON);
        } else {
            System.out.println("Дракон выпускает три пламени подряд в героя");
            unitHero.takeDamage(DAMAGE_DRAGON);
            unitHero.takeDamage(DAMAGE_DRAGON);
            unitHero.takeDamage(DAMAGE_DRAGON);
        }
            }
}
