package cn.tedu.demo.cache;

import org.springframework.stereotype.Component;

@Component("cache")
public class WeakCache implements Cache{
    public WeakCache(){
        System.out.println("WeakCache");
    }
}