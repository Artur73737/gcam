import android.support.constraint.Pv.bmSypa;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import java.util.Arrays;

public final class ah {
   public ak a = null;
   public float b = 0.0F;
   boolean c = false;
   public final ag d;
   boolean e = false;

   public ah(AmbientDelegate var1) {
      this.d = new ag(this, var1);
   }

   public final void a(ak var1) {
      ak var5 = this.a;
      if (var5 != null) {
         this.d.f(var5, -1.0F);
         this.a = null;
      }

      float var2 = -this.d.c(var1);
      this.a = var1;
      if (var2 != 1.0F) {
         this.b /= var2;
         ag var7 = this.d;
         int var4 = var7.e;

         for(int var3 = 0; var4 != -1 && var3 < var7.a; ++var3) {
            float[] var6 = var7.d;
            var6[var4] /= var2;
            var4 = var7.c[var4];
         }

      }
   }

   final void b() {
      ag var5 = this.d;
      int var2 = var5.e;

      for(int var1 = 0; var2 != -1 && var1 < var5.a; ++var1) {
         Object var6 = var5.h.a;
         int var3 = var5.b[var2];
         ak var8 = ((ak[])var6)[var3];
         var3 = 0;

         while(true) {
            int var4 = var8.g;
            if (var3 >= var4) {
               ah[] var7 = var8.f;
               var3 = var7.length;
               if (var4 >= var3) {
                  var8.f = (ah[])Arrays.copyOf(var7, var3 + var3);
               }

               var7 = var8.f;
               var3 = var8.g;
               var7[var3] = this;
               var8.g = var3 + 1;
               break;
            }

            if (var8.f[var3] == this) {
               break;
            }

            ++var3;
         }

         var2 = var5.c[var2];
      }

   }

   public final void c(ak var1, ak var2) {
      this.d.f(var1, 1.0F);
      this.d.f(var2, -1.0F);
   }

   final void d(ak var1, ak var2, int var3, float var4, ak var5, ak var6, int var7) {
      if (var2 == var5) {
         this.d.f(var1, 1.0F);
         this.d.f(var6, 1.0F);
         this.d.f(var2, -2.0F);
      } else {
         if (var4 == 0.5F) {
            this.d.f(var1, 1.0F);
            this.d.f(var2, -1.0F);
            this.d.f(var5, -1.0F);
            this.d.f(var6, 1.0F);
            if (var3 > 0 || var7 > 0) {
               this.b = (float)(-var3 + var7);
               return;
            }
         } else {
            if (var4 <= 0.0F) {
               this.d.f(var1, -1.0F);
               this.d.f(var2, 1.0F);
               this.b = (float)var3;
               return;
            }

            if (var4 >= 1.0F) {
               this.d.f(var5, -1.0F);
               this.d.f(var6, 1.0F);
               this.b = (float)var7;
               return;
            }

            ag var10 = this.d;
            float var8 = 1.0F - var4;
            var10.f(var1, var8);
            this.d.f(var2, -var8);
            this.d.f(var5, -var4);
            this.d.f(var6, var4);
            if (var3 > 0 || var7 > 0) {
               var3 = -var3;
               float var9 = (float)var7;
               this.b = (float)var3 * var8 + var9 * var4;
               return;
            }
         }

      }
   }

   public final void e(ak var1, ak var2, ak var3, ak var4, float var5) {
      this.d.f(var1, -1.0F);
      this.d.f(var2, 1.0F);
      this.d.f(var3, var5);
      var5 = -var5;
      this.d.f(var4, var5);
   }

   public final void f(float var1, float var2, float var3, ak var4, int var5, ak var6, int var7, ak var8, int var9, ak var10, int var11) {
      if (var2 != 0.0F && var1 != var3) {
         var1 /= var2;
         float var12 = var3 / var2;
         var5 = -var5;
         var2 = (float)var9;
         var3 = (float)var11;
         var1 /= var12;
         this.b = (float)(var5 - var7) + var2 * var1 + var3 * var1;
         this.d.f(var4, 1.0F);
         this.d.f(var6, -1.0F);
         this.d.f(var10, var1);
         this.d.f(var8, -var1);
      } else {
         this.b = (float)(-var5 - var7 + var9 + var11);
         this.d.f(var4, 1.0F);
         this.d.f(var6, -1.0F);
         this.d.f(var10, 1.0F);
         this.d.f(var8, -1.0F);
      }
   }

   public final void g(ak var1, int var2) {
      if (var2 < 0) {
         this.b = (float)(-var2);
         this.d.f(var1, 1.0F);
      } else {
         this.b = (float)var2;
         this.d.f(var1, -1.0F);
      }
   }

   public final void h(ak var1, ak var2, int var3) {
      if (var3 != 0) {
         boolean var4;
         if (var3 < 0) {
            var3 = -var3;
            var4 = true;
         } else {
            var4 = false;
         }

         this.b = (float)var3;
         if (var4) {
            this.d.f(var1, 1.0F);
            this.d.f(var2, -1.0F);
            return;
         }
      }

      this.d.f(var1, -1.0F);
      this.d.f(var2, 1.0F);
   }

   public final void i(ak var1, ak var2, ak var3, int var4) {
      if (var4 != 0) {
         boolean var5;
         if (var4 < 0) {
            var4 = -var4;
            var5 = true;
         } else {
            var5 = false;
         }

         this.b = (float)var4;
         if (var5) {
            this.d.f(var1, 1.0F);
            this.d.f(var2, -1.0F);
            this.d.f(var3, -1.0F);
            return;
         }
      }

      this.d.f(var1, -1.0F);
      this.d.f(var2, 1.0F);
      this.d.f(var3, 1.0F);
   }

   public final void j(ak var1, ak var2, ak var3, int var4) {
      if (var4 != 0) {
         int var5;
         boolean var7;
         if (var4 < 0) {
            var5 = -var4;
            var7 = true;
         } else {
            boolean var6 = false;
            var5 = var4;
            var7 = var6;
         }

         this.b = (float)var5;
         if (var7) {
            this.d.f(var1, 1.0F);
            this.d.f(var2, -1.0F);
            this.d.f(var3, 1.0F);
            return;
         }
      }

      this.d.f(var1, -1.0F);
      this.d.f(var2, 1.0F);
      this.d.f(var3, -1.0F);
   }

   public final void k(ah var1) {
      this.d.g(this, var1);
   }

   public final String toString() {
      String var6;
      StringBuilder var7;
      if (this.a == null) {
         var6 = "0";
      } else {
         var7 = new StringBuilder();
         var7.append("");
         ak var8 = this.a;
         var7.append(var8);
         var6 = "".concat(String.valueOf(var8));
      }

      float var1 = this.b;
      int var3 = 0;
      var6 = var6.concat(TRoaEYDrhZZT.bIyUnDZcGqnMlk);
      boolean var2;
      if (var1 != 0.0F) {
         var7 = new StringBuilder();
         var7.append(var6);
         var7.append(this.b);
         var6 = var7.toString();
         var2 = true;
      } else {
         var2 = false;
      }

      boolean var4;
      String var9;
      for(int var5 = this.d.a; var3 < var5; var2 = var4) {
         var9 = var6;
         var4 = var2;
         if (this.d.d(var3) != null) {
            var1 = this.d.b(var3);
            if (!var2) {
               if (var1 < 0.0F) {
                  var1 = -var1;
                  var6 = var6.concat(bmSypa.KsuBsAn);
               }
            } else {
               if (var1 > 0.0F) {
                  var9 = " + ";
               } else {
                  var1 = -var1;
                  var9 = " - ";
               }

               var6 = var6.concat(var9);
            }

            if (var1 == 1.0F) {
               var6 = var6.concat("null");
            } else {
               var7 = new StringBuilder();
               var7.append(var6);
               var7.append(var1);
               var7.append(" null");
               var6 = var7.toString();
            }

            var4 = true;
            var9 = var6;
         }

         ++var3;
         var6 = var9;
      }

      var9 = var6;
      if (!var2) {
         var9 = var6.concat("0.0");
      }

      return var9;
   }
}
