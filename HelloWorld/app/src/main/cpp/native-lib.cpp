#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_example_helloworld_MainAcivity_stringfromJNI(
        JNIEnv *env, jobject /* this */){
    
    std: jstring hello = (jstring) "Hello World from C++";
    return env->NewStringUTF(hello->string());
}