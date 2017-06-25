package lection5;

/**
 * Created by алексей on 26.06.2017.
 */
public class BattleGround {
    public static void main(String[] args) {
        Enemy e1 = new Enemy(100);
        Warrior h1 = new Warrior("Викинг");
        Mage h2 = new Mage("Хатабыч");
        Archer h3 = new Archer("Робин Гуд");
        h1.attackEnemy(e1);
        h2.attackEnemy(e1);
        h3.attackEnemy(e1);
        while (e1.isAlive() == true) {
            h1.attackEnemy(e1);
            System.out.println("Остаток здоровья врага " + e1.health);
        }
        System.out.println("Враг мёртв");
    }
}
