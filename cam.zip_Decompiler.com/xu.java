import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xu implements bjt {
   private final lmk a;

   public xu(lmk var1) {
      var1.getClass();
      super();
      this.a = var1;
   }

   public final bju a(bjw var1, List var2, long var3) {
      ArrayList var15 = new ArrayList(pwm.aL(var2));
      Iterator var16 = var2.iterator();

      while(var16.hasNext()) {
         var15.add(((bjs)var16.next()).l(var3));
      }

      boolean var12 = var15.isEmpty();
      Object var14 = null;
      int var8 = 1;
      byte var9 = 0;
      int var5;
      int var6;
      int var7;
      int var10;
      int var11;
      Object var13;
      Object var17;
      if (var12) {
         var17 = null;
      } else {
         var13 = var15.get(0);
         var5 = ((bke)var13).a;
         var11 = pwm.al(var15);
         var17 = var13;
         if (var11 > 0) {
            var7 = 1;

            while(true) {
               var17 = var15.get(var7);
               var10 = ((bke)var17).a;
               if (var5 < var10) {
                  var6 = var10;
               } else {
                  var6 = var5;
               }

               if (var5 < var10) {
                  var13 = var17;
               }

               var17 = var13;
               if (var7 == var11) {
                  break;
               }

               ++var7;
               var5 = var6;
            }
         }
      }

      bke var18 = (bke)var17;
      if (var18 != null) {
         var7 = var18.a;
      } else {
         var7 = 0;
      }

      if (var15.isEmpty()) {
         var13 = var14;
      } else {
         var17 = var15.get(0);
         var5 = ((bke)var17).b;
         var11 = pwm.al(var15);
         var13 = var17;
         if (var11 > 0) {
            while(true) {
               var13 = var15.get(var8);
               var10 = ((bke)var13).b;
               if (var5 < var10) {
                  var6 = var10;
               } else {
                  var6 = var5;
               }

               if (var5 < var10) {
                  var17 = var13;
               }

               var13 = var17;
               if (var8 == var11) {
                  break;
               }

               ++var8;
               var5 = var6;
            }
         }
      }

      var18 = (bke)var13;
      if (var18 != null) {
         var5 = var18.b;
      } else {
         var5 = var9;
      }

      ((att)this.a.a).b(bxx.c(car.I(var7, var5)));
      return ja.g(var1, var7, var5, new ou(var15, 7));
   }
}
