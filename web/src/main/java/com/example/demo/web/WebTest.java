package com.example.demo.web; /**
 * Created by zhangtao on 2019/4/18
 */

import com.example.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName WebTest
 *@Description TODO
 *@Author 0682
 *@Date 2019/4/18 14:22
 *@Version 1.0
 **/
@RestController
@RequestMapping("test")
public class WebTest {
    @RequestMapping("showAll")
    String showAll(){
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService()+":我是web!";
    }
}
