import androidx.viewpager2.widget.ViewPager2;

public final class cwb extends cus {
   public final ViewPager2 a;
   public ej b;
   private final cic c;
   private final cic d;

   public cwb(ViewPager2 var1) {
      this.a = var1;
      this.c = new cvz(this, 1);
      this.d = new cvz(this, 0);
   }

   public final boolean d(int var1) {
      return var1 == 8192 || var1 == 4096;
   }

   public final void e(int var1) {
      ViewPager2 var2 = this.a;
      if (var2.g) {
         var2.e(var1, true);
      }

   }

   public final void f() {
      ViewPager2 var5 = this.a;
      int var2 = 16908360;
      cgm.f(var5, 16908360);
      cgm.f(var5, 16908361);
      cgm.f(var5, 16908358);
      cgm.f(var5, 16908359);
      if (this.a.b() != null) {
         int var3 = this.a.b().a();
         if (var3 != 0) {
            ViewPager2 var6 = this.a;
            if (var6.g) {
               if (var6.a() == 0) {
                  boolean var4 = this.a.g();
                  int var1;
                  if (!var4) {
                     var1 = 16908361;
                  } else {
                     var1 = 16908360;
                  }

                  if (var4) {
                     var2 = 16908361;
                  }

                  if (this.a.b < var3 - 1) {
                     cgm.i(var5, new chr(var1, (CharSequence)null), this.c);
                  }

                  if (this.a.b > 0) {
                     cgm.i(var5, new chr(var2, (CharSequence)null), this.d);
                     return;
                  }
               } else {
                  if (this.a.b < var3 - 1) {
                     cgm.i(var5, new chr(16908359, (CharSequence)null), this.c);
                  }

                  if (this.a.b > 0) {
                     cgm.i(var5, new chr(16908358, (CharSequence)null), this.d);
                     return;
                  }
               }

            }
         }
      }
   }
}
