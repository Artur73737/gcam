import java.util.Map;

public final class bjv implements bju {
   final int a;
   final bjw b;
   final qvt c;
   private final int d;
   private final int e;
   private final Map f;

   public bjv(int var1, int var2, Map var3, bjw var4, qvt var5) {
      this.a = var1;
      this.b = var4;
      this.c = var5;
      this.d = var1;
      this.e = var2;
      this.f = var3;
   }

   public final int c() {
      return this.e;
   }

   public final int d() {
      return this.d;
   }

   public final Map e() {
      return this.f;
   }

   public final void f() {
      bkd var6 = bkd.e;
      int var1 = this.a;
      bxy var5 = this.b.j();
      bjw var4 = this.b;
      bmn var11;
      if (var4 instanceof bmn) {
         var11 = (bmn)var4;
      } else {
         var11 = null;
      }

      qvt var7 = this.c;
      bjf var10 = bkd.c;
      int var2 = bkd.b;
      bxy var8 = bkd.a;
      bml var9 = bkd.d;
      bkd.b = var1;
      bkd.a = var5;
      boolean var3 = bkd.a(var11);
      var7.eo(var6);
      if (var11 != null) {
         var11.i = var3;
      }

      bkd.b = var2;
      bkd.a = var8;
      bkd.c = var10;
      bkd.d = var9;
   }
}
