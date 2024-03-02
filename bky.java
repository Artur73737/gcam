import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class bky extends bba implements blv, bll, bnj, bni, bkr, bkt, bnh, blu, bln, bbr, bbx, bca, bnf {
   public baz a;
   public boolean b;
   public final HashSet c;
   public bjf d;
   private bko e;

   public bky(baz var1) {
      var1.getClass();
      super();
      super.q = jm.g(var1);
      this.a = var1;
      this.b = true;
      this.c = new HashSet();
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      baz var5 = this.a;
      var5.getClass();
      return ((bji)var5).a(var1, var2, var3);
   }

   public final void c(brl var1) {
      var1.getClass();
      baz var2 = this.a;
      var2.getClass();
      AppendedSemanticsElement var7 = (AppendedSemanticsElement)var2;
      brl var3 = new brl();
      var3.b = false;
      var7.a.eo(var3);
      if (var3.b) {
         var1.b = true;
      }

      if (var3.c) {
         var1.c = true;
      }

      Iterator var8 = var3.a.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var4 = (Entry)var8.next();
         bru var9 = (bru)var4.getKey();
         Object var10 = var4.getValue();
         if (!var1.a.containsKey(var9)) {
            var1.a.put(var9, var10);
         } else if (var10 instanceof brc) {
            Object var5 = var1.a.get(var9);
            var5.getClass();
            brc var6 = (brc)var5;
            Map var12 = var1.a;
            brc var11 = (brc)var10;
            var12.put(var9, new brc(var6.a));
         }
      }

   }

   public final void d(bcb var1) {
      var1.getClass();
      baz var2 = this.a;
      if (var2 instanceof bbq) {
         ((bbq)var2).a();
      } else {
         throw new IllegalStateException("onFocusEvent called on wrong node");
      }
   }

   public final void eA() {
      this.l();
   }

   // $FF: synthetic method
   public final void eB() {
      kd.h(this);
   }

   public final void eC(bhl var1, int var2, long var3) {
      baz var5 = this.a;
      var5.getClass();
      ((bib)var5).a().b();
   }

   public final Object eD(bxr var1, Object var2) {
      var1.getClass();
      baz var3 = this.a;
      var3.getClass();
      return ((bkb)var3).a();
   }

   public final void eE(bbv var1) {
      baz var2 = this.a;
      if (var2 instanceof bbt) {
         (new blm((bbt)var2)).eo(var1);
      } else {
         throw new IllegalStateException("applyFocusProperties called on wrong node");
      }
   }

   public final Object eq(lmk var1) {
      this.c.add(var1);
      bba var4 = super.p;
      if (!var4.y) {
         IllegalStateException var11 = new IllegalStateException("visitAncestors called on an unattached node");
         throw var11;
      } else {
         var4 = var4.s;
         bmd var9 = jj.h(this);

         while(true) {
            while(var9 != null) {
               bba var5 = var4;
               if ((var9.n.e.r & 32) != 0) {
                  label80:
                  for(; var5 != null; var5 = var5.s) {
                     if ((var5.q & 32) != 0) {
                        bba var8 = var5;
                        axf var7 = null;

                        while(true) {
                           int var3;
                           axf var12;
                           do {
                              if (var8 == null) {
                                 continue label80;
                              }

                              if (var8 instanceof bkr) {
                                 bkr var13 = (bkr)var8;
                                 if (var13.ex().b(var1)) {
                                    return var13.ex().a(var1);
                                 }

                                 var12 = var7;
                                 break;
                              }

                              var12 = var7;
                              if ((var8.q & 32) == 0) {
                                 break;
                              }

                              var12 = var7;
                              if (!(var8 instanceof blh)) {
                                 break;
                              }

                              bba var6 = ((blh)var8).A;
                              var3 = 0;

                              int var2;
                              for(var12 = var7; var6 != null; var3 = var2) {
                                 bba var15 = var8;
                                 axf var10 = var12;
                                 var2 = var3;
                                 if ((var6.q & 32) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var15 = var6;
                                       var10 = var12;
                                    } else {
                                       var7 = var12;
                                       if (var12 == null) {
                                          var7 = new axf(new bba[16]);
                                       }

                                       if (var8 != null) {
                                          var7.p(var8);
                                       }

                                       var7.p(var6);
                                       var4 = null;
                                       var10 = var7;
                                       var15 = var4;
                                    }
                                 }

                                 var6 = var6.t;
                                 var8 = var15;
                                 var12 = var10;
                              }

                              var7 = var12;
                           } while(var3 == 1);

                           var8 = jj.f(var12);
                           var7 = var12;
                        }
                     }
                  }
               }

               var9 = var9.n();
               if (var9 != null) {
                  bmr var14 = var9.n;
                  if (var14 != null) {
                     var4 = var14.d;
                     continue;
                  }
               }

               var4 = null;
            }

            return ((qvi)var1.a).a();
         }
      }
   }

   public final void er() {
      this.j(true);
   }

   public final void es() {
      this.b = true;
      jk.k(this);
   }

   // $FF: synthetic method
   public final boolean et() {
      return false;
   }

   public final void eu(bmf var1) {
      baz var3 = this.a;
      var3.getClass();
      bbl var2 = (bbl)var3;
      if (this.b && var3 instanceof bbk) {
         jj.k(this).j.d(this, bla.b, new amp(var3, 20));
         this.b = false;
      }

      var2.j(var1);
   }

   public final bkq ex() {
      bko var1 = this.e;
      return (bkq)(var1 != null ? var1 : bkp.a);
   }

   public final void ey() {
      baz var1 = this.a;
      var1.getClass();
      ((bib)var1).a().a();
   }

   // $FF: synthetic method
   public final void ez() {
      kd.g(this);
   }

   public final void f(bjf var1) {
      baz var3 = this.a;
      var3.getClass();
      akb var4 = (akb)var3;
      if (!var4.a) {
         var4.a = true;
         que var2 = var4.b;
         if (var2 != null) {
            var2.gP(qsn.a);
         }

         var4.b = null;
      }

   }

   public final void g(bjf var1) {
      this.d = var1;
      baz var2 = this.a;
      if (var2 instanceof bjz) {
         ((bjz)var2).a();
      }

   }

   public final void h(long var1) {
      baz var3 = this.a;
      if (var3 instanceof bka) {
         bka var4 = (bka)var3;
         if (!c.o(var4.b, var1)) {
            var4.a.eo(bxx.c(var1));
            var4.b = var1;
         }
      }

   }

   public final void i() {
      baz var1 = this.a;
      var1.getClass();
      ((bib)var1).a();
      throw null;
   }

   public final void j(boolean var1) {
      if (!super.y) {
         throw new IllegalStateException("initializeModifier called on unattached node");
      } else {
         baz var3 = this.a;
         if ((super.q & 32) != 0) {
            if (var3 instanceof bht) {
               amp var4 = new amp(this, 19);
               jj.k(this).o(var4);
            }

            if (var3 instanceof bks) {
               bks var6 = (bks)var3;
               bko var5 = this.e;
               lmk var7;
               jom var9;
               if (var5 != null && var5.b(var6.d())) {
                  var6.getClass();
                  var5.a = var6;
                  var9 = jj.k(this).z;
                  var7 = var6.d();
                  ((axf)var9.c).p(this);
                  ((axf)var9.f).p(var7);
                  var9.h();
               } else {
                  this.e = new bko(var6);
                  if (bla.a(this)) {
                     var9 = jj.k(this).z;
                     var7 = var6.d();
                     ((axf)var9.c).p(this);
                     ((axf)var9.f).p(var7);
                     var9.h();
                  }
               }
            }
         }

         if ((super.q & 4) != 0) {
            if (var3 instanceof bbk) {
               this.b = true;
            }

            if (!var1) {
               jk.g(this);
            }
         }

         if ((super.q & 2) != 0) {
            if (bla.a(this)) {
               bmz var8 = super.v;
               var8.getClass();
               ((blx)var8).f = this;
               var8.aa();
            }

            if (!var1) {
               jk.g(this);
               jj.h(this).I();
            }
         }

         if (var3 instanceof aju) {
            aju var10 = (aju)var3;
            bmd var11 = jj.h(this);
            var10.a.m = var11;
         }

         if ((super.q & 128) != 0) {
            if (var3 instanceof bka && bla.a(this)) {
               jj.h(this).I();
            }

            if (var3 instanceof bjz) {
               this.d = null;
               if (bla.a(this)) {
                  boa var13 = jj.k(this);
                  bkx var12 = new bkx(this);
                  ((axf)var13.y.g).p(var12);
                  boa.t(var13);
               }
            }
         }

         if ((super.q & 256) != 0 && var3 instanceof akb && bla.a(this)) {
            jj.h(this).I();
         }

         if (var3 instanceof bbz) {
            ((bbz)var3).a().c.p(this);
         }

         int var2 = super.q;
         if ((var2 & 16) != 0 && var3 instanceof bib) {
            ((bib)var3).a();
            throw null;
         } else {
            if ((var2 & 8) != 0) {
               jj.k(this).m();
            }

         }
      }
   }

   public final void k() {
      baz var1 = this.a;
      var1.getClass();
      ((bib)var1).a();
      throw null;
   }

   public final void l() {
      if (super.y) {
         baz var1 = this.a;
         if ((super.q & 32) != 0) {
            if (var1 instanceof bks) {
               jom var2 = jj.k(this).z;
               lmk var3 = ((bks)var1).d();
               Object var5 = var2.e;
               bmd var4 = jj.h(this);
               ((axf)var5).p(var4);
               ((axf)var2.d).p(var3);
               var2.h();
            }

            if (var1 instanceof bht) {
               ((bht)var1).e(bla.a);
            }
         }

         if ((super.q & 8) != 0) {
            jj.k(this).m();
         }

         if (var1 instanceof bbz) {
            ((bbz)var1).a().c.o(this);
         }

      } else {
         throw new IllegalStateException("unInitializeModifier called on unattached node");
      }
   }

   public final void m() {
      if (super.y) {
         this.c.clear();
         jj.k(this).j.d(this, bla.c, new bmc(this, 1));
      }

   }

   public final String toString() {
      return this.a.toString();
   }

   public final boolean w() {
      return super.y;
   }
}
