package hw_06.date;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal day = temporal.with(TemporalAdjusters.firstDayOfYear());
        Temporal dayNext = temporal.with(TemporalAdjusters.firstDayOfNextYear());
        long dayThisYear = ChronoUnit.DAYS.between(day, temporal);
        long dayNextYear = ChronoUnit.DAYS.between(temporal, dayNext);
        return dayThisYear < dayNextYear ? day : dayNext;
    }
}
