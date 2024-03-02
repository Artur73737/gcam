public final class arl extends qwq implements qvx {
   final int a;
   final Object b;
   final Object c;
   final Object d;
   final Object e;
   private final int f;

   public arl(Object var1, Object var2, Object var3, Object var4, int var5, int var6) {
      super(2);
      this.f = var6;
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.a = var5;
   }

   public arl(qvi var1, bbb var2, pde var3, qvx var4, int var5, int var6) {
      super(2);
      this.f = var6;
      this.d = var1;
      this.c = var2;
      this.b = var3;
      this.e = var4;
      this.a = var5;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var3;
      Object var4;
      Object var5;
      Object var6;
      asm var7;
      switch(this.f) {
      case 0:
         var7 = (asm)var1;
         ((Number)var2).intValue();
         var2 = this.b;
         var6 = this.c;
         var5 = this.d;
         var4 = this.e;
         var3 = this.a;
         aru var8 = (aru)var5;
         arq var9 = (arq)var6;
         arm.a((aqz)var2, var9, var8, (qvx)var4, var7, ns.b(var3 | 1));
         return qsn.a;
      case 1:
         var7 = (asm)var1;
         ((Number)var2).intValue();
         var4 = this.d;
         var6 = this.c;
         var2 = this.b;
         var5 = this.e;
         var3 = this.a;
         iz.k((qvi)var4, (bbb)var6, (pde)var2, (qvx)var5, var7, ns.b(var3 | 1));
         return qsn.a;
      default:
         var7 = (asm)var1;
         ((Number)var2).intValue();
         var7.getClass();
         var4 = this.b;
         var5 = this.c;
         var2 = this.d;
         var6 = this.e;
         var3 = ns.b(this.a);
         ((ayt)var4).e(var5, var2, var6, var7, var3 | 1);
         return qsn.a;
      }
   }
}
