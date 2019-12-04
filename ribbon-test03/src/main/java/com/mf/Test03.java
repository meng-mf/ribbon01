package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test03
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/4
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
public class Test03 {
    public static void main(String[] args){

        SpringApplication.run(Test03.class,args);

    }

    @RequestMapping("test02")
    public String test02(){
        System.out.println("----------test02--------");
        return "test02-ok";
    }
}
