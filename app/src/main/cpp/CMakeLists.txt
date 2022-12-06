cmake_minimum_required(VERSION 3.18.1)

project("Anyffmpeg")

add_library(
        Anyffmpeg
        SHARED
        native-lib.cpp)


include_directories(ffmpeg/includes/${ANDROID_ABI})
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -L${CMAKE_SOURCE_DIR}/ffmpeg/libs/${ANDROID_ABI}")

find_library(log-lib
        log)

target_link_libraries(
        Anyffmpeg
        avcodec avfilter avformat avutil swresample swscale
        ${log-lib})