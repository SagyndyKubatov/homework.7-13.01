public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private String ability;

    public Hero(String characterClass, int health, int damage, String ability) {
        super(characterClass, health, damage);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Герой применил супер способность: "+superAbilityType;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                +" "+applySuperAbility(ability);
    }

}
