package arbalest.time.beans;

import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class GetDayOfWeek {
    private DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

    public String getDayOfWeek() {
        switch (dayOfWeek) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            default:
                return "Воскресенье";
        }
    }
}
