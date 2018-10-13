package org.sopt.sb_seminar2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-10-12
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@RestController
public class FirstController {

//    @RequestMapping(method = RequestMethod.GET, value = "/hello")
//    public String hello2() {
//        return "Nice to Meet You!";
//    }

    // 위 어노테이션과 동일 설정
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    // 첫번째 '/' 생략가능
    @GetMapping("1")
    public String one() {
        return "One";
    }

    @GetMapping("/get1")
    public String getOne() {
        return "GET 1";
    }

    // 두번째 '/' 생략불가
    @GetMapping("get1/ehay")
    public String getOneEhay() {
        return "GET 1 ehay";
    }

    // required 는 name 값이 반드시 있어야하는가에 대한 설정  true = 값이 있어야 실행됨/ false = 값이 없어도 실행됨
    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name", required = true) final String name) {
        return name;
    }

    // value = QueryString의 key값, defaultValue = 값이 없을때 기본값
    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue = "") final String part) {
        return part;
    }

    // param 값이 2개 이상이면 '&'기호로 연결  ?name=ehay&type=ob
    // dafaultValue를 사용하지 않은 name 값이 입력되지 않으면 오류
    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name") final String name,
            @RequestParam(value = "type", defaultValue = "yb") final String type) {
        return name + "이고 " + type + "입니다.";
    }

    // ?num=1&num=2&num=3   or  ?num=1,2,3
    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum = 0;

        for (int i : num) {
            sum += i;
        }

        return sum;
    }

}

