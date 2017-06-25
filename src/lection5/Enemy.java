package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public abstract class Enemy implements Mortal {
    int health;

    Enemy(int health) {
        this.health = health;
    }

    private int getHealth() {
        return health;
    }

    private void setHealth(int health) {
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
        } else {
            return false;
        }
    }

    public abstract void attackHero(Hero unitHero);
}
