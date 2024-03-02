import android.util.Log;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import java.util.List;
import java.util.Map;

public final class sx {
   public final qr a;
   public final Object b;
   public qq c;
   public tz d;
   public Map e;
   public vd f;
   public gh g;
   private final qzv h;
   private final tt i;
   private final rf j;
   private rbd k;
   private final wk l;
   private final ve m;
   private final nwu n;

   public sx(qzv var1, qr var2, wk var3, tt var4, ve var5, nwu var6, rf var7, nl var8) {
      var1.getClass();
      var4.getClass();
      var6.getClass();
      var7.getClass();
      var8.getClass();
      super();
      this.h = var1;
      this.a = var2;
      this.l = var3;
      this.i = var4;
      this.m = var5;
      this.n = var6;
      this.j = var7;
      this.b = new Object();
      this.g = qo.a;
   }

   public final void a() {
      Object var2 = this.b;
      synchronized(var2){}

      Throwable var10000;
      label190: {
         boolean var1;
         boolean var10001;
         try {
            var1 = c.E(this.g, qk.a);
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label190;
         }

         if (var1) {
            return;
         }

         rbd var3;
         vd var4;
         tz var5;
         try {
            this.g = qk.a;
            var4 = this.f;
            var5 = this.d;
            this.f = null;
            this.d = null;
            var3 = this.k;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label190;
         }

         if (var3 != null) {
            try {
               qxb.r(var3);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label190;
            }
         }

         try {
            this.k = null;
            this.c(var5, var4);
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label190;
         }

         return;
      }

      Throwable var26 = var10000;
      throw var26;
   }

   public final void b() {
      Object var2 = this.b;
      synchronized(var2){}

      Throwable var10000;
      label1013: {
         boolean var1;
         boolean var10001;
         try {
            var1 = c.E(this.g, qk.a);
         } catch (Throwable var117) {
            var10000 = var117;
            var10001 = false;
            break label1013;
         }

         if (var1) {
            return;
         }

         try {
            if (c.E(this.g, qn.a)) {
               Log.w("CXCP", "Ignoring start(): Camera2CameraController is already started");
               return;
            }
         } catch (Throwable var118) {
            var10000 = var118;
            var10001 = false;
            break label1013;
         }

         Map var120;
         tz var124;
         label989: {
            IllegalStateException var119;
            label988: {
               label987: {
                  try {
                     this.c = null;
                     nwu var3 = this.n;
                     qr var4 = this.a;
                     String var8 = var4.a;
                     List var5 = var4.l;
                     wk var6 = this.l;
                     ou var7 = new ou(this, 3);
                     vd var122 = new vd(var8, var6, (qzv)((bwc)var3.e).b);
                     uj var128 = new uj(var122, var5, var6, var7);
                     if (!(((rdb)var3.b).u(var128) instanceof rde)) {
                        if (this.f != null) {
                           break label987;
                        }

                        if (this.d != null) {
                           break label988;
                        }

                        this.f = var122;
                        var124 = new tz(this.l, this.i, this.m, this.j, this.h);
                        this.d = var124;
                        var120 = this.e;
                        break label989;
                     }
                  } catch (Throwable var116) {
                     var10000 = var116;
                     var10001 = false;
                     break label1013;
                  }

                  try {
                     var119 = new IllegalStateException("There are more than 32 requests buffered!");
                     throw var119;
                  } catch (Throwable var115) {
                     var10000 = var115;
                     var10001 = false;
                     break label1013;
                  }
               }

               try {
                  var119 = new IllegalStateException("Check failed.");
                  throw var119;
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label1013;
               }
            }

            try {
               String var127 = nJwt.bjcOchcCyv;
               var119 = new IllegalStateException(var127);
               throw var119;
            } catch (Throwable var113) {
               var10000 = var113;
               var10001 = false;
               break label1013;
            }
         }

         if (var120 != null) {
            try {
               var124.b(var120);
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               break label1013;
            }
         }

         rbd var121;
         try {
            this.g = qn.a;
            var121 = this.k;
         } catch (Throwable var111) {
            var10000 = var111;
            var10001 = false;
            break label1013;
         }

         if (var121 != null) {
            try {
               qxb.r(var121);
            } catch (Throwable var110) {
               var10000 = var110;
               var10001 = false;
               break label1013;
            }
         }

         try {
            qzv var126 = this.h;
            sw var123 = new sw(this, (que)null);
            this.k = qwo.o(var126, (qui)null, 0, var123, 3);
         } catch (Throwable var109) {
            var10000 = var109;
            var10001 = false;
            break label1013;
         }

         return;
      }

      Throwable var125 = var10000;
      throw var125;
   }

   public final void c(tz var1, vd var2) {
      qwo.n(this.h, (qui)null, new sv(var1, var2, (que)null), 3);
   }
}
