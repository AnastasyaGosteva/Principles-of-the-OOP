public class Program {
    public static void main(String[] args) {
        
        BaseHero hero1 = new Magican();
        System.out.println(hero1.getInfo());

        BaseHero hero2 = new Priest();
        System.out.println(hero2.getInfo());

        System.out.println("-------");

        hero1.Attack(hero2);
        System.out.println(hero2.getInfo());

        hero2.Attack(hero1);
        System.out.println(hero1.getInfo());
    }
}
