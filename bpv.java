import android.graphics.Outline;
import android.graphics.Path;

public final class bpv {
   private bxr a;
   private boolean b;
   private final Outline c;
   private long d;
   private bdr e;
   private boolean f;
   private boolean g;
   private bck h;
   private float i;
   private long j;
   private long k;
   private boolean l;
   private bxy m;
   private bbf n;
   private bbf o;
   private bbf p;
   private bdn q;

   public bpv(bxr var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = true;
      Outline var2 = new Outline();
      var2.setAlpha(1.0F);
      this.c = var2;
      this.d = bcl.a;
      this.e = bdm.a;
      this.j = bci.a;
      this.k = bcl.a;
      this.m = bxy.a;
   }

   private final void h() {
      if (this.f) {
         this.j = bci.a;
         long var2 = this.d;
         this.k = var2;
         this.i = 0.0F;
         this.o = null;
         this.f = false;
         this.g = false;
         if (this.l && bcl.c(var2) > 0.0F && bcl.a(this.d) > 0.0F) {
            this.b = true;
            bdn var4 = this.e.a(this.d, this.m, this.a);
            this.q = var4;
            if (var4 instanceof bdh) {
               bcj var8 = ((bdh)var4).a;
               this.j = es.i(var8.b, var8.c);
               this.k = et.k(var8.b(), var8.a());
               this.c.setRect(qxg.e(var8.b), qxg.e(var8.c), qxg.e(var8.d), qxg.e(var8.e));
               return;
            }

            if (var4 instanceof bdi) {
               bck var6 = ((bdi)var4).a;
               float var1 = bcg.a(var6.e);
               this.j = es.i(var6.a, var6.b);
               this.k = et.k(var6.b(), var6.a());
               if (et.o(var6)) {
                  this.c.setRoundRect(qxg.e(var6.a), qxg.e(var6.b), qxg.e(var6.c), qxg.e(var6.d), var1);
                  this.i = var1;
                  return;
               }

               bbf var5 = this.n;
               bbf var7 = var5;
               if (var5 == null) {
                  var7 = eu.i();
                  this.n = var7;
               }

               var7.k();
               var7.b(var6);
               this.i(var7);
               return;
            }

            if (var4 instanceof bdg) {
               this.i(((bdg)var4).a);
               return;
            }
         } else {
            this.c.setEmpty();
         }
      }

   }

   private final void i(bbf var1) {
      this.c.setConvexPath((Path)var1.a);
      this.g = this.c.canClip() ^ true;
      this.o = var1;
   }

   public final Outline a() {
      this.h();
      return this.l && this.b ? this.c : null;
   }

   public final void b(bcw var1) {
      bbf var13 = this.g();
      if (var13 != null) {
         bcq.f(var1, var13);
      } else {
         float var2 = this.i;
         if (!(var2 > 0.0F)) {
            var1.m(bci.b(this.j), bci.c(this.j), bci.b(this.j) + bcl.c(this.k), bci.c(this.j) + bcl.a(this.k));
         } else {
            label41: {
               var13 = this.p;
               bck var14 = this.h;
               if (var13 != null) {
                  long var9 = this.j;
                  long var11 = this.k;
                  if (var14 != null && et.o(var14) && var14.a == bci.b(var9) && var14.b == bci.c(var9) && var14.c == bci.b(var9) + bcl.c(var11) && var14.d == bci.c(var9) + bcl.a(var11) && bcg.a(var14.e) == var2) {
                     break label41;
                  }
               }

               float var5 = bci.b(this.j);
               float var4 = bci.c(this.j);
               float var3 = bci.b(this.j);
               var2 = bcl.c(this.k);
               float var6 = bci.c(this.j);
               float var7 = bcl.a(this.k);
               float var8 = this.i;
               var14 = et.n(var5, var4, var3 + var2, var6 + var7, es.k(var8, var8));
               if (var13 == null) {
                  var13 = eu.i();
               } else {
                  var13.k();
               }

               var13.b(var14);
               this.h = var14;
               this.p = var13;
            }

            bcq.f(var1, var13);
         }
      }
   }

   public final void c(long var1) {
      if (!c.o(this.d, var1)) {
         this.d = var1;
         this.f = true;
      }

   }

   public final boolean d() {
      return !this.g;
   }

   public final boolean e(long var1) {
      boolean var14 = this.l;
      boolean var13 = true;
      if (!var14) {
         return true;
      } else {
         bdn var15 = this.q;
         if (var15 == null) {
            return true;
         } else {
            float var7 = bci.b(var1);
            float var4 = bci.c(var1);
            if (var15 instanceof bdh) {
               bcj var17 = ((bdh)var15).a;
               if (!(var17.b <= var7) || !(var7 < var17.d) || !(var17.c <= var4) || !(var4 < var17.e)) {
                  var13 = false;
               }
            } else if (var15 instanceof bdi) {
               bck var18 = ((bdi)var15).a;
               if (!(var7 < var18.a) && !(var7 >= var18.c) && !(var4 < var18.b)) {
                  if (var4 >= var18.d) {
                     var13 = false;
                  } else if (bcg.a(var18.e) + bcg.a(var18.f) <= var18.b() && bcg.a(var18.h) + bcg.a(var18.g) <= var18.b() && bcg.b(var18.e) + bcg.b(var18.h) <= var18.a() && bcg.b(var18.f) + bcg.b(var18.g) <= var18.a()) {
                     float var8 = var18.a + bcg.a(var18.e);
                     float var10 = var18.b + bcg.b(var18.e);
                     float var5 = var18.c - bcg.a(var18.f);
                     float var9 = var18.b + bcg.b(var18.f);
                     float var11 = var18.c - bcg.a(var18.g);
                     float var3 = var18.d - bcg.b(var18.g);
                     float var12 = var18.d - bcg.b(var18.h);
                     float var6 = var18.a + bcg.a(var18.h);
                     if (var7 < var8 && var4 < var10) {
                        var13 = bof.b(var7, var4, var18.e, var8, var10);
                     } else if (var7 < var6 && var4 > var12) {
                        var13 = bof.b(var7, var4, var18.h, var6, var12);
                     } else if (var7 > var5 && var4 < var9) {
                        var13 = bof.b(var7, var4, var18.f, var5, var9);
                     } else if (var7 > var11 && var4 > var3) {
                        var13 = bof.b(var7, var4, var18.g, var11, var3);
                     }
                  } else {
                     bbf var16 = eu.i();
                     var16.b(var18);
                     var13 = bof.d(var16, var7, var4);
                  }
               } else {
                  var13 = false;
               }
            } else {
               if (!(var15 instanceof bdg)) {
                  throw new qse();
               }

               var13 = bof.d(((bdg)var15).a, var7, var4);
            }

            return var13;
         }
      }
   }

   public final boolean f(bdr var1, float var2, boolean var3, float var4, bxy var5, bxr var6) {
      this.c.setAlpha(var2);
      boolean var7 = c.E(this.e, var1) ^ true;
      if (var7) {
         this.e = var1;
         this.f = true;
      }

      if (!var3) {
         if (var4 > 0.0F) {
            var3 = true;
         } else {
            var3 = false;
         }
      } else {
         var3 = true;
      }

      if (this.l != var3) {
         this.l = var3;
         this.f = true;
      }

      if (this.m != var5) {
         this.m = var5;
         this.f = true;
      }

      if (!c.E(this.a, var6)) {
         this.a = var6;
         this.f = true;
      }

      return var7;
   }

   public final bbf g() {
      this.h();
      return this.o;
   }
}
