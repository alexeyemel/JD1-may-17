package lection5;

<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;

=======
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
/**
 * Created by алексей on 26.06.2017.
 */
public class BattleGround {
    public static void main(String[] args) {
<<<<<<< HEAD
        final int BEGIN_HEALTH = 100;
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Выбирите тип героя соответствующий номерам: 1 - ВОИН; 2 - МАГ; 3 - ЛУЧНИК");
        int type = in1.nextInt();
        System.out.println("Введите имя героя: ");
        String name = in2.nextLine();
        Hero hero = null;
        Enemy enemyFirst = null;
        Enemy enemySecond = null;
        switch (type) {
            case 1:
                hero = new Warrior(name, BEGIN_HEALTH);
                break;
            case 2:
                hero = new Mage(name, BEGIN_HEALTH);
                break;
            case 3:
                hero = new Archer(name, BEGIN_HEALTH);
                break;
            default:
                System.out.println("Вы не выбрали героя");
        }
        Random rand = new Random();
        switch (rand.nextInt(3) + 1) {
            case 1:
                enemyFirst = new Dragon(BEGIN_HEALTH);
                System.out.println("Создан враг типа Дракон ");
                break;
            case 2:
                enemyFirst = new Zombie(BEGIN_HEALTH);
                System.out.println("Создан враг типа Зомби ");
                break;
            case 3:
                enemyFirst = new Ork(BEGIN_HEALTH);
                System.out.println("Создан враг типа Орк ");
                break;
        }
        switch (rand.nextInt(3) + 1) {
            case 1:
                enemySecond = new Dragon(BEGIN_HEALTH);
                System.out.println("Создан враг типа Дракон ");
                break;
            case 2:
                enemySecond = new Zombie(BEGIN_HEALTH);
                System.out.println("Создан враг типа Зомби ");
                break;
            case 3:
                enemySecond = new Ork(BEGIN_HEALTH);
                System.out.println("Создан враг типа Орк ");
                break;
        }


        while (hero.isAlive() == true || enemyFirst.isAlive() == true || enemySecond.isAlive() == true) {
            if (hero.isAlive() == true && enemyFirst.isAlive() == true && enemySecond.isAlive() == true) {
                hero.attackEnemy(enemyFirst);
                System.out.println(" 1");
                hero.attackEnemy(enemySecond);
                System.out.println(" 2");
                if (enemyFirst.isAlive() == true) {
                    enemyFirst.attackHero(hero);
                }
                if (enemySecond.isAlive() == true) {
                    enemySecond.attackHero(hero);
                }
                if (enemyFirst.isAlive() == true) {
                    System.out.println("Остаток здоровья первого врага " + enemyFirst.health);
                } else {
                    System.out.println("Первый враг уничтожен");
                }
                if (enemySecond.isAlive() == true) {
                    System.out.println("Остаток здоровья второго врага " + enemySecond.health);
                } else {
                    System.out.println("Второй враг уничтожен");
                }
                if (hero.isAlive() == true) {
                    System.out.println("Остаток здоровья героя " + hero.health);
                } else {
                    System.out.println("Герой уничтожен");
                }
                System.out.println();
                if (hero.isAlive() == true && enemyFirst.isAlive() == false && enemySecond.isAlive() == false) {
                    System.out.println("Герой выиграл");
                    break;
                } else if (hero.isAlive() == false) {
                    System.out.println("Враги победили");
                    break;
                }
            } else if (hero.isAlive() == true && enemyFirst.isAlive() == true && enemySecond.isAlive() == false) {
                hero.attackEnemy(enemyFirst);
                System.out.println(" 1");
                if (enemyFirst.isAlive() == true) {
                    enemyFirst.attackHero(hero);
                }
                if (enemyFirst.isAlive() == true) {
                    System.out.println("Остаток здоровья первого врага " + enemyFirst.health);
                } else {
                    System.out.println("Первый враг уничтожен");
                }
                System.out.println("Второй враг уничтожен");
                if (hero.isAlive() == true) {
                    System.out.println("Остаток здоровья героя " + hero.health);
                } else {
                    System.out.println("Герой уничтожен");
                }
                System.out.println();
                if (hero.isAlive() == true && enemyFirst.isAlive() == false && enemySecond.isAlive() == false) {
                    System.out.println("Герой выиграл");
                    break;
                } else if (hero.isAlive() == false) {
                    System.out.println("Враги победили");
                    break;
                }
            } else if (hero.isAlive() == true && enemyFirst.isAlive() == false && enemySecond.isAlive() == true) {
                hero.attackEnemy(enemySecond);
                System.out.println(" 2");
                if (enemySecond.isAlive() == true) {
                    enemySecond.attackHero(hero);
                }
                System.out.println("Первый враг уничтожен");
                if (enemySecond.isAlive() == true) {
                    System.out.println("Остаток здоровья второго врага " + enemySecond.health);
                } else {
                    System.out.println("Второй враг уничтожен");
                }
                if (hero.isAlive() == true) {
                    System.out.println("Остаток здоровья героя " + hero.health);
                } else {
                    System.out.println("Герой уничтожен");
                }
                if (hero.isAlive() == true && enemyFirst.isAlive() == false && enemySecond.isAlive() == false) {
                    System.out.println("Герой выиграл");
                    break;
                } else if (hero.isAlive() == false) {
                    System.out.println("Враги победили");
                    break;
                }
            }

        }
=======
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
>>>>>>> c8cdc482c5e92cc313dab291d8f5bbb264165fd6
    }
}
