package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public abstract class Hero {
    String name;
    int damageHero;

    Hero(String name) {
        System.out.println("Вы создали героя " + name);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy damage);
}
