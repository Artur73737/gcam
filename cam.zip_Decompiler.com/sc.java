import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class sc implements tl {
   public final CameraDevice a;
   public final String b;
   public final blj c;
   private final qyq d;
   private final sz e;
   private final bwc f;

   public sc(sz var1, CameraDevice var2, String var3, blj var4, bwc var5) {
      var1.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      super();
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.f = var5;
      this.d = qwp.i((Object)null);
   }

   public final Object a(qxs var1) {
      return c.E(var1, qxa.a(CameraDevice.class)) ? this.a : null;
   }

   public final String b() {
      return this.b;
   }

   public final void c() {
      ue var1 = (ue)this.d.a((Object)null);
      if (var1 != null) {
         var1.f();
      }

   }

   public final boolean d(um var1) {
      String var3 = this.b;
      blj var4 = this.c;

      Exception var10000;
      qsn var17;
      label83: {
         boolean var10001;
         label89: {
            int var2;
            ArrayList var5;
            tz var6;
            ue var7;
            Iterator var25;
            try {
               var6 = var1.h;
               var7 = (ue)this.d.a;
               if (!this.d.d(var7, var6)) {
                  break label89;
               }

               var2 = var1.a;
               List var8 = var1.c;
               var5 = new ArrayList(pwm.aL(var8));
               var25 = var8.iterator();
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label83;
            }

            while(true) {
               try {
                  if (!var25.hasNext()) {
                     break;
                  }

                  var5.add(((sm)var25.next()).a(qxa.a(OutputConfiguration.class)));
               } catch (Exception var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label83;
               }
            }

            SessionConfiguration var16;
            Builder var20;
            ArrayList var22;
            Iterator var24;
            try {
               Executor var26 = var1.d;
               sh var15 = new sh(this, var6, var7, this.c, this.f.e());
               var16 = sr.b(var2, var5, var26, var15);
               var20 = this.a.createCaptureRequest(1);
               var20.getClass();
               Set var23 = this.e.d();
               var22 = new ArrayList(pwm.aL(var23));
               var24 = var23.iterator();
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label83;
            }

            while(true) {
               try {
                  if (!var24.hasNext()) {
                     break;
                  }

                  var22.add(((Key)var24.next()).getName());
               } catch (Exception var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label83;
               }
            }

            try {
               CaptureRequest var21 = var20.build();
               var21.getClass();
               sr.m(var16, var21);
               sr.g(this.a, var16);
               var17 = qsn.a;
               return var17 != null;
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label83;
            }
         }

         try {
            IllegalStateException var19 = new IllegalStateException("Check failed.");
            throw var19;
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
         }
      }

      Exception var18 = var10000;
      if (!(var18 instanceof IllegalArgumentException) && !(var18 instanceof IllegalStateException) && !(var18 instanceof CameraAccessException) && !(var18 instanceof SecurityException) && !(var18 instanceof UnsupportedOperationException) && !(var18 instanceof NullPointerException)) {
         throw var18;
      } else {
         var4.k(var3, 9, false);
         var17 = null;
         return var17 != null;
      }
   }

   public final boolean e(List var1, tz var2) {
      String var4 = this.b;
      blj var3 = this.c;

      qsn var9;
      try {
         ue var7 = (ue)this.d.a;
         if (!this.d.d(var7, var2)) {
            IllegalStateException var10 = new IllegalStateException("Check failed.");
            throw var10;
         }

         CameraDevice var5 = this.a;
         sh var6 = new sh(this, var2, var7, this.c, this.f.e());
         var5.createCaptureSession(var1, var6, this.f.e());
         var9 = qsn.a;
      } catch (Exception var8) {
         if (!(var8 instanceof IllegalArgumentException) && !(var8 instanceof IllegalStateException) && !(var8 instanceof CameraAccessException) && !(var8 instanceof SecurityException) && !(var8 instanceof UnsupportedOperationException) && !(var8 instanceof NullPointerException)) {
            throw var8;
         }

         var3.k(var4, 9, false);
         var9 = null;
      }

      return var9 != null;
   }

   public final boolean f(List var1, tz var2) {
      String var4 = this.b;
      blj var3 = this.c;

      qsn var15;
      Exception var10000;
      label72: {
         ArrayList var5;
         ue var6;
         CameraDevice var7;
         Iterator var13;
         boolean var10001;
         label65: {
            try {
               var6 = (ue)this.d.a;
               if (this.d.d(var6, var2)) {
                  var7 = this.a;
                  var5 = new ArrayList(pwm.aL(var1));
                  var13 = var1.iterator();
                  break label65;
               }
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label72;
            }

            try {
               IllegalStateException var12 = new IllegalStateException("Check failed.");
               throw var12;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label72;
            }
         }

         while(true) {
            try {
               if (!var13.hasNext()) {
                  break;
               }

               var5.add(((sm)var13.next()).a(qxa.a(OutputConfiguration.class)));
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label72;
            }
         }

         try {
            sh var16 = new sh(this, var2, var6, this.c, this.f.e());
            sp.b(var7, var5, var16, this.f.e());
            var15 = qsn.a;
            return var15 != null;
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      if (!(var14 instanceof IllegalArgumentException) && !(var14 instanceof IllegalStateException) && !(var14 instanceof CameraAccessException) && !(var14 instanceof SecurityException) && !(var14 instanceof UnsupportedOperationException) && !(var14 instanceof NullPointerException)) {
         throw var14;
      } else {
         var3.k(var4, 9, false);
         var15 = null;
         return var15 != null;
      }
   }

   public final boolean g(List var1, tz var2) {
      String var3 = this.b;
      blj var4 = this.c;

      qsn var9;
      try {
         ue var6 = (ue)this.d.a;
         if (!this.d.d(var6, var2)) {
            IllegalStateException var10 = new IllegalStateException("Check failed.");
            throw var10;
         }

         CameraDevice var7 = this.a;
         sh var5 = new sh(this, var2, var6, this.c, this.f.e());
         so.e(var7, var1, var5, this.f.e());
         var9 = qsn.a;
      } catch (Exception var8) {
         if (!(var8 instanceof IllegalArgumentException) && !(var8 instanceof IllegalStateException) && !(var8 instanceof CameraAccessException) && !(var8 instanceof SecurityException) && !(var8 instanceof UnsupportedOperationException) && !(var8 instanceof NullPointerException)) {
            throw var8;
         }

         var4.k(var3, 9, false);
         var9 = null;
      }

      return var9 != null;
   }
}
