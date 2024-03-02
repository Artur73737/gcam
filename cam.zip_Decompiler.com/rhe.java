public final class rhe extends qwq implements qvx {
   public static final rhe a = new rhe(0);
   public static final rhe b = new rhe(1);
   public static final rhe c = new rhe(2);
   public static final rhe d = new rhe(3);
   public static final rhe e = new rhe(4);
   private final int f;

   public rhe(int var1) {
      super(2);
      this.f = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var3 = this.f;
      Object[] var4 = null;
      qug var5 = null;
      qug var7;
      switch(var3) {
      case 0:
         var3 = ((Number)var1).intValue();
         ((qug)var2).getClass();
         return var3 + 1;
      case 1:
         return c.E(var1, var2);
      case 2:
         var5 = (qug)var2;
         var5.getClass();
         var2 = var1;
         if (var5 instanceof rca) {
            Integer var8;
            if (var1 instanceof Integer) {
               var8 = (Integer)var1;
            } else {
               var8 = var4;
            }

            if (var8 != null) {
               var3 = var8;
            } else {
               var3 = 1;
            }

            if (var3 == 0) {
               var2 = var5;
            } else {
               var2 = var3 + 1;
            }
         }

         return var2;
      case 3:
         rca var6 = (rca)var1;
         var7 = (qug)var2;
         var7.getClass();
         if (var6 == null) {
            if (var7 instanceof rca) {
               var6 = (rca)var7;
            } else {
               var6 = var5;
            }
         }

         return var6;
      default:
         rix var9 = (rix)var1;
         var7 = (qug)var2;
         var9.getClass();
         var7.getClass();
         if (var7 instanceof rca) {
            rca var10 = (rca)var7;
            Object var12 = var10.gH(var9.a);
            var4 = var9.b;
            var3 = var9.d;
            var4[var3] = var12;
            rca[] var11 = var9.c;
            var9.d = var3 + 1;
            var11[var3] = var10;
         }

         return var9;
      }
   }
}
