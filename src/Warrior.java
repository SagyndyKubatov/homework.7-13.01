public class Warrior extends Hero{
    Weapon weapon;

    public Warrior(String characterClass, int health, int damage, String ability, Weapon weapon) {
        super(characterClass, health, damage, ability);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                +" "+getWeapon();
    }
}
