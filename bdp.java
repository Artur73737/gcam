import android.graphics.Shader;

public abstract class bdp extends bcu {
   private Shader a;
   private long b;

   public bdp() {
      this.b = bcl.b;
   }

   public final void a(long var1, bco var3, float var4) {
      var3.getClass();
      Shader var7 = this.a;
      if (var7 == null || !c.o(this.b, var1)) {
         if (bcl.g(var1)) {
            var7 = null;
            this.a = null;
            this.b = bcl.b;
         } else {
            var7 = this.b(var1);
            this.a = var7;
            this.b = var1;
         }
      }

      long var5 = var3.g();
      var1 = bcy.a;
      if (!c.o(var5, var1)) {
         var3.j(var1);
      }

      if (!c.E(var3.c, var7)) {
         var3.l(var7);
      }

      if (var3.a() != var4) {
         var3.h(var4);
      }
   }

   public abstract Shader b(long var1);
}
