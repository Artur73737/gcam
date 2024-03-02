package com.google.android.libraries.oliveoil.natives;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.libraries.oliveoil.util.JniUtil;
import java.nio.ByteBuffer;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public class BitmapNativeBuffer extends .njf {
   private final Bitmap b;
   private int c;
   private ByteBuffer d;

   public BitmapNativeBuffer(Bitmap var1) {
      super(new .new(.ncr.d(var1.getWidth(), var1.getHeight()), var1.getRowBytes() * 8));
      boolean var3 = false;
      this.c = 0;
      if (var1.getConfig() == Config.ARGB_8888) {
         var3 = true;
      }

      .onk.w(var3);
      this.b = var1;
      int var2 = JniUtil.a;
   }

   private static native ByteBuffer lockBitmapPixels(Bitmap var0);

   private static native void unlockBitmapPixels(Bitmap var0);

   public final ByteBuffer a() {
      synchronized(this){}

      Throwable var10000;
      label180: {
         int var1;
         boolean var10001;
         try {
            var1 = this.c++;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label180;
         }

         if (var1 == 0) {
            try {
               this.d = lockBitmapPixels(this.b);
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label180;
            }
         }

         ByteBuffer var2;
         try {
            var2 = this.d;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label180;
         }

         if (var2 != null) {
            return var2;
         }

         label164:
         try {
            --this.c;
            RuntimeException var24 = new RuntimeException(DzzpnVggahPIX.DzFcSYjbAD);
            throw var24;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label164;
         }
      }

      Throwable var23 = var10000;
      throw var23;
   }

   public final void b() {
      synchronized(this){}

      Throwable var10000;
      label148: {
         boolean var10001;
         boolean var2;
         label142: {
            label141: {
               try {
                  if (this.d != null) {
                     break label141;
                  }
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label148;
               }

               var2 = false;
               break label142;
            }

            var2 = true;
         }

         int var1;
         try {
            .onk.H(var2);
            var1 = this.c - 1;
            this.c = var1;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label148;
         }

         if (var1 != 0) {
            return;
         }

         label131:
         try {
            unlockBitmapPixels(this.b);
            this.d = null;
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label131;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public final .njj c() {
      return new .niz(this);
   }

   public final void close() {
   }
}
