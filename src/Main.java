
public class Main {

    public static void main(String[] args) {
        String order = "COFFEE, 2, HOT";
        String[] parts = order.split(",");
        if (parts.length == 3) {
            System.out.println("상품: " + parts[0]);

            System.out.println("수량: " + parts[1]);

            System.out.println("옵션: " + parts[2]);
        }
    }
}
