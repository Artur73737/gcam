import android.graphics.Canvas;

final class abr extends kf implements bbl {
   private final abe a;

   public abr(abe var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof abr) ? false : c.E(this.a, ((abr)var1).a);
      }
   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   // $FF: synthetic method
   public final Object h(Object var1, qvx var2) {
      return dq.j(this, var1, var2);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   // $FF: synthetic method
   public final boolean i(qvt var1) {
      return dq.k(this, var1);
   }

   public final void j(bmf var1) {
      var1.l();
      abe var5 = this.a;
      if (!bcl.g(var5.k)) {
         bcw var6 = var1.m().b();
         var5.j.a();
         Canvas var7 = bcn.a(var6);
         if (er.h(var5.h) != 0.0F) {
            var5.h(var1, var5.h, var7);
            var5.h.finish();
         }

         boolean var2 = var5.d.isFinished();
         boolean var4 = false;
         if (!var2) {
            var2 = var5.g(var1, var5.d, var7);
            er.i(var5.h, er.h(var5.d), 0.0F);
         } else {
            var2 = false;
         }

         if (er.h(var5.f) != 0.0F) {
            var5.f(var1, var5.f, var7);
            var5.f.finish();
         }

         boolean var3 = var2;
         if (!var5.b.isFinished()) {
            if (!var5.i(var1, var5.b, var7)) {
               if (var2) {
                  var2 = true;
               } else {
                  var2 = false;
               }
            } else {
               var2 = true;
            }

            er.i(var5.f, er.h(var5.b), 0.0F);
            var3 = var2;
         }

         if (er.h(var5.i) != 0.0F) {
            var5.g(var1, var5.i, var7);
            var5.i.finish();
         }

         var2 = var3;
         if (!var5.e.isFinished()) {
            if (!var5.h(var1, var5.e, var7)) {
               if (var3) {
                  var2 = true;
               } else {
                  var2 = false;
               }
            } else {
               var2 = true;
            }

            er.i(var5.i, er.h(var5.e), 0.0F);
         }

         if (er.h(var5.g) != 0.0F) {
            var5.i(var1, var5.g, var7);
            var5.g.finish();
         }

         var3 = var2;
         if (!var5.c.isFinished()) {
            if (!var5.f(var1, var5.c, var7)) {
               if (var2) {
                  var2 = true;
               } else {
                  var2 = var4;
               }
            } else {
               var2 = true;
            }

            er.i(var5.g, er.h(var5.c), 0.0F);
            var3 = var2;
         }

         if (var3) {
            var5.e();
            return;
         }
      }

   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DrawOverscrollModifier(overscrollEffect=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
