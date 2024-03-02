import android.support.constraint.Pv.bmSypa;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class dhq {
   public int a;
   public Object b;
   public Object c;

   public dhq() {
      this.c = new int[16];
      this.b = new avm[16];
   }

   public dhq(int var1) {
      this.c = null;
      this.b = new byte[var1];
      this.a = 0;
   }

   public dhq(InputStream var1) {
      this.c = null;
      this.a = 0;
      this.b = new byte[16384];

      while(true) {
         Object var4 = this.b;
         int var2 = this.a;
         var2 = var1.read((byte[])var4, var2, 16384);
         if (var2 <= 0) {
            break;
         }

         int var3 = this.a + var2;
         this.a = var3;
         if (var2 != 16384) {
            break;
         }

         this.d(var3 + 16384);
      }

   }

   public dhq(byte[] var1) {
      this.c = null;
      this.b = var1;
      this.a = var1.length;
   }

   // $FF: synthetic method
   public dhq(byte[] var1, byte[] var2) {
      this.b = new Object[16];
      this.c = new Object[16];
   }

   public dhq(char[] var1, byte[] var2) {
      this.c = new Object[4];
      this.b = new int[4];
   }

   public final InputStream a() {
      Object var2 = this.b;
      int var1 = this.a;
      return new ByteArrayInputStream((byte[])var2, 0, var1);
   }

   public final String b() {
      if (this.c == null) {
         int var1 = this.a;
         String var3 = "UTF-8";
         if (var1 < 2) {
            this.c = "UTF-8";
         } else {
            byte[] var4 = (byte[])this.b;
            byte var2 = var4[0];
            if (var2 == 0) {
               if (var1 >= 4 && var4[1] == 0) {
                  if ((var4[2] & 255) == 254 && (var4[3] & 255) == 255) {
                     this.c = "UTF-32BE";
                  } else {
                     this.c = "UTF-32";
                  }
               } else {
                  this.c = "UTF-16BE";
               }
            } else {
               int var5 = var2 & 255;
               if (var5 < 128) {
                  if (var4[1] != 0) {
                     this.c = "UTF-8";
                  } else {
                     if (var1 >= 4 && var4[2] == 0) {
                        var3 = "UTF-32LE";
                     } else {
                        var3 = bmSypa.Ktwi;
                     }

                     this.c = var3;
                  }
               } else {
                  if (var5 != 239) {
                     var3 = "UTF-16";
                     if (var5 != 254) {
                        if (var1 >= 4 && var4[2] == 0) {
                           this.c = "UTF-32";
                        } else {
                           this.c = "UTF-16";
                        }

                        return (String)this.c;
                     }
                  }

                  this.c = var3;
               }
            }
         }
      }

      return (String)this.c;
   }

   public final void c(byte[] var1) {
      this.e(var1, var1.length);
   }

   public final void d(int var1) {
      Object var3 = this.b;
      int var2 = ((byte[])var3).length;
      if (var1 > var2) {
         byte[] var4 = new byte[var2 + var2];
         this.b = var4;
         System.arraycopy(var3, 0, var4, 0, var2);
      }

   }

   public final void e(byte[] var1, int var2) {
      this.d(this.a + var2);
      System.arraycopy(var1, 0, this.b, this.a, var2);
      this.a += var2;
   }

   public final int f(Object var1) {
      int var4 = System.identityHashCode(var1);
      int var3 = this.a - 1;
      Object var8 = this.b;
      int var2 = 0;

      while(var2 <= var3) {
         int var6 = var2 + var3 >>> 1;
         Object var7 = ((Object[])var8)[var6];
         int var5 = System.identityHashCode(var7);
         if (var5 < var4) {
            var2 = var6 + 1;
         } else {
            if (var5 <= var4) {
               if (var1 == var7) {
                  return var6;
               }

               var7 = this.b;
               var5 = this.a;
               var3 = var6 - 1;

               while(true) {
                  if (var3 >= 0) {
                     var8 = ((Object[])var7)[var3];
                     var2 = var3;
                     if (var8 == var1) {
                        break;
                     }

                     if (System.identityHashCode(var8) == var4) {
                        --var3;
                        continue;
                     }
                  }

                  var3 = var6 + 1;

                  do {
                     if (var3 >= var5) {
                        var2 = -(var5 + 1);
                        return var2;
                     }

                     var8 = ((Object[])var7)[var3];
                     var2 = var3;
                     if (var8 == var1) {
                        return var2;
                     }

                     var6 = System.identityHashCode(var8);
                     var2 = var3 + 1;
                     var3 = var2;
                  } while(var6 == var4);

                  var2 = -var2;
                  break;
               }

               return var2;
            }

            var3 = var6 - 1;
         }
      }

      return -(var2 + 1);
   }

   public final Object g(Object var1) {
      var1.getClass();
      int var2 = this.f(var1);
      return var2 >= 0 ? ((Object[])this.c)[var2] : null;
   }

   public final void h(Object var1, Object var2) {
      Object var7 = this.b;
      Object var8 = this.c;
      int var4 = this.a;
      int var5 = this.f(var1);
      if (var5 >= 0) {
         ((Object[])var8)[var5] = var2;
      } else {
         Object[] var9 = (Object[])var7;
         boolean var3;
         if (var4 == var9.length) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            var7 = new Object[var4 + var4];
         }

         var5 = -(var5 + 1);
         int var6 = var5 + 1;
         Object[] var10 = (Object[])var7;
         pwm.bh(var9, var10, var6, var5, var4);
         if (var3) {
            pwm.bn(var9, var10, 0, 0, var5, 6);
         }

         var10[var5] = var1;
         this.b = var7;
         if (var3) {
            var1 = new Object[var4 + var4];
         } else {
            var1 = var8;
         }

         Object[] var11 = (Object[])var1;
         Object[] var12 = (Object[])var8;
         pwm.bh(var12, var11, var6, var5, var4);
         if (var3) {
            pwm.bn(var12, var11, 0, 0, var5, 6);
         }

         var11[var5] = var2;
         this.c = var1;
         ++this.a;
      }
   }

   public final int i(Object var1, int var2) {
      Object var8 = this.b;
      int var3 = this.a;
      int var4;
      int var5;
      int var6;
      Object var9;
      if (var3 > 0) {
         var6 = System.identityHashCode(var1);
         var9 = this.c;
         var4 = var3 - 1;
         var3 = 0;

         label63:
         while(true) {
            if (var3 > var4) {
               var3 = -(var3 + 1);
               break;
            }

            var5 = var3 + var4 >>> 1;
            Object var10 = ((Object[])var9)[var5];
            int var7 = System.identityHashCode(var10);
            if (var7 < var6) {
               var3 = var5 + 1;
            } else {
               if (var7 <= var6) {
                  if (var10 == var1) {
                     var3 = var5;
                     break;
                  }

                  var9 = this.c;
                  var7 = this.a;

                  for(var3 = var5 - 1; var3 >= 0; --var3) {
                     var10 = ((Object[])var9)[var3];
                     if (var10 == var1) {
                        break label63;
                     }

                     if (System.identityHashCode(var10) != var6) {
                        break;
                     }
                  }

                  var4 = var5 + 1;

                  do {
                     if (var4 >= var7) {
                        var3 = -(var7 + 1);
                        break label63;
                     }

                     var10 = ((Object[])var9)[var4];
                     var3 = var4;
                     if (var10 == var1) {
                        break label63;
                     }

                     var5 = System.identityHashCode(var10);
                     var3 = var4 + 1;
                     var4 = var3;
                  } while(var5 == var6);

                  var3 = -var3;
                  break;
               }

               var4 = var5 - 1;
            }
         }

         if (var3 >= 0) {
            int[] var12 = (int[])var8;
            var4 = var12[var3];
            var12[var3] = var2;
            return var4;
         }
      } else {
         var3 = -1;
      }

      var9 = this.c;
      var3 = -(var3 + 1);
      var4 = this.a;
      Object[] var11 = (Object[])var9;
      var6 = var11.length;
      int[] var13;
      if (var4 == var6) {
         var5 = var3 + 1;
         var6 += var6;
         Object[] var14 = new Object[var6];
         int[] var15 = new int[var6];
         pwm.bh(var11, var14, var5, var3, var4);
         var13 = (int[])var8;
         pwm.bg(var13, var15, var5, var3, var4);
         pwm.bn(var11, var14, 0, 0, var3, 6);
         pwm.bj(var13, var15, var3, 6);
         this.c = var14;
         this.b = var15;
      } else {
         var5 = var3 + 1;
         pwm.bh(var11, var11, var5, var3, var4);
         var13 = (int[])var8;
         pwm.bg(var13, var13, var5, var3, var4);
      }

      ((Object[])this.c)[var3] = var1;
      ((int[])this.b)[var3] = var2;
      ++this.a;
      return -1;
   }
}
