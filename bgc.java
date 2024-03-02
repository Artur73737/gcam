public final class bgc extends ase {
   public bgc(bgb var1) {
      var1.getClass();
      super(var1);
   }

   private static final bfd k(bgb var0) {
      if (var0 instanceof bfd) {
         return (bfd)var0;
      } else {
         throw new IllegalStateException("Cannot only insert VNode into Group");
      }
   }

   protected final void d() {
      bfd var1 = k((bgb)super.a);
      var1.d(0, var1.a());
   }

   // $FF: synthetic method
   public final void g(int var1, Object var2) {
      ((bgb)var2).getClass();
   }

   public final void i(int var1, int var2, int var3) {
      bfd var6 = k((bgb)super.b);
      byte var5 = 0;
      int var4 = 0;
      bgb var7;
      if (var1 > var2) {
         while(var4 < var3) {
            var7 = (bgb)var6.a.get(var1);
            var6.a.remove(var1);
            var6.a.add(var2, var7);
            ++var2;
            ++var4;
         }
      } else {
         for(var4 = var5; var4 < var3; ++var4) {
            var7 = (bgb)var6.a.get(var1);
            var6.a.remove(var1);
            var6.a.add(var2 - 1, var7);
         }
      }

      var6.k();
   }

   public final void j(int var1, int var2) {
      k((bgb)super.b).d(var1, var2);
   }
}
