public final class rhw extends raf implements qur, que {
   public final qzr a;
   public final que b;
   public Object c;
   public final Object d;
   public final qyq e;

   public rhw(qzr var1, que var2) {
      super(-1);
      this.a = var1;
      this.b = var2;
      this.c = rhx.a;
      this.d = ris.a(this.n());
      this.e = qwp.i((Object)null);
   }

   public final void c(qui var1, Object var2) {
      var1.getClass();
      this.c = var2;
      this.f = 1;
      this.a.e(var1, this);
   }

   public final StackTraceElement el() {
      return null;
   }

   public final qur em() {
      return this.b;
   }

   public final Object f() {
      Object var2 = this.c;
      boolean var1 = qzx.a;
      this.c = rhx.a;
      return var2;
   }

   public final void gP(Object var1) {
      qui var3 = this.b.n();
      Object var4 = qwp.I(var1);
      if (this.a.f(var3)) {
         this.c = var4;
         this.f = 0;
         this.a.a(var3, this);
      } else {
         boolean var2 = qzx.a;
         ThreadLocal var47 = rcb.a;
         ran var48 = rcb.a();
         if (var48.o()) {
            this.c = var4;
            this.f = 0;
            var48.m(this);
         } else {
            var48.n(true);

            Throwable var10000;
            label371: {
               qui var5;
               boolean var10001;
               try {
                  var5 = this.n();
                  var4 = ris.b(var5, this.d);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label371;
               }

               try {
                  this.b.gP(var1);
               } finally {
                  try {
                     ris.c(var5, var4);
                  } catch (Throwable var42) {
                     var10000 = var42;
                     var10001 = false;
                     break label371;
                  }
               }

               while(true) {
                  try {
                     var2 = var48.q();
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break;
                  }

                  if (!var2) {
                     return;
                  }
               }
            }

            Throwable var46 = var10000;

            try {
               this.C(var46, (Throwable)null);
            } finally {
               var48.l(true);
            }

         }
      }
   }

   public final que j() {
      return this;
   }

   public final void m(Object var1, Throwable var2) {
      if (var1 instanceof qzj) {
         qvt var3 = ((qzj)var1).a;
         throw null;
      }
   }

   public final qui n() {
      return this.b.n();
   }

   public final String toString() {
      qzr var3 = this.a;
      String var2 = qzy.c(this.b);
      StringBuilder var1 = new StringBuilder();
      var1.append("DispatchedContinuation[");
      var1.append(var3);
      var1.append(", ");
      var1.append(var2);
      var1.append("]");
      return var1.toString();
   }
}
