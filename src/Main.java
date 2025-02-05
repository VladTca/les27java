public class Main {
    public static void main(String[] args) {
        final int DAMAGE = 10;

        // первое задание----------------------------
        Warrior warrior1 = new Warrior("Warrior1");
        Warrior warrior2 = new Warrior("Warrior2");
        Warrior warrior3 = new Warrior("Warrior3");
        Archer archer1 = new Archer("Archer1");
        Archer archer2 = new Archer("Archer2");
        Archer archer3 = new Archer("Archer3");
        Mage mage1 = new Mage("Mage1");

       GameCharacter[] banda =new GameCharacter[7];
         banda[0]=warrior1;
            banda[1]=warrior2;
            banda[2]=warrior3;
            banda[3]=archer1;
            banda[4]=archer2;
            banda[5]=archer3;
            banda[6]=mage1;
            for (GameCharacter character : banda) {
                character.attack(warrior1);
            }
        System.out.println();
            archer2.damage(10);
            mage1.damage(20);
            warrior2.damage(DAMAGE);
            warrior2.setShield(true);
            warrior2.damage(DAMAGE);
//----------------------------------------------------------------
        System.out.println();
        // второе задание----------------------------
        warrior1.levelUp();
        warrior1.levelUp();
        mage1.levelUp();
        archer2.levelUp();
        System.out.println("Здоровье Warrior3: "+warrior3.getHealth());
        warrior1.attack(warrior3);
        mage1.attack(warrior3);
        warrior3.setShield(true);
        archer2.attack(warrior3);
          
    }
}