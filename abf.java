import java.util.Collection;
import java.util.List;

public final class abf extends qwq implements qvt {
   final int a;
   final Object b;
   private final int c;

   public abf(int var1, Object var2, int var3) {
      super(1);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public abf(bke var1, int var2, int var3) {
      super(1);
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var2;
      bke var9;
      switch(this.c) {
      case 0:
         ((bkd)var1).getClass();
         var1 = this.b;
         var2 = this.a / 2;
         bkd.b((bke)var1, var2, var2);
         return qsn.a;
      case 1:
         ((bkd)var1).getClass();
         var1 = this.b;
         int var3 = -this.a;
         var9 = (bke)var1;
         var2 = var9.a;
         int var4 = var9.o();
         int var7 = -this.a;
         bke var8 = (bke)this.b;
         int var5 = var8.b;
         int var6 = var8.n();
         var7 /= 2;
         var5 = (var5 - var6) / 2;
         bkd.g(var9, var3 / 2 - (var2 - var4) / 2, var7 - var5, (qvt)null, 12);
         return qsn.a;
      case 2:
         ((bkd)var1).getClass();
         var2 = this.a;
         var9 = (bke)this.b;
         bkd.e(var9, 0, (var2 - var9.b) / 2);
         return qsn.a;
      default:
         List var10 = (List)var1;
         var10.getClass();
         return var10.addAll(this.a, (Collection)this.b);
      }
   }
}
