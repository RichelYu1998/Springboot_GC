package cn.tedu.demo.cache;

import org.springframework.stereotype.Component;

@Component
public class SoftCache implements Cache {
    public SoftCache(){
        System.out.println("SoftCache");
    }
}