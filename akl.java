import java.util.Map;

public final class akl extends qwq implements qvx {
   final int a;
   final Object b;
   final int c;
   final Object d;
   private final int e;

   public akl(bgi var1, Map var2, int var3, int var4, int var5) {
      super(2);
      this.e = var5;
      this.d = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
   }

   public akl(Object var1, int var2, Object var3, int var4, int var5) {
      super(2);
      this.e = var5;
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var3;
      int var4;
      Object var5;
      asm var6;
      switch(this.e) {
      case 0:
         var6 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var6.G()) {
            var6.q();
         } else {
            var2 = this.d;
            var3 = this.a;
            var5 = this.b;
            var4 = this.c;
            ((aji)var2).d(var3, var5, var6, var4 << 6 & 896 | var4 >> 6 & 14 | 64);
         }

         return qsn.a;
      case 1:
         var6 = (asm)var1;
         ((Number)var2).intValue();
         var2 = this.d;
         var4 = this.a;
         var5 = this.b;
         var3 = this.c;
         ((aji)var2).d(var4, var5, var6, ns.b(var3 | 1));
         return qsn.a;
      case 2:
         var6 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var6.G()) {
            var6.q();
         } else {
            aip var7 = gf.f(0.0F, 0.0F, 0.0F, ((bkk)this.d).eG(this.a));
            ((qvy)this.b).a(var7, var6, this.c >> 6 & 112);
         }

         return qsn.a;
      default:
         var6 = (asm)var1;
         ((Number)var2).intValue();
         var2 = this.d;
         var5 = this.b;
         var4 = ns.b(this.c | 1);
         var3 = this.a;
         gh.e((bgi)var2, (Map)var5, var6, var4, var3);
         return qsn.a;
      }
   }
}
