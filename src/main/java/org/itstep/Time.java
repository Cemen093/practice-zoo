package org.itstep;

public class Time {
    private int year = 0;
    private int maunt = 0;
    private int day = 0;
    private int haur = 0;
    private int minute = 0;
    private int second = 0;

    public Time() {
    }

    public Time(int year, int maunt, int day, int haur, int minute, int second) {
        this.year = year;
        this.maunt = maunt;
        this.day = day;
        this.haur = haur;
        this.minute = minute;
        this.second = second;
    }

    public void addTime(Time b){
        int tmp = second + b.second;
        second = tmp % 60;
        minute = tmp / 60;

        tmp = minute + b.minute;
        minute = tmp % 60;
        haur = tmp / 60;

        tmp = haur + b.haur;
        haur = tmp % 24;
        day = tmp / 24;

        tmp = day + b.day;//хм, пусть это будет вселенная с правильным календарем
        day = tmp % 30;
        maunt = tmp / 30;

        tmp = maunt + b.maunt;
        maunt = tmp % 12;
        year = tmp / 12;

        year += b.year;

    }

    @Override
    public String toString(){
        return String.format("%3s%5s%2s%5s%2s%6s%2s%1s%2s%1s%2s",
                year, "лет,", maunt, "мес,", day, "дней и ", haur, ":", minute, ":", String.valueOf(second));
    }
}
