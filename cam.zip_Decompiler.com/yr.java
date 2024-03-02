import java.util.concurrent.CancellationException;

@qus(
   b = "androidx.compose.animation.core.Animatable$runAnimation$2",
   c = "Animatable.kt",
   d = "invokeSuspend",
   e = {310}
)
final class yr extends quw implements qvt {
   Object a;
   Object b;
   int c;
   final yt d;
   final Object e;
   final yy f;
   final long g;
   final qvt h;

   public yr(yt var1, Object var2, yy var3, long var4, qvt var6, que var7) {
      super(1, var7);
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = var6;
   }

   public final Object b(Object var1) {
      CancellationException var10000;
      label50: {
         qul var8 = qul.a;
         int var3 = this.c;
         byte var2 = 1;
         boolean var10001;
         Object var20;
         switch(var3) {
         case 0:
            pwm.bs(var1);

            try {
               yt var7 = this.d;
               zc var15 = var7.a;
               zh var19 = (zh)((qvt)var7.c.a).eo(this.e);
               var19.getClass();
               var15.a = var19;
               this.d.g(((aac)this.f).b);
               this.d.f(true);
               zc var10 = this.d.a;
               Object var9 = var10.a();
               zh var16 = do.x(var10.a);
               long var4 = var10.b;
               boolean var6 = var10.d;
               var20 = new zc(var10.e, var9, var16, var4, Long.MIN_VALUE, var6);
               var1 = new qwv();
               yy var23 = this.f;
               var4 = this.g;
               adi var22 = new adi(this.d, (zc)var20, this.h, (qwv)var1, 1);
               this.a = var20;
               this.b = var1;
               this.c = 1;
               if (dq.d((zc)var20, var23, var4, var22, this) == var8) {
                  return var8;
               }
               break;
            } catch (CancellationException var14) {
               var10000 = var14;
               var10001 = false;
               break label50;
            }
         default:
            Object var21 = this.b;
            var20 = this.a;

            try {
               pwm.bs(var1);
            } catch (CancellationException var13) {
               var10000 = var13;
               var10001 = false;
               break label50;
            }

            var1 = var21;
         }

         label33: {
            try {
               if (((qwv)var1).a) {
                  break label33;
               }
            } catch (CancellationException var12) {
               var10000 = var12;
               var10001 = false;
               break label50;
            }

            var2 = 2;
         }

         try {
            this.d.e();
            yz var18 = new yz((zc)var20, var2);
            return var18;
         } catch (CancellationException var11) {
            var10000 = var11;
            var10001 = false;
         }
      }

      CancellationException var17 = var10000;
      this.d.e();
      throw var17;
   }
}
