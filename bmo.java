import java.util.LinkedHashMap;
import java.util.Map;

public abstract class bmo extends bmn implements bjs {
   private Map f;
   public final bmz g;
   public long j;
   public final bjr k;
   public final Map l;
   private bju m;

   public bmo(bmz var1) {
      this.g = var1;
      this.j = bxw.a;
      this.k = new bjr(this);
      this.l = new LinkedHashMap();
   }

   public final long A() {
      return this.j;
   }

   public final bjf B() {
      return this.k;
   }

   public final bju C() {
      bju var1 = this.m;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
      }
   }

   public final bmd D() {
      return this.g.n;
   }

   public final bmn E() {
      bmz var1 = this.g.o;
      return var1 != null ? var1.u() : null;
   }

   public final bmn F() {
      bmz var1 = this.g.p;
      return var1 != null ? var1.u() : null;
   }

   public final void G() {
      this.r(this.j, (qvt)null);
   }

   public final boolean H() {
      return this.m != null;
   }

   public final float a() {
      return this.g.a();
   }

   public final float b() {
      return this.g.b();
   }

   public final Object c() {
      return this.g.c();
   }

   public final boolean eM() {
      return true;
   }

   public final bxy j() {
      return this.g.j();
   }

   public final void r(long var1, qvt var3) {
      if (!c.o(this.j, var1)) {
         this.j = var1;
         bmh var4 = this.D().o.o;
         if (var4 != null) {
            var4.k();
         }

         I(this.g);
      }

      if (!super.h) {
         this.t();
      }
   }

   protected void t() {
      bxy var4 = bkd.a;
      int var2 = this.C().d();
      bxy var7 = this.g.j();
      bjf var5 = bkd.c;
      int var1 = bkd.b;
      bxy var6 = bkd.a;
      bml var8 = bkd.d;
      bkd.b = var2;
      bkd.a = var7;
      boolean var3 = bkd.a(this);
      this.C().f();
      super.i = var3;
      bkd.b = var1;
      bkd.a = var6;
      bkd.c = var5;
      bkd.d = var8;
   }

   public final long u(bmo var1) {
      long var6 = bxw.a;

      int var2;
      int var3;
      int var4;
      int var5;
      for(bmo var10 = this; !c.E(var10, var1); var6 = car.K(var5 + var3, var2 + var4)) {
         long var8 = var10.j;
         var5 = bxw.a(var6);
         var3 = bxw.a(var8);
         var2 = bxw.b(var6);
         var4 = bxw.b(var8);
         bmz var11 = var10.g.p;
         var11.getClass();
         var10 = var11.u();
         var10.getClass();
      }

      return var6;
   }

   public final bkw v() {
      bmh var1 = this.g.n.o.o;
      var1.getClass();
      return var1;
   }

   public final void w(bju var1) {
      qsn var2;
      if (var1 != null) {
         this.p(car.I(var1.d(), var1.c()));
         var2 = qsn.a;
      } else {
         var2 = null;
      }

      if (var2 == null) {
         this.p(0L);
      }

      if (!c.E(this.m, var1) && var1 != null) {
         Map var4 = this.f;
         if ((var4 != null && !var4.isEmpty() || !var1.e().isEmpty()) && !c.E(var1.e(), this.f)) {
            ((bmh)this.v()).n.e();
            Map var3 = this.f;
            Object var5 = var3;
            if (var3 == null) {
               var5 = new LinkedHashMap();
               this.f = (Map)var5;
            }

            ((Map)var5).clear();
            ((Map)var5).putAll(var1.e());
         }
      }

      this.m = var1;
   }
}
