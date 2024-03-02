package androidx.wear.ambient;

import com.google.android.wearable.compat.WearableActivityController;
import java.util.concurrent.atomic.AtomicInteger;

public final class AmbientModeSupport$AmbientController {
   public final Object a;

   public AmbientModeSupport$AmbientController(Object var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public AmbientModeSupport$AmbientController(Object var1, byte[] var2) {
      this.a = var1;
   }

   public final void a() {
      ((.hdv)this.a).b.r = true;
   }

   public final void b(Exception param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c() {
      ((.jnb)((.jml)this.a).d.get()).k();
   }

   public final void d() {
      ((.jml)this.a).e(false);
   }

   public final void e() {
      ((.jml)this.a).e(true);
   }

   public final void f(.jlm var1, .jln var2) {
      .mzx.bP((.psd)this.a, new .efh(var1, var2, 9), .pre.a);
   }

   public final .mdh g() {
      return .mdl.g(((.ixm)this.a).b);
   }

   public final .mdh h() {
      return ((.ixm)this.a).a;
   }

   public final void i(.kej var1) {
      Object var2 = this.a;
      if (!var1.equals(.kfq.e())) {
         ((.iby)var2).b(var1);
      }

   }

   public final boolean isAmbient() {
      AmbientDelegate var1 = ((AmbientModeSupport)this.a).a;
      return var1 == null ? false : var1.h();
   }

   public final void j(.ksm var1) {
      Object var4 = this.a;
      Object var2 = ((.hua)var4).c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label808: {
         try {
            if (((.hua)var4).l == var1) {
               return;
            }
         } catch (Throwable var96) {
            var10000 = var96;
            var10001 = false;
            break label808;
         }

         label812: {
            Object var3;
            .mbx var5;
            .grq var6;
            try {
               var3 = ((.kpe)((.hua)var4).i).a().e;
               if (((.hua)var4).l != .ksm.f && var1 == .ksm.f) {
                  var5 = ((.hua)var4).g;
                  var6 = new .grq(var4, var3, var1, 11, (byte[])null);
                  var5.c(var6);
                  break label812;
               }
            } catch (Throwable var95) {
               var10000 = var95;
               var10001 = false;
               break label808;
            }

            .ksm var98;
            .ksm var100;
            try {
               var98 = ((.hua)var4).l;
               var100 = .ksm.c;
            } catch (Throwable var94) {
               var10000 = var94;
               var10001 = false;
               break label808;
            }

            if (var98 != var100 && var1 == var100) {
               try {
                  .mbx var101 = ((.hua)var4).g;
                  .grq var99 = new .grq(var4, var3, var1, 12, (byte[])null);
                  var101.c(var99);
               } catch (Throwable var93) {
                  var10000 = var93;
                  var10001 = false;
                  break label808;
               }
            } else {
               try {
                  var100 = .ksm.n;
               } catch (Throwable var92) {
                  var10000 = var92;
                  var10001 = false;
                  break label808;
               }

               if (var98 != var100 && var1 == var100) {
                  try {
                     var5 = ((.hua)var4).g;
                     var6 = new .grq(var4, var3, var1, 13, (byte[])null);
                     var5.c(var6);
                  } catch (Throwable var91) {
                     var10000 = var91;
                     var10001 = false;
                     break label808;
                  }
               } else {
                  try {
                     ((.hua)var4).l = var1;
                  } catch (Throwable var90) {
                     var10000 = var90;
                     var10001 = false;
                     break label808;
                  }
               }
            }
         }

         label773:
         try {
            return;
         } catch (Throwable var89) {
            var10000 = var89;
            var10001 = false;
            break label773;
         }
      }

      while(true) {
         Throwable var97 = var10000;

         try {
            throw var97;
         } catch (Throwable var88) {
            var10000 = var88;
            var10001 = false;
            continue;
         }
      }
   }

   public final void k() {
      .fnu var1 = (.fnu)this.a;
      if (((AtomicInteger)var1.a).decrementAndGet() == 0) {
         ((.gfw)var1.b).c();
      }

   }

   public final void setAmbientOffloadEnabled(boolean var1) {
      AmbientDelegate var2 = ((AmbientModeSupport)this.a).a;
      if (var2 != null) {
         var2.setAmbientOffloadEnabled(var1);
      }

   }

   public final void setAutoResumeEnabled(boolean var1) {
      AmbientDelegate var2 = ((AmbientModeSupport)this.a).a;
      if (var2 != null) {
         Object var3 = var2.a;
         if (var3 != null) {
            ((WearableActivityController)var3).setAutoResumeEnabled(var1);
         }
      }

   }
}
