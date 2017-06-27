package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
<<<<<<< HEAD
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
=======
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
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
