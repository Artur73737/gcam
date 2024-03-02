import java.util.ArrayList;
import java.util.List;

public final class ajr {
   public final long a;
   public final aji b;
   final int c;
   final int d;
   final int e;
   final int f;
   final long g;
   final akq h;
   final bat i;
   private final akq j;

   public ajr(long var1, aji var3, akq var4, int var5, int var6, bat var7, int var8, int var9, long var10) {
      this.h = var4;
      this.c = var5;
      this.d = var6;
      this.i = var7;
      this.e = var8;
      this.f = var9;
      this.g = var10;
      var3.getClass();
      super();
      this.b = var3;
      this.j = var4;
      this.a = car.aa(Integer.MAX_VALUE, bxq.a(var1), 5);
   }

   public final ajq a(int var1) {
      Object var8 = this.b.c(var1);
      this.b.e(var1);
      akq var9 = this.j;
      long var4 = this.a;
      List var7 = (List)var9.b.get(var1);
      Object var6 = var7;
      int var2;
      if (var7 == null) {
         var6 = var9.c.c(var1);
         var9.c.e(var1);
         qvx var10 = var9.d.a(var1, var6);
         var7 = var9.a.l(var6, var10);
         int var3 = var7.size();
         var6 = new ArrayList(var3);

         for(var2 = 0; var2 < var3; ++var2) {
            ((ArrayList)var6).add(((bjs)var7.get(var2)).l(var4));
         }

         var9.b.put(var1, var6);
      }

      if (var1 == this.c - 1) {
         var2 = 0;
      } else {
         var2 = this.d;
      }

      return new ajq(var1, (List)var6, this.i, this.h.j(), var2, this.g, var8);
   }
}
