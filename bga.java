public class bga {
   public final boolean h;
   public final boolean i;

   // $FF: synthetic method
   public bga(boolean var1, boolean var2, int var3) {
      boolean var4 = true;
      boolean var5;
      if (1 != (var1 & (var3 & 1 ^ 1))) {
         var5 = false;
      } else {
         var5 = true;
      }

      this.h = var5;
      if ((var3 & 2) != 0) {
         var4 = false;
      }

      this.i = var4 & var2;
   }
}
