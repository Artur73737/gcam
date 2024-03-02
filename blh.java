public class blh extends bba {
   public bba A;
   public final int z = jm.h(this);

   protected final void m(blg var1) {
      bba var7 = var1.n();
      bba var10;
      if (var7 != var1) {
         var10 = ((bba)var1).s;
         if (var7 != super.p || !c.E(var10, this)) {
            throw new IllegalStateException("Cannot delegate to an already delegated node");
         }
      } else if (!var7.y) {
         var10 = super.p;
         var10.getClass();
         var7.p = var10;
         int var6 = super.q;
         int var2 = jm.i(var7);
         var7.q = var2;
         int var3 = super.q;
         int var5 = var2 & 2;
         if (var5 != 0 && (var3 & 2) != 0 && !(this instanceof blv)) {
            throw new IllegalStateException(c.aH(var7, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
         } else {
            var7.t = this.A;
            this.A = var7;
            var7.s = this;
            var2 |= var3;
            super.q = var2;
            if (var3 != var2) {
               if (this.n() == this) {
                  super.r = var2;
               }

               if (super.y) {
                  bba var8 = super.p;
                  Object var11 = this;

                  while(true) {
                     var3 = var2;
                     if (var11 == null) {
                        break;
                     }

                     var2 |= ((bba)var11).q;
                     ((bba)var11).q = var2;
                     var3 = var2;
                     if (var11 == var8) {
                        break;
                     }

                     var11 = ((bba)var11).s;
                  }

                  byte var4 = 0;
                  var2 = var4;
                  if (var11 != null) {
                     var8 = ((bba)var11).t;
                     var2 = var4;
                     if (var8 != null) {
                        var2 = var8.r;
                     }
                  }

                  for(var2 |= var3; var11 != null; var11 = ((bba)var11).s) {
                     var2 |= ((bba)var11).q;
                     ((bba)var11).r = var2;
                  }
               }
            }

            if (super.y) {
               if (var5 != 0 && (var6 & 2) == 0) {
                  bmr var12 = jj.h(this).n;
                  super.p.u((bmz)null);
                  var12.i();
               } else {
                  this.u(super.v);
               }

               var7.p();
               var7.s();
               jm.j(var7);
            }
         }
      } else {
         IllegalStateException var9 = new IllegalStateException("Cannot delegate to an already attached node");
         throw var9;
      }
   }

   public final void p() {
      super.p();

      for(bba var1 = this.A; var1 != null; var1 = var1.t) {
         var1.u(super.v);
         if (!var1.y) {
            var1.p();
         }
      }

   }

   public final void q() {
      for(bba var1 = this.A; var1 != null; var1 = var1.t) {
         var1.q();
      }

      super.q();
   }

   public final void r() {
      super.r();

      for(bba var1 = this.A; var1 != null; var1 = var1.t) {
         var1.r();
      }

   }

   public final void s() {
      for(bba var1 = this.A; var1 != null; var1 = var1.t) {
         var1.s();
      }

      super.s();
   }

   public final void t() {
      super.t();

      for(bba var1 = this.A; var1 != null; var1 = var1.t) {
         var1.t();
      }

   }

   public final void u(bmz var1) {
      super.v = var1;

      for(bba var2 = this.A; var2 != null; var2 = var2.t) {
         var2.u(var1);
      }

   }
}
