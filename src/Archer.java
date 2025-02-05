public class Archer extends GameCharacter{
    public Archer(String name){
        super(name);
    }

    @Override
    public int attack(GameCharacter character){
        System.out.printf("Лучник %s атакует луком %s на %d%n", getName(), character.getName(), super.attack(character));
        super.checkHealth(character);
        return 0;
    }
}
