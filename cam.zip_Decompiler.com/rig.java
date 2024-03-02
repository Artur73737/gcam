import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;

public class rig {
   private final qyq a = qwp.i((Object)null);
   public final qyq c = qwp.i(this);
   public final qyq d = qwp.i(this);

   private final rig gK() {
      while(true) {
         rig var3 = (rig)this.d.a;
         rig var1 = var3;
         rig var2 = null;

         while(true) {
            Object var4 = var1.c.a;
            if (var4 == this) {
               if (var3 == var1) {
                  return var1;
               }

               if (this.d.d(var3, var1)) {
                  return var1;
               }
               break;
            }

            if (this.gG()) {
               return null;
            }

            if (var4 == null) {
               return var1;
            }

            if (var4 instanceof rik) {
               ((rik)var4).c(var1);
               break;
            }

            if (var4 instanceof ril) {
               if (var2 != null) {
                  if (!var2.c.d(var1, ((ril)var4).a)) {
                     break;
                  }

                  var1 = var2;
                  var2 = null;
               } else {
                  var1 = (rig)var1.d.a;
               }
            } else {
               rig var5 = (rig)var4;
               var2 = var1;
               var1 = var5;
            }
         }
      }
   }

   public boolean gF() {
      return this.l() == null;
   }

   public boolean gG() {
      return this.i() instanceof ril;
   }

   public final int h(rig var1, rig var2, rie var3) {
      var1.d.b(this);
      var1.c.b(var2);
      var3.d = var2;
      if (!this.c.d(var2, var3)) {
         return 0;
      } else {
         return var3.c(this) == null ? 1 : 2;
      }
   }

   public final Object i() {
      qyq var2 = this.c;

      while(true) {
         Object var1 = var2.a;
         if (!(var1 instanceof rik)) {
            return var1;
         }

         ((rik)var1).c(this);
      }
   }

   public final rig j() {
      Object var2 = this.i();
      var2.getClass();
      ril var1;
      if (var2 instanceof ril) {
         var1 = (ril)var2;
      } else {
         var1 = null;
      }

      rig var3;
      if (var1 != null) {
         var3 = var1.a;
      } else {
         var3 = (rig)var2;
      }

      return var3;
   }

   public final rig k() {
      rig var1 = this.gK();
      if (var1 != null) {
         return var1;
      } else {
         for(var1 = (rig)this.d.a; var1.gG(); var1 = (rig)var1.d.a) {
         }

         return var1;
      }
   }

   public final rig l() {
      ril var1;
      rig var3;
      Object var4;
      do {
         var4 = this.i();
         if (var4 instanceof ril) {
            return ((ril)var4).a;
         }

         if (var4 == this) {
            return (rig)var4;
         }

         var4.getClass();
         var3 = (rig)var4;
         ril var2 = (ril)var3.a.a;
         var1 = var2;
         if (var2 == null) {
            var1 = new ril(var3);
            var3.a.b(var1);
         }
      } while(!this.c.d(var4, var1));

      var3.gK();
      return null;
   }

   public final void m(rig var1) {
      qyq var2 = var1.d;

      rig var3;
      do {
         var3 = (rig)var2.a;
         if (this.i() != var1) {
            return;
         }
      } while(!var1.d.d(var3, this));

      if (this.gG()) {
         var1.gK();
      }

   }

   public final void n() {
      Object var1 = this.i();
      var1.getClass();
      ((ril)var1).a.o();
   }

   public final void o() {
      rig var1 = this;

      while(true) {
         Object var2 = var1.i();
         if (!(var2 instanceof ril)) {
            var1.gK();
            return;
         }

         var1 = ((ril)var2).a;
      }
   }

   public final boolean p(rig var1, rig var2) {
      var2.getClass();
      var1.d.b(this);
      var1.c.b(var2);
      if (!this.c.d(var2, var1)) {
         return false;
      } else {
         var1.m(var2);
         return true;
      }
   }

   public String toString() {
      rif var1 = new rif(this);
      String var2 = qzy.b(this);
      StringBuilder var3 = new StringBuilder();
      var3.append(var1);
      var3.append(DeBfHrQZSt.ggPfO);
      var3.append(var2);
      return var3.toString();
   }
}
