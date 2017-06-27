package lection5;

<<<<<<< HEAD
import java.util.Random;

=======
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
/**
 * Created by алексей on 26.06.2017.
 */
public class Mage extends Hero {
<<<<<<< HEAD
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
=======
    int damageMag=20;
    Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(name + " Делает магическое заклинание врага");
        damage.takeDamage(damageMag);
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
    }
}
