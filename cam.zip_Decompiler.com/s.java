import java.io.Serializable;

final class s implements Serializable, m {
   private static final long serialVersionUID = 1L;
   private final int a;
   private final boolean b;
   private final boolean c;
   private final double d;
   private final double e;
   private final long[] f;
   private final int g;

   public s(int var1, boolean var2, int var3, boolean var4, double var5, double var7, long[] var9) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var7;
      this.f = var9;
      this.g = var3;
   }

   public final boolean a(o var1) {
      double var2;
      int var6;
      int var7;
      label83: {
         label82: {
            var7 = this.g;
            long var8;
            switch(var7 - 1) {
            case 1:
               var8 = var1.f;
               break;
            case 2:
               var8 = var1.d;
               break;
            case 3:
               var8 = var1.e;
               break;
            case 4:
               var6 = var1.b;
               break label82;
            case 5:
               var6 = var1.c;
               break label82;
            default:
               var2 = var1.a;
               break label83;
            }

            var2 = (double)var8;
            break label83;
         }

         var2 = (double)var6;
      }

      label88: {
         double var4;
         if (this.c) {
            var4 = (double)((long)var2);
            Double.isNaN(var4);
            if (var2 - var4 != 0.0D) {
               break label88;
            }
         }

         if (var7 != 7 || var1.b == 0) {
            var6 = this.a;
            if (var6 != 0) {
               var4 = (double)var6;
               Double.isNaN(var4);
               var2 %= var4;
            }

            boolean var10;
            if (var2 >= this.d && var2 <= this.e) {
               var10 = true;
            } else {
               var10 = false;
            }

            boolean var11 = var10;
            if (var10) {
               var11 = var10;
               if (this.f != null) {
                  var10 = false;
                  var6 = 0;

                  while(true) {
                     var11 = var10;
                     if (var10) {
                        break;
                     }

                     long[] var12 = this.f;
                     var11 = var10;
                     if (var6 >= var12.length) {
                        break;
                     }

                     if (var2 >= (double)var12[var6] && var2 <= (double)var12[var6 + 1]) {
                        var10 = true;
                     } else {
                        var10 = false;
                     }

                     var6 += 2;
                  }
               }
            }

            return this.b == var11;
         }
      }

      if (!this.b) {
         return true;
      } else {
         return false;
      }
   }

   public final String toString() {
      StringBuilder var8 = new StringBuilder();
      String var7;
      switch(this.g) {
      case 1:
         var7 = "n";
         break;
      case 2:
         var7 = "i";
         break;
      case 3:
         var7 = "f";
         break;
      case 4:
         var7 = "t";
         break;
      case 5:
         var7 = "v";
         break;
      case 6:
         var7 = "w";
         break;
      default:
         var7 = "j";
      }

      var8.append(var7);
      if (this.a != 0) {
         var8.append(" % ");
         var8.append(this.a);
      }

      double var1;
      double var3;
      label52: {
         var1 = this.d;
         var3 = this.e;
         var7 = " = ";
         if (var1 != var3) {
            if (!this.c) {
               if (this.b) {
                  var7 = " within ";
               } else {
                  var7 = " not within ";
               }
               break label52;
            }

            if (this.b) {
               break label52;
            }
         } else if (this.b) {
            break label52;
         }

         var7 = " != ";
      }

      var8.append(var7);
      if (this.f != null) {
         int var5 = 0;

         while(true) {
            long[] var9 = this.f;
            if (var5 >= var9.length) {
               break;
            }

            var1 = (double)var9[var5];
            var3 = (double)var9[var5 + 1];
            boolean var6;
            if (var5 != 0) {
               var6 = true;
            } else {
               var6 = false;
            }

            v.b(var8, var1, var3, var6);
            var5 += 2;
         }
      } else {
         v.b(var8, this.d, this.e, false);
      }

      return var8.toString();
   }
}
