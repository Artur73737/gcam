public final class rjq {
   public final qyq a;
   public final qyp b;
   public final qyo c;
   public final qvt d;
   private final int e;
   private final qyq f;
   private final qyp g;

   public rjq(int var1) {
      this.e = var1;
      this.g = qwp.h(0L);
      this.b = qwp.h(0L);
      rht var2 = new rht(0L, (rht)null, 2);
      this.f = qwp.i(var2);
      this.a = qwp.i(var2);
      this.c = qwp.g(var1 - 1);
      this.d = new qsp(this, 13);
   }

   public final void a() {
      label97:
      while(true) {
         qyo var8 = this.c;

         int var1;
         int var2;
         do {
            var2 = var8.b;
            var1 = this.e;
            if (var2 >= var1) {
               IllegalStateException var16 = new IllegalStateException(c.aE(var1, "The number of released permits cannot be greater than "));
               throw var16;
            }
         } while(!var8.c(var2, var2 + 1));

         if (var2 >= 0) {
            return;
         }

         rht var10 = (rht)this.f.a;
         long var4 = this.g.b();
         long var6 = var4 / (long)rjr.f;
         qyq var11 = this.f;

         Object var9;
         rht var13;
         label90:
         while(true) {
            var13 = var10;

            while(true) {
               if (var13.b >= var6) {
                  var9 = var13;
                  if (!var13.g()) {
                     break;
                  }
               }

               Object var12 = var13.a();
               var9 = rhs.a;
               if (var12 == var9) {
                  break;
               }

               rht var14 = (rht)var12;
               if (var14 != null) {
                  var13 = var14;
               } else {
                  var14 = rjr.a(var13.b + 1L, var13);
                  if (var13.e(var14)) {
                     if (var13.g()) {
                        var13.c();
                     }

                     var13 = var14;
                  }
               }
            }

            if (rio.a(var9)) {
               break;
            }

            var13 = rio.b(var9);

            while(true) {
               rht var19 = (rht)var11.a;
               if (var19.b >= var13.b) {
                  break label90;
               }

               if (!var13.h()) {
                  break;
               }

               if (var11.d(var19, var13)) {
                  if (var19.f()) {
                     var19.c();
                  }
                  break label90;
               }

               if (var13.f()) {
                  var13.c();
               }
            }
         }

         var13 = rio.b(var9);
         var13.a.b((Object)null);
         if (var13.b <= var6) {
            int var3 = (int)(var4 % (long)rjr.f);
            riq var18 = rjr.b;
            var9 = var13.d.k(var3).a(var18);
            if (var9 != null) {
               if (var9 != rjr.e) {
                  qza var15 = (qza)var9;
                  if (var15.z(qsn.a, this.d) != null) {
                     var15.B();
                     return;
                  }
               }
            } else {
               var2 = rjr.a;
               var1 = 0;

               while(true) {
                  if (var1 >= var2) {
                     var18 = rjr.b;
                     riq var17 = rjr.d;
                     if (var13.d.k(var3).d(var18, var17)) {
                        continue label97;
                     }
                     break;
                  }

                  if (var13.d.k(var3).a == rjr.c) {
                     break;
                  }

                  ++var1;
               }

               return;
            }
         }
      }
   }
}
