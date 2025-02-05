import java.util.Random;

abstract class GameCharacter {
    private final String name;
    private int health = 100;
    private int level = 1;

    protected GameCharacter(String name) {
        this.name = name;
    }

    public void levelUp() {

        if (this.getLevel() < 5) {
            level++;
            System.out.println("Персонаж " + name + " повысил уровень с " + level + " на " + (level + 1));
        } else {
            System.out.println("Уровень персонажа " + name + " не может быть повышен");
        }
    }

    public void damage(int damage) {
//        if (this instanceof Warrior) {
//            if (((Warrior) this).isShield()) {
//                System.out.println("Воин защищается щитом. Урон уменьшен вдвое");
//                damage = damage / 2;
//                ((Warrior) this).setShield(false);
//            }
//        }
        health -= damage;
    }

    public void checkHealth(GameCharacter character) {
        if (health <= 0) {
            System.out.println("Персонаж " + character.getName() + " погиб");
        } else {
            System.out.println("У персонажа " + character.getName() + " осталось " + character.getHealth() + " здоровья");
        }
    }

    public int attack(GameCharacter character) {
        Random random = new Random();
        int damage = getLevel() * random.nextInt(1, 11);
        character.damage(damage);
        return damage;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public int getLevel() {
        return level;
    }

}
