import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

public final class sf extends StateCallback {
   public final String a;
   public final CountDownLatch b;
   public final rga c;
   private final int d;
   private final long e;
   private final int f;
   private final Object g;
   private boolean h;
   private sd i;
   private final long j;
   private vt k;
   private final sz l;
   private final bwc m;
   private final blj n;
   private final bpe o;

   public sf(String var1, sz var2, int var3, long var4, blj var6, bpe var7, bwc var8) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.l = var2;
      this.d = var3;
      this.e = var4;
      this.n = var6;
      this.o = var7;
      this.m = var8;
      this.f = uo.b.b();
      this.g = new Object();
      this.b = new CountDownLatch(1);
      this.c = rgb.a(ts.a);
      StringBuilder var9 = new StringBuilder();
      var9.append("Opening ");
      var9.append(qu.b(var1));
      if (var3 != 1) {
         var4 = SystemClock.elapsedRealtimeNanos();
      }

      this.j = var4;
   }

   private final tn c(sd var1) {
      long var4 = SystemClock.elapsedRealtimeNanos();
      vt var10 = this.k;
      long var6 = var1.a;
      vn var8;
      if (var10 != null) {
         var8 = vn.a(var10.a - this.e);
      } else {
         var8 = null;
      }

      vn var9;
      if (var10 != null) {
         var9 = vn.a(var10.a - this.j);
      } else {
         var9 = null;
      }

      vn var13;
      if (var10 == null) {
         var13 = null;
      } else {
         var13 = vn.a(var6 - var10.a);
      }

      String var11 = this.a;
      int var2 = var1.d;
      int var3 = this.d;
      qq var12 = var1.b;
      return new tn(var11, var2, var3 - 1, var8, var1.c, var9, var13, vn.a(var4 - var6), var12);
   }

   public final void a() {
      kh var1 = (kh)this.c.b();
      tl var3;
      if (var1 instanceof tp) {
         var3 = ((tp)var1).a;
      } else {
         var3 = null;
      }

      Object var4;
      if (var3 != null) {
         var4 = var3.a(qxa.a(CameraDevice.class));
      } else {
         var4 = null;
      }

      sd var2 = new sd(1, (qq)null, (Throwable)null, 14);
      this.b((CameraDevice)var4, var2);
   }

   public final void b(CameraDevice var1, sd var2) {
      kh var4 = (kh)this.c.b();
      tl var9;
      if (var4 instanceof tp) {
         var9 = ((tp)var4).a;
      } else {
         var9 = null;
      }

      Object var5 = this.g;
      synchronized(var5){}
      boolean var7 = false;

      label76: {
         boolean var3;
         label75: {
            try {
               var7 = true;
               if (this.i == null) {
                  this.i = var2;
                  var3 = this.h;
                  var7 = false;
                  break label75;
               }

               var7 = false;
            } finally {
               if (var7) {
                  ;
               }
            }

            var2 = null;
            break label76;
         }

         if (var3) {
            var2 = null;
         }
      }

      if (var2 != null) {
         qq var10 = var2.b;
         if (var10 != null && var2.d != 6) {
            this.n.k(this.a, var10.a, false);
         }

         this.c.d(new to(var2.b));
         this.o.i(var9, var1, this);
         this.c.d(this.c(var2));
      }

   }

   public final void onClosed(CameraDevice var1) {
      var1.getClass();
      if (c.E(var1.getId(), this.a)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Camera-");
         var2.append(this.a);
         var2.append("#onClosed");
         Trace.beginSection(var2.toString());
         var2 = new StringBuilder();
         var2.append(qu.b(this.a));
         var2.append(": onClosed");
         this.b.countDown();
         this.b(var1, new sd(3, (qq)null, (Throwable)null, 14));
         Trace.endSection();
      } else {
         throw new IllegalStateException("Check failed.");
      }
   }

   public final void onDisconnected(CameraDevice var1) {
      var1.getClass();
      if (c.E(var1.getId(), this.a)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Camera-");
         var2.append(this.a);
         var2.append("#onDisconnected");
         Trace.beginSection(var2.toString());
         var2 = new StringBuilder();
         var2.append(qu.b(this.a));
         var2.append(": onDisconnected");
         this.b.countDown();
         this.b(var1, new sd(4, qq.a(6), (Throwable)null, 10));
         Trace.endSection();
      } else {
         throw new IllegalStateException("Check failed.");
      }
   }

   public final void onError(CameraDevice var1, int var2) {
      var1.getClass();
      if (c.E(var1.getId(), this.a)) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Camera-");
         var3.append(this.a);
         var3.append("#onError-");
         var3.append(var2);
         Trace.beginSection(var3.toString());
         var3 = new StringBuilder();
         var3.append(qu.b(this.a));
         var3.append(": onError ");
         var3.append(var2);
         this.b.countDown();
         byte var4;
         switch(var2) {
         case 1:
            var4 = 1;
            break;
         case 2:
            var4 = 2;
            break;
         case 3:
            var4 = 3;
            break;
         case 4:
            var4 = 4;
            break;
         case 5:
            var4 = 5;
            break;
         default:
            throw new IllegalArgumentException(c.aE(var2, "Unexpected StateCallback error code:"));
         }

         this.b(var1, new sd(5, qq.a(var4), (Throwable)null, 10));
         Trace.endSection();
      } else {
         throw new IllegalStateException("Check failed.");
      }
   }

   public final void onOpened(CameraDevice var1) {
      var1.getClass();
      if (c.E(var1.getId(), this.a)) {
         long var6 = SystemClock.elapsedRealtimeNanos();
         this.k = vt.a(var6);
         StringBuilder var10 = new StringBuilder();
         var10.append("Camera-");
         var10.append(this.a);
         var10.append("#onOpened");
         Trace.beginSection(var10.toString());
         long var4 = var6 - this.j;
         long var8 = this.e;
         double var2;
         if (this.d == 1) {
            StringBuilder var11 = new StringBuilder();
            var11.append("Opened ");
            var11.append(qu.b(this.a));
            var11.append(" in ");
            var2 = (double)var4;
            Double.isNaN(var2);
            String var25 = String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{var2 / 1000000.0D}, 1));
            var25.getClass();
            var11.append(var25);
         } else {
            var10 = new StringBuilder();
            var10.append("Opened ");
            var10.append(qu.b(this.a));
            var10.append(" in ");
            var2 = (double)var4;
            Double.isNaN(var2);
            String var27 = String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{var2 / 1000000.0D}, 1));
            var27.getClass();
            var10.append(var27);
            var10.append(" (");
            var2 = (double)(var6 - var8);
            Double.isNaN(var2);
            var27 = String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{var2 / 1000000.0D}, 1));
            var27.getClass();
            var10.append(var27);
            var10.append(" total) after ");
            var10.append(this.d);
            var10.append(" attempts.");
         }

         Object var26 = this.g;
         synchronized(var26){}

         sd var28;
         label185: {
            Throwable var10000;
            label192: {
               boolean var10001;
               try {
                  var28 = this.i;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label192;
               }

               if (var28 != null) {
                  break label185;
               }

               label180:
               try {
                  this.h = true;
                  break label185;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label180;
               }
            }

            Throwable var24 = var10000;
            throw var24;
         }

         if (var28 != null) {
            kd.j(this.o, var1, this);
         } else {
            this.c.d(new tp(new sc(this.l, var1, this.a, this.n, this.m)));
            var26 = this.g;
            synchronized(var26){}

            try {
               this.h = false;
               var28 = this.i;
            } finally {
               ;
            }

            if (var28 != null) {
               this.c.d(new to(var28.b));
               kd.j(this.o, var1, this);
               this.c.d(this.c(var28));
            }

            Trace.endSection();
         }
      } else {
         throw new IllegalStateException("Check failed.");
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CameraState-");
      var1.append(this.f);
      return var1.toString();
   }
}
