package lection5;

/**
 * Created by алексей on 27.06.2017.
 */
public class Ork extends Enemy {
    final int DAMAGE_ORK=20;
    Ork(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero unitHero) {
        System.out.println("Орк бьёт топором героя");
        unitHero.takeDamage(DAMAGE_ORK);

    }
}
