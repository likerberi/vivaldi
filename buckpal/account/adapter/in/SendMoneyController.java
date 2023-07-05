package buckpal.adapter.in.web;

@RestController
@RequiredArgsContructor
class SendMoneyController {
    private final SendMoneyUseCase sendMoneyUseCase;
    @PostMapping("/accounts/send/{sourceAccountId}/{tartgetAccountId}/{amount}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("targetAccountId") Long targetAccountId,
            @PathVariable("amount") Long amount) {
        SendMoneyCommand command = new SendMoneyCommand(
                new AccountId(sourceAccountId),
                new AccountId(targetAccountId),
                Money.of(amount)
        );
        sendMoneyUseCase.sendMoney(command);
    }
}