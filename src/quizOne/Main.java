package quizOne;

class CustomException extends Exception{}
class CustomException2 extends RuntimeException{}

class question6 {
    public static void main(String[] args) throws CustomException{
        int[] numbers = {1,2,3,4,5};
        for (int number: numbers){
            if (number%2 !=0){
                System.out.println("Odd");
                throw new CustomException2();
            } else {
                throw new CustomException();
            }
        }
    }
}
