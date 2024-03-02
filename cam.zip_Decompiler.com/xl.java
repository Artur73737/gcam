import java.util.Arrays;

public final class xl implements Cloneable {
   public boolean a;
   public long[] b;
   public Object[] c;
   public int d;

   public xl() {
      this(10);
   }

   public xl(int var1) {
      if (var1 == 0) {
         this.b = xr.b;
         this.c = xr.c;
      } else {
         var1 = xr.d(var1);
         this.b = new long[var1];
         this.c = new Object[var1];
      }
   }

   public final int a(long var1) {
      if (this.a) {
         int var6 = this.d;
         long[] var8 = this.b;
         Object[] var9 = this.c;
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = 0; var3 < var6; var4 = var5) {
            Object var7 = var9[var3];
            var5 = var4;
            if (var7 != xm.a) {
               if (var3 != var4) {
                  var8[var4] = var8[var3];
                  var9[var4] = var7;
                  var9[var3] = null;
               }

               var5 = var4 + 1;
            }

            ++var3;
         }

         this.a = false;
         this.d = var4;
      }

      return xr.a(this.b, this.d, var1);
   }

   public final int b() {
      if (this.a) {
         int var4 = this.d;
         long[] var5 = this.b;
         Object[] var6 = this.c;
         int var3 = 0;

         int var1;
         int var2;
         for(var1 = 0; var3 < var4; var1 = var2) {
            Object var7 = var6[var3];
            var2 = var1;
            if (var7 != xm.a) {
               if (var3 != var1) {
                  var5[var1] = var5[var3];
                  var6[var1] = var7;
                  var6[var3] = null;
               }

               var2 = var1 + 1;
            }

            ++var3;
         }

         this.a = false;
         this.d = var1;
      }

      return this.d;
   }

   public final long c(int var1) {
      if (var1 >= 0) {
         int var5 = this.d;
         if (var1 < var5) {
            if (this.a) {
               long[] var8 = this.b;
               Object[] var7 = this.c;
               int var2 = 0;

               int var3;
               int var4;
               for(var3 = 0; var2 < var5; var3 = var4) {
                  Object var9 = var7[var2];
                  var4 = var3;
                  if (var9 != xm.a) {
                     if (var2 != var3) {
                        var8[var3] = var8[var2];
                        var7[var3] = var9;
                        var7[var2] = null;
                     }

                     var4 = var3 + 1;
                  }

                  ++var2;
               }

               this.a = false;
               this.d = var3;
            }

            return this.b[var1];
         }
      }

      IllegalArgumentException var6 = new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
      throw var6;
   }

   public final Object d(long var1) {
      int var3 = xr.a(this.b, this.d, var1);
      if (var3 >= 0) {
         Object var4 = this.c[var3];
         if (var4 != xm.a) {
            return var4;
         }
      }

      return null;
   }

   public final Object e(int var1) {
      if (var1 >= 0) {
         int var5 = this.d;
         if (var1 < var5) {
            if (this.a) {
               long[] var7 = this.b;
               Object[] var9 = this.c;
               int var2 = 0;

               int var3;
               int var4;
               for(var3 = 0; var2 < var5; var3 = var4) {
                  Object var8 = var9[var2];
                  var4 = var3;
                  if (var8 != xm.a) {
                     if (var2 != var3) {
                        var7[var3] = var7[var2];
                        var9[var3] = var8;
                        var9[var2] = null;
                     }

                     var4 = var3 + 1;
                  }

                  ++var2;
               }

               this.a = false;
               this.d = var3;
            }

            return this.c[var1];
         }
      }

      IllegalArgumentException var6 = new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
      throw var6;
   }

   public final void f() {
      int var2 = this.d;
      Object[] var3 = this.c;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.d = 0;
      this.a = false;
   }

   public final void g(long var1, Object var3) {
      int var4 = xr.a(this.b, this.d, var1);
      if (var4 >= 0) {
         this.c[var4] = var3;
      } else {
         int var5 = ~var4;
         int var7 = this.d;
         Object[] var8;
         if (var5 < var7) {
            var8 = this.c;
            if (var8[var5] == xm.a) {
               this.b[var5] = var1;
               var8[var5] = var3;
               return;
            }
         }

         var4 = var5;
         int var6;
         long[] var11;
         if (this.a) {
            var11 = this.b;
            var4 = var5;
            if (var7 >= var11.length) {
               Object[] var9 = this.c;
               var5 = 0;

               for(var6 = 0; var5 < var7; var6 = var4) {
                  Object var10 = var9[var5];
                  var4 = var6;
                  if (var10 != xm.a) {
                     if (var5 != var6) {
                        var11[var6] = var11[var5];
                        var9[var6] = var10;
                        var9[var5] = null;
                     }

                     var4 = var6 + 1;
                  }

                  ++var5;
               }

               this.a = false;
               this.d = var6;
               var4 = ~xr.a(this.b, var6, var1);
            }
         }

         var5 = this.d;
         var11 = this.b;
         if (var5 >= var11.length) {
            var5 = xr.d(var5 + 1);
            var11 = Arrays.copyOf(var11, var5);
            var11.getClass();
            this.b = var11;
            var8 = Arrays.copyOf(this.c, var5);
            var8.getClass();
            this.c = var8;
         }

         var6 = this.d - var4;
         if (var6 != 0) {
            var11 = this.b;
            var5 = var4 + 1;
            var11.getClass();
            var11.getClass();
            System.arraycopy(var11, var4, var11, var5, var6);
            var8 = this.c;
            pwm.bh(var8, var8, var5, var4, this.d);
         }

         this.b[var4] = var1;
         this.c[var4] = var3;
         ++this.d;
      }
   }

   public final void h(long var1) {
      int var3 = xr.a(this.b, this.d, var1);
      if (var3 >= 0) {
         Object[] var5 = this.c;
         Object var6 = var5[var3];
         Object var4 = xm.a;
         if (var6 != var4) {
            var5[var3] = var4;
            this.a = true;
         }
      }

   }

   public final boolean i(long var1) {
      return this.a(var1) >= 0;
   }

   public final boolean j() {
      return this.b() == 0;
   }

   public final String toString() {
      String var3;
      if (this.b() <= 0) {
         var3 = "{}";
      } else {
         StringBuilder var5 = new StringBuilder(this.d * 28);
         var5.append('{');
         int var2 = this.d;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var5.append(", ");
            }

            var5.append(this.c(var1));
            var5.append('=');
            Object var4 = this.e(var1);
            if (var4 != var5) {
               var5.append(var4);
            } else {
               var5.append("(this Map)");
            }
         }

         var5.append('}');
         var3 = var5.toString();
      }

      return var3;
   }
}
