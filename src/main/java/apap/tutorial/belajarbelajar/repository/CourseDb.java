package apap.tutorial.belajarbelajar.repository;

import apap.tutorial.belajarbelajar.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseDb extends JpaRepository<CourseModel, String> {
    Optional<CourseModel> findByCode(String code);
}
