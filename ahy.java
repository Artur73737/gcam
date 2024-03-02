public final class ahy implements ahv {
   // $FF: synthetic method
   public final float a() {
      return 0.0F;
   }

   public final void b(bxr var1, int var2, int[] var3, bxy var4, int[] var5) {
      var4.getClass();
      if (var4 == bxy.a) {
         aib.b(var3, var5);
      } else {
         int var6 = 0;
         int var7 = 0;

         while(true) {
            int var8 = var3.length;
            if (var6 >= var8) {
               var6 = var2 - var7;

               for(var2 = var8 - 1; var2 >= 0; --var2) {
                  var7 = var3[var2];
                  var5[var2] = var6;
                  var6 += var7;
               }

               return;
            }

            var7 += var3[var6];
            ++var6;
         }
      }
   }

   public final String toString() {
      return "Arrangement#Start";
   }
}
