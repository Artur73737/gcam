import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import java.util.List;

public final class abe implements acv {
   public bci a;
   public final EdgeEffect b;
   public final EdgeEffect c;
   public final EdgeEffect d;
   public final EdgeEffect e;
   public final EdgeEffect f;
   public final EdgeEffect g;
   public final EdgeEffect h;
   public final EdgeEffect i;
   public final att j;
   public long k;
   public bhv l;
   private final act m;
   private final List n;
   private boolean o;
   private boolean p;
   private final qvt q;
   private final bbb r;

   public abe(Context var1, act var2) {
      var1.getClass();
      super();
      this.m = var2;
      EdgeEffect var5 = er.g(var1);
      this.b = var5;
      EdgeEffect var6 = er.g(var1);
      this.c = var6;
      EdgeEffect var7 = er.g(var1);
      this.d = var7;
      EdgeEffect var9 = er.g(var1);
      this.e = var9;
      int var3 = 0;
      List var10 = pwm.aS(new EdgeEffect[]{var7, var5, var9, var6});
      this.n = var10;
      this.f = er.g(var1);
      this.g = er.g(var1);
      this.h = er.g(var1);
      this.i = er.g(var1);

      for(int var4 = var10.size(); var3 < var4; ++var3) {
         ((EdgeEffect)var10.get(var3)).setColor(bcq.h(this.m.a));
      }

      this.j = so.i(qsn.a, aup.b);
      this.o = true;
      this.k = bcl.a;
      ou var8 = new ou(this, 16);
      this.q = var8;
      bay var11 = bbb.d;
      bbb var12 = big.a(abg.a, qsn.a, new abd(this, (que)null));
      var8.getClass();
      this.r = var12.g(new bka(var8)).g(new abr(this));
   }

   private final float k(long var1, long var3) {
      float var6 = bci.b(var3) / bcl.c(this.k);
      float var5 = bci.c(var1) / bcl.a(this.k);
      var6 = -er.i(this.c, -var5, 1.0F - var6);
      var5 = bcl.a(this.k);
      return er.h(this.c) == 0.0F ? var6 * var5 : bci.c(var1);
   }

   private final float l(long var1, long var3) {
      float var5 = bci.c(var3) / bcl.a(this.k);
      float var6 = bci.b(var1) / bcl.c(this.k);
      var5 = er.i(this.d, var6, 1.0F - var5);
      var6 = bcl.c(this.k);
      return er.h(this.d) == 0.0F ? var5 * var6 : bci.b(var1);
   }

   private final float m(long var1, long var3) {
      float var5 = bci.c(var3) / bcl.a(this.k);
      float var6 = bci.b(var1) / bcl.c(this.k);
      var5 = -er.i(this.e, -var6, var5);
      var6 = bcl.c(this.k);
      return er.h(this.e) == 0.0F ? var5 * var6 : bci.b(var1);
   }

   private final float n(long var1, long var3) {
      float var5 = bci.b(var3) / bcl.c(this.k);
      float var6 = bci.c(var1) / bcl.a(this.k);
      var6 = er.i(this.b, var6, var5);
      var5 = bcl.a(this.k);
      return er.h(this.b) == 0.0F ? var6 * var5 : bci.c(var1);
   }

   public final long a(long var1, int var3, qvt var4) {
      if (bcl.g(this.k)) {
         return ((bci)var4.eo(bci.i(var1))).d;
      } else {
         boolean var9 = this.p;
         boolean var11 = true;
         long var12;
         if (!var9) {
            var12 = et.l(this.k);
            if (er.h(this.d) != 0.0F) {
               this.l(bci.a, var12);
            }

            if (er.h(this.e) != 0.0F) {
               this.m(bci.a, var12);
            }

            if (er.h(this.b) != 0.0F) {
               this.n(bci.a, var12);
            }

            if (er.h(this.c) != 0.0F) {
               this.k(bci.a, var12);
            }

            this.p = true;
         }

         bci var20 = this.a;
         if (var20 != null) {
            var12 = var20.d;
         } else {
            var12 = et.l(this.k);
         }

         float var5;
         float var6;
         if (bci.c(var1) == 0.0F) {
            var5 = 0.0F;
         } else if (er.h(this.b) == 0.0F) {
            if (er.h(this.c) == 0.0F) {
               var5 = 0.0F;
            } else {
               var6 = this.k(var1, var12);
               var5 = var6;
               if (er.h(this.c) == 0.0F) {
                  this.c.onRelease();
                  var5 = var6;
               }
            }
         } else {
            var6 = this.n(var1, var12);
            var5 = var6;
            if (er.h(this.b) == 0.0F) {
               this.b.onRelease();
               var5 = var6;
            }
         }

         if (bci.b(var1) == 0.0F) {
            var6 = 0.0F;
         } else {
            float var7;
            if (er.h(this.d) == 0.0F) {
               if (er.h(this.e) == 0.0F) {
                  var6 = 0.0F;
               } else {
                  var7 = this.m(var1, var12);
                  var6 = var7;
                  if (er.h(this.e) == 0.0F) {
                     this.e.onRelease();
                     var6 = var7;
                  }
               }
            } else {
               var7 = this.l(var1, var12);
               var6 = var7;
               if (er.h(this.d) == 0.0F) {
                  this.d.onRelease();
                  var6 = var7;
               }
            }
         }

         long var16 = es.i(var6, var5);
         if (!c.o(var16, bci.a)) {
            this.e();
         }

         long var18 = bci.e(var1, var16);
         long var14 = ((bci)var4.eo(bci.i(var18))).d;
         var18 = bci.e(var18, var14);
         boolean var21;
         if (c.n(var3, 1)) {
            if (bci.b(var18) > 0.5F) {
               this.l(var18, var12);
               var21 = true;
            } else if (bci.b(var18) < -0.5F) {
               this.m(var18, var12);
               var21 = true;
            } else {
               var21 = false;
            }

            boolean var8;
            if (bci.c(var18) > 0.5F) {
               this.n(var18, var12);
               var8 = true;
            } else if (bci.c(var18) < -0.5F) {
               this.k(var18, var12);
               var8 = true;
            } else {
               var8 = false;
            }

            if (!var21) {
               if (var8) {
                  var21 = true;
               } else {
                  var21 = false;
               }
            } else {
               var21 = true;
            }
         } else {
            var21 = false;
         }

         boolean var10;
         EdgeEffect var22;
         if (!this.d.isFinished() && bci.b(var1) < 0.0F) {
            var22 = this.d;
            bci.b(var1);
            var22.onRelease();
            var10 = this.d.isFinished();
         } else {
            var10 = false;
         }

         var9 = var10;
         if (!this.e.isFinished()) {
            var9 = var10;
            if (bci.b(var1) > 0.0F) {
               var22 = this.e;
               bci.b(var1);
               var22.onRelease();
               if (!var10) {
                  if (this.e.isFinished()) {
                     var9 = true;
                  } else {
                     var9 = false;
                  }
               } else {
                  var9 = true;
               }
            }
         }

         var10 = var9;
         if (!this.b.isFinished()) {
            var10 = var9;
            if (bci.c(var1) < 0.0F) {
               var22 = this.b;
               bci.c(var1);
               var22.onRelease();
               if (!var9) {
                  if (this.b.isFinished()) {
                     var10 = true;
                  } else {
                     var10 = false;
                  }
               } else {
                  var10 = true;
               }
            }
         }

         if (!this.c.isFinished() && bci.c(var1) > 0.0F) {
            var22 = this.c;
            bci.c(var1);
            var22.onRelease();
            if (!var10) {
               if (this.c.isFinished()) {
                  var9 = var11;
               } else {
                  var9 = false;
               }
            } else {
               var9 = var11;
            }
         } else {
            var9 = var10;
         }

         if (var9 || var21) {
            this.e();
         }

         return bci.f(var16, var14);
      }
   }

   public final bbb b() {
      return this.r;
   }

   public final Object c(long var1, qvx var3, que var4) {
      abb var13;
      label91: {
         if (var4 instanceof abb) {
            abb var10 = (abb)var4;
            int var7 = var10.d;
            if ((var7 & Integer.MIN_VALUE) != 0) {
               var10.d = var7 + Integer.MIN_VALUE;
               var13 = var10;
               break label91;
            }
         }

         var13 = new abb(this, var4);
      }

      abe var12;
      Object var14;
      label85: {
         Object var15 = var13.b;
         qul var11 = qul.a;
         switch(var13.d) {
         case 0:
            pwm.bs(var15);
            byb var16;
            if (!bcl.g(this.k)) {
               float var5;
               if (byb.a(var1) > 0.0F && er.h(this.d) != 0.0F) {
                  this.d.onAbsorb(qxg.e(byb.a(var1)));
                  var5 = byb.a(var1);
               } else if (byb.a(var1) < 0.0F) {
                  if (er.h(this.e) == 0.0F) {
                     var5 = 0.0F;
                  } else {
                     this.e.onAbsorb(-qxg.e(byb.a(var1)));
                     var5 = byb.a(var1);
                  }
               } else {
                  var5 = 0.0F;
               }

               float var6;
               if (byb.b(var1) > 0.0F && er.h(this.b) != 0.0F) {
                  this.b.onAbsorb(qxg.e(byb.b(var1)));
                  var6 = byb.b(var1);
               } else if (byb.b(var1) < 0.0F) {
                  if (er.h(this.c) == 0.0F) {
                     var6 = 0.0F;
                  } else {
                     this.c.onAbsorb(-qxg.e(byb.b(var1)));
                     var6 = byb.b(var1);
                  }
               } else {
                  var6 = 0.0F;
               }

               long var8 = car.A(var5, var6);
               if (!c.o(var8, byb.a)) {
                  this.e();
               }

               var1 = byb.c(var1, var8);
               var16 = byb.e(var1);
               var13.e = this;
               var13.a = var1;
               var13.d = 2;
               var14 = var3.a(var16, var13);
               if (var14 == var11) {
                  return var11;
               }

               var12 = this;
               break label85;
            }

            var16 = byb.e(var1);
            var13.d = 1;
            if (var3.a(var16, var13) == var11) {
               return var11;
            }
            break;
         case 1:
            pwm.bs(var15);
            break;
         case 2:
            var1 = var13.a;
            var12 = var13.e;
            pwm.bs(var15);
            var14 = var15;
            break label85;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         return qsn.a;
      }

      var1 = byb.c(var1, ((byb)var14).b);
      var12.p = false;
      if (byb.a(var1) > 0.0F) {
         var12.d.onAbsorb(qxg.e(byb.a(var1)));
      } else if (byb.a(var1) < 0.0F) {
         var12.e.onAbsorb(-qxg.e(byb.a(var1)));
      }

      if (byb.b(var1) > 0.0F) {
         var12.b.onAbsorb(qxg.e(byb.b(var1)));
      } else if (byb.b(var1) < 0.0F) {
         var12.c.onAbsorb(-qxg.e(byb.b(var1)));
      }

      if (!c.o(var1, byb.a)) {
         var12.e();
      }

      var12.d();
      return qsn.a;
   }

   public final void d() {
      List var4 = this.n;
      int var3 = var4.size();
      int var2 = 0;

      boolean var1;
      for(var1 = false; var2 < var3; ++var2) {
         EdgeEffect var5 = (EdgeEffect)var4.get(var2);
         var5.onRelease();
         if (!var5.isFinished() && !var1) {
            var1 = false;
         } else {
            var1 = true;
         }
      }

      if (var1) {
         this.e();
      }

   }

   public final void e() {
      if (this.o) {
         this.j.b(qsn.a);
      }

   }

   public final boolean f(bev var1, EdgeEffect var2, Canvas var3) {
      int var5 = var3.save();
      var3.rotate(180.0F);
      float var4 = var1.eI(this.m.b.b);
      var3.translate(-bcl.c(this.k), -bcl.a(this.k) + var4);
      boolean var6 = var2.draw(var3);
      var3.restoreToCount(var5);
      return var6;
   }

   public final boolean g(bev var1, EdgeEffect var2, Canvas var3) {
      int var4 = var3.save();
      var3.rotate(270.0F);
      var3.translate(-bcl.a(this.k), var1.eI(this.m.b.a(var1.k())));
      boolean var5 = var2.draw(var3);
      var3.restoreToCount(var4);
      return var5;
   }

   public final boolean h(bev var1, EdgeEffect var2, Canvas var3) {
      int var7 = var3.save();
      int var6 = qxg.e(bcl.c(this.k));
      float var5 = this.m.b.b(var1.k());
      var3.rotate(90.0F);
      float var4 = (float)var6;
      var5 = var1.eI(var5);
      var3.translate(0.0F, -var4 + var5);
      boolean var8 = var2.draw(var3);
      var3.restoreToCount(var7);
      return var8;
   }

   public final boolean i(bev var1, EdgeEffect var2, Canvas var3) {
      int var4 = var3.save();
      var3.translate(0.0F, var1.eI(this.m.b.a));
      boolean var5 = var2.draw(var3);
      var3.restoreToCount(var4);
      return var5;
   }

   public final boolean j() {
      List var4 = this.n;
      int var2 = var4.size();
      boolean var3 = false;

      for(int var1 = 0; var1 < var2; ++var1) {
         if (er.h((EdgeEffect)var4.get(var1)) != 0.0F) {
            var3 = true;
            break;
         }
      }

      return var3;
   }
}
