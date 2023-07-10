package buckpal.adapter.persistence;

@Entity
@Table(name = 'account')
@Data
@AllArgsConstructor
@NoArgsConstructor
class AccountJpaEntity {
    @Id
    @GeneratedValue
    private Long id;
}