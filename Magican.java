public class Magican extends BaseHero {
    private int mana;
    private int maxMana;

    public Magican(){
        super(String.format("Hero_Magican #%d", ++Magican.number, Magican.r.nextInt(100, 200)));
        this.maxMana = Magican.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
    
}
