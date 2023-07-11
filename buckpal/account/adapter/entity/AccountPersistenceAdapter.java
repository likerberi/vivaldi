@RequiredArgsConstructor
@Component
class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountStatePort {
    private final AccountRepository accountRepository;
    private final ActivityRepository activityRepository;
    private final AccountMapper accountMapper;

    public Account loadAccount(
            AccountId accountId,
            LocalDateTime baselineDate
    ){
        AccountJpaEntity account = accountRepository.findById(accountId.getValue())
                .orElseThrow();
        List<ActivityJpaEntity> activities =
                activityRepository.findByOwnerSince(
                        accountId.getValue(), baselineDate
                );
        Long withdrawalBalance = orZero();

        Long depositBalance = orZero();
        return accountMapper.mapToDomainEntity(
                account, activities,
                withdrawalBalance, depositBalance
        );
    }

    private Long orZero(Long value) {
        return value == null ? 0L : value;
    }
}