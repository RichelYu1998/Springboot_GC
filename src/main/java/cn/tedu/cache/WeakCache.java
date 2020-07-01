package cn.tedu.cache;

import org.springframework.stereotype.Component;

@Component("cache")
public class WeakCache implements Cache{
    public WeakCache(){
        System.out.println("WeakCache");
    }
}