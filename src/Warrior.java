public class Warrior extends GameCharacter {
    private boolean isShield = false;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public int attack(GameCharacter character) {
        System.out.printf("Воин %s атакует мечом %s на %d%n", getName(), character.getName(), super.attack(character));
        super.checkHealth(character);
        return 0;
    }

    @Override
    public void damage(int damage) {
        if (isShield) {
            System.out.println("Воин защищается щитом");
            super.damage(damage / 2);
            isShield = false;
        } else {
            super.damage(damage);
        }
    }

    public void setShield(boolean shield) {
        isShield = shield;
    }

}
