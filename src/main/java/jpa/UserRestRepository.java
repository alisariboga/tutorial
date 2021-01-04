package jpa;

import java.util.List;

public interface UserRestRepository extends
        PagingAndSortingRepository<User, Long> {
    List<User> findByRole(@Param("role") String role);
}
