import android.util.Log;
import java.util.List;

public final class un implements tl {
   public final Object a;
   public boolean b;
   private final sc c;

   public un(sc var1) {
      this.c = var1;
      this.a = new Object();
   }

   public final Object a(qxs var1) {
      return this.c.a(var1);
   }

   public final String b() {
      return this.c.b;
   }

   public final void c() {
      this.c.c();
   }

   public final boolean d(um var1) {
      Object var3 = this.a;
      synchronized(var3){}
      boolean var5 = false;

      boolean var2;
      try {
         var5 = true;
         if (!this.b) {
            var2 = this.c.d(var1);
            var5 = false;
            return var2;
         }

         Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
         var1.h.f();
         var5 = false;
      } finally {
         if (var5) {
            ;
         }
      }

      var2 = false;
      return var2;
   }

   public final boolean e(List var1, tz var2) {
      Object var4 = this.a;
      synchronized(var4){}
      boolean var6 = false;

      boolean var3;
      try {
         var6 = true;
         if (!this.b) {
            var3 = this.c.e(var1, var2);
            var6 = false;
            return var3;
         }

         Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
         var2.f();
         var6 = false;
      } finally {
         if (var6) {
            ;
         }
      }

      var3 = false;
      return var3;
   }

   public final boolean f(List var1, tz var2) {
      Object var4 = this.a;
      synchronized(var4){}
      boolean var6 = false;

      boolean var3;
      try {
         var6 = true;
         if (!this.b) {
            var3 = this.c.f(var1, var2);
            var6 = false;
            return var3;
         }

         Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
         var2.f();
         var6 = false;
      } finally {
         if (var6) {
            ;
         }
      }

      var3 = false;
      return var3;
   }

   public final boolean g(List var1, tz var2) {
      Object var4 = this.a;
      synchronized(var4){}
      boolean var6 = false;

      boolean var3;
      try {
         var6 = true;
         if (!this.b) {
            var3 = this.c.g(var1, var2);
            var6 = false;
            return var3;
         }

         Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
         var2.f();
         var6 = false;
      } finally {
         if (var6) {
            ;
         }
      }

      var3 = false;
      return var3;
   }
}
