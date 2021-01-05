package jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class UserCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory
            .getLogger(UserCommandLineRunner.class);
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new User("Ali", "Admin"));
        repository.save(new User("Can", "User"));
        repository.save(new User("Sifa", "Admin"));
        repository.save(new User("Fevzi", "User"));

        for (User user : repository.findAll()) {
            log.info(user.toString());
        }
        log.info("Admin users are .... ");
        log.info("_____________________");
        for (User user : repository.findByRole("Admin", "Admin")) {
            log.info(user.toString());
        }

    }
}
