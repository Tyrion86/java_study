public class Question {
    private String text;
    private String answer;

    public Question(){
        text="1";
        answer="2";
    }

    public static void main(String[] args) {
        System.out.println((new Question()).answer);

    }
}
