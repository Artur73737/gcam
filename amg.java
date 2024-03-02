public final class amg {
   public String a;
   public bss b;
   public int c;
   public boolean d;
   public int e;
   public bxr f;
   public boolean g;
   public long h;
   public bsg i;
   public bxy j;
   public long k;
   public brw l;
   public fwf m;

   public amg(String var1, bss var2, fwf var3, int var4, boolean var5, int var6) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.m = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.h = car.I(0, 0);
      int[] var7 = bxq.a;
      this.k = car.ac(0, 0);
   }

   private final void c() {
      this.l = null;
      this.i = null;
      this.j = null;
      int[] var1 = bxq.a;
      this.k = car.ac(0, 0);
      this.h = car.I(0, 0);
      this.g = false;
   }

   public final void a(bxr var1) {
      bxr var2 = this.f;
      if (var2 == null) {
         this.f = var1;
      } else if (var1 == null) {
         this.f = null;
         this.c();
      } else if (var2.a() != var1.a() || var2.b() != var1.b()) {
         this.f = var1;
         this.c();
      }
   }

   public final void b(String var1, bss var2, fwf var3, int var4, boolean var5, int var6) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      this.a = var1;
      this.b = var2;
      this.m = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.c();
   }
}
