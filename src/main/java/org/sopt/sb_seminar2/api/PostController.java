package org.sopt.sb_seminar2.api;

import org.sopt.sb_seminar2.model.SoptUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-10-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("")
    public String postUser(@RequestBody final SoptUser user) {
        return user.getName();
    }
}
