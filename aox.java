import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class aox implements bjt {
   final String a;
   final String b;

   public aox() {
      this.a = "action";
      this.b = "text";
      super();
   }

   public final bju a(bjw var1, List var2, long var3) {
      String var12 = this.a;
      Iterator var11 = var2.iterator();

      bjs var13;
      do {
         if (!var11.hasNext()) {
            NoSuchElementException var14 = new NoSuchElementException("Collection contains no element matching the predicate.");
            throw var14;
         }

         var13 = (bjs)var11.next();
      } while(!c.E(iz.j(var13), var12));

      bke var17 = var13.l(var3);
      int var5 = qxb.k(bxq.b(var3) - var17.a - var1.eJ(8.0F), bxq.d(var3));
      var12 = this.b;
      Iterator var18 = var2.iterator();

      bjs var15;
      do {
         if (!var18.hasNext()) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
         }

         var15 = (bjs)var18.next();
      } while(!c.E(iz.j(var15), var12));

      bke var16 = var15.l(bxq.k(var3, 0, var5, 0, 0, 9));
      var5 = var16.m(biu.a);
      if (var5 != Integer.MIN_VALUE) {
         int var6 = var16.m(biu.b);
         if (var6 != Integer.MIN_VALUE) {
            int var9 = bxq.b(var3);
            int var10 = var17.a;
            int var7;
            int var8;
            if (var5 == var6) {
               var8 = Math.max(var1.eJ(48.0F), var17.b);
               var6 = (var8 - var16.b) / 2;
               var7 = var17.m(biu.a);
               if (var7 != Integer.MIN_VALUE) {
                  var5 = var5 + var6 - var7;
               } else {
                  var5 = 0;
               }

               var7 = var5;
            } else {
               var5 = var1.eJ(30.0F) - var5;
               var8 = Math.max(var1.eJ(68.0F), var16.b + var5);
               var7 = (var8 - var17.b) / 2;
               var6 = var5;
            }

            return ja.g(var1, bxq.b(var3), var8, new aow(var16, var6, var17, var9 - var10, var7));
         } else {
            throw new IllegalArgumentException("No baselines for text");
         }
      } else {
         throw new IllegalArgumentException("No baselines for text");
      }
   }
}
