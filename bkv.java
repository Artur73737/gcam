import java.util.HashMap;
import java.util.Map;

public abstract class bkv {
   public final bkw a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e;
   public boolean f;
   public boolean g;
   public final Map h;
   private bkw i;

   public bkv(bkw var1) {
      this.a = var1;
      this.b = true;
      this.h = new HashMap();
   }

   public abstract int a(bmz var1, bir var2);

   protected abstract long b(bmz var1, long var2);

   public abstract Map c(bmz var1);

   public final void d(bir var1, int var2, bmz var3) {
      float var4 = (float)var2;
      long var6 = es.i(var4, var4);

      while(true) {
         var6 = this.b(var3, var6);
         var3 = var3.p;
         var3.getClass();
         if (c.E(var3, this.a.d())) {
            if (var1 instanceof bjb) {
               var2 = qxg.e(bci.c(var6));
            } else {
               var2 = qxg.e(bci.b(var6));
            }

            Map var8 = this.h;
            int var5 = var2;
            if (var8.containsKey(var1)) {
               var5 = ((Number)pwm.ac(this.h, var1)).intValue();
               var1.getClass();
               var5 = ((Number)var1.a.a(var5, var2)).intValue();
            }

            var8.put(var1, var5);
            return;
         }

         if (this.c(var3).containsKey(var1)) {
            var4 = (float)this.a(var3, var1);
            var6 = es.i(var4, var4);
         }
      }
   }

   public final void e() {
      this.b = true;
      bkw var1 = this.a.b();
      if (var1 != null) {
         if (this.c) {
            var1.h();
         } else if (this.e || this.d) {
            var1.g();
         }

         if (this.f) {
            this.a.h();
         }

         if (this.g) {
            this.a.g();
         }

         var1.a().e();
      }
   }

   public final void f() {
      this.h.clear();
      this.a.e(new bkh(this, 4));
      this.h.putAll(this.c(this.a.d()));
      this.b = false;
   }

   public final void g() {
      bkw var1;
      if (this.i()) {
         var1 = this.a;
      } else {
         label45: {
            var1 = this.a.b();
            if (var1 == null) {
               return;
            }

            bkw var2 = var1.a().i;
            if (var2 != null) {
               var1 = var2;
               if (var2.a().i()) {
                  break label45;
               }
            }

            var1 = this.i;
            if (var1 == null || var1.a().i()) {
               return;
            }

            var2 = var1.b();
            if (var2 != null) {
               bkv var4 = var2.a();
               if (var4 != null) {
                  var4.g();
               }
            }

            var1 = var1.b();
            if (var1 != null) {
               bkv var3 = var1.a();
               if (var3 != null) {
                  var1 = var3.i;
                  break label45;
               }
            }

            var1 = null;
         }
      }

      this.i = var1;
   }

   public final void h() {
      this.b = true;
      this.c = false;
      this.e = false;
      this.d = false;
      this.f = false;
      this.g = false;
      this.i = null;
   }

   public final boolean i() {
      return this.c || this.e || this.f || this.g;
   }

   public final boolean j() {
      this.g();
      return this.i != null;
   }
}
