public class bhk {
   public final axf d = new axf(new bhj[16]);

   public boolean b(xl var1, bjf var2, blj var3, boolean var4) {
      axf var10 = this.d;
      int var7 = var10.b;
      boolean var8 = false;
      if (var7 > 0) {
         Object[] var11 = var10.a;
         int var5 = 0;
         boolean var9 = false;

         int var6;
         do {
            if (!((bhj)var11[var5]).b(var1, var2, var3, var4) && !var9) {
               var8 = false;
            } else {
               var8 = true;
            }

            var6 = var5 + 1;
            var5 = var6;
            var9 = var8;
         } while(var6 < var7);
      }

      return var8;
   }

   public final void e() {
      int var1 = 0;

      while(true) {
         axf var2 = this.d;
         if (var1 >= var2.b) {
            return;
         }

         bhj var3 = (bhj)var2.a[var1];
         if (!var3.a.y) {
            var2.c(var1);
            var3.a();
         } else {
            var3.e();
            ++var1;
         }
      }
   }

   public final void f() {
      for(int var1 = this.d.b - 1; var1 >= 0; --var1) {
         axf var2 = this.d;
         if (((bhj)var2.a[var1]).c.a == 0) {
            var2.c(var1);
         }
      }

   }
}
