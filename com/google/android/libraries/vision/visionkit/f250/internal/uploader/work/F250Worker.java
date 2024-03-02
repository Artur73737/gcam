package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class F250Worker extends CoroutineWorker {
   public final .myd h;
   public final .occ i;
   public final .ofl j;
   public final .odh k;
   private final .oam l;
   private final .odn m;
   private final int n;
   private final .qzr o;

   public F250Worker(.myd var1, .occ var2, .oam var3, .ofl var4, .odh var5, .odn var6, int var7, .qzr var8, Context var9, WorkerParameters var10) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      var6.getClass();
      var8.getClass();
      var9.getClass();
      var10.getClass();
      super(var9, var10);
      this.h = var1;
      this.i = var2;
      this.l = var3;
      this.j = var4;
      this.k = var5;
      this.m = var6;
      this.n = var7;
      this.o = var8;
   }

   public final Object b(.que var1) {
      .oec var6;
      label20: {
         if (var1 instanceof .oec) {
            .oec var3 = (.oec)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var6 = var3;
               break label20;
            }
         }

         var6 = new .oec(this, var1);
      }

      Object var8 = var6.a;
      .qul var4 = .qul.a;
      Object var7;
      switch(var6.c) {
      case 0:
         .pwm.bs(var8);
         .qzr var5 = this.o;
         .oee var9 = new .oee(this, (.que)null);
         var6.c = 1;
         var8 = .qwo.k(var5, var9, var6);
         var7 = var8;
         if (var8 == var4) {
            return var4;
         }
         break;
      case 1:
         .pwm.bs(var8);
         var7 = var8;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var7.getClass();
      return var7;
   }

   public final Object h(.odg var1, .que var2) {
      .oef var18;
      label197: {
         if (var2 instanceof .oef) {
            .oef var4 = (.oef)var2;
            int var3 = var4.d;
            if ((var3 & Integer.MIN_VALUE) != 0) {
               var4.d = var3 + Integer.MIN_VALUE;
               var18 = var4;
               break label197;
            }
         }

         var18 = new .oef(this, var2);
      }

      .qtf var6;
      .qmt var8;
      Throwable var9;
      .qul var10;
      Throwable var17;
      .qtf var20;
      .odh var22;
      .odg var28;
      label216: {
         Object var5 = var18.b;
         var10 = .qul.a;
         F250Worker var21;
         switch(var18.d) {
         case 0:
            .pwm.bs(var5);
            var22 = this.k;
            var20 = .qtf.a;
            var8 = .qmt.o;

            Object var27;
            try {
               .occ var25 = this.i;
               var18.a = this;
               var18.e = var1;
               var18.f = var22;
               var18.h = var20;
               var18.i = var20;
               var18.g = var8;
               var18.d = 1;
               var27 = var25.a(var18);
            } catch (Throwable var15) {
               var28 = var1;
               var17 = var15;
               var6 = var20;
               break label216;
            }

            if (var27 == var10) {
               return var10;
            }

            var21 = this;
            var5 = var27;
            break;
         case 1:
            var8 = var18.g;
            var20 = var18.i;
            var6 = var18.h;
            .odh var7 = var18.f;
            var1 = var18.e;
            F250Worker var31 = (F250Worker)var18.a;

            try {
               .pwm.bs(var5);
            } catch (Throwable var16) {
               var22 = var7;
               var28 = var1;
               var17 = var16;
               break label216;
            }

            var21 = var31;
            break;
         case 2:
            var9 = (Throwable)var18.a;
            .pwm.bs(var5);
            throw var9;
         case 3:
            .pwm.bs(var5);
            return .qsn.a;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         List var26 = (List)var5;
         if (!var26.isEmpty()) {
            .qsg var29 = .oby.a(var26);
            var26 = (List)var29.a;
            List var30 = (List)var29.b;
            .odh var24 = var21.k;
            .nyr var19 = .odg.e(var1, var26, var30, .qmt.i, 8);
            var18.a = null;
            var18.e = null;
            var18.f = null;
            var18.h = null;
            var18.i = null;
            var18.g = null;
            var18.d = 3;
            if (var24.a(var19, var18) == var10) {
               return var10;
            }
         }

         return .qsn.a;
      }

      var9 = var17;
      if (!(var17 instanceof CancellationException)) {
         .nyr var23 = var28.a(var6, var20, var8, var17);
         var18.a = var17;
         var18.e = null;
         var18.f = null;
         var18.h = null;
         var18.i = null;
         var18.g = null;
         var18.d = 2;
         var9 = var17;
         if (var22.a(var23, var18) == var10) {
            return var10;
         }
      }

      throw var9;
   }

   public final Object i(.odg param1, .que param2) {
      // $FF: Couldn't be decompiled
   }

   public final Object j(.odg var1, .que var2) {
      .oeh var4;
      label69: {
         if (var2 instanceof .oeh) {
            var4 = (.oeh)var2;
            int var3 = var4.c;
            if ((var3 & Integer.MIN_VALUE) != 0) {
               var4.c = var3 + Integer.MIN_VALUE;
               break label69;
            }
         }

         var4 = new .oeh(this, var2);
      }

      Object var8 = var4.a;
      .qul var15 = .qul.a;
      ArrayList var5;
      F250Worker var6;
      .odg var7;
      F250Worker var9;
      .oeh var10;
      .qul var12;
      .oeh var13;
      List var14;
      .nyr var16;
      .oeh var17;
      .qsg var18;
      .odh var19;
      ArrayList var20;
      F250Worker var21;
      List var23;
      List var24;
      .qul var25;
      .qul var26;
      switch(var4.c) {
      case 0:
         .pwm.bs(var8);
         var5 = new ArrayList();
         var6 = this;
         var7 = var1;
         var13 = var4;
         break;
      case 1:
         var5 = var4.f;
         var7 = var4.e;
         var6 = var4.d;
         .pwm.bs(var8);
         var12 = var15;
         var17 = var4;
         var20 = var5;
         var21 = var6;
         var24 = (List)var8;
         if (var24.isEmpty()) {
            var9 = var21;
            var26 = var12;
            var10 = var17;
            var18 = .oby.a(var20);
            var14 = (List)var18.a;
            var23 = (List)var18.b;
            var19 = var9.k;
            var16 = .odg.e(var7, var14, var23, .qmt.b, 8);
            var10.d = null;
            var10.e = null;
            var10.f = null;
            var10.c = 2;
            if (var19.a(var16, var10) == var26) {
               return var26;
            }

            return .qsn.a;
         }

         .pwm.aJ(var20, var24);
         var25 = var12;
         var13 = var17;
         var15 = var25;
         var6 = var21;
         var5 = var20;
         break;
      case 2:
         .pwm.bs(var8);
         return .qsn.a;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      while(true) {
         var10 = var13;
         var26 = var15;
         if (!.qzy.u(var13.n())) {
            var18 = .oby.a(var5);
            var14 = (List)var18.a;
            var23 = (List)var18.b;
            var19 = var6.k;
            var16 = .odg.e(var7, var14, var23, .qmt.b, 8);
            var10.d = null;
            var10.e = null;
            var10.f = null;
            var10.c = 2;
            if (var19.a(var16, var10) == var26) {
               return var26;
            }
            break;
         }

         .ree var22 = .osh.a(.qwl.u(new .oei(var6, var7, (.que)null)), .qxb.k(var6.n - 1, 1), new .oej(var6, var7, (.que)null));
         var13.d = var6;
         var13.e = var7;
         var13.f = var5;
         var13.c = 1;
         var8 = .quy.v(var22, var13);
         if (var8 == var15) {
            return var15;
         }

         var20 = var5;
         .oeh var27 = var13;
         var21 = var6;
         var12 = var15;
         var17 = var27;
         var24 = (List)var8;
         if (var24.isEmpty()) {
            var9 = var21;
            var26 = var12;
            var10 = var17;
            var18 = .oby.a(var20);
            var14 = (List)var18.a;
            var23 = (List)var18.b;
            var19 = var9.k;
            var16 = .odg.e(var7, var14, var23, .qmt.b, 8);
            var10.d = null;
            var10.e = null;
            var10.f = null;
            var10.c = 2;
            if (var19.a(var16, var10) == var26) {
               return var26;
            }
            break;
         }

         .pwm.aJ(var20, var24);
         var25 = var12;
         var13 = var27;
         var15 = var25;
         var6 = var21;
         var5 = var20;
      }

      return .qsn.a;
   }
}
