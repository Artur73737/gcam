import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;

public final class amf {
   public bry a;
   public bss b;
   public int c;
   public boolean d;
   public int e;
   public bxr f;
   public bsd g;
   public bxy h;
   public bsq i;
   public fwf j;

   // $FF: synthetic method
   public amf(bry var1, bss var2, fwf var3, int var4, boolean var5, int var6) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.j = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   private final void e() {
      this.g = null;
      this.i = null;
   }

   public final bsq a() {
      bsq var1 = this.i;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(gREaEL.zOhO);
      }
   }

   public final bsq b(bxy var1, long var2, bsc var4) {
      bry var8 = this.a;
      bss var10 = this.b;
      qtf var11 = qtf.a;
      int var6 = this.e;
      boolean var7 = this.d;
      int var5 = this.c;
      bxr var9 = this.f;
      var9.getClass();
      return new bsq(new bsp(var8, var10, var11, var6, var7, var5, var9, var1, this.j, var2), var4, car.Y(var2, car.I(jl.j(var4.c), jl.j(var4.d))));
   }

   public final void c(bxr var1) {
      bxr var2 = this.f;
      if (var2 == null) {
         this.f = var1;
      } else if (var1 == null) {
         this.f = null;
         this.e();
      } else if (var2.a() != var1.a() || var2.b() != var1.b()) {
         this.f = var1;
         this.e();
      }
   }

   public final void d(bry var1, bss var2, fwf var3, int var4, boolean var5, int var6) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      this.a = var1;
      this.b = var2;
      this.j = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.e();
   }
}
