import java.util.concurrent.CancellationException;

@qus(
   b = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {905}
)
final class adj extends quw implements qvx {
   Object a;
   Object b;
   int c;
   final float d;
   final afj e;
   final ip f;

   public adj(float var1, ip var2, afj var3, que var4) {
      super(2, var4);
      this.d = var1;
      this.f = var2;
      this.e = var3;
   }

   public final Object b(Object var1) {
      float var2;
      label53: {
         qul var6 = qul.a;
         Object var14;
         switch(this.c) {
         case 0:
            pwm.bs(var1);
            if (!(Math.abs(this.d) > 1.0F)) {
               var2 = this.d;
               return quy.d(var2);
            }

            var1 = new qww();
            ((qww)var1).a = this.d;
            qww var7 = new qww();
            var2 = this.d;
            zc var4 = new zc(aam.a, 0.0F, do.t(var2), Long.MIN_VALUE, Long.MIN_VALUE, false);

            label58: {
               Object var5;
               boolean var10001;
               try {
                  ip var8 = this.f;
                  var5 = var8.c;
                  adi var3 = new adi(var7, this.e, (qww)var1, var8, 0);
                  this.a = var1;
                  this.b = var4;
                  this.c = 1;
                  Object var16 = var4.a();
                  zh var17 = var4.a;
                  bpe var9 = var4.e;
                  zl var10 = new zl((lmk)var5, var9, var16, var17);
                  var5 = dq.d(var4, var10, Long.MIN_VALUE, var3, this);
               } catch (CancellationException var12) {
                  var10001 = false;
                  break label58;
               }

               var14 = var5;

               try {
                  if (var5 != qul.a) {
                     var14 = qsn.a;
                  }
               } catch (CancellationException var11) {
                  var10001 = false;
                  break label58;
               }

               if (var14 == var6) {
                  return var6;
               }
               break label53;
            }

            var14 = var4;
            break;
         default:
            label59: {
               Object var15 = this.b;
               var14 = this.a;

               try {
                  pwm.bs(var1);
               } catch (CancellationException var13) {
                  var1 = var14;
                  var14 = var15;
                  break label59;
               }

               var1 = var14;
               break label53;
            }
         }

         var2 = ((Number)((zc)var14).b()).floatValue();
         ((qww)var1).a = var2;
      }

      var2 = ((qww)var1).a;
      return quy.d(var2);
   }

   public final que c(Object var1, que var2) {
      return new adj(this.d, this.f, this.e, var2);
   }
}
