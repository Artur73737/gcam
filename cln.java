import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cln implements ref {
   final Object a;
   private final int b;

   public cln(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final Object a(Object var1, que var2) {
      int var3 = this.b;
      Object var5 = null;
      gtq var4 = null;
      cxl var10;
      cxk var11;
      qul var16;
      switch(var3) {
      case 0:
         var1 = ((rdo)this.a).t(var1, var2);
         if (var1 == qul.a) {
            return var1;
         }

         return qsn.a;
      case 1:
         apt var18;
         label153: {
            if (var2 instanceof apt) {
               apt var19 = (apt)var2;
               var3 = var19.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var19.b = var3 + Integer.MIN_VALUE;
                  var18 = var19;
                  break label153;
               }
            }

            var18 = new apt(this, var2);
         }

         var5 = var18.a;
         var16 = qul.a;
         switch(var18.b) {
         case 0:
            pwm.bs(var5);
            var5 = this.a;
            if (!((Map)var1).isEmpty()) {
               var18.b = 1;
               if (((ref)var5).a(var1, var18) == var16) {
                  return var16;
               }
            }
            break;
         case 1:
            pwm.bs(var5);
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         return qsn.a;
      case 2:
         ((cew)this.a).accept(var1);
         return qsn.a;
      case 3:
         gtm var15;
         label145: {
            if (var2 instanceof gtm) {
               gtm var17 = (gtm)var2;
               var3 = var17.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var17.b = var3 + Integer.MIN_VALUE;
                  var15 = var17;
                  break label145;
               }
            }

            var15 = new gtm(this, var2);
         }

         Object var21 = var15.a;
         var16 = qul.a;
         switch(var15.b) {
         case 0:
            label138: {
               pwm.bs(var21);
               var21 = this.a;
               cxv var26 = (cxv)var1;
               if (var26 != null) {
                  cxj var23 = cxj.a;
                  var10 = var26.a(var23);
                  if (var10 != null) {
                     var11 = var10.a;
                  } else {
                     var11 = null;
                  }

                  if (!c.E(var11, cxk.e)) {
                     throw new IllegalStateException("No session is currently active");
                  }

                  if (c.E(var26.b, cxu.a)) {
                     if (c.E(var23, cxj.a)) {
                        var1 = new cxh(var26.d);
                     } else {
                        if (!c.E(var23, cxj.b)) {
                           throw new IllegalArgumentException("Invalid operation provided");
                        }

                        WindowAreaComponent var24 = var26.d;
                        ExtensionWindowAreaPresentation var25 = var24.getRearDisplayPresentation();
                        var25.getClass();
                        var1 = new cxg(var24, var25);
                     }
                     break label138;
                  }
               }

               var1 = var5;
            }

            var15.b = 1;
            if (((ref)var21).a(var1, var15) == var16) {
               return var16;
            }
            break;
         case 1:
            pwm.bs(var21);
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         return qsn.a;
      case 4:
         gtp var14;
         label132: {
            if (var2 instanceof gtp) {
               gtp var20 = (gtp)var2;
               var3 = var20.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var20.b = var3 + Integer.MIN_VALUE;
                  var14 = var20;
                  break label132;
               }
            }

            var14 = new gtp(this, var2);
         }

         var5 = var14.a;
         qul var6 = qul.a;
         switch(var14.b) {
         case 0:
            pwm.bs(var5);
            Object var7 = this.a;
            List var22 = (List)var1;
            ArrayList var13 = new ArrayList();
            Iterator var8 = var22.iterator();

            while(var8.hasNext()) {
               var5 = var8.next();
               if (c.E(((cxv)var5).b, cxu.a)) {
                  var13.add(var5);
               }
            }

            var8 = var13.iterator();

            label118: {
               while(var8.hasNext()) {
                  var5 = var8.next();
                  var10 = ((cxv)var5).a(cxj.a);
                  if (var10 != null) {
                     var11 = var10.a;
                  } else {
                     var11 = null;
                  }

                  if (c.E(var11, cxk.b) ^ true) {
                     var1 = var5;
                     break label118;
                  }
               }

               var1 = var4;
            }

            var14.b = 1;
            if (((ref)var7).a(var1, var14) == var6) {
               return var6;
            }
            break;
         case 1:
            pwm.bs(var5);
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         return qsn.a;
      case 5:
         gtq var12;
         label109: {
            if (var2 instanceof gtq) {
               var4 = (gtq)var2;
               var3 = var4.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var4.b = var3 + Integer.MIN_VALUE;
                  var12 = var4;
                  break label109;
               }
            }

            var12 = new gtq(this, var2);
         }

         var5 = var12.a;
         var16 = qul.a;
         switch(var12.b) {
         case 0:
            label102: {
               pwm.bs(var5);
               var5 = this.a;
               cxv var9 = (cxv)var1;
               if (var9 != null) {
                  var10 = var9.a(cxj.a);
                  if (var10 != null) {
                     var11 = var10.a;
                     break label102;
                  }
               }

               var11 = cxk.b;
            }

            var12.b = 1;
            if (((ref)var5).a(var11, var12) == var16) {
               return var16;
            }
            break;
         case 1:
            pwm.bs(var5);
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         return qsn.a;
      case 6:
         ((Collection)this.a).add(var1);
         return qsn.a;
      case 7:
         ((qwz)this.a).a = var1;
         throw new rgf(this);
      default:
         ((qwz)this.a).a = var1;
         throw new rgf(this);
      }
   }
}
