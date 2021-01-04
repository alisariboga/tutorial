package jpa;

public class UserCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory
            .getLogger(UserCommandLineRunner.class);
    @Autowired
    private com.company.jpa.UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new com.company.jpa.User("Ali", "Admin"));
        repository.save(new com.company.jpa.User("Can", "User"));
        repository.save(new com.company.jpa.User("Sifa", "Admin"));
        repository.save(new com.company.jpa.User("Fevzi", "User"));

        for (com.company.jpa.User user : repository.findAll()) {
            log.info(user.toString());
        }
        log.info("Admin users are .... ");
        log.info("_____________________");
        for (com.company.jpa.User user : repository.findByRole("Admin")) {
            log.info(user.toString());
        }

    }
}
