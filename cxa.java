import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

// $FF: synthetic class
public final class cxa implements cjq {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public cxa(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void a(float var1) {
      cjv var3;
      switch(this.b) {
      case 0:
         Object var5 = this.a;
         if (Math.max(0.0F, var1 + 0.0F) <= 5.0F) {
            var3 = ((cxd)var5).m;
            if (var3 != null) {
               var3.k();
            }
         }

         ((cxd)var5).c(var1);
         return;
      case 1:
         cxd var2 = (cxd)this.a;
         if (Math.max(0.0F, (float)var2.b - var1) <= 5.0F) {
            var3 = var2.l;
            if (var3 != null) {
               var3.k();
            }
         }

         var2.c(var1);
         return;
      default:
         kjh var4 = (kjh)this.a;
         var4.c.setScrollX((int)var1);
         ksm var7 = var4.c.b();
         ModeSwitcher var6 = var4.c;
         if (var6.i != var7) {
            var6.i = var7;
            prv.h(var6);
            var6.b.f(var7);
            var4.d = 4;
         }
      }
   }
}
