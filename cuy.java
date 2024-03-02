class cuy extends cub {
   protected cdj[] m = null;
   String n;
   int o = 0;
   int p;

   public cuy() {
   }

   public cuy(cuy var1) {
      this.n = var1.n;
      int var2 = var1.p;
      this.p = 0;
      this.m = cbs.f(var1.m);
   }

   public boolean d() {
      return false;
   }

   public cdj[] getPathData() {
      return this.m;
   }

   public String getPathName() {
      return this.n;
   }

   public void setPathData(cdj[] var1) {
      cdj[] var6 = this.m;
      if (var6 != null && var1 != null) {
         int var2 = var1.length;
         if (var6.length == var2) {
            var2 = 0;

            while(true) {
               if (var2 >= var6.length) {
                  cdj[] var8 = this.m;

                  for(var2 = 0; var2 < var1.length; ++var2) {
                     var8[var2].a = var1[var2].a;
                     int var7 = 0;

                     while(true) {
                        float[] var9 = var1[var2].b;
                        if (var7 >= var9.length) {
                           break;
                        }

                        var8[var2].b[var7] = var9[var7];
                        ++var7;
                     }
                  }

                  return;
               }

               cdj var4 = var6[var2];
               char var3 = var4.a;
               cdj var5 = var1[var2];
               if (var3 != var5.a || var4.b.length != var5.b.length) {
                  break;
               }

               ++var2;
            }
         }
      }

      this.m = cbs.f(var1);
   }
}
