import java.util.Random;

public class BaseHero{
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static{
        number = 0;
        r = new Random();
    };

    private BaseHero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public BaseHero(String name){
        this(name, 300);
    }

    public BaseHero(){
    this("");
}

    public String getInfo(){
        return String.format("Name: %s HP: %d Type: %s", this.name, this.hp, this.getClass().getSimpleName());
    }

    public void headled(int Hp){}

    public void getDamage(int damage) {
        if (this.hp > 0) {
            this.hp -= damage;
            if (this.hp < 0) {
                this.hp = 0;
            }
        }
    }

    public void Attack(BaseHero target){
        int damage = BaseHero.r.nextInt(10, 20);
        target.getDamage(damage);
    }
}