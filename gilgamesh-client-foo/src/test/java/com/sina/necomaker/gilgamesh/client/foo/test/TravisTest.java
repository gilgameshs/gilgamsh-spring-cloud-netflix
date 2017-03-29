package com.sina.necomaker.gilgamesh.client.foo.test;

import com.sina.necomaker.gilgamesh.client.foo.configuration.Travis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Travis on 2016/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TravisTest {
    @Autowired
    Travis travis;
    @Test
    public void testTravis(){
        assert travis.getName().equals("foo-dev");
    }
}
