public final class akt extends qwq implements qvx {
   final Object a;
   final int b;
   final int c;
   final Object d;
   final Object e;
   private final int f;

   public akt(aji var1, Object var2, int var3, Object var4, int var5, int var6) {
      super(2);
      this.f = var6;
      this.d = var1;
      this.e = var2;
      this.b = var3;
      this.a = var4;
      this.c = var5;
   }

   public akt(Object var1, int var2, aku var3, qvx var4, int var5, int var6) {
      super(2);
      this.f = var6;
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = var4;
      this.c = var5;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var3;
      int var4;
      Object var5;
      Object var6;
      asm var7;
      switch(this.f) {
      case 0:
         var7 = (asm)var1;
         ((Number)var2).intValue();
         var5 = this.a;
         var3 = this.b;
         var6 = this.d;
         var2 = this.e;
         var4 = this.c;
         ja.b(var5, var3, (aku)var6, (qvx)var2, var7, ns.b(var4 | 1));
         return qsn.a;
      default:
         var7 = (asm)var1;
         ((Number)var2).intValue();
         var6 = this.d;
         var5 = this.e;
         var4 = this.b;
         var2 = this.a;
         var3 = this.c;
         iy.c((aji)var6, var5, var4, var2, var7, ns.b(var3 | 1));
         return qsn.a;
      }
   }
}
