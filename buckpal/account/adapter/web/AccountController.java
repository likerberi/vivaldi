package buckpal.adapter.web;

@RestController
@RequiredArgsConstructor
class AccountController {
    private final GetAccountBalanceQuery getAccountBalanceQuery;
    private final ListAccountsQuery listAccountsQuery;
    private final LoadAccountQuery loadAccountQuery;

    private final SendMoneyUseCase sendMoneyUseCase;
    private final CreateAccountUseCase createAccountUseCase;

    @GetMapping("/accounts")
    @GetMapping("/accounts/{accountId}")
    @GetMapping("/accounts/{accountId}/balance")
    @PostMapping("/accounts")
    @PostMapiing("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
}