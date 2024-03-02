package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import java.util.Collection;

public final class MomentsUtils {
   public static .psd a(.mlh var0) {
      .psq var1 = .psq.g();
      var0.k(new .hxk(var1));
      return var1;
   }

   public static native HardwareBuffer allocateHardwareBuffer(int var0, int var1, int var2, int var3, long var4);

   public static boolean b(.huy var0, .izv var1, Collection var2) {
      if (!var0.f().h() && !var0.e().h()) {
         return false;
      } else if (var2.size() <= 0) {
         return true;
      } else {
         if (var0.f().h()) {
            var0.f().c();
         }

         if (var0.a() < 0.0F) {
            return false;
         } else {
            return var1.a(var0.d(), var2, true).a > 0.07F;
         }
      }
   }

   public static boolean c(.huy var0, float var1, .izv var2, Collection var3) {
      if (var3.size() < 2) {
         return true;
      } else {
         if (var0.f().h()) {
            var0.f().c();
         }

         if (var0.a() - var1 < -0.02F) {
            return false;
         } else {
            return var2.a(var0.d(), var3, false).a > 0.07F;
         }
      }
   }

   public static native long yuv2hwyuv(int var0, int var1, ByteBuffer var2, int var3, int var4, ByteBuffer var5, int var6, int var7, ByteBuffer var8, int var9, int var10, HardwareBuffer var11);
}
