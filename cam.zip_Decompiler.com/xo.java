import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class xo {
   private int[] a;
   private Object[] b;
   public int d;

   public xo() {
      this((byte[])null);
   }

   public xo(int var1) {
      int[] var2;
      if (var1 == 0) {
         var2 = xr.a;
      } else {
         var2 = new int[var1];
      }

      this.a = var2;
      Object[] var3;
      if (var1 == 0) {
         var3 = xr.c;
      } else {
         var3 = new Object[var1 + var1];
      }

      this.b = var3;
   }

   // $FF: synthetic method
   public xo(byte[] var1) {
      this(0);
   }

   private final int a(Object var1, int var2) {
      int var4 = this.d;
      if (var4 == 0) {
         return -1;
      } else {
         int var5 = c.s(this.a, var4, var2);
         if (var5 < 0) {
            return var5;
         } else if (c.E(var1, this.b[var5 + var5])) {
            return var5;
         } else {
            int var3;
            for(var3 = var5 + 1; var3 < var4 && this.a[var3] == var2; ++var3) {
               if (c.E(var1, this.b[var3 + var3])) {
                  return var3;
               }
            }

            for(var4 = var5 - 1; var4 >= 0 && this.a[var4] == var2; --var4) {
               if (c.E(var1, this.b[var4 + var4])) {
                  return var4;
               }
            }

            return ~var3;
         }
      }
   }

   private final int j() {
      int var3 = this.d;
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

   public final int b(Object var1) {
      int var2 = this.d;
      int var3 = var2 + var2;
      Object[] var4 = this.b;
      if (var1 == null) {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (var4[var2] == null) {
               return var2 >> 1;
            }
         }
      } else {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (c.E(var1, var4[var2])) {
               return var2 >> 1;
            }
         }
      }

      return -1;
   }

   public final int c(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.j();
      } else {
         var2 = this.a(var1, var1.hashCode());
      }

      return var2;
   }

   public void clear() {
      if (this.d > 0) {
         this.a = xr.a;
         this.b = xr.c;
         this.d = 0;
      }

   }

   public final boolean containsKey(Object var1) {
      return this.c(var1) >= 0;
   }

   public final boolean containsValue(Object var1) {
      return this.b(var1) >= 0;
   }

   public final Object d(int var1) {
      if (var1 >= 0 && var1 < this.d) {
         return this.b[var1 + var1];
      } else {
         throw new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
      }
   }

   public Object e(int var1) {
      if (var1 >= 0) {
         int var4 = this.d;
         if (var1 < var4) {
            Object[] var9 = this.b;
            int var5 = var1 + var1;
            Object var7 = var9[var5 + 1];
            if (var4 <= 1) {
               this.clear();
            } else {
               int var3 = var4 - 1;
               int[] var8 = this.a;
               int var6 = var8.length;
               int var2 = 8;
               if (var6 > 8 && var4 < var6 / 3) {
                  if (var4 > 8) {
                     var2 = var4 + (var4 >> 1);
                  }

                  int[] var10 = Arrays.copyOf(var8, var2);
                  var10.getClass();
                  this.a = var10;
                  Object[] var12 = Arrays.copyOf(this.b, var2 + var2);
                  var12.getClass();
                  this.b = var12;
                  if (var4 != this.d) {
                     throw new ConcurrentModificationException();
                  }

                  if (var1 > 0) {
                     pwm.bg(var8, this.a, 0, 0, var1);
                     pwm.bh(var9, this.b, 0, 0, var5);
                  }

                  if (var1 < var3) {
                     var10 = this.a;
                     var6 = var1 + 1;
                     var2 = var3 + 1;
                     pwm.bg(var8, var10, var1, var6, var2);
                     pwm.bh(var9, this.b, var5, var6 + var6, var2 + var2);
                  }
               } else {
                  Object[] var11;
                  if (var1 < var3) {
                     var2 = var1 + 1;
                     var6 = var3 + 1;
                     pwm.bg(var8, var8, var1, var2, var6);
                     var11 = this.b;
                     pwm.bh(var11, var11, var5, var2 + var2, var6 + var6);
                  }

                  var11 = this.b;
                  var1 = var3 + var3;
                  var11[var1] = null;
                  var11[var1 + 1] = null;
               }

               if (var4 != this.d) {
                  throw new ConcurrentModificationException();
               }

               this.d = var3;
            }

            return var7;
         }
      }

      throw new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         boolean var10001;
         int var2;
         int var3;
         Object var5;
         Object var7;
         xo var27;
         label162: {
            try {
               if (var1 instanceof xo) {
                  var3 = this.d;
                  var27 = (xo)var1;
                  if (var3 == var27.d) {
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

               if (this.d != ((Map)var1).size()) {
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
               var3 = this.d;
            } catch (NullPointerException var21) {
               var10001 = false;
               return false;
            } catch (ClassCastException var22) {
               var10001 = false;
               return false;
            }

            for(var2 = 0; var2 < var3; ++var2) {
               Map var6;
               Object var8;
               try {
                  var5 = this.d(var2);
                  var8 = this.g(var2);
                  var6 = (Map)var1;
                  var7 = var6.get(var5);
               } catch (NullPointerException var19) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var20) {
                  var10001 = false;
                  return false;
               }

               if (var8 == null) {
                  if (var7 != null) {
                     return false;
                  }

                  try {
                     if (!var6.containsKey(var5)) {
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
                     var4 = c.E(var8, var7);
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
            Object var28;
            try {
               var5 = this.d(var2);
               var28 = this.g(var2);
               var7 = var27.get(var5);
            } catch (NullPointerException var13) {
               var10001 = false;
               return false;
            } catch (ClassCastException var14) {
               var10001 = false;
               return false;
            }

            if (var28 == null) {
               if (var7 != null) {
                  return false;
               }

               try {
                  if (!var27.containsKey(var5)) {
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
                  if (!c.E(var28, var7)) {
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

   public Object f(int var1, Object var2) {
      if (var1 >= 0 && var1 < this.d) {
         Object[] var3 = this.b;
         var1 = var1 + var1 + 1;
         Object var4 = var3[var1];
         var3[var1] = var2;
         return var4;
      } else {
         throw new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
      }
   }

   public final Object g(int var1) {
      if (var1 >= 0 && var1 < this.d) {
         return this.b[var1 + var1 + 1];
      } else {
         throw new IllegalArgumentException(c.aE(var1, "Expected index to be within 0..size()-1, but was "));
      }
   }

   public final Object get(Object var1) {
      int var2 = this.c(var1);
      return var2 >= 0 ? this.b[var2 + var2 + 1] : null;
   }

   public final Object getOrDefault(Object var1, Object var2) {
      int var3 = this.c(var1);
      return var3 >= 0 ? this.b[var3 + var3 + 1] : var2;
   }

   public final void h(int var1) {
      int var2 = this.d;
      int[] var3 = this.a;
      if (var3.length < var1) {
         var3 = Arrays.copyOf(var3, var1);
         var3.getClass();
         this.a = var3;
         Object[] var4 = Arrays.copyOf(this.b, var1 + var1);
         var4.getClass();
         this.b = var4;
      }

      if (this.d != var2) {
         throw new ConcurrentModificationException();
      }
   }

   public int hashCode() {
      int[] var8 = this.a;
      Object[] var7 = this.b;
      int var5 = this.d;
      int var1 = 1;
      int var2 = 0;

      int var3;
      for(var3 = 0; var2 < var5; var1 += 2) {
         Object var9 = var7[var1];
         int var6 = var8[var2];
         int var4;
         if (var9 != null) {
            var4 = var9.hashCode();
         } else {
            var4 = 0;
         }

         var3 += var4 ^ var6;
         ++var2;
      }

      return var3;
   }

   public void i(xo var1) {
      int var3 = var1.d;
      this.h(this.d + var3);
      int var4 = this.d;
      int var2 = 0;
      if (var4 == 0) {
         if (var3 > 0) {
            pwm.bg(var1.a, this.a, 0, 0, var3);
            pwm.bh(var1.b, this.b, 0, 0, var3 + var3);
            this.d = var3;
            return;
         }
      } else {
         while(var2 < var3) {
            this.put(var1.d(var2), var1.g(var2));
            ++var2;
         }
      }

   }

   public final boolean isEmpty() {
      return this.d <= 0;
   }

   public Object put(Object var1, Object var2) {
      int var5 = this.d;
      int var4;
      if (var1 != null) {
         var4 = var1.hashCode();
      } else {
         var4 = 0;
      }

      int var3;
      if (var1 != null) {
         var3 = this.a(var1, var4);
      } else {
         var3 = this.j();
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
            if (var5 != this.d) {
               throw new ConcurrentModificationException();
            }
         }

         if (var6 < var5) {
            var8 = this.a;
            var3 = var6 + 1;
            pwm.bg(var8, var8, var3, var6, var5);
            var9 = this.b;
            int var7 = this.d;
            pwm.bh(var9, var9, var3 + var3, var6 + var6, var7 + var7);
         }

         var3 = this.d;
         if (var5 == var3) {
            var8 = this.a;
            if (var6 < var8.length) {
               var8[var6] = var4;
               var9 = this.b;
               var4 = var6 + var6;
               var9[var4] = var1;
               var9[var4 + 1] = var2;
               this.d = var3 + 1;
               return null;
            }
         }

         throw new ConcurrentModificationException();
      }
   }

   public final Object putIfAbsent(Object var1, Object var2) {
      Object var3 = this.get(var1);
      return var3 == null ? this.put(var1, var2) : var3;
   }

   public final Object remove(Object var1) {
      int var2 = this.c(var1);
      return var2 >= 0 ? this.e(var2) : null;
   }

   public final boolean remove(Object var1, Object var2) {
      int var3 = this.c(var1);
      if (var3 >= 0 && c.E(var2, this.g(var3))) {
         this.e(var3);
         return true;
      } else {
         return false;
      }
   }

   public final Object replace(Object var1, Object var2) {
      int var3 = this.c(var1);
      return var3 >= 0 ? this.f(var3, var2) : null;
   }

   public final boolean replace(Object var1, Object var2, Object var3) {
      int var4 = this.c(var1);
      if (var4 >= 0 && c.E(var2, this.g(var4))) {
         this.f(var4, var3);
         return true;
      } else {
         return false;
      }
   }

   public final int size() {
      return this.d;
   }

   public final String toString() {
      if (this.isEmpty()) {
         return "{}";
      } else {
         StringBuilder var3 = new StringBuilder(this.d * 28);
         var3.append('{');
         int var2 = this.d;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var3.append(", ");
            }

            Object var4 = this.d(var1);
            if (var4 != var3) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }

            var3.append('=');
            var4 = this.g(var1);
            if (var4 != var3) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }
         }

         var3.append('}');
         return var3.toString();
      }
   }
}
