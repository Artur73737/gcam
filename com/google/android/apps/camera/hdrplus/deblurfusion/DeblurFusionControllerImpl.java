package com.google.android.apps.camera.hdrplus.deblurfusion;

import android.content.Context;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeblurFusionControllerImpl implements .glq {
   public static final .pds a = .pds.h("com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl");
   public final .min b;
   public final .pva c;
   public final Object d = new Object();
   public final AtomicBoolean e;
   public final AtomicBoolean f;
   public final .mcy g;
   public final .flx h;
   public final Context i;
   public final .iwm j;
   private final Executor k;
   private final .qrz l;

   public DeblurFusionControllerImpl(.iwm var1, Executor var2, .mcy var3, .min var4, .qrz var5, .flx var6, Context var7) {
      this.j = var1;
      this.k = var2;
      this.g = var3;
      this.b = var4;
      this.c = new .pva();
      this.l = var5;
      this.h = var6;
      this.e = new AtomicBoolean(false);
      this.f = new AtomicBoolean(false);
      this.i = var7;
   }

   public static native long deblurFaceImpl(long var0, long var2, long var4, long var6, long var8, long var10, long var12, InterleavedU8ClientAllocator var14, InterleavedU8ClientAllocator var15, boolean var16, boolean var17, boolean var18, boolean var19, boolean[] var20, long[] var21, long[] var22, long[] var23, long var24, String var26, boolean var27, boolean var28, boolean var29, boolean var30, int var31, int var32, FusionProgressCallback var33, boolean var34, boolean var35);

   public static native boolean initialize(String var0, String var1, boolean var2, boolean var3);

   public static native boolean loadModelIntoCache(byte[] var0);

   public static native int retrieveFusionType(long var0);

   public static native long retrieveReferenceDebugImage(long var0);

   public static native long retrieveResultImage(long var0);

   public static native int retrieveResultStatus(long var0);

   public static native long retrieveSourceDebugImage(long var0);

   public static native long retrieveWarpedReferenceDebugImage(long var0);

   public final String a() {
      .otw var1 = ((.gxx)this.l).a();
      return var1.h() ? ((File)var1.c()).getAbsolutePath() : "";
   }

   public final void b() {
      this.k.execute(new .gki(this));
   }

   public final void c(long var1, long var3, int var5, FusionProgressCallback var6, ShotMetadata var7, String var8, boolean var9, boolean var10) {
      this.b.e("retrieveImage");
      if (var3 == -1L) {
         this.b.f();
         ((.pdq)((.pdq)a.c().g(.pet.a, "FalconController")).I(1493)).t("Does not save debug image due to fallback %s", var8);
      } else {
         .otw var11 = this.c.a(var3);
         if (!var11.h()) {
            this.b.f();
            ((.pdq)((.pdq)a.c().g(.pet.a, "FalconController")).I(1492)).t("Error retrieving debug image %s", var8);
         } else {
            if (var5 != 0 && !var10) {
               ((InterleavedImageU8)var11.c()).g();
            } else if (var9) {
               this.b.g("onOriginalImage");
               var6.b(var1, (InterleavedImageU8)var11.c(), new ShotMetadata(var7));
            } else {
               this.b.g("onDebugImage");
               var6.d((InterleavedImageU8)var11.c(), new ShotMetadata(var7), var8);
            }

            this.b.f();
         }
      }
   }

   public final .psd d(long var1, .ich var3, .glp var4, .glp var5, FusionProgressCallback var6, .mhs var7) {
      this.f();
      if (var4.a.isEmpty() || ((RawReadView)var4.a.get()).b()) {
         ((.pdq)((.pdq)a.b().g(.pet.a, "FalconController")).I(1481)).q("Empty primary raw image.");
      }

      if (var5.a.isEmpty() || ((RawReadView)var5.a.get()).b()) {
         ((.pdq)((.pdq)a.b().g(.pet.a, "FalconController")).I(1482)).q("Empty secondary raw image.");
      }

      .pei var8 = .pet.a;
      .psq var9 = .psq.g();
      this.k.execute(new .gkj(this, var9, var1, var4, var5, var3, var7, var6));
      var9.c(new .gcr(this, 13), .pre.a);
      return var9;
   }

   public final void e(.gdy var1, .jfi var2) {
      var1.c(var2.f().a, .gdr.k);
      var2.ab().b();
   }

   public final void f() {
      .flx var2 = this.h;
      String var1 = .flv.a;
      var2.e();
   }

   public final int g(int var1) {
      switch(var1) {
      case 1:
         return 2;
      case 2:
         return 4;
      default:
         return 1;
      }
   }

   public final int h(int var1) {
      switch(var1) {
      case 0:
         return 2;
      case 1:
         return 3;
      case 2:
         return 5;
      case 3:
         return 6;
      case 4:
         return 7;
      case 5:
         return 8;
      case 6:
         return 9;
      case 7:
         return 10;
      case 8:
         return 11;
      case 9:
         return 12;
      case 10:
         return 13;
      case 11:
         return 14;
      case 12:
         return 15;
      case 13:
         return 16;
      case 14:
         return 17;
      case 15:
         return 18;
      case 16:
         return 19;
      case 17:
         return 20;
      case 18:
         return 21;
      case 19:
         return 22;
      default:
         return 4;
      }
   }
}
