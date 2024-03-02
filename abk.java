@qus(
   b = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {301, 303, 310, 311, 320}
)
final class abk extends quw implements qvx {
   boolean a;
   int b;
   final long c;
   final aav d;
   final qvi e;
   final afd f;
   final lmk g;
   private Object h;

   public abk(afd var1, long var2, lmk var4, aav var5, qvi var6, que var7) {
      super(2, var7);
      this.f = var1;
      this.c = var2;
      this.g = var4;
      this.d = var5;
      this.e = var6;
   }

   public final Object b(Object var1) {
      label64: {
         qul var4;
         ahs var6;
         lmk var10;
         label54: {
            boolean var2;
            label55: {
               var4 = qul.a;
               rbd var8;
               switch(this.b) {
               case 0:
                  pwm.bs(var1);
                  var8 = qwo.o((qzv)this.h, (qui)null, 0, new abj(this.e, this.c, this.g, this.d, (que)null), 3);
                  afd var7 = this.f;
                  this.h = var8;
                  this.b = 1;
                  var1 = var7.j(this);
                  if (var1 == var4) {
                     return var4;
                  }
                  break;
               case 1:
                  var8 = (rbd)this.h;
                  pwm.bs(var1);
                  break;
               case 2:
                  var2 = this.a;
                  pwm.bs(var1);
                  break label55;
               case 3:
                  ahs var3 = (ahs)this.h;
                  pwm.bs(var1);
                  var6 = var3;
                  break label54;
               case 4:
               default:
                  pwm.bs(var1);
                  break label64;
               }

               var2 = (Boolean)var1;
               if (!var8.gU()) {
                  ahr var9 = this.d.b;
                  if (var9 != null) {
                     var10 = this.g;
                     if (var2) {
                        var1 = new ahs(var9);
                     } else {
                        var1 = new ahq(var9);
                     }

                     this.h = null;
                     this.b = 5;
                     if (var10.aM((ahp)var1, this) == var4) {
                        return var4;
                     }
                  }
                  break label64;
               }

               this.h = null;
               this.a = var2;
               this.b = 2;
               if (qzy.p(var8, this) == var4) {
                  return var4;
               }
            }

            if (!var2) {
               break label64;
            }

            ahr var5 = new ahr(this.c);
            var6 = new ahs(var5);
            var10 = this.g;
            this.h = var6;
            this.b = 3;
            if (var10.aM(var5, this) == var4) {
               return var4;
            }
         }

         var10 = this.g;
         this.h = null;
         this.b = 4;
         if (var10.aM(var6, this) == var4) {
            return var4;
         }
      }

      this.d.b = null;
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      abk var3 = new abk(this.f, this.c, this.g, this.d, this.e, var2);
      var3.h = var1;
      return var3;
   }
}
