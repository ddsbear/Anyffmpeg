#include <jni.h>
#include <string>

extern "C"{
#include "ffmpeg/includes/libavcodec/avcodec.h"
#include "ffmpeg/includes/libavformat/avformat.h"
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_dds_ffmpeg_FFMpeg_stringFromJNI(JNIEnv *env, jclass clazz) {
    avformat_version();
    return env->NewStringUTF(avcodec_configuration());
}