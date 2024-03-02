@qus(
   b = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5",
   c = "DragGestureDetector.kt",
   d = "invokeSuspend",
   e = {547, 549, 560}
)
public final class adx extends quv implements qvx {
   Object a;
   int b;
   final qvt c;
   final qvx d;
   final qvi e;
   final qvi f;
   private Object g;

   public adx(qvt var1, qvx var2, qvi var3, qvi var4, que var5) {
      super(var5);
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
   }

   public final Object b(Object var1) {
      label36: {
         long var3;
         bij var5;
         Object var6;
         qul var7;
         bhw var8;
         label30: {
            var7 = qul.a;
            switch(this.b) {
            case 0:
               pwm.bs(var1);
               var5 = (bij)this.g;
               this.g = var5;
               this.b = 1;
               var1 = ahb.d(var5, this, 2);
               if (var1 == var7) {
                  return var7;
               }
               break;
            case 1:
               var5 = (bij)this.g;
               pwm.bs(var1);
               break;
            case 2:
               var6 = this.a;
               var5 = (bij)this.g;
               pwm.bs(var1);
               break label30;
            default:
               pwm.bs(var1);
               break label36;
            }

            var8 = (bhw)var1;
            var6 = new qww();
            var3 = var8.a;
            int var2 = var8.i;
            ajb var9 = new ajb(var6, 1);
            this.g = var5;
            this.a = var6;
            this.b = 2;
            var1 = aea.d(var5, var3, var2, var9, this);
            if (var1 == var7) {
               return var7;
            }
         }

         var8 = (bhw)var1;
         if (var8 == null) {
            return qsn.a;
         }

         this.c.eo(bci.i(var8.c));
         this.d.a(var8, quy.d(((qww)var6).a));
         var3 = var8.a;
         ou var10 = new ou(this.d, 18);
         this.g = null;
         this.a = null;
         this.b = 3;
         Object var11 = aea.g(var5, var3, var10, this);
         var1 = var11;
         if (var11 == var7) {
            return var7;
         }
      }

      if ((Boolean)var1) {
         this.e.a();
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      adx var3 = new adx(this.c, this.d, this.e, this.f, var2);
      var3.g = var1;
      return var3;
   }
}
