
import java.util.Scanner;

class StudentEntry {

    String studentId;
    String name;
}

public class FinalEventCheckIn_student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];

        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    // TODO 3. null인 첫 칸을 찾고 StudentEntry 객체를 저장하세요.
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    System.out.println("신청 기능을 완성해 보세요.");
                    break;

                case "2":
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    // 아무도 없으면 "등록된 신청자가 없습니다."를 출력하세요.
                    System.out.println("명단 기능을 완성해 보세요.");
                    break;

                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();
                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    // 없는 학번이라면 그 사실을 알려 주세요.
                    System.out.println("취소 기능을 완성해 보세요.");
                    break;

                case "4":
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    System.out.println("현황 기능을 완성해 보세요.");
                    break;

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}
