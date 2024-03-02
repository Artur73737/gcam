import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class bro {
   public final bba a;
   public final bmd b;
   public final brl c;
   public boolean d;
   public final int e;
   private final boolean f;
   private bro g;

   public bro(bba var1, boolean var2, bmd var3, brl var4) {
      var1.getClass();
      super();
      this.a = var1;
      this.f = var2;
      this.b = var3;
      this.c = var4;
      this.e = var3.d;
   }

   // $FF: synthetic method
   public static List k(bro var0) {
      return var0.i(false);
   }

   private final bro l(bri var1, qvt var2) {
      brl var4 = new brl();
      var4.b = false;
      var4.c = false;
      var2.eo(var4);
      brn var6 = new brn(var2);
      int var3;
      if (var1 != null) {
         var3 = this.e + 1000000000;
      } else {
         var3 = this.e + 2000000000;
      }

      bro var5 = new bro(var6, false, new bmd(true, var3), var4);
      var5.d = true;
      var5.g = this;
      return var5;
   }

   private final List m(boolean var1, boolean var2) {
      if (!var1 && this.c.c) {
         return qtf.a;
      } else if (this.p()) {
         ArrayList var3 = new ArrayList();
         this.q(var3);
         return var3;
      } else {
         return this.i(var2);
      }
   }

   private final void n(bmd var1, List var2) {
      axf var7 = var1.l();
      int var5 = var7.b;
      if (var5 > 0) {
         Object[] var6 = var7.a;
         int var3 = 0;

         int var4;
         do {
            var1 = (bmd)var6[var3];
            if (var1.n.j(8)) {
               var2.add(la.k(var1, this.f));
            } else {
               this.n(var1, var2);
            }

            var4 = var3 + 1;
            var3 = var4;
         } while(var4 < var5);
      }

   }

   private final void o(brl var1) {
      if (!this.c.c) {
         List var5 = k(this);
         int var3 = var5.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            bro var7 = (bro)var5.get(var2);
            if (!var7.p()) {
               Iterator var4 = var7.c.a.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var8 = (Entry)var4.next();
                  bru var6 = (bru)var8.getKey();
                  Object var10 = var8.getValue();
                  Object var9 = var1.a.get(var6);
                  var6.getClass();
                  var10 = var6.b.a(var9, var10);
                  if (var10 != null) {
                     var1.a.put(var6, var10);
                  }
               }

               var7.o(var1);
            }
         }
      }

   }

   private final boolean p() {
      return this.f && this.c.b;
   }

   private final void q(List var1) {
      List var4 = k(this);
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         bro var5 = (bro)var4.get(var2);
         if (var5.p()) {
            var1.add(var5);
         } else if (!var5.c.c) {
            var5.q(var1);
         }
      }

   }

   public final long a() {
      bmz var4 = this.d();
      long var1;
      if (var4 != null) {
         bmz var3 = var4;
         if (!var4.k()) {
            var3 = null;
         }

         if (var3 != null) {
            var1 = iy.d(var3);
            return var1;
         }
      }

      var1 = bci.a;
      return var1;
   }

   public final bcj b() {
      bmz var2 = this.d();
      if (var2 != null) {
         bmz var1 = var2;
         if (!var2.k()) {
            var1 = null;
         }

         if (var1 != null) {
            return iy.f(var1);
         }
      }

      return bcj.a;
   }

   public final bcj c() {
      bmz var16 = this.d();
      if (var16 != null) {
         bmz var15 = var16;
         if (!var16.k()) {
            var15 = null;
         }

         if (var15 != null) {
            bjf var18 = iy.g(var15);
            bcj var17 = iy.f(var15);
            int var5 = bxx.b(var18.d());
            int var6 = bxx.a(var18.d());
            float var1 = var17.b;
            float var3 = (float)var5;
            var1 = qxb.j(var1, 0.0F, var3);
            float var4 = var17.c;
            float var2 = (float)var6;
            var4 = qxb.j(var4, 0.0F, var2);
            var3 = qxb.j(var17.d, 0.0F, var3);
            var2 = qxb.j(var17.e, 0.0F, var2);
            if (var1 != var3 && var4 != var2) {
               long var7 = var18.g(es.i(var1, var4));
               long var11 = var18.g(es.i(var3, var4));
               long var9 = var18.g(es.i(var3, var2));
               long var13 = var18.g(es.i(var1, var2));
               var17 = new bcj(quy.p(bci.b(var7), bci.b(var11), bci.b(var13), bci.b(var9)), quy.p(bci.c(var7), bci.c(var11), bci.c(var13), bci.c(var9)), quy.o(bci.b(var7), bci.b(var11), bci.b(var13), bci.b(var9)), quy.o(bci.c(var7), bci.c(var11), bci.c(var13), bci.c(var9)));
            } else {
               var17 = bcj.a;
            }

            return var17;
         }
      }

      return bcj.a;
   }

   public final bmz d() {
      if (this.d) {
         bro var2 = this.f();
         return var2 != null ? var2.d() : null;
      } else {
         Object var1 = la.j(this.b);
         if (var1 == null) {
            var1 = this.a;
         }

         return jj.i((blg)var1, 8);
      }
   }

   public final brl e() {
      if (this.p()) {
         brl var2 = this.c;
         brl var1 = new brl();
         var1.b = var2.b;
         var1.c = var2.c;
         var1.a.putAll(var2.a);
         this.o(var1);
         return var1;
      } else {
         return this.c;
      }
   }

   public final bro f() {
      bro var1 = this.g;
      if (var1 != null) {
         return var1;
      } else {
         bmd var3;
         if (this.f) {
            var3 = c.y(this.b, bmv.t);
         } else {
            var3 = null;
         }

         bmd var2 = var3;
         if (var3 == null) {
            var2 = c.y(this.b, bmv.u);
         }

         return var2 == null ? null : la.k(var2, this.f);
      }
   }

   public final List g() {
      return this.m(this.f ^ true, false);
   }

   public final List h() {
      return this.m(false, true);
   }

   public final List i(boolean var1) {
      if (this.d) {
         return qtf.a;
      } else {
         ArrayList var3 = new ArrayList();
         this.n(this.b, var3);
         if (var1) {
            bri var2 = (bri)la.l(this.c, brp.q);
            if (var2 != null && this.c.b && !var3.isEmpty()) {
               var3.add(this.l(var2, new bkh(var2, 14)));
            }

            if (this.c.d(brp.a) && !var3.isEmpty()) {
               brl var4 = this.c;
               if (var4.b) {
                  List var5 = (List)la.l(var4, brp.a);
                  String var6;
                  if (var5 != null) {
                     var6 = (String)pwm.aw(var5);
                  } else {
                     var6 = null;
                  }

                  if (var6 != null) {
                     var3.add(0, this.l((bri)null, new bkh(var6, 15)));
                  }
               }
            }
         }

         return var3;
      }
   }

   public final boolean j() {
      return !this.d && this.h().isEmpty() && c.y(this.b, bmv.s) == null;
   }
}
