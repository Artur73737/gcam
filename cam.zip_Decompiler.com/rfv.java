@qus(
   b = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1",
   c = "SharingStarted.kt",
   d = "invokeSuspend",
   e = {178, 180, 182, 183, 185}
)
final class rfv extends quw implements qvy {
   int a;
   int b;
   final rfx c;
   private Object d;

   public rfv(rfx var1, que var2) {
      super(3, var2);
      this.c = var1;
   }

   public final Object b(Object var1) {
      qul var3;
      rfo var4;
      label38: {
         label37: {
            var3 = qul.a;
            Object var2;
            switch(this.a) {
            case 0:
               pwm.bs(var1);
               var1 = this.d;
               if (this.b > 0) {
                  var4 = rfo.a;
                  this.a = 1;
                  if (((ref)var1).a(var4, this) == var3) {
                     return var3;
                  }

                  return qsn.a;
               }

               this.a = 2;
               if (qzy.d(0L, this) == var3) {
                  return var3;
               }
               break;
            case 1:
            default:
               pwm.bs(var1);
               return qsn.a;
            case 2:
               var2 = this.d;
               pwm.bs(var1);
               var1 = var2;
               break;
            case 3:
               var2 = this.d;
               pwm.bs(var1);
               var1 = var2;
               break label37;
            case 4:
               var2 = this.d;
               pwm.bs(var1);
               var1 = var2;
               break label38;
            }

            var4 = rfo.b;
            this.d = var1;
            this.a = 3;
            if (((ref)var1).a(var4, this) == var3) {
               return var3;
            }
         }

         this.d = var1;
         this.a = 4;
         if (qzy.d(Long.MAX_VALUE, this) == var3) {
            return var3;
         }
      }

      var4 = rfo.c;
      this.d = null;
      this.a = 5;
      if (((ref)var1).a(var4, this) == var3) {
         return var3;
      } else {
         return qsn.a;
      }
   }
}
