// $FF: synthetic class
public final class cwj implements lvx {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public cwj(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void d(Object var1) {
      switch(this.b) {
      case 0:
         ((qvt)this.a).eo(var1);
         return;
      case 1:
         ((qvt)this.a).eo(var1);
         return;
      default:
         Object var4 = this.a;
         opf var5 = (opf)var1;
         int var2 = var5.c;
         int var3 = var5.b;
         kud var6 = (kud)var4;
         var6.c = var5;
         if (var2 != 11) {
            switch(var3) {
            case 0:
            case 1:
               var6.b.f();
               return;
            case 2:
               if (var5.a()) {
                  var6.b.h(var5.a, var5.d);
                  return;
               }
            default:
               return;
            case 3:
               var6.d();
               var6.b.x();
            }
         } else {
            var6.b.r();
         }
      }
   }
}
