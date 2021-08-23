package by.iba.repository;

import by.iba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepository extends JpaRepository<User, Long> {
}
