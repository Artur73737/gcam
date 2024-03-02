import java.util.ArrayList;
import java.util.List;

public final class bki extends bma {
   public static final bki a = new bki();

   private bki() {
      super("Undefined intrinsics block and it is required");
   }

   public final bju a(bjw var1, List var2, long var3) {
      bju var11;
      if (var2.isEmpty()) {
         var11 = ja.g(var1, bxq.d(var3), bxq.c(var3), axa.m);
      } else {
         int var5 = var2.size();
         byte var7 = 0;
         bke var12;
         if (var5 == 1) {
            var12 = ((bjs)var2.get(0)).l(var3);
            var11 = ja.g(var1, car.W(var3, var12.a), car.V(var3, var12.b), new bkh(var12, 0));
         } else {
            ArrayList var10 = new ArrayList(var2.size());
            int var6 = var2.size();

            for(var5 = 0; var5 < var6; ++var5) {
               var10.add(((bjs)var2.get(var5)).l(var3));
            }

            int var9 = var10.size();
            byte var8 = 0;
            var6 = 0;
            var5 = var7;

            int var13;
            for(var13 = var8; var5 < var9; ++var5) {
               var12 = (bke)var10.get(var5);
               var13 = Math.max(var12.a, var13);
               var6 = Math.max(var12.b, var6);
            }

            var11 = ja.g(var1, car.W(var3, var13), car.V(var3, var6), new bkh(var10, 2));
         }
      }

      return var11;
   }
}
