import androidx.wear.ambient.AmbientMode$AmbientController;

// $FF: synthetic class
public final class cxb implements cjp {
   public final cxd a;
   public final AmbientMode$AmbientController b;
   private final int c;

   // $FF: synthetic method
   public cxb(cxd var1, AmbientMode$AmbientController var2, int var3) {
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      switch(this.c) {
      case 0:
         cxd var1 = this.a;
         AmbientMode$AmbientController var2 = this.b;
         var1.d();
         if (var2 != null) {
            ((cww)var2.a).a();
         }

         return;
      default:
         cxd var4 = this.a;
         AmbientMode$AmbientController var3 = this.b;
         var4.d();
         if (var3 != null) {
            ((cww)var3.a).b();
         }
      }
   }
}
