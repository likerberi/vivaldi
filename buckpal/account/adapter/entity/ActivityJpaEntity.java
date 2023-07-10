package buckpal.adapter.persistence;

@Entity
@Table(name = 'activity')
@Data
@AllArgsConstructor
@NoArgsConstructor
class ActivityJpaEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column private LocalDateTime timestamp;
    @Column private Long ownerAccountId;
    @Column private Long sourceAccountId;
    @Column private Long targetAccountId;
    @Column private Long amount;
}