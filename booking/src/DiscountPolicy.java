import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();
    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }
    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
