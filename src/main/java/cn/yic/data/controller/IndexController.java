package cn.yic.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String Index() {
        return "Hello, index page!!";
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for(int i=1; i<6; i++) {
            map = new HashMap<>();
            map.put("name", "Shy - " + i);
            list.add(map);
        }
        return list;
    }
}
