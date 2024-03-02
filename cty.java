import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class cty extends ctr {
   ArrayList r;
   int s;
   boolean t;
   private boolean u;
   private int v;

   public cty() {
      this.r = new ArrayList();
      this.u = true;
      this.t = false;
      this.v = 0;
   }

   public cty(byte[] var1) {
      this();
      this.K();
      this.J(new ctd(2));
      this.J(new ctb());
      this.J(new ctd(1));
   }

   private final void L(ctr var1) {
      this.r.add(var1);
      var1.e = this;
   }

   public final void D() {
      this.v |= 2;
      int var2 = this.r.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         ((ctr)this.r.get(var1)).D();
      }

   }

   // $FF: synthetic method
   public final void E(long var1) {
      super.a = var1;
   }

   public final void G(ctj var1) {
      super.n = var1;
      this.v |= 8;
      int var3 = this.r.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((ctr)this.r.get(var2)).G(var1);
      }

   }

   public final void H(csr var1) {
      super.H(var1);
      this.v |= 4;
      if (this.r != null) {
         for(int var2 = 0; var2 < this.r.size(); ++var2) {
            ((ctr)this.r.get(var2)).H(var1);
         }
      }

   }

   public final void I(ViewGroup var1, dub var2, dub var3, ArrayList var4, ArrayList var5) {
      long var11 = super.a;
      int var8 = this.r.size();

      int var7;
      for(int var6 = 0; var6 < var8; var6 = var7 + 1) {
         ctr var13 = (ctr)this.r.get(var6);
         var7 = var6;
         if (var11 > 0L) {
            label30: {
               var7 = var6;
               if (!this.u) {
                  var7 = var6;
                  if (var6 != 0) {
                     break label30;
                  }

                  var7 = 0;
               }

               long var9 = var13.a;
               if (var9 > 0L) {
                  var13.E(var9 + var11);
               } else {
                  var13.E(var11);
               }
            }
         }

         var13.I(var1, var2, var3, var4, var5);
      }

   }

   public final void J(ctr var1) {
      this.L(var1);
      if (this.b >= 0L) {
         var1.F();
      }

      if ((this.v & 1) != 0) {
         var1.C();
      }

      if ((this.v & 2) != 0) {
         var1.D();
      }

      if ((this.v & 4) != 0) {
         var1.H(super.o);
      }

      if ((this.v & 8) != 0) {
         var1.G(super.n);
      }

   }

   public final void K() {
      this.u = false;
   }

   public final void b(cuc var1) {
      if (this.w(var1.b)) {
         ArrayList var4 = this.r;
         int var3 = var4.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            ctr var5 = (ctr)var4.get(var2);
            if (var5.w(var1.b)) {
               var5.b(var1);
               var1.c.add(var5);
            }
         }
      }

   }

   public final void c(cuc var1) {
      if (this.w(var1.b)) {
         ArrayList var4 = this.r;
         int var3 = var4.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            ctr var5 = (ctr)var4.get(var2);
            if (var5.w(var1.b)) {
               var5.c(var1);
               var1.c.add(var5);
            }
         }
      }

   }

   public final int e() {
      return this.r.size();
   }

   public final ctr f(int var1) {
      return var1 >= 0 && var1 < this.r.size() ? (ctr)this.r.get(var1) : null;
   }

   public final ctr h() {
      cty var3 = (cty)super.h();
      var3.r = new ArrayList();
      int var2 = this.r.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         var3.L(((ctr)this.r.get(var1)).h());
      }

      return var3;
   }

   public final String l(String var1) {
      String var3 = super.l(var1);

      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var3);
         var4.append("\n");
         var4.append(((ctr)this.r.get(var2)).l(var1.concat("  ")));
         var3 = var4.toString();
      }

      return var3;
   }

   protected final void m() {
      super.m();
      int var2 = this.r.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         ((ctr)this.r.get(var1)).m();
      }

   }

   public final void n(cuc var1) {
      int var3 = this.r.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((ctr)this.r.get(var2)).n(var1);
      }

   }

   public final void r(View var1) {
      super.r(var1);
      int var3 = this.r.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((ctr)this.r.get(var2)).r(var1);
      }

   }

   public final void s(View var1) {
      super.s(var1);
      int var3 = this.r.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((ctr)this.r.get(var2)).s(var1);
      }

   }

   protected final void t() {
      if (this.r.isEmpty()) {
         this.u();
         this.q();
      } else {
         ctx var5 = new ctx(this);
         ArrayList var4 = this.r;
         int var3 = var4.size();
         byte var2 = 0;

         int var1;
         for(var1 = 0; var1 < var3; ++var1) {
            ((ctr)var4.get(var1)).x(var5);
         }

         this.s = this.r.size();
         if (!this.u) {
            for(var1 = 1; var1 < this.r.size(); ++var1) {
               ((ctr)this.r.get(var1 - 1)).x(new ctw((ctr)this.r.get(var1)));
            }

            ctr var6 = (ctr)this.r.get(0);
            if (var6 != null) {
               var6.t();
               return;
            }
         } else {
            var4 = this.r;
            var3 = var4.size();

            for(var1 = var2; var1 < var3; ++var1) {
               ((ctr)var4.get(var1)).t();
            }
         }

      }
   }
}
