import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

public final class ag {
   public int a = 0;
   public int[] b = new int[8];
   public int[] c = new int[8];
   public float[] d = new float[8];
   public int e = -1;
   public int f = -1;
   public boolean g = false;
   public final AmbientDelegate h;
   private final ah i;
   private int j = 8;

   public ag(ah var1, AmbientDelegate var2) {
      this.i = var1;
      this.h = var2;
   }

   public final float a(ak var1) {
      int var3 = this.e;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (this.b[var3] == var1.a) {
            return this.d[var3];
         }

         var3 = this.c[var3];
      }

      return 0.0F;
   }

   final float b(int var1) {
      int var3 = this.e;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (var2 == var1) {
            return this.d[var3];
         }

         var3 = this.c[var3];
      }

      return 0.0F;
   }

   public final float c(ak var1) {
      int var2 = this.e;
      if (var2 != -1) {
         int var3 = 0;

         int var5;
         for(int var4 = -1; var2 != -1 && var3 < this.a; var2 = var5) {
            var5 = this.b[var2];
            if (var5 == var1.a) {
               if (var2 == this.e) {
                  this.e = this.c[var2];
               } else {
                  int[] var6 = this.c;
                  var6[var4] = var6[var2];
               }

               ((ak[])this.h.a)[var5].a(this.i);
               --this.a;
               this.b[var2] = -1;
               if (this.g) {
                  this.f = var2;
               }

               return this.d[var2];
            }

            var5 = this.c[var2];
            ++var3;
            var4 = var2;
         }
      }

      return 0.0F;
   }

   final ak d(int var1) {
      int var3 = this.e;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (var2 == var1) {
            Object var4 = this.h.a;
            var1 = this.b[var3];
            return ((ak[])var4)[var1];
         }

         var3 = this.c[var3];
      }

      return null;
   }

   public final void e(ak var1, float var2) {
      if (var2 != 0.0F) {
         int var3 = this.e;
         if (var3 == -1) {
            this.e = 0;
            this.d[0] = var2;
            this.b[0] = var1.a;
            this.c[0] = -1;
            ++this.a;
            if (!this.g) {
               ++this.f;
            }

         } else {
            int var4 = 0;

            int var5;
            int var6;
            int[] var10;
            for(var6 = -1; var3 != -1 && var4 < this.a; ++var4) {
               var5 = this.b[var3];
               int var7 = var1.a;
               if (var5 == var7) {
                  float[] var9 = this.d;
                  var2 += var9[var3];
                  var9[var3] = var2;
                  if (var2 == 0.0F) {
                     if (var3 == this.e) {
                        this.e = this.c[var3];
                     } else {
                        var10 = this.c;
                        var10[var6] = var10[var3];
                     }

                     ((ak[])this.h.a)[var5].a(this.i);
                     if (this.g) {
                        this.f = var3;
                     }

                     --this.a;
                     return;
                  }

                  return;
               }

               if (var5 < var7) {
                  var6 = var3;
               }

               var3 = this.c[var3];
            }

            var4 = this.f;
            int[] var8;
            if (this.g) {
               var8 = this.b;
               var3 = var4;
               if (var8[var4] != -1) {
                  var3 = var8.length;
               }
            } else {
               var3 = var4 + 1;
            }

            var5 = this.b.length;
            var4 = var3;
            if (var3 >= var5) {
               var4 = var3;
               if (this.a < var5) {
                  var5 = 0;

                  while(true) {
                     var8 = this.b;
                     var4 = var3;
                     if (var5 >= var8.length) {
                        break;
                     }

                     if (var8[var5] == -1) {
                        var4 = var5;
                        break;
                     }

                     ++var5;
                  }
               }
            }

            var5 = this.b.length;
            var3 = var4;
            if (var4 >= var5) {
               var3 = this.j;
               var3 += var3;
               this.j = var3;
               this.g = false;
               this.f = var5 - 1;
               this.d = Arrays.copyOf(this.d, var3);
               this.b = Arrays.copyOf(this.b, this.j);
               this.c = Arrays.copyOf(this.c, this.j);
               var3 = var5;
            }

            var8 = this.b;
            var8[var3] = var1.a;
            this.d[var3] = var2;
            if (var6 != -1) {
               var10 = this.c;
               var10[var3] = var10[var6];
               var10[var6] = var3;
            } else {
               this.c[var3] = this.e;
               this.e = var3;
            }

            ++this.a;
            if (!this.g) {
               ++this.f;
            }

            var4 = this.f;
            var3 = var8.length;
            if (var4 >= var3) {
               this.g = true;
               this.f = var3 - 1;
            }

         }
      }
   }

   public final void f(ak var1, float var2) {
      if (var2 == 0.0F) {
         this.c(var1);
      } else {
         int var3 = this.e;
         if (var3 == -1) {
            this.e = 0;
            this.d[0] = var2;
            this.b[0] = var1.a;
            this.c[0] = -1;
            ++this.a;
            if (!this.g) {
               ++this.f;
            }

         } else {
            int var4 = 0;

            int var5;
            int var6;
            for(var6 = -1; var3 != -1 && var4 < this.a; ++var4) {
               var5 = this.b[var3];
               int var7 = var1.a;
               if (var5 == var7) {
                  this.d[var3] = var2;
                  return;
               }

               if (var5 < var7) {
                  var6 = var3;
               }

               var3 = this.c[var3];
            }

            var4 = this.f;
            int[] var8;
            if (this.g) {
               var8 = this.b;
               var3 = var4;
               if (var8[var4] != -1) {
                  var3 = var8.length;
               }
            } else {
               var3 = var4 + 1;
            }

            var5 = this.b.length;
            var4 = var3;
            if (var3 >= var5) {
               var4 = var3;
               if (this.a < var5) {
                  var5 = 0;

                  while(true) {
                     var8 = this.b;
                     var4 = var3;
                     if (var5 >= var8.length) {
                        break;
                     }

                     if (var8[var5] == -1) {
                        var4 = var5;
                        break;
                     }

                     ++var5;
                  }
               }
            }

            var5 = this.b.length;
            var3 = var4;
            if (var4 >= var5) {
               var3 = this.j;
               var3 += var3;
               this.j = var3;
               this.g = false;
               this.f = var5 - 1;
               this.d = Arrays.copyOf(this.d, var3);
               this.b = Arrays.copyOf(this.b, this.j);
               this.c = Arrays.copyOf(this.c, this.j);
               var3 = var5;
            }

            var8 = this.b;
            var8[var3] = var1.a;
            this.d[var3] = var2;
            if (var6 != -1) {
               int[] var9 = this.c;
               var9[var3] = var9[var6];
               var9[var6] = var3;
            } else {
               this.c[var3] = this.e;
               this.e = var3;
            }

            var3 = this.a + 1;
            this.a = var3;
            if (!this.g) {
               ++this.f;
            }

            if (var3 >= var8.length) {
               this.g = true;
            }

         }
      }
   }

   final void g(ah var1, ah var2) {
      int var4 = this.e;
      int var5 = 0;

      while(var4 != -1 && var5 < this.a) {
         int var6 = this.b[var4];
         ak var7 = var2.a;
         if (var6 != var7.a) {
            var4 = this.c[var4];
            ++var5;
         } else {
            float var3 = this.d[var4];
            this.c(var7);
            ag var9 = var2.d;
            var5 = var9.e;

            for(var4 = 0; var5 != -1 && var4 < var9.a; ++var4) {
               Object var8 = this.h.a;
               var6 = var9.b[var5];
               this.e(((ak[])var8)[var6], var9.d[var5] * var3);
               var5 = var9.c[var5];
            }

            var1.b += var2.b * var3;
            var2.a.a(var1);
            var4 = this.e;
            var5 = 0;
         }
      }

   }

   public final String toString() {
      int var2 = this.e;
      int var1 = 0;

      String var4;
      for(var4 = ""; var2 != -1 && var1 < this.a; ++var1) {
         var4 = var4.concat(" -> ");
         StringBuilder var5 = new StringBuilder();
         var5.append(var4);
         var5.append(this.d[var2]);
         var5.append(" : ");
         String var8 = var5.toString();
         StringBuilder var7 = new StringBuilder();
         var7.append(var8);
         Object var6 = this.h.a;
         int var3 = this.b[var2];
         ak var9 = ((ak[])var6)[var3];
         var7.append(var9);
         var4 = var8.concat(String.valueOf(var9));
         var2 = this.c[var2];
      }

      return var4;
   }
}
