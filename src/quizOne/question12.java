package quizOne;

public class question12 {
    public static void main(String[] args) {
        int number= 66;
        if (number++>66){
            System.out.println(1);
        }else if (number>67){
            System.out.println(2);
        }else if (--number>66){
            System.out.println(3);
        }else if (++number>67){
            System.out.println(4);
        }
        System.out.println(5);
    }
}
