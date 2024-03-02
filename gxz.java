import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

public class gxz extends hhb {
   private volatile ve A;
   public min r;
   public hfy s;
   public ekd t;
   private final Object u = new Object();
   private boolean v = false;
   private egc w;
   private volatile gtz x;

   public gxz() {
      String var2 = this.getClass().getSimpleName();
      StringBuilder var1 = new StringBuilder();
      var1.append("GcaActivity(");
      var1.append(var2);
      var1.append(")");
   }

   private final void q() {
      if (!this.v) {
         Object var1 = this.u;
         synchronized(var1){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (!this.v) {
                  gzh var2 = ((CameraApp)this.getApplicationContext()).f();
                  this.r = (min)var2.h.get();
                  this.t = (ekd)var2.z.get();
                  this.s = hgf.b(var2.iw);
                  ekd var16 = this.t;
                  var16.getClass();
                  onk.w(true);
                  egc var3 = new egc(var16);
                  this.w = var3;
                  this.v = true;
               }
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               return;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var17 = var10000;

            try {
               throw var17;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               continue;
            }
         }
      }
   }

   private final void r() {
      Integer.toHexString(this.hashCode());
   }

   protected final min n() {
      this.q();
      return this.r;
   }

   protected final gtz o() {
      if (this.x == null) {
         Object var1 = this.u;
         synchronized(var1){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (this.x == null) {
                  gtz var2 = new gtz(this);
                  this.x = var2;
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return this.x;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label141;
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
      } else {
         return this.x;
      }
   }

   protected void onCreate(Bundle var1) {
      this.q();
      ojy.a(this);
      this.r();
      this.r.e("GcaActivity#onCreate");
      egc var3 = this.w;
      Object var2 = var3.a;
      synchronized(var2){}

      label136: {
         Throwable var10000;
         boolean var10001;
         label131: {
            try {
               if (var3.g.a()) {
                  var3.d = var3.h.b();
                  mbv var5 = var3.d;
                  elt var4 = new elt();
                  var5.d(var4);
                  var3.g = var4;
                  var3.c = var3.h.c(var3.d);
                  mbv var19 = var3.c;
                  elt var20 = new elt();
                  var19.d(var20);
                  var3.f = var20;
                  var3.b = var3.h.a(var3.c);
                  var19 = var3.b;
                  var20 = new elt();
                  var19.d(var20);
                  var3.e = var20;
               }
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label131;
            }

            label128:
            try {
               break label136;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label128;
            }
         }

         while(true) {
            Throwable var18 = var10000;

            try {
               throw var18;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               continue;
            }
         }
      }

      super.onCreate(var1);
      this.r.f();
   }

   protected void onDestroy() {
      this.r();
      this.r.e("GcaActivity#onDestroy");
      super.onDestroy();
      this.w.fx();
      this.r.f();
   }

   protected final void onNewIntent(Intent var1) {
      this.r();
      super.onNewIntent(var1);
   }

   protected void onPause() {
      this.r();
      this.r.e("GcaActivity#onPause");
      super.onPause();
      this.w.fy();
      this.r.f();
   }

   protected void onResume() {
      this.r();
      this.r.e("GcaActivity#onResume");
      this.w.fz();
      super.onResume();
      this.r.f();
   }

   protected void onStart() {
      this.r();
      this.r.e("GcaActivity#onStart");
      this.w.fA();
      super.onStart();
      this.r.f();
   }

   protected void onStop() {
      this.r();
      this.r.e("GcaActivity#onStop");
      super.onStop();
      this.w.onStop();
      this.r.f();
   }

   protected final ve p() {
      this.q();
      if (this.A == null) {
         Object var1 = this.u;
         synchronized(var1){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (this.A == null) {
                  hfx var3 = super.y;
                  hdp var2 = super.z;
                  var3.e(this.s);
                  var3 = this.y;
                  this.q();
                  ve var4 = new ve(this, var3, var2, this.w);
                  this.A = var4;
               }
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return this.A;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var17 = var10000;

            try {
               throw var17;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               continue;
            }
         }
      } else {
         return this.A;
      }
   }
}
