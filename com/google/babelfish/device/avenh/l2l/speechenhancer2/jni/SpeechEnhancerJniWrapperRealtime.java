package com.google.babelfish.device.avenh.l2l.speechenhancer2.jni;

import j$.nio.file.Path;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SpeechEnhancerJniWrapperRealtime {
   private static final long ILLEGAL_JNI_CONTEXT = -1L;
   private final int audioChannels;
   private final .osg callback;
   private long jniContext;
   private final Path modelDirectory;
   private final float sampleRate;
   private final boolean skipInitGoogle;
   private final boolean useBatchMode;
   private final boolean useTpu;

   private SpeechEnhancerJniWrapperRealtime(boolean var1, Path var2, int var3, float var4, .osg var5, boolean var6, boolean var7) {
      this.useBatchMode = var1;
      this.modelDirectory = var2;
      this.callback = var5;
      this.skipInitGoogle = var6;
      this.useTpu = var7;
      this.jniContext = -1L;
      this.audioChannels = var3;
      this.sampleRate = var4;
   }

   // $FF: synthetic method
   public SpeechEnhancerJniWrapperRealtime(boolean var1, Path var2, int var3, float var4, .osg var5, boolean var6, boolean var7, .osh var8) {
      this(var1, var2, var3, var4, var5, var6, var7);
   }

   private native int avenhAudioBytesPerSample(long var1);

   private native int avenhAudioNumberOfChannels(long var1);

   private native float avenhAudioSampleRateHz(long var1);

   private native void avenhCleanup(long var1);

   private native int avenhFlush(long var1);

   private native double avenhGetAllSpeechMixingRatio(long var1);

   private native double avenhGetRawAudioMixingRatio(long var1);

   private native boolean avenhHasAllSpeechOutput(long var1);

   private native long avenhInit(String var1, int var2, float var3, boolean var4, boolean var5, boolean var6, String var7, String var8, String var9, String var10);

   private static native void avenhModelWarmup(String var0, boolean var1);

   private native int avenhNumberOfThumbnailImageChannels(long var1);

   private native void avenhProvideFrame(long var1, ByteBuffer var3, int var4, int var5, int var6);

   private native void avenhProvideFrameAndFace(long var1, ByteBuffer var3, int var4, int var5, int var6, ByteBuffer var7);

   private native void avenhProvideRawAudio(long var1, ByteBuffer var3);

   private native void avenhSetAllSpeechMixingRatio(long var1, double var3);

   private native void avenhSetRawAudioMixingRatio(long var1, double var3);

   private native int avenhThumbnailHeightPixels(long var1);

   private native int avenhThumbnailWidthPixels(long var1);

   private native int avenhVideoFramesPerSecond(long var1);

   private static ByteBuffer byteArrayToDirectByteBuffer(byte[] var0) {
      ByteBuffer var1 = ByteBuffer.allocateDirect(var0.length);
      var1.order(ByteOrder.nativeOrder());
      var1.put(var0);
      var1.position(0);
      return var1;
   }

   public static void modelWarmup(Path var0, boolean var1) {
      avenhModelWarmup(var0.toString(), var1);
   }

   public void cleanup() {
      long var1 = this.jniContext;
      if (var1 != -1L) {
         this.avenhCleanup(var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling cleanup().");
      }
   }

   public void flush() {
      long var1 = this.jniContext;
      if (var1 != -1L) {
         this.avenhFlush(var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling flush().");
      }
   }

   public double getAllSpeechMixingRatio() {
      long var1 = this.jniContext;
      if (var1 != -1L) {
         return this.avenhGetAllSpeechMixingRatio(var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling getAllSpeechMixingRatio().");
      }
   }

   public double getRawAudioMixingRatio() {
      long var1 = this.jniContext;
      if (var1 != -1L) {
         return this.avenhGetRawAudioMixingRatio(var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling getRawAudioMixingRatio().");
      }
   }

   public .osm getSpeechEnhancerModelInfo() {
      if (this.jniContext != -1L) {
         .osl var2 = .osm.a();
         var2.g(this.avenhThumbnailWidthPixels(this.jniContext));
         var2.f(this.avenhThumbnailHeightPixels(this.jniContext));
         int var1 = this.avenhNumberOfThumbnailImageChannels(this.jniContext);
         var2.e((.osk).osk.c.get(var1));
         var2.h(this.avenhVideoFramesPerSecond(this.jniContext));
         var2.d(this.avenhAudioSampleRateHz(this.jniContext));
         var2.b(this.avenhAudioBytesPerSample(this.jniContext));
         var2.c(this.avenhAudioNumberOfChannels(this.jniContext));
         return var2.a();
      } else {
         throw new IllegalStateException("'initialize' must be called before calling getSpeechEnhancerModelInfo().");
      }
   }

   public boolean hasAllSpeechOutput() {
      long var1 = this.jniContext;
      if (var1 != -1L) {
         return this.avenhHasAllSpeechOutput(var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling hasAllSpeechOutput().");
      }
   }

   public void initialize() {
      this.jniContext = this.avenhInit(this.modelDirectory.toString(), this.audioChannels, this.sampleRate, this.useBatchMode, this.skipInitGoogle, this.useTpu, "processedAudioJniCallback", "isSpeakingJniCallback", "mainSpeakerDetectedJniCallback", "onSwitchToAudioOnlyJniCallback");
   }

   public void isSpeakingJniCallback(float var1) {
      this.callback.c();
   }

   public void mainSpeakerDetectedJniCallback(byte[] var1) {
      .osg var2 = this.callback;
      Optional.ofNullable(var1).map(.kmz.g);
      var2.d();
   }

   public void onSwitchToAudioOnlyJniCallback(int var1) {
      this.callback.b(var1);
   }

   public void processedAudioJniCallback(byte[] var1) {
      this.callback.a(var1);
   }

   public void provideRawAudio(byte[] var1) {
      if (this.jniContext != -1L) {
         ByteBuffer var2 = byteArrayToDirectByteBuffer(var1);
         this.avenhProvideRawAudio(this.jniContext, var2);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling provideRawAudio().");
      }
   }

   public void provideVideoFrame(.oss var1) {
      if (this.jniContext != -1L) {
         if (var1.e.isPresent()) {
            this.avenhProvideFrameAndFace(this.jniContext, var1.a, var1.b, var1.c, var1.d.d, byteArrayToDirectByteBuffer(((.qkc)var1.e.get()).J()));
         } else {
            this.avenhProvideFrame(this.jniContext, var1.a, var1.b, var1.c, var1.d.d);
         }
      } else {
         throw new IllegalStateException("'initialize' must be called before calling provideVideoFrame().");
      }
   }

   public void setAllSpeechMixingRatio(double var1) {
      long var3 = this.jniContext;
      if (var3 != -1L) {
         this.avenhSetAllSpeechMixingRatio(var3, var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling setAllSpeechMixingRatio().");
      }
   }

   public void setRawAudioMixingRatio(double var1) {
      long var3 = this.jniContext;
      if (var3 != -1L) {
         this.avenhSetRawAudioMixingRatio(var3, var1);
      } else {
         throw new IllegalStateException("'initialize' must be called before calling setRawAudioMixingRatio().");
      }
   }
}
