package cn.tedu;

import cn.tedu.cache.Cache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheTests {
    @Autowired
    private Cache cache;

    @Test
    void testCache() {
        System.out.println(cache);
    }
}
