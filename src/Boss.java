public class Boss extends GameEntity implements HavingSuperAbility{
    Weapon weapon;
    private String ability;


    public Boss(String characterClass, int health, int damage, Weapon weapon, String ability) {
        super(characterClass, health, damage);
        this.weapon = weapon;
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
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
                +" "+getWeapon()
                +" "+applySuperAbility(ability);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Босс применил супер способность: "+superAbilityType;
    }
}
