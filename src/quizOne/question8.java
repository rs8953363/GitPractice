package quizOne;

import java.util.ArrayList;
interface Edible {
    void eat();
}
/*public class question8 {
    private static class Vegetable implements Edible{
        protected void eat(){
            System.out.println("Eat vegetable");
        }
    }
    private static class Tomato extends Vegetable implements Edible{
        public void eat(){
            System.out.println("Eat tomato");
        }
    }
    public static void main (String[] args){
        ArrayList<Edible> thingsToEat = new ArrayList<>();
        Vegetable vegetable1=new Vegetable();
        thingsToEat.add(vegetable1);
        Vegetable vegetable2 = new Tomato();
        thingsToEat.add(vegetable2);
        for (Edible anEdible : thingsToEat) {
            anEdible.eat();
        }
    }
}
*/