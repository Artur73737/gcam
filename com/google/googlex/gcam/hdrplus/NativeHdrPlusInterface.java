package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NativeHdrPlusInterface implements .pvn {
   private static final Object a = new Object();
   private static final AtomicBoolean b = new AtomicBoolean();

   public NativeHdrPlusInterface() {
      Object var1 = a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         AtomicBoolean var2;
         try {
            var2 = b;
            if (var2.get()) {
               return;
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            init();
            var2.set(true);
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   private static native void init();

   private native void nativeInitializeWalnutFromOpenFile(int var1, long var2, long var4, long var6);

   private native void nativeSetFinalImageRgb16Allocator(long var1, InterleavedU16ClientAllocator var3);

   private native void nativeSetFrameRescorerCallback(long var1, FrameRescorerCallback var3);

   public native boolean nativeAddPayloadFrame(long var1, int var3, long var4, long var6, long var8, Runnable var10, long var11, Runnable var13, long var14, Runnable var16);

   public native void nativeAddViewfinderFrame(long var1, int var3, long var4, long var6, long var8, long var10, Runnable var12);

   public native void nativeAddViewfinderMetadataOnly(long var1, int var3, long var4, long var6);

   public native float nativeGetPostZoomSharpenStrength(long var1, float var3);

   public native void nativeInitializeLancetFromOpenFile(int var1, long var2, long var4, int var6, boolean var7, long var8);

   public native void nativeInitializePecanFromOpenFile(long var1, long var3, long var5);

   public native void nativeSetBaseFrameAeCallback(long var1, BaseFrameAeCallback var3);

   public native void nativeSetBaseFrameCallback(long var1, BaseFrameCallback var3);

   public native void nativeSetFinalImageCallback(long var1, ManagedImageCallback var3);

   public native void nativeSetFinalImageRgbAllocator(long var1, InterleavedU8ClientAllocator var3);

   public native void nativeSetFinalImageYuvAllocator(long var1, YuvClientAllocator var3);

   public native void nativeSetMergedDngCallback(long var1, EncodedBlobCallback var3);

   public native void nativeSetMergedLumaDenoisedAllocator(long var1, GrayS16ClientAllocator var3);

   public native void nativeSetMergedLumaDenoisedCallback(long var1, MergedLumaDenoisedCallback var3);

   public native void nativeSetMergedPdAllocator(long var1, InterleavedU16ClientAllocator var3);

   public native void nativeSetMergedPdCallback(long var1, IntLongConsumer var3);

   public native void nativeSetMergedRawImageAllocator(long var1, RawClientAllocator var3);

   public native void nativeSetMergedRawImageCallback(long var1, MergedRawCallback var3);

   public native void nativeSetMutableMergedRawCallback(long var1, MutableMergedRawCallback var3);

   public native void nativeSetPostviewCallback(long var1, ManagedImageCallback var3);

   public native void nativeSetPostviewRgbAllocator(long var1, InterleavedU8ClientAllocator var3);

   public native void nativeSetPostviewYuvAllocator(long var1, YuvClientAllocator var3);

   public native void nativeSetProgressCallback(long var1, IntFloatConsumer var3);

   public native void nativeSetShotStatusCallbacks(long var1, IntByteArrayConsumer var3, IntStringConsumer var4, IntConsumer var5);

   public native boolean nativeTemporallyBinViewfinderFrame(long var1, int var3, long var4, long var6, Runnable var8, long var9, Runnable var11, long var12, long var14, Runnable var16, boolean var17, int var18);
}
