package test.java;

import com.alibaba.fastjson.JSON;
import com.wangjie.spring.model.User;
import com.wangjie.spring.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class) // ��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    private UserService userService;


    @Test
    public void test() {
        User user = userService.getUserById(2);
        logger.info(JSON.toJSONString(user));
    }
}
