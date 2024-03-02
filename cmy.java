import java.util.HashMap;

public final class cmy implements cma {
   private final int a;
   private final Object b;

   public cmy(Object var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void ej(cmc var1, clv var2) {
      switch(this.a) {
      case 0:
         if (var2 == clv.ON_CREATE) {
            var1.getLifecycle().c(this);
            ((cnc)this.b).b();
            return;
         }

         StringBuilder var7 = new StringBuilder();
         var7.append("Next event must be ON_CREATE, it was ");
         var7.append(var2);
         IllegalStateException var8 = new IllegalStateException("Next event must be ON_CREATE, it was ".concat(var2.toString()));
         throw var8;
      case 1:
         new HashMap();
         clq[] var6 = (clq[])this.b;
         int var5 = var6.length;
         byte var4 = 0;

         int var3;
         for(var3 = 0; var3 < var5; ++var3) {
            var6[var3].a();
         }

         var6 = (clq[])this.b;
         var5 = var6.length;

         for(var3 = var4; var3 < var5; ++var3) {
            var6[var3].a();
         }

         return;
      default:
         ((clq)this.b).a();
         ((clq)this.b).a();
      }
   }
}
