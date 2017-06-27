package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
<<<<<<< HEAD
public abstract class Enemy implements Mortal {
=======
public class Enemy implements Mortal {
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
    int health;

    Enemy(int health) {
        this.health = health;
    }

    private int getHealth() {
        return health;
    }

<<<<<<< HEAD
    private void setHealth(int health) {
=======
    public void setHealth(int health) {
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
        this.health = health;
    }

    int takeDamage(int damage) {
        this.health -= damage;
        return health;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
<<<<<<< HEAD
        } else {
            return false;
        }
    }

    public abstract void attackHero(Hero unitHero);
=======
        }else{return false;}
    }
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
}
