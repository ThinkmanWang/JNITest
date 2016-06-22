//
// Created by wangx on 2016/6/22.
//

#include "hello_jni.h"
#include "com_thinkman_jnitest_jni_HelloJni.h"
JNIEXPORT jstring JNICALL Java_com_thinkman_jnitest_jni_HelloJni_sayHello(JNIEnv *env, jobject object) {
    return (*env)->NewStringUTF(env, "Hello Jni");
}
