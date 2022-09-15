package apap.tutorial.belajarbelajar.service;

import apap.tutorial.belajarbelajar.model.CourseModel;
import apap.tutorial.belajarbelajar.repository.CourseDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourseServiceImpl implements  CourseService{
    @Autowired
    CourseDb courseDb;

    @Override
    public void addCourse(CourseModel course) {
        courseDb.save(course);
    }

    @Override
    public List<CourseModel> getListCourse() {
        return courseDb.findAll();
    }

    @Override
    public CourseModel getCourseByCodeCourse(String code) {
        Optional<CourseModel> course = courseDb.findByCode(code);
        if (course.isPresent()) {
            return course.get();
        } else return null;
    }

    @Override
    public CourseModel updateCourse(CourseModel course) {
        courseDb.save(course);
        return course;
    }


}
