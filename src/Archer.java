import java.util.Random;

public class Archer extends GameCharacter{
    public Archer(String name){
        super(name);
    }

    public void attack(GameCharacter character){
        System.out.printf("Лучник %s атакует луком %s%n", getName(), character.getName());
        Random random = new Random();
        character.damage(getLevel()*random.nextInt(1,11));
    }
}
