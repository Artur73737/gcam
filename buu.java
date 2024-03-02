@qus(
   b = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1",
   c = "FontListFontFamilyTypefaceAdapter.kt",
   d = "invokeSuspend",
   e = {149}
)
final class buu extends quw implements qvx {
   int a;
   final buk b;

   public buu(buk var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         buk var3 = this.b;
         this.a = 1;
         if (var3.b(this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new buu(this.b, var2);
   }
}
