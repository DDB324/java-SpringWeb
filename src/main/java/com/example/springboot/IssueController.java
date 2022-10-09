package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("repos")
public class IssueController {
    @DeleteMapping("/{owner}/{repo}/issues/{issueNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issueNumber") String issueNumber
    ) {
        System.out.println("owner = " + owner);
        System.out.println("repo = " + repo);
        System.out.println("issueNumber = " + issueNumber);
    }

    @PostMapping("/{owner}/{repo}/issues")
    public void create(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody MyParam object
    ) {
        System.out.println(object);
    }

    @PostMapping("/demo")
    public void formDemo(
            @RequestParam String aaa,
            @RequestParam String bbb
    ){
        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
    }
}
