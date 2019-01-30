package cn.yic.data.controller;

import cn.yic.data.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    // 模拟
    List<Person> personList = new ArrayList<Person>();

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("personList", personList);
        return "/person/index";
    }

    @RequestMapping("/add")
    public String add(Person person) {
        personList.add(person);
        return "redirect:/person/index";
    }
}
