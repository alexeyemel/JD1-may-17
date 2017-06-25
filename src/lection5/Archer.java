package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public class Archer extends Hero {
    final int DAMAGE_MAGE=15;
    final int SHIELD = 10;
    Archer(String name,int health) {
        super(name,health);

    }
    @Override
    public void attackEnemy(Enemy unit) {
        if (health < 50) {
            health += SHIELD;
            System.out.println("Герой прикрывается шитом. Плюс к защите: "+SHIELD);
        }
        System.out.print(name + " Попадает стрелой во врага");
        unit.takeDamage(DAMAGE_MAGE);

    }
}
