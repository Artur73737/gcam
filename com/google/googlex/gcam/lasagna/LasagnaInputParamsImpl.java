package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class LasagnaInputParamsImpl implements .pwn {
   private static final AtomicBoolean a = new AtomicBoolean();
   private long b;

   public LasagnaInputParamsImpl(long var1, long var3, long var5, long var7, List var9, int var10) {
      AtomicBoolean var15 = a;
      boolean var14 = true;
      if (!var15.getAndSet(true)) {
         init();
      }

      boolean var13;
      if (var1 != 0L) {
         var13 = true;
      } else {
         var13 = false;
      }

      .onk.x(var13, "staticMetadataPtr is 0.");
      if (var3 != 0L) {
         var13 = true;
      } else {
         var13 = false;
      }

      .onk.x(var13, "shotParamsPtr is 0.");
      if (var5 != 0L) {
         var13 = true;
      } else {
         var13 = false;
      }

      .onk.x(var13, "shotMetadataPtr is 0.");
      if (var7 != 0L) {
         var13 = true;
      } else {
         var13 = false;
      }

      .onk.x(var13, "rawImagePlanarWriteView16Ptr is 0.");
      int var12 = var9.size();
      long[] var20 = new long[var12];
      long[] var18 = new long[var12];
      long[] var16 = new long[var12];
      Runnable[] var17 = new Runnable[var12];

      for(int var11 = 0; var11 < var12; ++var11) {
         .pwl var19 = (.pwl)var9.get(var11);
         var20[var11] = var19.c.a;
         var18[var11] = FrameMetadata.b(var19.b);
         var16[var11] = RawWriteView.c(var19.a);
         var17[var11] = var19.d;
      }

      var1 = alloc(var1, var3, var5, var7, var16, var18, var20, var17, var10);
      if (var1 != 0L) {
         var13 = var14;
      } else {
         var13 = false;
      }

      .onk.I(var13, "alloc() failed!");
      this.b = var1;
   }

   private static native long alloc(long var0, long var2, long var4, long var6, long[] var8, long[] var9, long[] var10, Runnable[] var11, int var12);

   private static native void dealloc(long var0);

   private static native void init();

   public final long a() {
      synchronized(this){}

      long var1;
      try {
         var1 = this.b;
      } finally {
         ;
      }

      return var1;
   }

   public final void b() {
      synchronized(this){}

      try {
         dealloc(this.b);
         this.b = 0L;
      } finally {
         ;
      }

   }
}
