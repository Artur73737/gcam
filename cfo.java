import android.view.View;
import android.view.ViewParent;

public final class cfo {
   public boolean a;
   private ViewParent b;
   private ViewParent c;
   private final View d;
   private int[] e;

   public cfo(View var1) {
      this.d = var1;
   }

   private final ViewParent j(int var1) {
      switch(var1) {
      case 0:
         return this.b;
      default:
         return this.c;
      }
   }

   private final void k(int var1, ViewParent var2) {
      switch(var1) {
      case 0:
         this.b = var2;
         return;
      default:
         this.c = var2;
      }
   }

   private final int[] l() {
      if (this.e == null) {
         this.e = new int[2];
      }

      return this.e;
   }

   public final void a(boolean var1) {
      if (this.a) {
         cgd.r(this.d);
      }

      this.a = var1;
   }

   public final void b(int var1) {
      ViewParent var2 = this.j(var1);
      if (var2 != null) {
         ccf.f(var2, this.d, var1);
         this.k(var1, (ViewParent)null);
      }

   }

   public final boolean c(float var1, float var2, boolean var3) {
      if (this.a) {
         ViewParent var4 = this.b;
         if (var4 != null) {
            return ccf.g(var4, this.d, var1, var2, var3);
         }
      }

      return false;
   }

   public final boolean d(float var1, float var2) {
      if (this.a) {
         ViewParent var3 = this.b;
         if (var3 != null) {
            return ccf.h(var3, this.d, var1, var2);
         }
      }

      return false;
   }

   public final boolean e(int var1, int var2, int[] var3, int[] var4, int var5) {
      ViewParent var9;
      label43: {
         if (this.a) {
            var9 = this.j(var5);
            if (var9 == null) {
               return false;
            }

            if (var1 != 0) {
               break label43;
            }

            if (var2 != 0) {
               var1 = 0;
               break label43;
            }

            if (var4 != null) {
               var4[0] = 0;
               var4[1] = 0;
            }
         }

         return false;
      }

      int var6;
      int var7;
      if (var4 != null) {
         this.d.getLocationInWindow(var4);
         var7 = var4[0];
         var6 = var4[1];
      } else {
         var7 = 0;
         var6 = 0;
      }

      int[] var8 = var3;
      if (var3 == null) {
         var8 = this.l();
      }

      var8[0] = 0;
      var8[1] = 0;
      ccf.c(var9, this.d, var1, var2, var8, var5);
      if (var4 != null) {
         this.d.getLocationInWindow(var4);
         var4[0] -= var7;
         var4[1] -= var6;
      }

      return var8[0] != 0 || var8[1] != 0;
   }

   public final boolean f(int var1, int var2, int var3, int var4, int[] var5) {
      return this.g(var1, var2, var3, var4, var5, 0, (int[])null);
   }

   public final boolean g(int var1, int var2, int var3, int var4, int[] var5, int var6, int[] var7) {
      if (this.a) {
         ViewParent var10 = this.j(var6);
         if (var10 == null) {
            return false;
         } else {
            if (var1 == 0) {
               if (var2 == 0) {
                  if (var3 == 0) {
                     if (var4 == 0) {
                        if (var5 != null) {
                           var5[0] = 0;
                           var5[1] = 0;
                        }

                        return false;
                     }

                     var1 = 0;
                     var2 = 0;
                     var3 = 0;
                  } else {
                     var1 = 0;
                     var2 = 0;
                  }
               } else {
                  var1 = 0;
               }
            }

            int var8;
            int var9;
            if (var5 != null) {
               this.d.getLocationInWindow(var5);
               var8 = var5[0];
               var9 = var5[1];
            } else {
               var8 = 0;
               var9 = 0;
            }

            if (var7 == null) {
               var7 = this.l();
               var7[0] = 0;
               var7[1] = 0;
            }

            ccf.d(var10, this.d, var1, var2, var3, var4, var6, var7);
            if (var5 != null) {
               this.d.getLocationInWindow(var5);
               var5[0] -= var8;
               var5[1] -= var9;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public final boolean h(int var1) {
      return this.j(var1) != null;
   }

   public final boolean i(int var1, int var2) {
      if (this.h(var2)) {
         return true;
      } else {
         if (this.a) {
            ViewParent var3 = this.d.getParent();

            for(View var4 = this.d; var3 != null; var3 = var3.getParent()) {
               if (ccf.i(var3, var4, this.d, var1, var2)) {
                  this.k(var2, var3);
                  ccf.e(var3, var4, this.d, var1, var2);
                  return true;
               }

               if (var3 instanceof View) {
                  var4 = (View)var3;
               }
            }
         }

         return false;
      }
   }
}
