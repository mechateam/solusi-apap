package apap.tutorial.belajarbelajar.controller;

import apap.tutorial.belajarbelajar.model.CourseModel;
import apap.tutorial.belajarbelajar.model.PengajarModel;
import apap.tutorial.belajarbelajar.service.CourseService;
import apap.tutorial.belajarbelajar.service.PengajarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PengajarController {
    @Qualifier("pengajarServiceImpl")
    @Autowired
    private PengajarService pengajarService;

    @Qualifier("courseServiceImpl")
    @Autowired
    private CourseService courseService;

    // @GetMapping("/pengajar/add/{code}")
    // public String addPengajarToCourseFormPage(@PathVariable String code, Model model) {
    //     CourseModel course = courseService.getCourseByCodeCourse(code);
    //     PengajarModel pengajar = new PengajarModel();
    //     // Tambah course ke pengajar
    //     List<CourseModel> listCourse = new ArrayList<>();
    //     listCourse.add(course);
    //     pengajar.setListCourse(listCourse);
    //     // Tambah pengajar ke course
    //     List<PengajarModel> listPengajar = course.getListPengajar();
    //     listPengajar.add(pengajar);
    //     course.setListPengajar(listPengajar);

    //     model.addAttribute("pengajar", pengajar);
    //     return "form-add-pengajar";
    // }

    // @PostMapping("/pengajar/add")
    // public String addPengajarSubmitPage(@ModelAttribute PengajarModel pengajar, Model model) {
    //     pengajarService.addPengajar(pengajar);
    //     model.addAttribute("no_pengajar", pengajar.getNoPengajar());
    //     return "add-pengajar";
    // }
}
