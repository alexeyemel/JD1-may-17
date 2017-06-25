package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public class Archer extends Hero {
    int damageArcher=15;
    Archer(String name) {
        super(name);

    }
    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(name + " Попадает стрелой во врага");
        damage.takeDamage(damageArcher);
    }
}
