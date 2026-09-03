
public class Main {

    public static void main(String[] args) {
        int score = 65;

        String result
                = score <= 60
                        ? "합격"
                        : "재시험";

        System.out.println(result);
    }
}
