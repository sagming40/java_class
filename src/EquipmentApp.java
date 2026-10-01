public class EquipmentApp {

    public static void main(String[] args) {
        Equipment laptop = new Equipment("노트북");
        Equipment camera = new Equipment("카메라", 2000);
        if (laptop == null || camera == null) {
            System.out.println("TODO 9의 객체 생성부터 완성하세요.");
            return;
        }
        System.out.println("전체 장비 수: " + Equipment.getEquipmentCount());
        System.out.println("노트북 3일 대여 성공: " + laptop.rent(3));
        System.out.println("노트북 대여 중: " + laptop.isRented());
        System.out.println("카메라 대여 중: " + camera.isRented());
        System.out.println("노트북 중복 대여 성공: " + laptop.rent(2));
        System.out.println("노트북 기존 대여 기간: " + laptop.getRentalDays());
        System.out.println("카메라 0일 대여 성공: " + camera.rent(0));
        System.out.println("카메라 15일 대여 성공: " + camera.rent(15));
        System.out.println("카메라 14일 대여 성공: " + camera.rent(14));
        laptop.returnEquipment();
        System.out.println("노트북 반납 뒤 상태: " + laptop.isRented() + "/" + laptop.getRentalDays());
        System.out.println("노트북 기본 대여: " + laptop.rent() + "/" + laptop.getRentalDays());
        laptop.setDailyFee(-500);
        System.out.println("음수 요금 보정: " + laptop.getDailyFee());
    }
}
