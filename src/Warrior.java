public class Warrior extends GameCharacter {
    private boolean isShield = false;

    public Warrior(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("Воин атакует мечом");
    }

    @Override
    public void damage(int damage) {
        if (isShield) {
            System.out.println("Воин защищается щитом");
            super.damage(damage / 2);
            System.out.println("Осталось здоровья: " + getHealth());
            isShield = false;
        } else {
            super.damage(damage);
            System.out.println("Осталось здоровья: " + getHealth());
        }
    }

    public boolean isShield() {
        return isShield;
    }

    public void setShield(boolean shield) {
        isShield = shield;
    }
}
