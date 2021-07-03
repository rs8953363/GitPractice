package quizOne;

public class questionSeven {
    private static class Human {
        public void print(){
            System.out.println("Human");
        }
    }
    private static class Teacher extends Human{
        public void print(){
            System.out.println("Teacher");
        }
    }
    private static class Doctor extends Human{
        public void print(){
            System.out.println("Doctor");
        }
    }

    public static void main(String[] args) {
        Human human1= new Teacher();
        Human human2= new Doctor();
        Human human3= (Teacher)human2;
        human3.print();
        human1.print();
    }
}
