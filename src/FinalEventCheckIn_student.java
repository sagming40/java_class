
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
                case "1": {
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 값 거절
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("학번과 이름을 모두 입력하세요.");
                        break;
                    }

                    // TODO 2. 중복 학번 검사
                    boolean duplicate = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null && entries[i].studentId.equals(studentId)) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (duplicate) {
                        System.out.println("이미 신청한 학번입니다.");
                        break;
                    }

                    // TODO 3. 빈 칸 찾아 저장 / TODO 4. 정원 마감
                    boolean saved = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            StudentEntry entry = new StudentEntry();
                            entry.studentId = studentId;
                            entry.name = name;
                            entries[i] = entry;
                            saved = true;
                            System.out.println("신청 완료!");
                            break;
                        }
                    }
                    if (!saved) {
                        System.out.println("정원이 마감되었습니다.");
                    }
                    break;
                }

                case "2": {
                    // TODO 5. 명단 출력
                    int count = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            System.out.println((i + 1) + "번 " + entries[i].studentId + " " + entries[i].name);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;
                }

                case "3": {
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();

                    // TODO 6. 취소
                    boolean found = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null && entries[i].studentId.equals(cancelId)) {
                            entries[i] = null;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("해당 학번을 찾을 수 없습니다.");
                    } else {
                        System.out.println("취소되었습니다.");
                    }
                    break;
                }

                case "4": {
                    // TODO 7. 현황
                    int count = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            count++;
                        }
                    }
                    System.out.println("현재 인원: " + count + "명, 남은 자리: " + (5 - count) + "자리");
                    break;
                }

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}
