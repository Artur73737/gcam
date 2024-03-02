public class cfa implements cez {
   private final Object[] a;
   private int b;

   public cfa(int var1) {
      this.a = new Object[var1];
   }

   public Object a() {
      int var1 = this.b;
      if (var1 > 0) {
         --var1;
         Object[] var2 = this.a;
         Object var3 = var2[var1];
         var2[var1] = null;
         this.b = var1;
         return var3;
      } else {
         return null;
      }
   }

   public boolean b(Object var1) {
      int var2 = 0;

      while(true) {
         int var3 = this.b;
         if (var2 >= var3) {
            Object[] var4 = this.a;
            if (var3 < var4.length) {
               var4[var3] = var1;
               this.b = var3 + 1;
               return true;
            }

            return false;
         }

         if (this.a[var2] == var1) {
            throw new IllegalStateException("Already in the pool!");
         }

         ++var2;
      }
   }
}
