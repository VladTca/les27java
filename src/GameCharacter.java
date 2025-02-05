abstract class GameCharacter {
    private String name;
    private int health=100;
    private int level =1;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void levelUp(){
        System.out.println("Персонаж "+name+" повысил уровень с "+level+" на "+(level+1));
        level++;
    }
    public void damage(int damage){
        health-=damage;
    }
     abstract void attack(GameCharacter character);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
