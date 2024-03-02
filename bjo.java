import java.util.List;

public final class bjo extends bma {
   final bjq a;
   final qvx b;

   public bjo(bjq var1, qvx var2, String var3) {
      super(var3);
      this.a = var1;
      this.b = var2;
   }

   public final bju a(bjw var1, List var2, long var3) {
      bjm var7 = this.a.h;
      bxy var5 = var1.j();
      var5.getClass();
      var7.a = var5;
      var7.b = var1.a();
      this.a.h.c = var1.b();
      bjq var6;
      if (!var1.eM()) {
         var6 = this.a;
         if (var6.a.e != null) {
            var6.e = 0;
            bju var8 = (bju)this.b.a(var6.i, bxq.e(var3));
            bjq var10 = this.a;
            return new bjn(var8, var10, var10.e, var8, 1);
         }
      }

      var6 = this.a;
      var6.d = 0;
      bju var9 = (bju)this.b.a(var6.h, bxq.e(var3));
      var6 = this.a;
      return new bjn(var9, var6, var6.d, var9, 0);
   }
}
