import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public final class bub {
   private int[] a;
   private Object[] b;
   private int c;

   public bub() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public bub(byte[] var1) {
      this.a = btz.a;
      this.b = btz.b;
      this.c = 0;
   }

   protected final int a(Object var1, int var2) {
      int var5 = this.c;
      if (var5 == 0) {
         return -1;
      } else {
         int var4 = c.s(this.a, var5, var2);
         if (var4 < 0) {
            return var4;
         } else if (c.E(var1, this.b[var4 + var4])) {
            return var4;
         } else {
            int var3;
            for(var3 = var4 + 1; var3 < var5 && this.a[var3] == var2; ++var3) {
               if (c.E(var1, this.b[var3 + var3])) {
                  return var3;
               }
            }

            --var4;

            while(var4 >= 0 && this.a[var4] == var2) {
               if (c.E(var1, this.b[var4 + var4])) {
                  return var4;
               }

               --var4;
            }

            return ~var3;
         }
      }
   }

   public final int b(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.c();
      } else {
         var2 = this.a(var1, var1.hashCode());
      }

      return var2;
   }

   protected final int c() {
      int var3 = this.c;
      if (var3 == 0) {
         return -1;
      } else {
         int var2 = c.s(this.a, var3, 0);
         if (var2 < 0) {
            return var2;
         } else if (this.b[var2 + var2] == null) {
            return var2;
         } else {
            int var1;
            for(var1 = var2 + 1; var1 < var3 && this.a[var1] == 0; ++var1) {
               if (this.b[var1 + var1] == null) {
                  return var1;
               }
            }

            --var2;

            while(var2 >= 0 && this.a[var2] == 0) {
               if (this.b[var2 + var2] == null) {
                  return var2;
               }

               --var2;
            }

            return ~var1;
         }
      }
   }

   public final Object d(Object var1) {
      int var2 = this.b(var1);
      return var2 >= 0 ? this.b[var2 + var2 + 1] : null;
   }

   public final Object e(int var1) {
      return this.b[var1 + var1];
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         boolean var10001;
         int var2;
         int var3;
         Object var6;
         Object var7;
         bub var27;
         label162: {
            try {
               if (var1 instanceof bub) {
                  var27 = (bub)var1;
                  var3 = this.c;
                  if (var3 == var27.c) {
                     break label162;
                  }

                  return false;
               }
            } catch (NullPointerException var25) {
               var10001 = false;
               return false;
            } catch (ClassCastException var26) {
               var10001 = false;
               return false;
            }

            try {
               if (!(var1 instanceof Map)) {
                  return false;
               }

               if (this.c != ((Map)var1).size()) {
                  return false;
               }
            } catch (NullPointerException var23) {
               var10001 = false;
               return false;
            } catch (ClassCastException var24) {
               var10001 = false;
               return false;
            }

            try {
               var3 = this.c;
            } catch (NullPointerException var21) {
               var10001 = false;
               return false;
            } catch (ClassCastException var22) {
               var10001 = false;
               return false;
            }

            for(var2 = 0; var2 < var3; ++var2) {
               Object var5;
               Map var8;
               try {
                  var7 = this.e(var2);
                  var5 = this.g(var2);
                  var8 = (Map)var1;
                  var6 = var8.get(var7);
               } catch (NullPointerException var19) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var20) {
                  var10001 = false;
                  return false;
               }

               if (var5 == null) {
                  if (var6 != null) {
                     return false;
                  }

                  try {
                     if (!var8.containsKey(var7)) {
                        return false;
                     }
                  } catch (NullPointerException var15) {
                     var10001 = false;
                     return false;
                  } catch (ClassCastException var16) {
                     var10001 = false;
                     return false;
                  }
               } else {
                  boolean var4;
                  try {
                     var4 = c.E(var5, var6);
                  } catch (NullPointerException var17) {
                     var10001 = false;
                     return false;
                  } catch (ClassCastException var18) {
                     var10001 = false;
                     return false;
                  }

                  if (!var4) {
                     return false;
                  }
               }
            }

            return true;
         }

         for(var2 = 0; var2 < var3; ++var2) {
            try {
               var1 = this.e(var2);
               var6 = this.g(var2);
               var7 = var27.d(var1);
            } catch (NullPointerException var13) {
               var10001 = false;
               return false;
            } catch (ClassCastException var14) {
               var10001 = false;
               return false;
            }

            if (var6 == null) {
               if (var7 != null) {
                  return false;
               }

               try {
                  if (var27.b(var1) < 0) {
                     return false;
                  }
               } catch (NullPointerException var9) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var10) {
                  var10001 = false;
                  return false;
               }
            } else {
               try {
                  if (!c.E(var6, var7)) {
                     return false;
                  }
               } catch (NullPointerException var11) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var12) {
                  var10001 = false;
                  return false;
               }
            }
         }

         return true;
      }
   }

   public final Object f(Object var1, Object var2) {
      int var5 = this.c;
      int var3;
      int var4;
      if (var1 == null) {
         var3 = this.c();
         var4 = 0;
      } else {
         var4 = var1.hashCode();
         var3 = this.a(var1, var4);
      }

      Object[] var9;
      if (var3 >= 0) {
         var3 = var3 + var3 + 1;
         var9 = this.b;
         var1 = var9[var3];
         var9[var3] = var2;
         return var1;
      } else {
         int var6 = ~var3;
         int[] var8 = this.a;
         if (var5 >= var8.length) {
            var3 = 8;
            if (var5 >= 8) {
               var3 = (var5 >> 1) + var5;
            } else if (var5 < 4) {
               var3 = 4;
            }

            var8 = Arrays.copyOf(var8, var3);
            var8.getClass();
            this.a = var8;
            var9 = Arrays.copyOf(this.b, var3 + var3);
            var9.getClass();
            this.b = var9;
            if (var5 != this.c) {
               throw new ConcurrentModificationException();
            }
         }

         if (var6 < var5) {
            var8 = this.a;
            int var7 = var6 + 1;
            pwm.bg(var8, var8, var7, var6, var5);
            var9 = this.b;
            var3 = this.c;
            pwm.bh(var9, var9, var7 + var7, var6 + var6, var3 + var3);
         }

         var3 = this.c;
         if (var5 == var3) {
            var8 = this.a;
            if (var6 < var8.length) {
               var8[var6] = var4;
               var9 = this.b;
               var4 = var6 + var6;
               var9[var4] = var1;
               var9[var4 + 1] = var2;
               this.c = var3 + 1;
               return null;
            }
         }

         throw new ConcurrentModificationException();
      }
   }

   public final Object g(int var1) {
      return this.b[var1 + var1 + 1];
   }

   public final int hashCode() {
      int[] var8 = this.a;
      Object[] var7 = this.b;
      int var5 = this.c;
      int var3 = 1;
      int var1 = 0;

      int var2;
      for(var2 = 0; var1 < var5; var3 += 2) {
         Object var9 = var7[var3];
         int var6 = var8[var1];
         int var4;
         if (var9 != null) {
            var4 = var9.hashCode();
         } else {
            var4 = 0;
         }

         var2 += var4 ^ var6;
         ++var1;
      }

      return var2;
   }

   public final String toString() {
      int var1 = this.c;
      if (var1 > 0) {
         StringBuilder var3 = new StringBuilder(var1 * 28);
         var3.append('{');
         int var2 = this.c;

         for(var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var3.append(", ");
            }

            Object var4 = this.e(var1);
            if (var4 != this) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }

            var3.append('=');
            var4 = this.g(var1);
            if (var4 != this) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }
         }

         var3.append('}');
         return var3.toString();
      } else {
         return "{}";
      }
   }
}
