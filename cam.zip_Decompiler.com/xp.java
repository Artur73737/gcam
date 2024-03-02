import java.util.Arrays;

public final class xp implements Cloneable {
   public boolean a;
   public int[] b;
   public Object[] c;
   public int d;

   public xp() {
      int var1 = xr.c(10);
      this.b = new int[var1];
      this.c = new Object[var1];
   }

   public final int a(int var1) {
      if (this.a) {
         xq.b(this);
      }

      return this.b[var1];
   }

   public final int b() {
      if (this.a) {
         xq.b(this);
      }

      return this.d;
   }

   public final Object c(int var1) {
      if (this.a) {
         xq.b(this);
      }

      return this.c[var1];
   }

   public final void d(int var1, Object var2) {
      int var3 = c.s(this.b, this.d, var1);
      if (var3 >= 0) {
         this.c[var3] = var2;
      } else {
         int var4 = ~var3;
         int var5 = this.d;
         Object[] var6;
         if (var4 < var5) {
            var6 = this.c;
            if (var6[var4] == xq.a) {
               this.b[var4] = var1;
               var6[var4] = var2;
               return;
            }
         }

         var3 = var4;
         if (this.a) {
            var3 = var4;
            if (var5 >= this.b.length) {
               xq.b(this);
               var3 = ~c.s(this.b, this.d, var1);
            }
         }

         var4 = this.d;
         int[] var7 = this.b;
         if (var4 >= var7.length) {
            var4 = xr.c(var4 + 1);
            var7 = Arrays.copyOf(var7, var4);
            var7.getClass();
            this.b = var7;
            var6 = Arrays.copyOf(this.c, var4);
            var6.getClass();
            this.c = var6;
         }

         var4 = this.d;
         if (var4 - var3 != 0) {
            var7 = this.b;
            var5 = var3 + 1;
            pwm.bg(var7, var7, var5, var3, var4);
            var6 = this.c;
            pwm.bh(var6, var6, var5, var3, this.d);
         }

         this.b[var3] = var1;
         this.c[var3] = var2;
         ++this.d;
      }
   }

   public final String toString() {
      String var3;
      if (this.b() <= 0) {
         var3 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.d * 28);
         var4.append('{');
         int var2 = this.d;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var4.append(", ");
            }

            var4.append(this.a(var1));
            var4.append('=');
            Object var5 = this.c(var1);
            if (var5 != this) {
               var4.append(var5);
            } else {
               var4.append("(this Map)");
            }
         }

         var4.append('}');
         var3 = var4.toString();
      }

      return var3;
   }
}
