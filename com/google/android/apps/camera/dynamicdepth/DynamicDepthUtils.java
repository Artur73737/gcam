package com.google.android.apps.camera.dynamicdepth;

import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.io.File;

public class DynamicDepthUtils {
   public static final .pds a = .pds.h("com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils");
   private final boolean b;
   private final String c;
   private final String d;
   private boolean e = false;
   private final .mve f;

   public DynamicDepthUtils(boolean var1, .otw var2, .mve var3) {
      this.b = var1;
      this.f = var3;
      String var4;
      if (var1 && var2.h()) {
         var4 = ((File)var2.c()).getAbsolutePath();
         this.d = var4;
         var4 = (new File(var4, "ddc_opencl_cache.bin")).getAbsolutePath();
      } else {
         var4 = zBdGS.SRmvMQgqDKbDhdS;
         this.d = var4;
      }

      this.c = var4;
   }

   private static native boolean createDynamicDepthFromPdImpl(long var0, long var2, long var4, long var6);

   public static native boolean createDynamicDepthFromUltradepthImpl(long var0, long var2, long var4, long var6, boolean var8, long var9);

   public static byte[] d(byte[] var0, DynamicDepthResult var1, .jbb var2) {
      long var5 = var1.a;
      long var3;
      if (var2 == null) {
         var3 = 0L;
      } else {
         var3 = var2.a();
      }

      byte[] var8 = writeDynamicDepthIntoJpegStreamImpl(var0, var5, var3);
      if (var8 != null) {
         .pei var7 = .pet.a;
         return var8;
      } else {
         return null;
      }
   }

   private static native void initializePdImpl(boolean var0, String var1, int var2);

   public static native void savePdCacheImpl();

   private static native byte[] writeDynamicDepthIntoJpegStreamImpl(byte[] var0, long var1, long var3);

   public final Runnable a() {
      synchronized(this){}

      Throwable var10000;
      label297: {
         boolean var2;
         boolean var3;
         .ekp var4;
         boolean var10001;
         String var26;
         label291: {
            try {
               if (!this.e) {
                  .fsc.a();
                  var2 = this.b;
                  var26 = this.c;
                  var3 = this.f.d();
                  break label291;
               }
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label297;
            }

            try {
               var4 = .ekp.g;
               return var4;
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label297;
            }
         }

         byte var1 = 2;
         if (!var3) {
            label279: {
               try {
                  if (this.f.e() || this.f.g() || this.f.f()) {
                     break label279;
                  }

                  .mve var5 = this.f;
                  if (var5.c || var5.h()) {
                     break label279;
                  }
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label297;
               }

               var1 = 3;
            }
         }

         label265:
         try {
            initializePdImpl(var2, var26, var1 - 1);
            this.e = true;
            var4 = .ekp.f;
            return var4;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label265;
         }
      }

      Throwable var27 = var10000;
      throw var27;
   }

   public final boolean b(.mvx var1, .mvx var2, DynamicDepthResult var3, ShotMetadata var4) {
      synchronized(this){}

      boolean var5;
      try {
         .pvp var6 = new .pvp();
         .otw var9 = var6.a(var1);
         if (!var9.h()) {
            ((.pdq)((.pdq)a.b().g(.pet.a, "CAM_DynDepthUtils")).I(1112)).q("Error converting the PD image.");
            return false;
         }

         Object var10 = var9.c();
         YuvWriteView var11 = var6.c(var2);
         var5 = this.c((RawWriteView)var10, var11, var3, var4);
      } finally {
         ;
      }

      return var5;
   }

   public final boolean c(RawWriteView var1, YuvWriteView var2, DynamicDepthResult var3, ShotMetadata var4) {
      synchronized(this){}

      boolean var5;
      try {
         Runnable var6 = this.a();
         var5 = createDynamicDepthFromPdImpl(RawWriteView.c(var1), YuvWriteView.c(var2), ShotMetadata.a(var4), var3.a);
         var6.run();
      } finally {
         ;
      }

      return var5;
   }
}
