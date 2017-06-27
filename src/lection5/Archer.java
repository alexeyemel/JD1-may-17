package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public class Archer extends Hero {
<<<<<<< HEAD
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

=======
    int damageArcher=15;
    Archer(String name) {
        super(name);

    }
    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(name + " Попадает стрелой во врага");
        damage.takeDamage(damageArcher);
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
    }
}
