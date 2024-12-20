package netology.dao_with_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person anar = Person.builder().contact(Contact.builder()
                        .name("Dmitry")
                        .surname("Ivanov")
                        .age(31)
                        .build())
                .phoneNumber("+7 (495) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person dmitriy = Person.builder().contact(Contact.builder()
                        .name("Mikhail")
                        .surname("Kuznetsov")
                        .age(34)
                        .build())
                .phoneNumber("+7 (495) 222-22-22")
                .cityOfLiving("Moscow")
                .build();

        Person vlad = Person.builder().contact(Contact.builder()
                        .name("Vladislav")
                        .surname("Reznikov")
                        .age(42)
                        .build())
                .phoneNumber("+7 (812) 333-33-33")
                .cityOfLiving("SpB")
                .build();

    }
}
