import java.util.List;

final class aif implements bjt {
   final boolean a;
   final bar b;

   public aif(boolean var1, bar var2) {
      this.a = var1;
      this.b = var2;
   }

   public final bju a(bjw var1, List var2, long var3) {
      if (var2.isEmpty()) {
         return ja.g(var1, bxq.d(var3), bxq.c(var3), aal.j);
      } else {
         long var7;
         if (this.a) {
            var7 = var3;
         } else {
            var7 = bxq.k(var3, 0, 0, 0, 0, 10);
         }

         int var6 = var2.size();
         int var5 = 0;
         if (var6 == 1) {
            bjs var14 = (bjs)var2.get(0);
            aig.c(var14);
            bke var13 = var14.l(var7);
            var5 = Math.max(bxq.d(var3), var13.a);
            var6 = Math.max(bxq.c(var3), var13.b);
            return ja.g(var1, var5, var6, new aid(var13, var14, var1, var5, var6, this.b));
         } else {
            bke[] var9 = new bke[var2.size()];
            qwx var11 = new qwx();
            var11.a = bxq.d(var3);
            qwx var10 = new qwx();
            var10.a = bxq.c(var3);

            for(var6 = var2.size(); var5 < var6; ++var5) {
               bjs var12 = (bjs)var2.get(var5);
               aig.c(var12);
               bke var15 = var12.l(var7);
               var9[var5] = var15;
               var11.a = Math.max(var11.a, var15.a);
               var10.a = Math.max(var10.a, var15.b);
            }

            return ja.g(var1, var11.a, var10.a, new aie(var9, var2, var1, var11, var10, this.b));
         }
      }
   }
}
