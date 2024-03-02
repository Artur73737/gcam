package com.google.android.libraries.oliveoil.bufferflinger;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.util.Log;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class BufferFlinger implements .nco {
   private static final int MAX_PAIRS_TO_QUERY = 100;
   public static final int NATIVE_WINDOW_TRANSFORM_FLIP_H = 1;
   public static final int NATIVE_WINDOW_TRANSFORM_FLIP_V = 2;
   public static final int NATIVE_WINDOW_TRANSFORM_INVERSE_DISPLAY = 8;
   public static final int NATIVE_WINDOW_TRANSFORM_ROT_180 = 3;
   public static final int NATIVE_WINDOW_TRANSFORM_ROT_270 = 7;
   public static final int NATIVE_WINDOW_TRANSFORM_ROT_90 = 4;
   private static final int NUM_BUFFERS_TO_KEEP_BEFORE_CLOSING = 3;
   private static final int PTS_QUERY_PERIOD = 10;
   private static final String TAG;
   private final Object buffeFlingerHandleLock;
   private long bufferFlingerHandle;
   private final Executor displayExecutor;
   private final LongBuffer idAndPtsBuffer;
   private final Map idToOnPtsAvailableListener;
   private final AtomicInteger nextBufferId;
   private final Queue onBufferReleasedListenerQueue;
   private final boolean queryPts;

   static {
      .mhw.a(BufferFlinger.class, "bufferflinger");
      nativeInit();
      TAG = BufferFlinger.class.getSimpleName();
   }

   public BufferFlinger(Surface var1) {
      this(var1, false);
   }

   public BufferFlinger(Surface var1, boolean var2) {
      this.displayExecutor = Executors.newSingleThreadExecutor(BufferFlinger$$ExternalSyntheticLambda2.INSTANCE);
      this.buffeFlingerHandleLock = new Object();
      this.onBufferReleasedListenerQueue = new LinkedList();
      this.idToOnPtsAvailableListener = new HashMap();
      this.nextBufferId = new AtomicInteger(0);
      this.idAndPtsBuffer = ByteBuffer.allocateDirect(1600).order(ByteOrder.nativeOrder()).asLongBuffer();
      this.bufferFlingerHandle = nativeCreateBufferFlinger(var1, "buffer-flinger", var2);
      this.queryPts = var2;
   }

   // $FF: synthetic method
   static Thread lambda$new$0(Runnable var0) {
      return new Thread(var0, "bufferflinger");
   }

   private static native long nativeCreateBufferFlinger(Surface var0, String var1, boolean var2);

   private static native void nativeDisplayBuffer(long var0, int var2, HardwareBuffer var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

   private static native int nativeGetIdAndTimestampPairs(long var0, Buffer var2, int var3);

   private static native void nativeInit();

   private static native void nativeReleaseBufferFlinger(long var0);

   public void close() {
      Object var1 = this.buffeFlingerHandleLock;
      synchronized(var1){}

      label157: {
         Throwable var10000;
         boolean var10001;
         label152: {
            try {
               if (this.bufferFlingerHandle != 0L) {
                  break label157;
               }
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label152;
            }

            label145:
            try {
               IllegalStateException var20 = new IllegalStateException("Calling close on an already closed BufferFlinger.");
               throw var20;
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label145;
            }
         }

         while(true) {
            Throwable var2 = var10000;

            try {
               throw var2;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               continue;
            }
         }
      }

      Semaphore var19 = new Semaphore(0);
      this.displayExecutor.execute(new BufferFlinger$$ExternalSyntheticLambda0(this, var19));

      try {
         var19.acquire();
      } catch (InterruptedException var15) {
         Log.e(TAG, "Interrupted while waiting for nativeReleaseBufferFlinger.");
      }
   }

   public void displayBuffer(HardwareBuffer var1, Rect var2, Rect var3, int var4, BufferFlinger$OnBufferReleasedListener var5) {
      this.displayBuffer(var1, var2, var3, var4, var5, (BufferFlinger$OnPresentationTimestampAvailableListener)null);
   }

   public void displayBuffer(HardwareBuffer var1, Rect var2, Rect var3, int var4, BufferFlinger$OnBufferReleasedListener var5, BufferFlinger$OnPresentationTimestampAvailableListener var6) {
      this.displayExecutor.execute(new BufferFlinger$$ExternalSyntheticLambda1(this, var5, var6, var1, var2, var3, var4));
   }

   // $FF: synthetic method
   public void lambda$close$2$com_google_android_libraries_oliveoil_bufferflinger_BufferFlinger/* $FF was: lambda$close$2$com-google-android-libraries-oliveoil-bufferflinger-BufferFlinger*/(Semaphore param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public void lambda$displayBuffer$1$com_google_android_libraries_oliveoil_bufferflinger_BufferFlinger/* $FF was: lambda$displayBuffer$1$com-google-android-libraries-oliveoil-bufferflinger-BufferFlinger*/(BufferFlinger$OnBufferReleasedListener var1, BufferFlinger$OnPresentationTimestampAvailableListener var2, HardwareBuffer var3, Rect var4, Rect var5, int var6) {
      if (this.bufferFlingerHandle == 0L) {
         IllegalStateException var11 = new IllegalStateException("Calling displayBuffer on an already closed BufferFlinger.");
         throw var11;
      } else {
         this.onBufferReleasedListenerQueue.offer(var1);
         if (this.onBufferReleasedListenerQueue.size() > 3) {
            ((BufferFlinger$OnBufferReleasedListener)this.onBufferReleasedListenerQueue.poll()).onBufferReleased();
         }

         int var7 = this.nextBufferId.getAndIncrement();
         if (var2 != null) {
            this.idToOnPtsAvailableListener.put(var7, var2);
         }

         nativeDisplayBuffer(this.bufferFlingerHandle, var7, var3, var4.left, var4.top, var4.right, var4.bottom, var5.left, var5.top, var5.right, var5.bottom, var6);
         if (this.queryPts && var7 % 10 == 0) {
            var6 = nativeGetIdAndTimestampPairs(this.bufferFlingerHandle, this.idAndPtsBuffer, 100);
            if (var6 > 0) {
               this.idAndPtsBuffer.position(0);
               this.idAndPtsBuffer.limit(var6 + var6);

               while(this.idAndPtsBuffer.position() < this.idAndPtsBuffer.limit()) {
                  var6 = (int)this.idAndPtsBuffer.get();
                  long var8 = this.idAndPtsBuffer.get();
                  BufferFlinger$OnPresentationTimestampAvailableListener var10 = (BufferFlinger$OnPresentationTimestampAvailableListener)this.idToOnPtsAvailableListener.get(var6);
                  if (var10 != null) {
                     var10.onPresentationTimestampAvailable(var8);
                  }
               }
            }
         }

      }
   }
}
