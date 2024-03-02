import java.util.HashSet;

public final class al {
   final am a;
   al b;
   public int c = 0;
   int d = -1;
   public int e = 0;
   public ak f;
   final int g;
   public int h = 1;
   public int i = 1;

   public al(am var1, int var2) {
      this.a = var1;
      this.g = var2;
   }

   private final String f(HashSet var1) {
      if (var1.add(this)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("null:");
         var2.append(c.ax(this.g));
         al var3 = this.b;
         String var4;
         if (var3 != null) {
            var4 = " connected to ".concat(var3.f(var1));
         } else {
            var4 = "";
         }

         var2.append(var4);
         return var2.toString();
      } else {
         return "<-";
      }
   }

   public final int a() {
      if (this.a.K == 8) {
         return 0;
      } else {
         int var1 = this.d;
         if (var1 >= 0) {
            al var2 = this.b;
            if (var2 != null && var2.a.K == 8) {
               return var1;
            }
         }

         return this.c;
      }
   }

   public final void b() {
      this.b = null;
      this.c = 0;
      this.d = -1;
      this.h = 2;
      this.e = 0;
      this.i = 1;
   }

   public final boolean c() {
      return this.b != null;
   }

   public final void d(al var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var10 = true;
      boolean var11 = true;
      if (var1 == null) {
         this.b = null;
         this.c = 0;
         this.d = -1;
         this.h = 1;
         this.e = 2;
      } else {
         if (!var6) {
            int var8 = var1.g;
            int var7 = this.g;
            if (var8 == var7) {
               if (var7 == 7 || var7 == 6 && (!var1.a.r() || !this.a.r())) {
                  return;
               }
            } else {
               label75: {
                  int var9;
                  boolean var12;
                  boolean var13;
                  switch(var7 - 1) {
                  case 1:
                  case 3:
                     var12 = var10;
                     var9 = var8;
                     if (var8 != 2) {
                        if (var8 == 4) {
                           var9 = 4;
                           var12 = var10;
                        } else {
                           var12 = false;
                           var9 = var8;
                        }
                     }

                     var13 = var12;
                     if (var1.a instanceof ao) {
                        if (!var12 && var9 != 8) {
                           return;
                        }
                        break label75;
                     }
                     break;
                  case 2:
                  case 4:
                     var12 = var11;
                     var9 = var8;
                     if (var8 != 3) {
                        if (var8 == 5) {
                           var9 = 5;
                           var12 = var11;
                        } else {
                           var12 = false;
                           var9 = var8;
                        }
                     }

                     var13 = var12;
                     if (var1.a instanceof ao) {
                        if (!var12 && var9 != 9) {
                           return;
                        }
                        break label75;
                     }
                     break;
                  case 5:
                  default:
                     return;
                  case 6:
                     if (var8 == 6 || var8 == 8 || var8 == 9) {
                        return;
                     }
                     break label75;
                  }

                  if (!var13) {
                     return;
                  }
               }
            }
         }

         this.b = var1;
         if (var2 > 0) {
            this.c = var2;
         } else {
            this.c = 0;
         }

         this.d = var3;
         this.h = var4;
         this.e = var5;
      }
   }

   public final void e() {
      ak var1 = this.f;
      if (var1 == null) {
         this.f = new ak(1);
      } else {
         var1.b();
      }
   }

   public final String toString() {
      HashSet var1 = new HashSet();
      StringBuilder var2 = new StringBuilder();
      var2.append("null:");
      var2.append(c.ax(this.g));
      al var3 = this.b;
      String var4;
      if (var3 != null) {
         var4 = " connected to ".concat(var3.f(var1));
      } else {
         var4 = "";
      }

      var2.append(var4);
      return var2.toString();
   }
}
