@qus(
   b = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1",
   c = "FontListFontFamilyTypefaceAdapter.kt",
   d = "invokeSuspend",
   e = {269}
)
final class buh extends quw implements qvt {
   int a;
   final buk b;
   final bup c;

   public buh(buk var1, bup var2, que var3) {
      super(1, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         buk var2 = this.b;
         bup var4 = this.c;
         this.a = 1;
         Object var5 = var2.c(var4, this);
         var1 = var5;
         if (var5 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return var1;
   }
}
