@qus(
   b = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2",
   c = "FontListFontFamilyTypefaceAdapter.kt",
   d = "invokeSuspend",
   e = {301}
)
final class buj extends quw implements qvx {
   int a;
   final buk b;
   final bup c;

   public buj(buk var1, bup var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         dmw var2 = this.b.b;
         bup var4 = this.c;
         this.a = 1;
         Object var5 = var2.i(var4, this);
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

   public final que c(Object var1, que var2) {
      return new buj(this.b, this.c, var2);
   }
}
