import java.util.Random;

public class Warrior extends GameCharacter {
    private boolean isShield = false;

    public Warrior(String name) {
        super(name);
    }

    public void attack(GameCharacter character) {
        System.out.printf("Воин %s атакует мечом %s%n", getName(), character.getName());
        Random random = new Random();
        character.damage(getLevel()*random.nextInt(1,11));
    }

    @Override
    public void damage(int damage) {
        if (isShield) {
            System.out.println("Воин защищается щитом");
            super.damage(damage / 2);
            System.out.println("У " +getName()+" Осталось здоровья: " + getHealth());
            isShield = false;
        } else {
            super.damage(damage);
            System.out.println("У " +getName()+" Осталось здоровья: " + getHealth());
        }
    }
    public boolean isShield() {
        return isShield;
    }

    public void setShield(boolean shield) {
        isShield = shield;
    }

}
