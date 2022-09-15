package apap.tutorial.belajarbelajar.controller;

import apap.tutorial.belajarbelajar.model.CourseModel;
import apap.tutorial.belajarbelajar.model.PengajarModel;
import apap.tutorial.belajarbelajar.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {
    @Qualifier("courseServiceImpl")
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/add")
    public String addCourseFormPage(Model model) {
        model.addAttribute("course", new CourseModel());
        return "form-add-course";
    }

    @PostMapping("/course/add")
    public String addCourseSubmitPage(@ModelAttribute CourseModel course, Model model) {
        courseService.addCourse(course);
        model.addAttribute("code", course.getCode());
        return "add-course";
    }

    @GetMapping("/course/viewAll")
    public String listCourse(Model model) {
        List<CourseModel> listCourse = courseService.getListCourse();
        model.addAttribute("listCourse", listCourse);
        return "viewall-course";
    }

    @GetMapping("/course/view")
    public String viewDetailCoursePage(@RequestParam(value = "code") String code, Model model) {
        CourseModel course = courseService.getCourseByCodeCourse(code);
        List<PengajarModel> listPengajar = course.getListPengajar();

        model.addAttribute("listPengajar", listPengajar);
        model.addAttribute("course", course);

        return "view-course";
    }

    @GetMapping("/course/update/{code}")
    public String updateCourseFormPage(@PathVariable String code, Model model) {
        CourseModel course = courseService.getCourseByCodeCourse(code);
        model.addAttribute("course", course);

        return "form-update-course";
    }

    @PostMapping("/course/update")
    public String updateCourseSubmitPage(@ModelAttribute CourseModel course, Model model) {
        CourseModel updatedCourse = courseService.updateCourse(course);
        model.addAttribute("code", updatedCourse.getCode());

        return "update-course";
    }
}
