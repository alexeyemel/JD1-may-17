package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public class Mage extends Hero {
    int damageMag=20;
    Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(name + " Делает магическое заклинание врага");
        damage.takeDamage(damageMag);
    }
}
