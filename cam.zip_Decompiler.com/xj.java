import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class xj implements Collection, Set, qxc, qxf {
   public int[] a;
   public Object[] b;
   public int c;

   public xj() {
      this.a = xr.a;
      this.b = xr.c;
   }

   public final int a(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = op.d(this);
      } else {
         var2 = op.c(this, var1, var1.hashCode());
      }

      return var2;
   }

   public final boolean add(Object var1) {
      int var4 = this.c;
      boolean var7 = false;
      int var2;
      int var3;
      if (var1 == null) {
         var2 = op.d(this);
         var3 = 0;
      } else {
         var3 = var1.hashCode();
         var2 = op.c(this, var1, var3);
      }

      if (var2 < 0) {
         int var5 = ~var2;
         int[] var9 = this.a;
         int var6 = var9.length;
         Object[] var8;
         if (var4 >= var6) {
            var2 = 8;
            if (var4 >= 8) {
               var2 = (var4 >> 1) + var4;
            } else if (var4 < 4) {
               var2 = 4;
            }

            var8 = this.b;
            op.e(this, var2);
            if (var4 != this.c) {
               throw new ConcurrentModificationException();
            }

            int[] var10 = this.a;
            if (var10.length != 0) {
               pwm.bj(var9, var10, var6, 6);
               pwm.bn(var8, this.b, 0, 0, var8.length, 6);
            }
         }

         int[] var11;
         if (var5 < var4) {
            var11 = this.a;
            var2 = var5 + 1;
            pwm.bg(var11, var11, var2, var5, var4);
            var8 = this.b;
            pwm.bh(var8, var8, var2, var5, var4);
         }

         var2 = this.c;
         if (var4 == var2) {
            var11 = this.a;
            if (var5 < var11.length) {
               var11[var5] = var3;
               this.b[var5] = var1;
               var7 = true;
               this.c = var2 + 1;
               return var7;
            }
         }

         throw new ConcurrentModificationException();
      } else {
         return var7;
      }
   }

   public final boolean addAll(Collection var1) {
      var1.getClass();
      int var3 = this.c + var1.size();
      int var2 = this.c;
      int[] var6 = this.a;
      if (var6.length < var3) {
         Object[] var5 = this.b;
         op.e(this, var3);
         var3 = this.c;
         if (var3 > 0) {
            pwm.bj(var6, this.a, var3, 6);
            pwm.bn(var5, this.b, 0, 0, this.c, 6);
         }
      }

      if (this.c != var2) {
         ConcurrentModificationException var8 = new ConcurrentModificationException();
         throw var8;
      } else {
         Iterator var7 = var1.iterator();

         boolean var4;
         for(var4 = false; var7.hasNext(); var4 |= this.add(var7.next())) {
         }

         return var4;
      }
   }

   public final Object b(int var1) {
      return this.b[var1];
   }

   public final void c(int var1) {
      int var4 = this.c;
      Object[] var6 = this.b;
      Object var10000 = var6[var1];
      if (var4 <= 1) {
         this.clear();
      } else {
         int var3 = var4 - 1;
         int[] var7 = this.a;
         int var5 = var7.length;
         int var2 = 8;
         if (var5 > 8 && var4 < var5 / 3) {
            if (var4 > 8) {
               var2 = var4 + (var4 >> 1);
            }

            op.e(this, var2);
            if (var1 > 0) {
               pwm.bj(var7, this.a, var1, 6);
               pwm.bn(var6, this.b, 0, 0, var1, 6);
            }

            if (var1 < var3) {
               int[] var8 = this.a;
               var2 = var1 + 1;
               var5 = var3 + 1;
               pwm.bg(var7, var8, var1, var2, var5);
               pwm.bh(var6, this.b, var1, var2, var5);
            }
         } else {
            if (var1 < var3) {
               var2 = var1 + 1;
               var5 = var3 + 1;
               pwm.bg(var7, var7, var1, var2, var5);
               var6 = this.b;
               pwm.bh(var6, var6, var1, var2, var5);
            }

            this.b[var3] = null;
         }

         if (var4 == this.c) {
            this.c = var3;
         } else {
            throw new ConcurrentModificationException();
         }
      }
   }

   public final void clear() {
      if (this.c != 0) {
         this.a = xr.a;
         this.b = xr.c;
         this.c = 0;
      }

   }

   public final boolean contains(Object var1) {
      return this.a(var1) >= 0;
   }

   public final boolean containsAll(Collection var1) {
      var1.getClass();
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if (var3.hasNext()) {
            if (this.contains(var3.next())) {
               continue;
            }

            var2 = false;
            break;
         }

         var2 = true;
         break;
      }

      return var2;
   }

   public final boolean equals(Object var1) {
      boolean var4 = true;
      if (this != var1) {
         if (var1 instanceof Set) {
            label57: {
               if (this.c != ((Set)var1).size()) {
                  var4 = false;
                  return var4;
               }

               boolean var10001;
               int var3;
               try {
                  var3 = this.c;
               } catch (NullPointerException var9) {
                  var10001 = false;
                  break label57;
               } catch (ClassCastException var10) {
                  var10001 = false;
                  break label57;
               }

               int var2 = 0;

               while(true) {
                  if (var2 >= var3) {
                     return var4;
                  }

                  boolean var5;
                  try {
                     Object var6 = this.b(var2);
                     var5 = ((Set)var1).contains(var6);
                  } catch (NullPointerException var7) {
                     var10001 = false;
                     break;
                  } catch (ClassCastException var8) {
                     var10001 = false;
                     break;
                  }

                  if (!var5) {
                     break;
                  }

                  ++var2;
               }
            }
         }

         var4 = false;
      }

      return var4;
   }

   public final int hashCode() {
      int[] var4 = this.a;
      int var3 = this.c;
      int var2 = 0;

      int var1;
      for(var1 = 0; var2 < var3; ++var2) {
         var1 += var4[var2];
      }

      return var1;
   }

   public final boolean isEmpty() {
      return this.c <= 0;
   }

   public final Iterator iterator() {
      return new xi(this);
   }

   public final boolean remove(Object var1) {
      int var2 = this.a(var1);
      if (var2 >= 0) {
         this.c(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      var1.getClass();
      Iterator var3 = var1.iterator();

      boolean var2;
      for(var2 = false; var3.hasNext(); var2 |= this.remove(var3.next())) {
      }

      return var2;
   }

   public final boolean retainAll(Collection var1) {
      var1.getClass();
      int var2 = this.c - 1;

      boolean var3;
      for(var3 = false; var2 >= 0; --var2) {
         if (!pwm.aH(var1, this.b[var2])) {
            this.c(var2);
            var3 = true;
         }
      }

      return var3;
   }

   public final int size() {
      return this.c;
   }

   public final Object[] toArray() {
      return pwm.aW(this.b, 0, this.c);
   }

   public final Object[] toArray(Object[] var1) {
      var1.getClass();
      int var2 = this.c;
      int var3 = var1.length;
      Object[] var4;
      if (var3 < var2) {
         var4 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var2);
      } else {
         var4 = var1;
         if (var3 > var2) {
            var1[var2] = null;
            var4 = var1;
         }
      }

      pwm.bh(this.b, var4, 0, 0, this.c);
      var4.getClass();
      return var4;
   }

   public final String toString() {
      String var3;
      if (this.isEmpty()) {
         var3 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.c * 14);
         var4.append('{');
         int var2 = this.c;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var4.append(", ");
            }

            Object var5 = this.b(var1);
            if (var5 != this) {
               var4.append(var5);
            } else {
               var4.append("(this Set)");
            }
         }

         var4.append('}');
         var3 = var4.toString();
      }

      return var3;
   }
}
