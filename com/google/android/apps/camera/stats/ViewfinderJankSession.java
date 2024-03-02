package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.ArrayList;
import java.util.List;

public class ViewfinderJankSession implements TimingSession {
   public final Object a = new Object();
   public final List b = new ArrayList(30);
   public final List c = new ArrayList();
   public int d = 0;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   private .pls h;
   private Runnable i;

   public static final .pls c(.mvq var0, double var1, double var3) {
      .qfi var8 = .pls.i.O();
      long var6 = SystemClock.elapsedRealtimeNanos();
      if (!var8.b.ad()) {
         var8.p();
      }

      .pls var9 = (.pls)var8.b;
      var9.a |= 1;
      var9.b = var6;
      var6 = var0.b();
      if (!var8.b.ad()) {
         var8.p();
      }

      var9 = (.pls)var8.b;
      var9.a |= 4;
      var9.d = var6;
      Long var10 = (Long)var0.d(CaptureResult.SENSOR_TIMESTAMP);
      Long var13 = (Long)var0.d(CaptureResult.SENSOR_FRAME_DURATION);
      Long var11 = (Long)var0.d(CaptureResult.SENSOR_EXPOSURE_TIME);
      if (var10 != null) {
         var6 = var10;
         if (!var8.b.ad()) {
            var8.p();
         }

         .pls var14 = (.pls)var8.b;
         var14.a |= 2;
         var14.c = var6;
      }

      int var5;
      if (var13 != null) {
         var5 = .jbc.ae(var13);
         if (!var8.b.ad()) {
            var8.p();
         }

         var9 = (.pls)var8.b;
         var9.a |= 8;
         var9.e = var5;
      }

      .pls var12;
      if (var11 != null) {
         var5 = .jbc.ae(var11);
         if (!var8.b.ad()) {
            var8.p();
         }

         var12 = (.pls)var8.b;
         var12.a |= 16;
         var12.f = var5;
      }

      if (var1 > 0.0D) {
         var5 = .jbc.ad(var1);
         if (!var8.b.ad()) {
            var8.p();
         }

         var12 = (.pls)var8.b;
         var12.a |= 64;
         var12.h = var5;
      }

      if (var3 > 0.0D) {
         var5 = .jbc.ad(var3);
         if (!var8.b.ad()) {
            var8.p();
         }

         var12 = (.pls)var8.b;
         var12.a |= 32;
         var12.g = var5;
      }

      return (.pls)var8.i();
   }

   public final void a(.pls var1) {
      if (this.h == null) {
         this.h = var1;
      }

   }

   public final void b(Runnable var1) {
      this.i = var1;
   }

   public final void close() {
      Runnable var1 = this.i;
      if (var1 != null) {
         var1.run();
      }

   }

   public int getDelay150PctCount() {
      return this.f;
   }

   public int getDelay500PctCount() {
      return this.g;
   }

   public int getDelay50PctCount() {
      return this.e;
   }
}
