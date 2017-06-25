package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public abstract class Hero implements Mortal {
    String name;
    int health;

    Hero(String name, int health) {
        System.out.println("Вы создали героя " + name);
        System.out.println("Здоровье героя " + name +" "+ health+"%");
        this.name = name;
        this.health = health;
    }


    public String getName() {
        return name;
    }
    int takeDamage(int damage) {
        this.health -= damage;
        return health;
    }
    public abstract void attackEnemy(Enemy unitEnemy);

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }
}