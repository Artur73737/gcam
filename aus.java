import java.util.ArrayList;

public final class aus {
   public final aut a;
   public final int[] b;
   public final int c;
   public final Object[] d;
   public boolean e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   private final int l;

   public aus(aut var1) {
      this.a = var1;
      this.b = var1.a;
      int var2 = var1.b;
      this.c = var2;
      this.d = var1.c;
      this.l = var1.d;
      this.g = var2;
      this.h = -1;
   }

   private final Object y(int[] var1, int var2) {
      Object var6;
      if (pu.t(var1, var2)) {
         Object[] var5 = this.d;
         int var3 = var1.length;
         int var4 = var2 * 5;
         var2 = var3;
         if (var4 < var3) {
            var2 = var1[var4 + 4] + pu.d(var1[var4 + 1] >> 29);
         }

         var6 = var5[var2];
      } else {
         var6 = asl.a;
      }

      return var6;
   }

   public final int a() {
      int var1 = this.f;
      return var1 < this.g ? pu.g(this.b, var1) : 0;
   }

   public final int b(int var1) {
      return pu.g(this.b, var1);
   }

   public final int c(int var1) {
      return pu.f(this.b, var1);
   }

   public final int d(int var1) {
      return pu.i(this.b, var1);
   }

   public final int e(int var1) {
      return pu.k(this.b, var1);
   }

   public final int f() {
      if (this.i == 0) {
         int var1;
         if (pu.w(this.b, this.f)) {
            var1 = 1;
         } else {
            var1 = pu.i(this.b, this.f);
         }

         int var2 = this.f;
         this.f = var2 + pu.f(this.b, var2);
         return var1;
      } else {
         asr.k("Cannot skip while in an empty region");
         throw new qsc();
      }
   }

   public final Object g() {
      int var1 = this.f;
      Object var2;
      if (var1 < this.g) {
         var2 = this.y(this.b, var1);
      } else {
         var2 = 0;
      }

      return var2;
   }

   public final Object h() {
      int var1 = this.f;
      return var1 < this.g ? this.o(this.b, var1) : null;
   }

   public final Object i(int var1) {
      return this.y(this.b, var1);
   }

   public final Object j(int var1) {
      return this.k(this.f, var1);
   }

   public final Object k(int var1, int var2) {
      int var3 = pu.m(this.b, var1);
      ++var1;
      if (var1 < this.c) {
         var1 = pu.e(this.b, var1);
      } else {
         var1 = this.l;
      }

      var2 += var3;
      Object var4;
      if (var2 < var1) {
         var4 = this.d[var2];
      } else {
         var4 = asl.a;
      }

      return var4;
   }

   public final Object l(int var1) {
      return this.o(this.b, var1);
   }

   public final Object m() {
      if (this.i <= 0) {
         int var1 = this.j;
         if (var1 < this.k) {
            Object[] var2 = this.d;
            this.j = var1 + 1;
            return var2[var1];
         }
      }

      return asl.a;
   }

   public final Object n(int var1) {
      if (pu.w(this.b, var1)) {
         int[] var2 = this.b;
         Object var3;
         if (pu.w(var2, var1)) {
            var3 = this.d[var2[var1 * 5 + 4]];
         } else {
            var3 = asl.a;
         }

         return var3;
      } else {
         return null;
      }
   }

   public final Object o(int[] var1, int var2) {
      return pu.v(var1, var2) ? this.d[pu.j(var1, var2)] : null;
   }

   public final void p() {
      ++this.i;
   }

   public final void q() {
      this.e = true;
      aut var2 = this.a;
      int var1 = var2.e;
      if (var1 > 0) {
         var2.e = var1 - 1;
      } else {
         asr.k("Unexpected reader close()");
         throw new qsc();
      }
   }

   public final void r() {
      if (this.i == 0) {
         if (this.f == this.g) {
            int var1 = pu.k(this.b, this.h);
            this.h = var1;
            if (var1 < 0) {
               var1 = this.c;
            } else {
               var1 += pu.f(this.b, var1);
            }

            this.g = var1;
         } else {
            asr.k("endGroup() not called at the end of a group");
            throw new qsc();
         }
      }
   }

   public final void s(int var1) {
      if (this.i == 0) {
         this.f = var1;
         if (var1 < this.c) {
            var1 = pu.k(this.b, var1);
         } else {
            var1 = -1;
         }

         this.h = var1;
         if (var1 < 0) {
            this.g = this.c;
         } else {
            this.g = var1 + pu.f(this.b, var1);
         }

         this.j = 0;
         this.k = 0;
      } else {
         asr.k("Cannot reposition while in an empty region");
         throw new qsc();
      }
   }

   public final void t() {
      if (this.i == 0) {
         this.f = this.g;
      } else {
         asr.k("Cannot skip the enclosing group while in an empty region");
         throw new qsc();
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SlotReader(current=");
      var1.append(this.f);
      var1.append(", key=");
      var1.append(this.a());
      var1.append(", parent=");
      var1.append(this.h);
      var1.append(", end=");
      var1.append(this.g);
      var1.append(')');
      return var1.toString();
   }

   public final void u() {
      if (this.i <= 0) {
         if (pu.k(this.b, this.f) == this.h) {
            int var1 = this.f;
            this.h = var1;
            this.g = var1 + pu.f(this.b, var1);
            int var2 = this.f;
            var1 = var2 + 1;
            this.f = var1;
            this.j = pu.m(this.b, var2);
            if (var2 >= this.c - 1) {
               var1 = this.l;
            } else {
               var1 = pu.e(this.b, var1);
            }

            this.k = var1;
         } else {
            throw new IllegalArgumentException("Invalid slot table detected");
         }
      }
   }

   public final boolean v() {
      return this.i > 0;
   }

   public final boolean w(int var1) {
      return pu.w(this.b, var1);
   }

   public final nxj x(int var1) {
      ArrayList var4 = this.a.h;
      int var2 = pu.l(var4, var1, this.c);
      nxj var3;
      if (var2 < 0) {
         var3 = new nxj(var1);
         var4.add(-(var2 + 1), var3);
      } else {
         Object var5 = var4.get(var2);
         var5.getClass();
         var3 = (nxj)var5;
      }

      return var3;
   }
}
