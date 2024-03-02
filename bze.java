import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class bze {
   public HashSet a = null;
   public int b;
   public boolean c;
   public final bzf d;
   public final bzd e;
   public bze f;
   public int g = 0;
   int h = Integer.MIN_VALUE;
   public byz i;

   public bze(bzf var1, bzd var2) {
      this.d = var1;
      this.e = var2;
   }

   public final int a() {
      return !this.c ? 0 : this.b;
   }

   public final int b() {
      if (this.d.ai == 8) {
         return 0;
      } else {
         int var1 = this.h;
         if (var1 != Integer.MIN_VALUE) {
            bze var2 = this.f;
            if (var2 != null && var2.d.ai == 8) {
               return var1;
            }
         }

         return this.g;
      }
   }

   public final void c(int var1, ArrayList var2, bzy var3) {
      HashSet var4 = this.a;
      if (var4 != null) {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            car.u(((bze)var5.next()).d, var1, var2, var3);
         }
      }

   }

   public final void d() {
      bze var1 = this.f;
      if (var1 != null) {
         HashSet var2 = var1.a;
         if (var2 != null) {
            var2.remove(this);
            if (this.f.a.size() == 0) {
               this.f.a = null;
            }
         }
      }

      this.a = null;
      this.f = null;
      this.g = 0;
      this.h = Integer.MIN_VALUE;
      this.c = false;
      this.b = 0;
   }

   public final void e(int var1) {
      this.b = var1;
      this.c = true;
   }

   public final boolean f() {
      HashSet var1 = this.a;
      if (var1 == null) {
         return false;
      } else {
         Iterator var2 = var1.iterator();

         bze var5;
         do {
            if (!var2.hasNext()) {
               return false;
            }

            bze var3 = (bze)var2.next();
            bzd var4 = bzd.a;
            switch(var3.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
               var5 = null;
               break;
            case 1:
               var5 = var3.d.M;
               break;
            case 2:
               var5 = var3.d.N;
               break;
            case 3:
               var5 = var3.d.K;
               break;
            case 4:
               var5 = var3.d.L;
               break;
            default:
               throw new AssertionError(var3.e.name());
            }
         } while(!var5.h());

         return true;
      }
   }

   public final boolean g() {
      HashSet var1 = this.a;
      if (var1 == null) {
         return false;
      } else {
         return var1.size() > 0;
      }
   }

   public final boolean h() {
      return this.f != null;
   }

   public final void i() {
      byz var1 = this.i;
      if (var1 == null) {
         this.i = new byz(1);
      } else {
         var1.c();
      }
   }

   public final void j(bze var1, int var2, int var3) {
      if (var1 == null) {
         this.d();
      } else {
         this.f = var1;
         if (var1.a == null) {
            var1.a = new HashSet();
         }

         HashSet var4 = this.f.a;
         if (var4 != null) {
            var4.add(this);
         }

         this.g = var2;
         this.h = var3;
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.d.aj);
      var1.append(":");
      var1.append(this.e.toString());
      return var1.toString();
   }
}
