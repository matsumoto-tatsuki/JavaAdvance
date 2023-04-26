package EnumPractice;

import java.time.LocalDate;

public enum DayOfWeek {
    MONDAY("月曜日"),
    TUESDAY("火曜日"),
    WEDNESDAY("水曜日"),
    THURSDAY("木曜日"),
    FRIDAY("金曜日"),
    SATURDAY("土曜日"),
    SUNDAY("日曜日");

    private final String name;

    DayOfWeek(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static DayOfWeek getDayOfWeek(LocalDate date){
        return DayOfWeek.valueOf(date.getDayOfWeek().name());
    }

    public static void main(String[] args){
        LocalDate date = LocalDate.of(2023, 4, 26);
        System.out.println(getDayOfWeek(date).getName());
    }
}
