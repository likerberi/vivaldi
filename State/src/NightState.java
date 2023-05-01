import javax.naming.Context;

public class NightState implements State {
    private static NightState singleton = new NightState();

    public static State getInstance() {
        return singleton;
    }
    public NightState() {
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
        return "NightState{}";
    }
}
