@qus(
   b = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2",
   c = "ScrollableState.kt",
   d = "invokeSuspend",
   e = {187}
)
public final class adl extends quw implements qvx {
   int a;
   final adn b;
   final acn c;
   final qvx d;

   public adl(adn var1, acn var2, qvx var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         adn var5 = this.b;
         bpe var7 = var5.d;
         afj var4 = var5.b;
         acn var3 = this.c;
         adk var6 = new adk(var5, this.d, (que)null);
         this.a = 1;
         if (var7.h(var4, var3, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new adl(this.b, this.c, this.d, var2);
   }
}
