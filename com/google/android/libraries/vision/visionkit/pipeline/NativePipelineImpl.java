package com.google.android.libraries.vision.visionkit.pipeline;

import android.util.Log;
import java.nio.ByteBuffer;

public class NativePipelineImpl implements .ogz {
   private .qfc a;
   private .ohb b;
   private .ohb c;

   public NativePipelineImpl(.ohb var1, .ohb var2, .qfc var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public NativePipelineImpl(.ohb var1, .ohb var2, .qfc var3, byte[] var4) {
      this(var1, var2, var3);
      System.loadLibrary("camerapipeline");
   }

   public final void a() {
      this.a = null;
      this.b = null;
      this.c = null;
   }

   public native void close(long var1, long var3, long var5, long var7);

   public native boolean disableSubpipeline(long var1, String var3);

   public native boolean enableSubpipeline(long var1, String var3);

   public native long initialize(byte[] var1, long var2, long var4, long var6, long var8);

   public native long initializeFrameBufferReleaseCallback(long var1);

   public native long initializeFrameManager();

   public native long initializeResultsCallback();

   public void onReleaseAtTimestampUs(long var1) {
      this.b.a(var1);
   }

   public void onResult(byte[] var1) {
      try {
         .qfc var6 = this.a;
         .qfn var4 = .qfn.Q(.ohe.f, var1, 0, var1.length, var6);
         .qfn.af(var4);
         .ohe var5 = (.ohe)var4;
         this.c.b(var5);
      } catch (.qfz var3) {
         .nyj var2 = .nyj.a;
         if (var2.d(6)) {
            Log.e(var2.b, var2.a("Error in result from JNI layer"), var3);
         }

      }
   }

   public native boolean receiveYuvFrame(long var1, long var3, ByteBuffer var5, ByteBuffer var6, ByteBuffer var7, int var8, int var9, int var10, int var11, int var12, int var13);

   public native void resetSchedulingOptimizerOptions(long var1, byte[] var3);

   public native void start(long var1);

   public native boolean stop(long var1);

   public native void waitUntilIdle(long var1);
}
