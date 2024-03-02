public final class din extends dil {
   public din() {
   }

   public din(int var1) {
      super(var1);
   }

   protected final int a() {
      return -2147475470;
   }

   public final void b(din var1) {
      if (var1 != null) {
         int var2 = super.a;
         this.g(var1.a | var2);
      }

   }

   public final boolean c() {
      return this.h(64);
   }

   public final boolean d() {
      return this.h(512);
   }

   public final void e(int var1) {
      if ((var1 & 256) > 0 && (var1 & 512) > 0) {
         throw new dhl("IsStruct and IsArray options are mutually exclusive", 103);
      } else if ((var1 & 2) > 0 && (var1 & 768) > 0) {
         throw new dhl("Structs and arrays can't have \"value\" options", 103);
      }
   }

   public final boolean i() {
      return this.h(4096);
   }

   public final boolean j() {
      return this.h(2048);
   }

   public final boolean k() {
      return this.h(1024);
   }

   public final boolean l() {
      return (super.a & 768) > 0;
   }

   public final boolean m() {
      return this.h(32);
   }

   public final boolean n() {
      return this.h(Integer.MIN_VALUE);
   }

   public final boolean o() {
      return this.h(256);
   }

   public final boolean p() {
      return this.h(2);
   }

   public final void q() {
      this.f(512, true);
   }

   public final void r() {
      this.f(4096, true);
   }

   public final void s() {
      this.f(2048, true);
   }

   public final void t() {
      this.f(1024, true);
   }

   public final void u(boolean var1) {
      this.f(64, var1);
   }

   public final void v(boolean var1) {
      this.f(16, var1);
   }

   public final void w(boolean var1) {
      this.f(128, var1);
   }

   public final void x(boolean var1) {
      this.f(256, var1);
   }
}
