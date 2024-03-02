package com.google.android.apps.camera.rectiface.jni;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import android.support.constraint.Pv.bmSypa;
import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.imageio.JpgHelper;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.File;
import java.io.FileOutputStream;

public final class RectifaceImpl implements .jas, .mhq {
   private static final .pds a;
   private final .flx b;
   private long c = 0L;
   private long d = 0L;
   private boolean e = false;
   private int f;
   private final .iwt g;
   private final .mdq h;
   private final .iwm i;

   static {
      a = .pds.h(bmSypa.ZQCPEUNFtU);
      .jbc.a();
   }

   public RectifaceImpl(.iwm var1, .iwt var2, .mdq var3, .flx var4) {
      this.i = var1;
      this.g = var2;
      this.h = var3;
      this.b = var4;
   }

   private static native void copyRgbaToRgbImpl(long var0, long var2, long var4, boolean var6);

   private static native String correctFaceDistortionAHWBImpl(HardwareBuffer var0, long var1, long var3, long var5, long var7, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, long var16, Rectiface$RectifaceCallback var18, long var19);

   private static native String correctFaceDistortionImpl(long var0, long var2, long var4, long var6, long var8, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, long var16, Rectiface$RectifaceCallback var18, long var19);

   private static native boolean correctLensDistortionAHWBZeroCopyImpl(HardwareBuffer var0, HardwareBuffer var1, long var2, long var4);

   private static native boolean correctLensDistortionImpl(Bitmap var0, long var1);

   private static native long initializeLensCorrectionImpl(int var0, int var1);

   private static native long initializeSegmenterImpl(long var0, int var2, String var3, String var4, int var5);

   private final void l(HardwareBuffer var1, ShotMetadata var2, int var3, String var4) {
      LockedHardwareBuffer var13 = LockedHardwareBuffer.c(var1, 2L);

      try {
         InterleavedReadViewU8 var5 = var13.a();
         InterleavedImageU8 var6 = new InterleavedImageU8(var5.d(), var5.c(), var5.b());
         ImageUtils.a(var5, var6.f());
         this.m(var6.e(), var2, var3, var4);
      } catch (Throwable var12) {
         try {
            var13.close();
         } catch (Throwable var11) {
            .c.C(var12, var11);
            throw var12;
         }

         throw var12;
      }

      var13.close();
   }

   private final void m(InterleavedReadViewU8 var1, ShotMetadata var2, int var3, String var4) {
      int var5;
      boolean var10001;
      label189: {
         try {
            if (this.b.m(.fmd.bH)) {
               var5 = .pwm.f(var2.e());
               .pwm.j(var2, 60);
               break label189;
            }
         } catch (Exception var31) {
            var10001 = false;
            return;
         }

         var5 = 0;
      }

      .otw var33;
      Path var6;
      try {
         var6 = Paths.get("sdcard", "DCIM", "CAMERA");
         Files.createDirectories(var6);
         JpgEncodeOptions var7 = new JpgEncodeOptions();
         GcamModuleJNI.JpgEncodeOptions_quality_set(var7.a, var7, 80);
         var7.b(var2);
         var33 = JpgHelper.a(var1, var7, var5);
      } catch (Exception var30) {
         var10001 = false;
         return;
      }

      String var32;
      switch(var3 - 1) {
      case 0:
         var32 = "rectiface_input";
         break;
      default:
         var32 = "rectiface_output";
      }

      FileOutputStream var34;
      try {
         StringBuilder var38 = new StringBuilder();
         var38.append(var4);
         var38.append("_");
         var38.append(var32);
         var38.append(".jpg");
         File var37 = Files.createFile(var6.resolve(var38.toString())).toFile();
         var34 = new FileOutputStream(var37);
      } catch (Exception var29) {
         var10001 = false;
         return;
      }

      try {
         var34.write((byte[])var33.c());
      } catch (Throwable var28) {
         Throwable var35 = var28;

         try {
            var34.close();
         } catch (Throwable var26) {
            Throwable var36 = var26;

            label164:
            try {
               .c.C(var35, var36);
               break label164;
            } catch (Exception var25) {
               var10001 = false;
               return;
            }
         }

         try {
            throw var35;
         } catch (Exception var24) {
            var10001 = false;
            return;
         }
      }

      try {
         var34.close();
      } catch (Exception var27) {
         var10001 = false;
      }
   }

   private static final void n(ShotMetadata var0) {
      var0.h("Skipped Rectiface since the module is not initialized.");
      ((.pdq)a.c().I(3465)).t("%s", "Skipped Rectiface since the module is not initialized.");
   }

   private static native void releaseSegmenterImpl(long var0);

   public final .jbb a() {
      RectifaceWarpfieldImpl var2 = new RectifaceWarpfieldImpl();
      if (var2.b == 0L) {
         var2.b = RectifaceWarpfieldImpl.initializeImpl();
      }

      ((.pdq)RectifaceWarpfieldImpl.a.c().I(3470)).q("Ignored Rectiface warpfield re-initialization.");
      boolean var1;
      if (var2.b != 0L) {
         var1 = true;
      } else {
         var1 = false;
      }

      .onk.I(var1, "Invalid rectiface warpfield.");
      return var2;
   }

   public final void b(Bitmap var1, ShotMetadata var2) {
      var1.getClass();
      if (!correctLensDistortionImpl(var1, ShotMetadata.a(var2))) {
         ((.pdq)a.b().I(3461)).q("Lens correction failed.");
      }

   }

   public final void c() {
      boolean var2;
      label37: {
         long var3 = this.c;
         var2 = false;
         if (var3 == 0L) {
            .iwm var5 = this.i;
            if (var5 != null) {
               if (var5.a() == 0L && this.e()) {
                  ((.pdq)a.c().I(3464)).q("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                  this.i.b();
               }

               var3 = this.i.a();
               String var7 = Build.MANUFACTURER;
               var7.getClass();
               String var6 = Build.DEVICE;
               var6.getClass();
               this.c = initializeSegmenterImpl(var3, 8, var7, var6, 0);
               byte var1;
               if (this.b.m(.fml.Y) && this.b.m(.fml.u)) {
                  var1 = 1;
               } else {
                  var1 = 0;
               }

               this.f = var1;
               this.d = initializeLensCorrectionImpl(8, var1);
               break label37;
            }
         }

         ((.pdq)a.c().I(3462)).q("Ignored Rectiface (Segmenter) re-initialization.");
      }

      if (this.c != 0L) {
         var2 = true;
      }

      .onk.I(var2, "Invalid segmenter.");
      if (this.g.a() == 0L && this.i()) {
         ((.pdq)a.c().I(3463)).q("Expected firefly to be initialized, but it wasn't. Initializing again.");
         this.g.d();
      }

      this.e = true;
   }

   public final void close() {
      this.e = false;
      long var1 = this.c;
      if (var1 != 0L) {
         releaseSegmenterImpl(var1);
         this.c = 0L;
      }

      var1 = this.d;
      if (var1 != 0L) {
         releaseSegmenterImpl(var1);
         this.d = 0L;
      }

   }

   public final boolean d(HardwareBuffer var1, HardwareBuffer var2, ShotMetadata var3) {
      if ((this.f != 1 || var1.getFormat() == 35) && (this.f != 0 || var1.getFormat() == 1)) {
         var1.getClass();
         return correctLensDistortionAHWBZeroCopyImpl(var1, var2, ShotMetadata.a(var3), this.d);
      } else {
         ((.pdq)a.c().I(3469)).q("Lens distortion correction skipped because of format mismatch.");
         return false;
      }
   }

   public final boolean e() {
      return this.b.m(.fmu.i);
   }

   public final void f(HardwareBuffer var1, ShotMetadata var2, boolean var3, boolean var4, String var5, .jbb var6, .jqk var7, Rectiface$RectifaceCallback var8, InterleavedWriteViewU8 var9) {
      if (!this.e) {
         n(var2);
      } else if (this.b.m(.fmu.b)) {
         boolean var12;
         if (!var5.isEmpty()) {
            if (this.b.m(.fmu.h)) {
               var12 = true;
            } else {
               var12 = false;
            }
         } else {
            var12 = false;
         }

         Boolean var29 = var12;
         if (var29) {
            this.l(var1, new ShotMetadata(var2), 1, var5);
         }

         RectifaceOutput var28 = new RectifaceOutput();
         long var24 = ShotMetadata.a(var2);
         long var20 = this.c;
         long var18 = ((RectifaceWarpfieldImpl)var6).b;
         long var22 = this.g.a();
         boolean var14 = this.k();
         boolean var13 = this.j(var2);
         .flx var34 = this.b;
         int var10 = .flo.a;
         var34.c();
         boolean var15 = this.b.m(.fmu.e);
         if (!this.b.m(.fmu.f)) {
            if (var3) {
               var3 = true;
            } else {
               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (!this.b.m(.fmu.g) && this.e()) {
            if (!(Boolean)this.h.eZ()) {
               var12 = true;
            } else {
               var12 = false;
            }
         } else {
            var12 = true;
         }

         long var26 = var28.a;
         long var16;
         if (var9 == null) {
            var16 = 0L;
         } else {
            var16 = InterleavedWriteViewU8.a(var9);
         }

         correctFaceDistortionAHWBImpl(var1, var24, var20, var18, var22, var14, var13, var4, false, var15, var3, var12, var26, var8, var16);
         if (var29) {
            this.l(var1, new ShotMetadata(var2), 2, var5);
         }

         if (var7 != null) {
            .qfi var30 = .plh.k.O();
            var10 = .osh.bg()[var28.j()];
            if (!var30.b.ad()) {
               var30.p();
            }

            .plh var31 = (.plh)var30.b;
            if (var10 == 0) {
               throw null;
            }

            var31.b = var10 - 1;
            var31.a |= 1;
            var10 = var28.d();
            if (!var30.b.ad()) {
               var30.p();
            }

            var31 = (.plh)var30.b;
            var31.a |= 2;
            var31.e = var10;
            var10 = var28.g();
            if (!var30.b.ad()) {
               var30.p();
            }

            var31 = (.plh)var30.b;
            var31.a |= 16;
            var31.g = var10;
            var10 = var28.i();
            if (!var30.b.ad()) {
               var30.p();
            }

            var31 = (.plh)var30.b;
            var31.a |= 8;
            var31.f = var10;
            var10 = var28.h();
            if (!var30.b.ad()) {
               var30.p();
            }

            var31 = (.plh)var30.b;
            var31.a |= 64;
            var31.h = var10;
            var3 = RectifaceOutput.getIsAnglerfishAppliedImpl(var28.a);
            if (!var30.b.ad()) {
               var30.p();
            }

            var31 = (.plh)var30.b;
            var31.a |= 128;
            var31.i = var3;
            if (var28.f() > 0) {
               for(var10 = 0; var10 < var28.f(); ++var10) {
                  var30.D(var28.b(var10));
               }
            }

            if (var28.e() > 0) {
               for(var10 = 0; var10 < var28.e(); ++var10) {
                  var30.C(var28.a(var10));
               }
            }

            if (var28.c() > 0) {
               for(var10 = 0; var10 < var28.c(); ++var10) {
                  int var11 = RectifaceOutput.getAnglerfishFallbackStatusImpl(var28.a, var10);
                  var11 = (new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})[var11];
                  if (!var30.b.ad()) {
                     var30.p();
                  }

                  .plh var33 = (.plh)var30.b;
                  if (var11 == 0) {
                     throw null;
                  }

                  .qfu var32 = var33.j;
                  if (!var32.c()) {
                     var33.j = .qfn.T(var32);
                  }

                  var33.j.g(var11 - 1);
               }
            }

            var7.p = (.plh)var30.i();
         }

         var28.k();
      }
   }

   public final void g(InterleavedWriteViewU8 var1, ShotMetadata var2, boolean var3, boolean var4, String var5, .jbb var6, .jqk var7, Rectiface$RectifaceCallback var8, InterleavedWriteViewU8 var9) {
      if (!this.e) {
         n(var2);
      } else if (this.b.m(.fmu.b)) {
         boolean var25;
         if (!var5.isEmpty()) {
            if (this.b.m(.fmu.h)) {
               var25 = true;
            } else {
               var25 = false;
            }
         } else {
            var25 = false;
         }

         Boolean var30 = var25;
         if (var30) {
            this.m(var1.b(), new ShotMetadata(var2), 1, var5);
         }

         RectifaceOutput var29 = new RectifaceOutput();
         long var17 = InterleavedWriteViewU8.a(var1);
         long var19 = ShotMetadata.a(var2);
         long var23 = this.c;
         long var13 = ((RectifaceWarpfieldImpl)var6).b;
         long var15 = this.g.a();
         boolean var28 = this.k();
         boolean var26 = this.j(var2);
         boolean var27 = this.b.m(.fmu.e);
         if (!this.b.m(.fmu.f)) {
            if (var3) {
               var3 = true;
            } else {
               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (!this.b.m(.fmu.g)) {
            if (!this.e()) {
               var25 = true;
            } else {
               var25 = false;
            }
         } else {
            var25 = true;
         }

         long var21 = var29.a;
         long var11;
         if (var9 == null) {
            var11 = 0L;
         } else {
            var11 = InterleavedWriteViewU8.a(var9);
         }

         String var34 = correctFaceDistortionImpl(var17, var19, var23, var13, var15, var28, var26, var4, var27, var3, var25, var21, var8, var11);
         if (var30) {
            this.m(var1.b(), new ShotMetadata(var2), 2, var5);
         }

         var2.h(var34);
         if (var7 != null) {
            .qfi var31 = .plh.k.O();
            int var10 = .osh.bg()[var29.j()];
            if (!var31.b.ad()) {
               var31.p();
            }

            .plh var32 = (.plh)var31.b;
            if (var10 == 0) {
               throw null;
            }

            var32.b = var10 - 1;
            var32.a |= 1;
            var10 = var29.d();
            if (!var31.b.ad()) {
               var31.p();
            }

            var32 = (.plh)var31.b;
            var32.a |= 2;
            var32.e = var10;
            var10 = var29.g();
            if (!var31.b.ad()) {
               var31.p();
            }

            var32 = (.plh)var31.b;
            var32.a |= 16;
            var32.g = var10;
            var10 = var29.i();
            if (!var31.b.ad()) {
               var31.p();
            }

            var32 = (.plh)var31.b;
            var32.a |= 8;
            var32.f = var10;
            var10 = var29.h();
            if (!var31.b.ad()) {
               var31.p();
            }

            var32 = (.plh)var31.b;
            var32.a |= 64;
            var32.h = var10;
            if (var29.f() > 0) {
               for(var10 = 0; var10 < var29.f(); ++var10) {
                  var31.D(var29.b(var10));
               }
            }

            if (var29.e() > 0) {
               float[] var33 = new float[var29.e()];

               for(var10 = 0; var10 < var29.e(); ++var10) {
                  var31.C(var29.a(var10));
               }
            }

            var7.p = (.plh)var31.i();
         }

         var29.k();
      }
   }

   public final InterleavedImageU8 h(HardwareBuffer var1) {
      int var2 = var1.getFormat();
      boolean var4 = false;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.x(var3, gREaEL.PkFouDB);
      LockedHardwareBuffer var5 = LockedHardwareBuffer.c(var1, 2L);

      InterleavedImageU8 var7;
      label720: {
         Throwable var10000;
         label721: {
            InterleavedReadViewU8 var8;
            boolean var10001;
            label714: {
               label713: {
                  try {
                     var8 = var5.a();
                     if (var8.b() == 4) {
                        break label713;
                     }
                  } catch (Throwable var64) {
                     var10000 = var64;
                     var10001 = false;
                     break label721;
                  }

                  var3 = false;
                  break label714;
               }

               var3 = true;
            }

            InterleavedWriteViewU8 var6;
            label706: {
               label705: {
                  try {
                     .onk.w(var3);
                     var7 = new InterleavedImageU8(var8.d(), var8.c(), 3);
                     var6 = var7.f();
                     if (var8.b() == 4) {
                        break label705;
                     }
                  } catch (Throwable var63) {
                     var10000 = var63;
                     var10001 = false;
                     break label721;
                  }

                  var3 = false;
                  break label706;
               }

               var3 = true;
            }

            label698: {
               label697: {
                  try {
                     .onk.x(var3, "Expect srcBuffer in RGBA8 format.");
                     if (GcamModuleJNI.InterleavedWriteViewU8_channels(var6.a, var6) == 3) {
                        break label697;
                     }
                  } catch (Throwable var62) {
                     var10000 = var62;
                     var10001 = false;
                     break label721;
                  }

                  var3 = false;
                  break label698;
               }

               var3 = true;
            }

            label690: {
               label689: {
                  try {
                     .onk.x(var3, "Expect dstBuffer in RGB8 format.");
                     if (var8.d() != GcamModuleJNI.InterleavedWriteViewU8_width(var6.a, var6)) {
                        break label689;
                     }
                  } catch (Throwable var61) {
                     var10000 = var61;
                     var10001 = false;
                     break label721;
                  }

                  var3 = true;
                  break label690;
               }

               var3 = false;
            }

            label682: {
               label681: {
                  try {
                     .onk.w(var3);
                     if (var8.c() == GcamModuleJNI.InterleavedWriteViewU8_height(var6.a, var6)) {
                        break label681;
                     }
                  } catch (Throwable var60) {
                     var10000 = var60;
                     var10001 = false;
                     break label721;
                  }

                  var3 = var4;
                  break label682;
               }

               var3 = true;
            }

            label675:
            try {
               .onk.w(var3);
               copyRgbaToRgbImpl(var8.a, InterleavedWriteViewU8.a(var6), this.c, this.e);
               break label720;
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label675;
            }
         }

         Throwable var65 = var10000;

         try {
            var5.close();
         } catch (Throwable var58) {
            .c.C(var65, var58);
            throw var65;
         }

         throw var65;
      }

      var5.close();
      var1.close();
      return var7;
   }

   public final boolean i() {
      return this.b.m(.fmu.c);
   }

   public final boolean j(ShotMetadata var1) {
      boolean var2;
      if ((Integer)this.b.a(.fmu.a).get() == 2 && var1.f().b() == .pue.c) {
         var2 = true;
      } else {
         var2 = false;
      }

      return !this.b.m(.fmu.d) || var2;
   }

   public final boolean k() {
      if (this.i() && this.e()) {
         return !(Boolean)this.h.eZ();
      } else {
         return true;
      }
   }
}
