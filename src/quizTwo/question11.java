package quizTwo;

public class question11 {
    public String name ="CodingBook";

    protected String getName() {
        return name;

    }

    public static void main(String[] args) {
        question11 person=new question11();
        System.out.println(person.getName());
    }
}
