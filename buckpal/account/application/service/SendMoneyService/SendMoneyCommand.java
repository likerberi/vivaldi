package buckpal.application.port.in;

@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand>{
    private final AccountId sourceAccountId;
    private final AccountId targetAccountId;
    private final Money money;

    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;

//        requireNonNull(sourceAccountId);
//        requireNonNull(targetAccountId);
//        requireNonNull(money);
//        requireGreatThan(money, 0);

        requireGreaterThan(money, 0);
        this.validateSelf();
    }
}