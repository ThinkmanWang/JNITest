
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE :=hello
LOCAL_SRC_FILES =: hello_jni.c
	
include $(BUILD_SHARED_LIBRARY)
