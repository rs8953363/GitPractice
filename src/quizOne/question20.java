package quizOne;

public class question20 {
    public static void main(String[] args) {
        int number = 0;
        int [] numbers = {1,2,3,4,5};
        for (int aNumber: numbers) {
            switch (aNumber){
                case 2:
                case 4:
                    number -= 1;
                    break;
                case 1:
                    number++;
                case 3:
                    number--;
                case 5:
                    number+=2;
            }
        }
        System.out.println(number);
    }
}
