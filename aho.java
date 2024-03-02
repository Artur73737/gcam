import java.util.ArrayList;

@qus(
   b = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1",
   c = "HoverInteraction.kt",
   d = "invokeSuspend",
   e = {69}
)
public final class aho extends quw implements qvx {
   int a;
   final att b;
   final lmk c;

   public aho(lmk var1, att var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ArrayList var3 = new ArrayList();
         var1 = this.c.a;
         uq var4 = new uq(var3, this.b, 4, (byte[])null);
         this.a = 1;
         if (rfl.e((rfl)var1, var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aho(this.c, this.b, var2);
   }
}
