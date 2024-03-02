import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class aqe implements aci {
   private final boolean a;
   private final float b;
   private final avi c;

   public aqe(boolean var1, float var2, avi var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final acj a(lmk var1, asm var2) {
      var2.u(988743187);
      aqs var12 = (aqs)var2.e(aqt.a);
      var2.u(-1524341038);
      long var6;
      if (((bcy)this.c.a()).g != bcy.f) {
         var6 = ((bcy)this.c.a()).g;
      } else {
         var6 = var12.a(var2);
      }

      var2.n();
      avi var15 = so.l(bcy.f(var6), var2);
      avi var16 = so.l(var12.b(var2), var2);
      boolean var8 = this.a;
      float var3 = this.b;
      var15.getClass();
      var16.getClass();
      var2.u(331259447);
      var2.u(-1737891121);

      ViewParent var13;
      Object var17;
      for(var17 = var2.e(bou.e); !(var17 instanceof ViewGroup); var17 = var13) {
         var13 = ((View)var17).getParent();
         if (!(var13 instanceof View)) {
            throw new IllegalArgumentException(c.aF(var17, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
         }

         var13.getClass();
      }

      ViewGroup var14 = (ViewGroup)var17;
      var2.n();
      var2.u(1643267286);
      boolean var9;
      boolean var10;
      Object var18;
      if (var14.isInEditMode()) {
         label52: {
            var2.u(511388516);
            var10 = var2.B(var1);
            var9 = var2.B(this);
            var18 = var2.f();
            if (!(var10 | var9)) {
               var17 = var18;
               if (var18 != asl.a) {
                  break label52;
               }
            }

            var17 = new aqb(var8, var3, var15, var16);
            var2.w(var17);
         }

         var2.n();
         var17 = (aqb)var17;
         var2.n();
         var2.n();
      } else {
         var2.n();
         int var5 = var14.getChildCount();
         int var4 = 0;

         View var19;
         while(true) {
            if (var4 >= var5) {
               var19 = null;
               break;
            }

            var19 = var14.getChildAt(var4);
            if (var19 instanceof aqo) {
               break;
            }

            ++var4;
         }

         var18 = var19;
         if (var19 == null) {
            Context var21 = var14.getContext();
            var21.getClass();
            var18 = new aqo(var21);
            var14.addView((View)var18);
         }

         label38: {
            var2.u(1618982084);
            var9 = var2.B(var1);
            var10 = var2.B(this);
            boolean var11 = var2.B(var18);
            Object var20 = var2.f();
            if (!(var9 | var10 | var11)) {
               var17 = var20;
               if (var20 != asl.a) {
                  break label38;
               }
            }

            var17 = new apz(var8, var3, var15, var16, (aqo)var18);
            var2.w(var17);
         }

         var2.n();
         var17 = (apz)var17;
         var2.n();
      }

      atj.d(var17, var1, new aqd(var1, (aqq)var17, (que)null), var2);
      var2.n();
      return (acj)var17;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof aqe)) {
         return false;
      } else {
         boolean var2 = this.a;
         aqe var3 = (aqe)var1;
         if (var2 != var3.a) {
            return false;
         } else if (!bxt.c(this.b, var3.b)) {
            return false;
         } else {
            return c.E(this.c, var3.c);
         }
      }
   }

   public final int hashCode() {
      return (c.m(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + this.c.hashCode();
   }
}
