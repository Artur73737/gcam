import java.util.Map;

public final class aps implements ref {
   final Object a;
   final apu b;

   public aps(Object var1, apu var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Map var1, que var2) {
      apr var9;
      label26: {
         if (var2 instanceof apr) {
            apr var5 = (apr)var2;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               var9 = var5;
               break label26;
            }
         }

         var9 = new apr(this, var2);
      }

      Object var6 = var9.a;
      qul var10 = qul.a;
      aps var7;
      switch(var9.c) {
      case 0:
         pwm.bs(var6);
         Float var8 = la.d(var1, this.a);
         if (var8 == null) {
            throw new IllegalArgumentException("The target value must have an associated anchor.");
         }

         apu var11 = this.b;
         float var3 = var8;
         var9.d = this;
         var9.c = 1;
         if (var11.f(var3, var9) == var10) {
            return var10;
         }

         var7 = this;
         break;
      case 1:
         var7 = var9.d;
         pwm.bs(var6);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var7.b.j(var7.a);
      return qsn.a;
   }
}
