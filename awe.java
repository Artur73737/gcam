public final class awe extends awu {
   public static final awe a = new awe();

   private awe() {
      super(0, 3, 1);
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      aut var6 = (aut)var1.c(1);
      nxj var5 = (nxj)var1.c(0);
      blj var7 = (blj)var1.c(2);
      auw var10 = var6.b();

      try {
         if (!((awy)var7.b).e()) {
            asr.k("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            qsc var11 = new qsc();
            throw var11;
         }

         ((awy)var7.a).g(var2, var10, var4);
      } finally {
         var10.s();
      }

      var3.r();
      var3.R(var6, var5.e(var6));
      var3.t();
   }

   public final String c(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "anchor";
      } else if (c.n(var1, 1)) {
         var2 = "from";
      } else if (c.n(var1, 2)) {
         var2 = "fixups";
      } else {
         var2 = super.c(var1);
      }

      return var2;
   }
}
