import android.content.Context;

final class bb extends bc {
   private final boolean c;
   private boolean d;
   private bpe e;

   public bb(dk var1, hei var2, boolean var3) {
      var1.getClass();
      super(var1, var2);
      this.c = var3;
   }

   public final bpe a(Context var1) {
      bpe var5;
      if (this.d) {
         var5 = this.e;
      } else {
         dk var3 = super.a;
         bv var4 = var3.a;
         boolean var2;
         if (var3.f == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         var5 = c.ay(var1, var4, var2, this.c);
         this.e = var5;
         this.d = true;
      }

      return var5;
   }
}
