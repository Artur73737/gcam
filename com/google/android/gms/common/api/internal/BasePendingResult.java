package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public abstract class BasePendingResult extends .llb {
   public static final ThreadLocal b = new .llt();
   private final Object a = new Object();
   public .lle c;
   public boolean d = false;
   private final CountDownLatch e = new CountDownLatch(1);
   private final ArrayList f = new ArrayList();
   private final AtomicReference g = new AtomicReference();
   private Status h;
   private volatile boolean i;
   private boolean j;
   private volatile .mzx k;
   private .llv resultGuardian;

   @Deprecated
   BasePendingResult() {
      new .llu(Looper.getMainLooper());
      new WeakReference((Object)null);
   }

   protected BasePendingResult(.lky var1) {
      new .llu(((.lmf)var1).a.e);
      new WeakReference(var1);
   }

   public static void j(.lle var0) {
      if (var0 instanceof .llc) {
         try {
            ((.llc)var0).gh();
         } catch (RuntimeException var2) {
            String var3 = String.valueOf(String.valueOf(var0));
            Log.w(DzzpnVggahPIX.LncHCJdndqKd, "Unable to release ".concat(var3), var2);
         }
      }
   }

   protected abstract .lle a(Status var1);

   public final void e(.lla var1) {
      .mzx.de(true, "Callback cannot be null.");
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label195: {
         label189: {
            try {
               if (this.l()) {
                  var1.a(this.h);
                  break label189;
               }
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label195;
            }

            try {
               this.f.add(var1);
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label195;
            }
         }

         label180:
         try {
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label180;
         }
      }

      while(true) {
         Throwable var23 = var10000;

         try {
            throw var23;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   public final .lle f(TimeUnit param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public final void i(Status var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (!this.l()) {
               this.k(this.a(var1));
               this.j = true;
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
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

   public final void k(.lle var1) {
      Object var4 = this.a;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label442: {
         label437: {
            try {
               if (!this.j) {
                  this.l();
                  .mzx.dj(this.l() ^ true, "Results have already been set");
                  .mzx.dj(this.i ^ true, "Result has already been consumed");
                  this.c = var1;
                  this.h = var1.a();
                  this.e.countDown();
                  if (this.c instanceof .llc) {
                     .llv var47 = new .llv(this);
                     this.resultGuardian = var47;
                  }
                  break label437;
               }
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label442;
            }

            try {
               j(var1);
               return;
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label442;
            }
         }

         int var3;
         ArrayList var48;
         try {
            var48 = this.f;
            var3 = var48.size();
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            break label442;
         }

         for(int var2 = 0; var2 < var3; ++var2) {
            try {
               ((.lla)var48.get(var2)).a(this.h);
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label442;
            }
         }

         label416:
         try {
            this.f.clear();
            return;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            break label416;
         }
      }

      while(true) {
         Throwable var49 = var10000;

         try {
            throw var49;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean l() {
      return this.e.getCount() == 0L;
   }
}
