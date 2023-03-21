package hw_06.date;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class AddDay implements TemporalAdjuster {
    private final int days;

    public AddDay(int days) {
        this.days = days;
    }
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }
}
