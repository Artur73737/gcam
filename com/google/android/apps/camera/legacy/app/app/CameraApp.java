package com.google.android.apps.camera.legacy.app.app;

import android.app.NotificationManager;
import android.os.SystemClock;
import android.os.Trace;
import android.support.constraint.Pv.bmSypa;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class CameraApp extends .hhc implements HasCameraContentProviderComponent, .gzy, .jul, .gsr, .czq, .ekm, .gnu, .emg {
   private static final AtomicBoolean k;
   NotificationManager a;
   .qrz b;
   .qrz c;
   .njv d;
   .dao e;
   .ekj f;
   .fwf g;
   .eze h;
   private volatile .gnv l;
   private final .gyy m = new .gyy();
   private volatile .gzh n;

   static {
      .npq var0 = .npq.a;
      if (var0.c == 0L) {
         var0.c = SystemClock.elapsedRealtime();
         var0.l.a = true;
      }

      .jrt.d(i);
      .oyz var1 = .gtg.a;
      Object var115 = .mhw.a;
      synchronized(var115){}

      Throwable var10000;
      boolean var10001;
      label937: {
         .pdh var2;
         try {
            var2 = var1.u();
         } catch (Throwable var111) {
            var10000 = var111;
            var10001 = false;
            break label937;
         }

         while(true) {
            Class var3;
            String var4;
            String var116;
            try {
               if (!var2.hasNext()) {
                  break;
               }

               var3 = (Class)var2.next();
               var116 = bmSypa.VUdzVjxhn;
               var4 = (String).mhw.c.put(var3, var116);
            } catch (Throwable var114) {
               var10000 = var114;
               var10001 = false;
               break label937;
            }

            if (var4 != null) {
               label941: {
                  try {
                     if (var4.equals(var116)) {
                        break label941;
                     }
                  } catch (Throwable var113) {
                     var10000 = var113;
                     var10001 = false;
                     break label937;
                  }

                  try {
                     String var119 = String.valueOf(var3);
                     StringBuilder var121 = new StringBuilder();
                     var121.append("Could not register ");
                     var121.append(var119);
                     var121.append(". It was previously registered with: ");
                     var121.append(var4);
                     UnsatisfiedLinkError var117 = new UnsatisfiedLinkError(var121.toString());
                     throw var117;
                  } catch (Throwable var106) {
                     var10000 = var106;
                     var10001 = false;
                     break label937;
                  }
               }
            }

            .mhv var123;
            try {
               var123 = (.mhv).mhw.b.get(var116);
            } catch (Throwable var110) {
               var10000 = var110;
               var10001 = false;
               break label937;
            }

            if (var123 == null) {
               try {
                  Map var122 = .mhw.b;
                  var123 = new .mhv(var116);
                  var122.put(var116, var123);
               } catch (Throwable var109) {
                  var10000 = var109;
                  var10001 = false;
                  break label937;
               }
            } else {
               try {
                  if (!var123.a()) {
                     continue;
                  }
               } catch (Throwable var112) {
                  var10000 = var112;
                  var10001 = false;
                  break label937;
               }

               try {
                  UnsatisfiedLinkError var120 = new UnsatisfiedLinkError(String.format((Locale)null, "Registering \"%s\" after \"%s\" was loaded is racy.", var3.getSimpleName(), var116));
                  throw var120;
               } catch (Throwable var107) {
                  var10000 = var107;
                  var10001 = false;
                  break label937;
               }
            }
         }

         try {
            ;
         } catch (Throwable var108) {
            var10000 = var108;
            var10001 = false;
            break label937;
         }

         k = new AtomicBoolean(false);
         return;
      }

      Throwable var118;
      while(true) {
         var118 = var10000;

         try {
            break;
         } catch (Throwable var105) {
            var10000 = var105;
            var10001 = false;
            continue;
         }
      }

      throw var118;
   }

   public final .hwz a() {
      .pde var2 = new .pde();
      .dao var1 = this.e;
      var1.getClass();
      var2.a = var1;
      return new .hwz(var2);
   }

   public final .fjo b() {
      this.m.b(this);
      return this.f().b();
   }

   public final .psd c() {
      return this.m.a();
   }

   public final .fnq cameraContentProviderComponent(.fnu var1) {
      .onk.o(this.n, "initAppComponent needs to be called on main thread¬");
      .gzh var2 = this.n;
      var1.getClass();
      return new .gzi(var2.a, var1);
   }

   public final .gnv d() {
      return this.l;
   }

   public final .gst e(Class var1) {
      return (.gst)var1.cast(this.f());
   }

   public final .gzh f() {
      if (this.n == null) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label319: {
            label325: {
               int var2;
               .oyz var55;
               .fwf var62;
               try {
                  if (this.n != null) {
                     break label325;
                  }

                  Trace.beginSection("GCA_App#component");
                  Trace.beginSection("GCA_App#buildComponent");
                  .qrz var3 = .gzx.a;
                  .gtz var18 = new .gtz(this, this.getApplicationContext());
                  .dmw var6 = new .dmw(super.j, (byte[])null);
                  .fjn var16 = new .fjn();
                  .fsc var14 = new .fsc();
                  .gsy var17 = new .gsy();
                  .gsy var15 = new .gsy();
                  .hqd var9 = new .hqd();
                  .hqd var11 = new .hqd();
                  .fsc var12 = new .fsc();
                  .eli var7 = new .eli();
                  .gfv var19 = new .gfv((byte[])null, (byte[])null);
                  .hqd var8 = new .hqd();
                  .hqd var20 = new .hqd();
                  .lmk var10 = new .lmk((char[])null, (byte[])null);
                  .jbc var51 = new .jbc();
                  .fjn var5 = new .fjn();
                  .mzx var13 = new .mzx();
                  .gzh var4 = new .gzh(var16, var14, var17, var15, var9, var6, var18, var11, var12, var7, var19, var8, var20, var10, var51, var5, var13);
                  this.n = var4;
                  Trace.endSection();
                  Trace.beginSection("GCA_App#initialize");
                  .gzh var52 = this.n;
                  Trace.beginSection("GCA_App#inject");
                  .flx var54 = (.flx)var52.f.get();
                  .fsc var61 = (.fsc)var52.G.get();
                  .mib var63 = .foq.b(.mia.b(.otw.j((.mic)var52.n.get())));
                  .mbx var66 = (.mbx)var52.l.get();
                  Executor var67 = (Executor)var52.L.get();
                  .eze var68 = new .eze(var54, var63);
                  this.h = var68;
                  this.a = var52.j();
                  .flx var65 = (.flx)var52.f.get();
                  .qrz var69 = var52.M;
                  .qrz var56 = var52.O;
                  .qrz var71 = var52.P;
                  .qrz var70 = var52.Q;
                  .fwf var72 = new .fwf(var65, var69, var56, var71, var70);
                  this.g = var72;
                  this.b = var52.R;
                  this.c = var52.r;
                  this.d = (.njv)var52.T.get();
                  this.e = (.dao)var52.U.get();
                  this.f = (.ekj)var52.N.get();
                  Trace.endSection();
                  Trace.beginSection("GCA_App#PrimesInitialize");
                  this.d.a.a();
                  Trace.endSection();
                  Trace.beginSection("GCA_App#PrimesMemoryMonitor");
                  this.d.a.c();
                  Trace.endSection();
                  Trace.beginSection("GCA_App#strictMode");
                  Object var58 = this.h.a;
                  Float var53 = .fmd.a;
                  ((.flx)var58).f();
                  Trace.endSection();
                  Trace.beginSection("GCA_App#startAsync");
                  var62 = this.g;
                  Trace.beginSection("appStartup.start");
                  var55 = .oyz.o(var62.c, var62.b, var62.a);
                  var2 = ((.pby)var55).c;
               } catch (Throwable var50) {
                  var10000 = var50;
                  var10001 = false;
                  break label319;
               }

               int var1 = 0;

               while(true) {
                  if (var1 >= var2) {
                     try {
                        ((.flx)var62.e).c();
                        ((.ini)((.qrz)var62.d).get()).run();
                        Trace.endSection();
                        Trace.endSection();
                        Trace.beginSection("GCA_App#cancelNotifications");
                        this.a.cancelAll();
                        Trace.endSection();
                        Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                        .ekj var57 = this.f;
                        .ekl var64 = new .ekl(this.c, this.b);
                        var57.a(var64);
                        .ekg var59 = new .ekg(this.f, Thread.getDefaultUncaughtExceptionHandler());
                        Thread.setDefaultUncaughtExceptionHandler(var59);
                        this.d.a.b();
                        .mhz.b.addHandler(.mie.a);
                        .mhz.a.addHandler(.mie.a);
                        .mhz.c.addHandler(.mie.a);
                        .mhz.d.addHandler(.mie.a);
                        Trace.endSection();
                        Trace.endSection();
                        Trace.endSection();
                        break;
                     } catch (Throwable var48) {
                        var10000 = var48;
                        var10001 = false;
                        break label319;
                     }
                  }

                  try {
                     ((.jpx)((.qrz)var55.get(var1)).get()).run();
                  } catch (Throwable var49) {
                     var10000 = var49;
                     var10001 = false;
                     break label319;
                  }

                  ++var1;
               }
            }

            label304:
            try {
               return this.n;
            } catch (Throwable var47) {
               var10000 = var47;
               var10001 = false;
               break label304;
            }
         }

         while(true) {
            Throwable var60 = var10000;

            try {
               throw var60;
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               continue;
            }
         }
      } else {
         return this.n;
      }
   }

   public final .kok fB(.kfq var1) {
      return this.f().fB(var1);
   }

   public final void initAppComponent() {
      .mbx.a();
      this.f();
   }

   public final void onCreate() {
      // $FF: Couldn't be decompiled
   }
}
