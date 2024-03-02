import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;

public final class rgr implements ref {
   final Object a;
   final Object b;
   final Object c;
   final Object d;
   private final int e;

   public rgr(qwz var1, qzv var2, rgt var3, ref var4, int var5) {
      this.e = var5;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public rgr(ref var1, qwv var2, fwf var3, odg var4, int var5) {
      this.e = var5;
      this.c = var1;
      this.d = var2;
      this.a = var3;
      this.b = var4;
   }

   public final Object a(Object var1, que var2) {
      int var3 = this.e;
      String var6 = gThp.qaXj;
      Object var14;
      switch(var3) {
      case 0:
         rgq var9;
         label43: {
            if (var2 instanceof rgq) {
               rgq var4 = (rgq)var2;
               var3 = var4.d;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var4.d = var3 + Integer.MIN_VALUE;
                  var9 = var4;
                  break label43;
               }
            }

            var9 = new rgq(this, var2);
         }

         Object var5 = var9.b;
         qul var11 = qul.a;
         rgr var10;
         switch(var9.d) {
         case 0:
            pwm.bs(var5);
            rbd var16 = (rbd)((qwz)this.a).a;
            if (var16 != null) {
               var16.s(new rgu());
               var9.e = this;
               var9.a = var1;
               var9.d = 1;
               if (var16.gS(var9) == var11) {
                  var1 = var11;
                  return var1;
               }
            }

            var10 = this;
            break;
         case 1:
            var1 = var9.a;
            var10 = var9.e;
            pwm.bs(var5);
            break;
         default:
            throw new IllegalStateException(var6);
         }

         var14 = var10.a;
         var5 = var10.b;
         Object var18 = var10.c;
         Object var12 = var10.d;
         rbd var8 = qwo.o((qzv)var5, (qui)null, 4, new rgp((rgt)var18, (ref)var12, var1, (que)null), 1);
         ((qwz)var14).a = var8;
         var1 = qsn.a;
         return var1;
      default:
         nzn var13;
         label65: {
            if (var2 instanceof nzn) {
               nzn var15 = (nzn)var2;
               var3 = var15.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var15.b = var3 + Integer.MIN_VALUE;
                  var13 = var15;
                  break label65;
               }
            }

            var13 = new nzn(this, var2);
         }

         Object var7 = var13.a;
         qul var17 = qul.a;
         switch(var13.b) {
         case 0:
            pwm.bs(var7);
            var14 = this.c;
            qwv var19 = (qwv)this.d;
            if (var19.a) {
               var19.a = false;
               var7 = ((fwf)this.a).b;
               nyr var20 = odg.d((odg)this.b);
               var13.d = (ref)var14;
               var13.c = var1;
               var13.b = 1;
               if (((odh)var7).a(var20, var13) == var17) {
                  return var17;
               }
            }
            break;
         case 1:
            var1 = var13.c;
            var14 = var13.d;
            pwm.bs(var7);
            break;
         case 2:
            pwm.bs(var7);
            return qsn.a;
         default:
            throw new IllegalStateException(var6);
         }

         var13.d = null;
         var13.c = null;
         var13.b = 2;
         if (((ref)var14).a(var1, var13) == var17) {
            return var17;
         } else {
            return qsn.a;
         }
      }
   }
}
