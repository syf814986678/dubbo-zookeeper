package com.shiyifan;

import com.shiyifan.service.SendMailService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServerApplicationTests {
    @Reference
    SendMailService sendMailService;
    @Test
    void contextLoads(){
        System.out.println(sendMailService.sendmail("复杂测试", "复杂测试", true, "1.bmp", "/user/zookeeperdata/1.bmp", "814986678@qq.com", "814986678@qq.com"));

    }

}
