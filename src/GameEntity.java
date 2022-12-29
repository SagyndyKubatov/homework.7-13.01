public abstract class GameEntity {
    private String characterClass;
    private int health;
    private int damage;

    public GameEntity(String characterClass, int health, int damage) {
        this.characterClass = characterClass;
        this.health = health;
        this.damage = damage;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String printInfo(){
        return "Character class: "+
                characterClass+", Health: "+
                health+", damage: "+damage;
    }
}
