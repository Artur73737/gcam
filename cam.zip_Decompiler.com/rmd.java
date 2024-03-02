import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;

public final class rmd {
   public final byte[] a;
   public int b;
   public int c;
   public boolean d;
   public final boolean e;
   public rmd f;
   public rmd g;

   public rmd() {
      this.a = new byte[8192];
      this.e = true;
      this.d = false;
   }

   public rmd(byte[] var1, int var2, int var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = false;
   }

   public final rmd a() {
      rmd var2 = this.f;
      rmd var1;
      if (var2 != this) {
         var1 = var2;
      } else {
         var1 = null;
      }

      rmd var3 = this.g;
      var3.getClass();
      var3.f = var2;
      var2 = this.f;
      var2.getClass();
      var2.g = var3;
      this.f = null;
      this.g = null;
      return var1;
   }

   public final rmd b() {
      this.d = true;
      return new rmd(this.a, this.b, this.c, true);
   }

   public final void c(rmd var1, int var2) {
      if (var1.e) {
         int var4 = var1.c;
         int var5 = var4 + var2;
         int var3 = var4;
         byte[] var6;
         if (var5 > 8192) {
            if (var1.d) {
               throw new IllegalArgumentException();
            }

            var3 = var1.b;
            if (var5 - var3 > 8192) {
               throw new IllegalArgumentException();
            }

            var6 = var1.a;
            pwm.bi(var6, var6, var3, var4);
            var3 = var1.c - var1.b;
            var1.c = var3;
            var1.b = 0;
         }

         byte[] var7 = this.a;
         var6 = var1.a;
         var4 = this.b;
         pwm.be(var7, var6, var3, var4, var4 + var2);
         var1.c += var2;
         this.b += var2;
      } else {
         throw new IllegalStateException(TRoaEYDrhZZT.XpqNarYgJaFTqQ);
      }
   }

   public final void d(rmd var1) {
      var1.g = this;
      var1.f = this.f;
      rmd var2 = this.f;
      var2.getClass();
      var2.g = var1;
      this.f = var1;
   }
}
