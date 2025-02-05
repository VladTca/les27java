public class Mage extends GameCharacter{
    public Mage(String name){
        super(name);
    }


    @Override
    public int attack(GameCharacter character){
        System.out.printf("Маг %s атакует магией %s на %d%n", getName(), character.getName(), super.attack(character));
        super.checkHealth(character);
        return 0;
    }
}
