import java.util.Random;

public class Mage extends GameCharacter{
    public Mage(String name){
        super(name);
    }

    public void attack(GameCharacter character){
        System.out.printf("Маг %s атакует магией %s%n", getName(), character.getName());
        Random random = new Random();
        character.damage(getLevel()*random.nextInt(1,11));
    }
}
