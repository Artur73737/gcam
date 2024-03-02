final class bmq {
   public bba a;
   public int b;
   public axf c;
   public axf d;
   public boolean e;
   final bmr f;

   public bmq(bmr var1, bba var2, int var3, axf var4, axf var5, boolean var6) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   public final boolean a(int var1, int var2) {
      axf var4 = this.c;
      int var3 = this.b;
      return bmt.a((baz)var4.a[var1 + var3], (baz)this.d.a[var3 + var2]) != 0;
   }
}
