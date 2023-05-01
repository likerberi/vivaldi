import javax.naming.Context;

public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState(){}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {

    }

    @Override
    public void doAlarm(Context context) {

    }

    @Override
    public void doPhone(Context context) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
