package com.faj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2022/6/12
 */
@RestController
public class BranchController {

    @GetMapping("branch")
    public String getBranch() {
        return "branch: jenkins-test/v1.0/JIRA-2/feature-2";
    }

}
