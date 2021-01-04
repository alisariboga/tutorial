package jpa;

import java.util.List;

public interface UserRepository extends CrudRepository<com.company.jpa.User, Long> {
    List<com.company.jpa.User> findByRole(String role);

}
