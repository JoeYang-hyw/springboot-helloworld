package com.hehe.springboot;

import com.hehe.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootHelloworldApplicationTests {

    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads()  {
        //开始进行测试
        assertThat(userMapper.list().size()).isGreaterThan(1);
        assertThat(userMapper.getOne("1")).isNotEqualTo(null);
        assertThat(userMapper.getOne("xxx")).isEqualTo(null);
        }

}
