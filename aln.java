import java.util.concurrent.CancellationException;

@qus(
   b = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1",
   c = "BringIntoViewResponder.kt",
   d = "invokeSuspend",
   e = {170}
)
final class aln extends quw implements qvx {
   int a;
   final alr b;
   final bjf c;
   final qvi d;

   public aln(alr var1, bjf var2, qvi var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var6 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         alr var5 = this.b;
         ade var12 = var5.b;
         alm var7 = new alm(var5, this.c, this.d);
         this.a = 1;
         Object var13 = var7.a();
         if (var13 != null && !ade.k(var12, (bcj)var13)) {
            qza var14 = new qza(quy.h(this), 1);
            var14.r();
            ada var15 = new ada(var7, var14);
            lmk var8 = var12.j;
            Object var9 = var15.a.a();
            if (var9 == null) {
               var15.b.gP(qsn.a);
            } else {
               label66: {
                  var15.b.s(new zy(var8, var15, 5));
                  qxq var10 = new qxq(0, ((axf)var8.a).b - 1);
                  int var4 = var10.a;
                  int var2 = var10.b;
                  if (var4 <= var2) {
                     while(true) {
                        Object var16 = ((ada)((axf)var8.a).a[var2]).a.a();
                        if (var16 != null) {
                           bcj var11 = (bcj)var16;
                           var11 = ((bcj)var9).e(var11);
                           if (c.E(var11, var9)) {
                              ((axf)var8.a).f(var2 + 1, var15);
                              break label66;
                           }

                           if (!c.E(var11, var16)) {
                              CancellationException var17 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                              int var3 = ((axf)var8.a).b - 1;
                              if (var3 <= var2) {
                                 while(true) {
                                    ((ada)((axf)var8.a).a[var2]).b.A(var17);
                                    if (var3 == var2) {
                                       break;
                                    }

                                    ++var3;
                                 }
                              }
                           }
                        }

                        if (var2 == var4) {
                           break;
                        }

                        --var2;
                     }
                  }

                  ((axf)var8.a).f(0, var15);
               }

               if (!var12.h) {
                  var12.i();
               }
            }

            var13 = var14.c();
            var1 = var13;
            if (var13 != qul.a) {
               var1 = qsn.a;
            }
         } else {
            var1 = qsn.a;
         }

         if (var1 == var6) {
            return var6;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aln(this.b, this.c, this.d, var2);
   }
}
