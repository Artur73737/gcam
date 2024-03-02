@qus(
   b = "androidx.compose.material.SwipeableState$animateInternalToOffset$2",
   c = "Swipeable.kt",
   d = "invokeSuspend",
   e = {227}
)
final class apl extends quw implements qvx {
   int a;
   final apu b;
   final float c;
   final zb d;
   private Object e;

   public apl(apu var1, float var2, zb var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      label77: {
         qul var2 = qul.a;
         Throwable var10000;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);
            aeb var14 = (aeb)this.e;
            qww var7 = new qww();
            var7.a = this.b.m.f();
            this.b.c.b(quy.d(this.c));
            this.b.i(true);

            try {
               yt var5 = yu.a(var7.a);
               Float var3 = quy.d(this.c);
               zb var6 = this.d;
               zy var4 = new zy(var14, var7, 11);
               this.a = 1;
               var1 = yt.h(var5, var3, var6, var4, this, 4);
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break;
            }

            if (var1 == var2) {
               return var2;
            }
            break label77;
         default:
            label75:
            try {
               pwm.bs(var1);
               break label77;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label75;
            }
         }

         Throwable var15 = var10000;
         this.b.c.b((Object)null);
         this.b.i(false);
         throw var15;
      }

      this.b.c.b((Object)null);
      this.b.i(false);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      apl var3 = new apl(this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
