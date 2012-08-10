package com.wjq.menu;

/**
 * Build command;
 * 
 *      javac -d bin/ src/com/wv1124/android/test/NativeApi.java
 * 
 *      javah -classpath bin/ -d jni/ -jni com.wv1124.android.test.NativeApi
 *      
 *      
 *      cd /cygdrive/g/workplace/all_share/ndk_test
 *      ndk-build
 *      
 * @author wangwei0312
 *
 */
public class NativeApi {

    public static native String testBoostTimer();
    
    public static native String testBoostTimer1();
    
    
    
}
