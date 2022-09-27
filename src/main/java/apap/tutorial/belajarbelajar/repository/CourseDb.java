package apap.tutorial.belajarbelajar.repository;

import apap.tutorial.belajarbelajar.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseDb extends JpaRepository<CourseModel, String> {
    // JPA
    Optional<CourseModel> findByCode(String code);

    // Query
    // @Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
    // User findUserByStatusAndNameNamedParams(
    // @Param("status") Integer status,
    // @Param("name") String name);
    @Query("SELECT c FROM CourseModel c WHERE c.code = :code")
    Optional<CourseModel> findByCodeUsingQuery(@Param("code") String code);
}
