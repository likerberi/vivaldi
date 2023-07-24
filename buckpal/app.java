package copyeditor.configuration;

class Application {
  public static void main(String[] args) {
    AccountRepository accountRepository = new AccountRepository();
    ActivityRepository activityRepository = new ActivityRepository();

    AccountPersistenceAdapter accountPersistenceAdapter = new AccountPersistenceAdapter(accountRepository, acvitivityRepository);
    SendMoneyUseCase sendMoneyUseCase = new SendMoneyUseCase(accountPersistenceAdapter, accountPersistenceAdapter);

    SendMoneyController sendMoneyController = new SendMoneyController(sendMoneyUseCase);

    startProcessingWebRequests(sendMoneyController);
  }
}
