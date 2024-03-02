// $FF: synthetic class
public final class cto implements ctq {
   public static final cto a = new cto(0);
   public static final cto b = new cto(1);
   public static final cto c = new cto(2);
   public static final cto d = new cto(3);
   public static final cto e = new cto(4);
   private final int k;

   // $FF: synthetic method
   private cto(int var1) {
      this.k = var1;
   }

   public final void a(ctn var1, ctr var2) {
      int var3;
      switch(this.k) {
      case 0:
         var1.f(var2);
         return;
      case 1:
         var1.g(var2);
         return;
      case 2:
         var3 = ctp.a;
         var1.b();
         return;
      case 3:
         var3 = ctp.a;
         var1.c();
         return;
      default:
         var3 = ctp.a;
         var1.d();
      }
   }
}
