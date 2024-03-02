public class riv {
   private final qyo a = qwp.g(0);
   public riw[] b;

   private final void h(int var1, int var2) {
      riw[] var3 = this.b;
      var3.getClass();
      riw var5 = var3[var2];
      var5.getClass();
      riw var4 = var3[var1];
      var4.getClass();
      var3[var1] = var5;
      var3[var2] = var4;
      var5.f(var1);
      var4.f(var2);
   }

   public final int a() {
      return this.a.b;
   }

   public final riw b() {
      riw[] var1 = this.b;
      return var1 != null ? var1[0] : null;
   }

   public final riw c() {
      synchronized(this){}

      riw var1;
      try {
         var1 = this.b();
      } finally {
         ;
      }

      return var1;
   }

   public final riw d(int var1) {
      boolean var5 = qzx.a;
      riw[] var6 = this.b;
      var6.getClass();
      this.e(this.a() - 1);
      riw var7;
      if (var1 < this.a()) {
         label26: {
            this.h(var1, this.a());
            int var2 = var1;
            int var3;
            Comparable var8;
            if (var1 > 0) {
               var3 = (var1 - 1) / 2;
               var7 = var6[var1];
               var7.getClass();
               var8 = (Comparable)var7;
               var7 = var6[var3];
               var7.getClass();
               var2 = var1;
               if (var8.compareTo(var7) < 0) {
                  this.h(var1, var3);
                  this.f(var3);
                  break label26;
               }
            }

            while(true) {
               int var4 = var2 + var2 + 1;
               if (var4 >= this.a()) {
                  break;
               }

               riw[] var10 = this.b;
               var10.getClass();
               var3 = var4 + 1;
               var1 = var4;
               riw var11;
               if (var3 < this.a()) {
                  var11 = var10[var3];
                  var11.getClass();
                  Comparable var9 = (Comparable)var11;
                  var11 = var10[var4];
                  var11.getClass();
                  var1 = var4;
                  if (var9.compareTo(var11) < 0) {
                     var1 = var3;
                  }
               }

               var11 = var10[var2];
               var11.getClass();
               var8 = (Comparable)var11;
               var7 = var10[var1];
               var7.getClass();
               if (var8.compareTo(var7) <= 0) {
                  break;
               }

               this.h(var2, var1);
               var2 = var1;
            }
         }
      }

      var7 = var6[this.a()];
      var7.getClass();
      var7.e((riv)null);
      var7.f(-1);
      var6[this.a()] = null;
      return var7;
   }

   public final void e(int var1) {
      this.a.b = var1;
   }

   public final void f(int var1) {
      while(var1 > 0) {
         riw[] var4 = this.b;
         var4.getClass();
         int var2 = var1 - 1 >> 1;
         riw var3 = var4[var2];
         var3.getClass();
         Comparable var5 = (Comparable)var3;
         riw var6 = var4[var1];
         var6.getClass();
         if (var5.compareTo(var6) <= 0) {
            return;
         }

         this.h(var1, var2);
         var1 = var2;
      }

   }

   public final boolean g() {
      return this.a() == 0;
   }
}
