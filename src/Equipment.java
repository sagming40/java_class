public class Equipment {

    public static final int MAX_RENTAL_DAYS = 14;
    private static int equipmentCount;
    private final String name;
    private boolean rented;
    private int rentalDays;
    private int dailyFee;

    public Equipment(String name) {
        this(name, 1000);
    }

    public Equipment(String name, int dailyFee) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("장비 이름이 필요합니다.");
        }
        this.name = name;
        setDailyFee(dailyFee);
        equipmentCount++;
    }

    public boolean rent() {
        return rent(1);
    }

    public boolean rent(int days) {
        if (rented || days < 1 || days > MAX_RENTAL_DAYS) {
            return false;
        }
        rented = true;
        rentalDays = days;
        return true;
    }

    public void returnEquipment() {
        rented = false;
        rentalDays = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isRented() {
        return rented;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public int getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(int dailyFee) {
        if (dailyFee < 0) {
            this.dailyFee = 0;
            return;
        }
        this.dailyFee = dailyFee;
    }

    public static int getEquipmentCount() {
        return equipmentCount;
    }
}
