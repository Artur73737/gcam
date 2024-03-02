import android.graphics.Shader;
import android.text.TextPaint;

public final class bwk extends TextPaint {
   public final bco a;
   private bxd b;
   private bdq c;
   private gf d;

   public bwk(float var1) {
      super(1);
      this.density = var1;
      this.a = new bco(this);
      this.b = bxd.a;
      this.c = bdq.a;
   }

   public final void a(int var1) {
      this.a.i(var1);
   }

   public final void b(bcu var1, long var2, float var4) {
      this.a.l((Shader)null);
   }

   public final void c(long var1) {
      if (var1 != bcy.f) {
         this.a.j(var1);
         this.a.l((Shader)null);
      }

   }

   public final void d(bdq var1) {
      if (var1 != null) {
         if (!c.E(this.c, var1)) {
            this.c = var1;
            if (c.E(var1, bdq.a)) {
               this.clearShadowLayer();
               return;
            }

            var1 = this.c;
            this.setShadowLayer(btf.g(var1.d), bci.b(var1.c), bci.c(this.c.c), bcq.h(this.c.b));
         }

      }
   }

   public final void e(bxd var1) {
      if (var1 != null) {
         if (!c.E(this.b, var1)) {
            this.b = var1;
            this.setUnderlineText(var1.a(bxd.b));
            this.setStrikeThruText(this.b.a(bxd.c));
         }

      }
   }

   public final void f(gf var1) {
      if (var1 != null) {
         if (!c.E(this.d, var1)) {
            this.d = var1;
            if (c.E(var1, bex.a)) {
               this.a.q(0);
               return;
            }

            if (var1 instanceof bey) {
               this.a.q(1);
               bco var2 = this.a;
               bey var3 = (bey)var1;
               var2.p(var3.a);
               this.a.o(var3.b);
               this.a.n(var3.d);
               this.a.m(var3.c);
               this.a.r();
            }
         }

      }
   }
}
