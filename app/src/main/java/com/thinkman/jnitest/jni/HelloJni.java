package com.thinkman.jnitest.jni;

/**
 * Created by wangx on 2016/6/22.
 */
public class HelloJni {
    static {
        //加载.so的类库
        System.loadLibrary("hello");
    }
    //定义一个jni的方法
    public native String sayHello();
}
