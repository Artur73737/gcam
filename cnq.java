public final class cnq implements cnj {
   private final ebt[] a;

   public cnq(ebt... var1) {
      var1.getClass();
      super();
      this.a = var1;
   }

   // $FF: synthetic method
   public final cnh a(Class var1) {
      throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
   }

   public final cnh b(Class var1, cnp var2) {
      ebt[] var6 = this.a;
      int var4 = var6.length;
      int var3 = 0;

      Object var5;
      for(var5 = null; var3 < var4; ++var3) {
         ebt var7 = var6[var3];
         if (c.E(var7.a, var1)) {
            var5 = ((qvt)var7.b).eo(var2);
         }
      }

      if (var5 != null) {
         return (cnh)var5;
      } else {
         IllegalArgumentException var8 = new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(var1.getName())));
         throw var8;
      }
   }
}
