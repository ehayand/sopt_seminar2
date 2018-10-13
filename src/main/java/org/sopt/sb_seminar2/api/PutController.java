package org.sopt.sb_seminar2.api;

import org.sopt.sb_seminar2.model.SoptUser;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-10-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@RestController
@RequestMapping("/put")
public class PutController {

    @PutMapping("")
    public String putUser(@RequestBody final SoptUser user) {
        return user.getPart();
    }
}
