package com.stip.net.utils;

public class PicTVideo {

    public void pic2v(){
//图片转换器
//在main函数中时要让系统去加载这个opencv的相关变量，其它有运行容器（如Tomcat）则不用
System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
OpenCVFrameConverter.ToIplImage conveter = new OpenCVFrameConverter.ToIplImage(); //申明一个图片处理的变量

//------------------->begin 初始化视频录制器
        // 参数说明视频存储位置mergeMp4Path:xxx.mov，视频的宽和高
recorder = new FFmpegFrameRecorder(mergeMp4Path,MAX_W,MAX_H);
recorder.setVideoCodec(avcodec.AV_CODEC_ID_MPEG4); // 13
recorder.setFormat("mov"); //设置格式mov为快播短播
recorder.setFrameRate(FRAME_RATE); //此处说明每一秒多少帧，即说明1秒会录多少张照片
//  recorder.setGopSize(FRAME_RATE*2); //这一步没有感觉到有多少影响，暂时不管
recorder.setVideoBitrate(8000000); //8000kb/s 这个说明视频每秒大小，值越大图片转过来的压缩率就越小质量就会越高

//  recorder.setPixelFormat(avutil.AV_PIX_FMT_YUV420P); // yuv420p  先默认吧，这个应该属于设置视频的处理模式吧
        // 不可变(固定)音频比特率
recorder.setAudioOption("crf", "0");
        // 最高质量
recorder.setAudioQuality(0);
// 音频比特率
//  recorder.setAudioBitrate(192000);
// 音频采样率
//  recorder.setSampleRate(44100);
        // 双通道(立体声)
recorder.setAudioChannels(2);
//------------------->end 初始化视频录制器

recorder.start();//开始录制

//------------------->begin 如果有多张，则以下代码则执行多次即可

        String frame = "xxxx.jpg";//单张图片的位置

        IplImage image = opencv_imgcodecs.cvLoadImage(frame); // 非常吃内存！！
        Frame frame = conveter.convert(image);
        recorder.record(frame);  //录制
// 释放内存
cvLoadImage(fname); // 非常吃内存！！
opencv_core.cvReleaseImage(image);

//------------------->end 如果有多张，则以下代码则执行多次即可

//------------------->begin 开始录制音频
grabber = new FFmpegFrameGrabber(mp3Path);
grabber.start();// 开始录制音频

        while ((audioSamples = grabber.grab()) != null) {
            recorder.setTimestamp(grabber.getTimestamp());  //告诉录制器这个audioSamples的音频时长
            recorder.record(audioSamples);  //录入音频
        }

//------------------->end 开始录制音频

grabber.stop();
        grabber.release();
recorder.stop();
recorder.release();


    }
}
