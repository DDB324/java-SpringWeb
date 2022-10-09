package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;

@RestController
public class HelloController {
    @RequestMapping("/search")
    @ResponseBody
    public Object search(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("result", Arrays.asList("aaa", "bbb", "ccc"));
        return result;
    }
}
