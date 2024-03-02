public abstract class cmj {
   final cmm c;
   boolean d;
   int e;
   final cmk f;

   public cmj(cmk var1, cmm var2) {
      this.f = var1;
      this.e = -1;
      this.c = var2;
   }

   public abstract boolean a();

   public void b() {
   }

   public boolean c(cmc var1) {
      return false;
   }

   public final void d(boolean var1) {
      if (var1 != this.d) {
         this.d = var1;
         cmk var6 = this.f;
         byte var2;
         if (!var1) {
            var2 = -1;
         } else {
            var2 = 1;
         }

         int var3 = var6.d;
         var6.d = var2 + var3;
         if (!var6.e) {
            var6.e = true;
            int var19 = var3;

            while(true) {
               int var4;
               label298: {
                  Throwable var10000;
                  label312: {
                     boolean var10001;
                     try {
                        var4 = var6.d;
                     } catch (Throwable var18) {
                        var10000 = var18;
                        var10001 = false;
                        break label312;
                     }

                     if (var19 == var4) {
                        var6.e = false;
                        break;
                     }

                     boolean var20;
                     label285: {
                        if (var19 == 0) {
                           if (var4 > 0) {
                              var19 = 0;
                              var20 = true;
                              break label285;
                           }

                           var19 = 0;
                        }

                        var20 = false;
                     }

                     boolean var21;
                     if (var19 > 0 && var4 == 0) {
                        var21 = true;
                     } else {
                        var21 = false;
                     }

                     if (var20) {
                        label289:
                        try {
                           var6.e();
                        } catch (Throwable var16) {
                           var10000 = var16;
                           var10001 = false;
                           break label289;
                        }
                     } else {
                        if (!var21) {
                           break label298;
                        }

                        label291:
                        try {
                           var6.f();
                        } catch (Throwable var17) {
                           var10000 = var17;
                           var10001 = false;
                           break label291;
                        }
                     }
                     break label298;
                  }

                  Throwable var5 = var10000;
                  var6.e = false;
                  throw var5;
               }

               var19 = var4;
            }
         }

         if (this.d) {
            this.f.c(this);
         }

      }
   }
}
