package com.techelevator;

public class AlarmClock {

    /* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, … 6=Sat, and a boolean indicating
    if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.

   Weekdays, the alarm should be "7:00"

    and on the weekend it should be "10:00".

    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"
    */

    public String clockAlarm(int dayOfWeek, boolean onVacation) {

        if (dayOfWeek < 0 || dayOfWeek > 6) {
            throw new IllegalArgumentException("not a valid day of week");
        }

        boolean isWeekend = dayOfWeek == 6 || dayOfWeek == 0;
        if (isWeekend && onVacation) {
            return "off";
        } else if (isWeekend || onVacation) {
            return "10:00";
        } else {
            return "7:00";
        }

    }
}
