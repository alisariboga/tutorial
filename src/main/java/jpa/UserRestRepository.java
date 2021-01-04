package jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRestRepository extends
        PagingAndSortingRepository<User, Long> {
    List<User> findByRole(@Param("role") String role);
}
