public final class atu implements asf {
   private final asf a;
   private final int b;
   private int c;

   public atu(asf var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object a() {
      return this.a.a();
   }

   public final void b() {
      throw null;
   }

   public final void c(Object var1) {
      ++this.c;
      this.a.c(var1);
   }

   // $FF: synthetic method
   public final void e() {
   }

   public final void f() {
      int var1 = this.c;
      if (var1 > 0) {
         this.c = var1 - 1;
         this.a.f();
      } else {
         asr.k("OffsetApplier up called with no corresponding down");
         throw new qsc();
      }
   }

   public final void g(int var1, Object var2) {
      asf var4 = this.a;
      int var3;
      if (this.c == 0) {
         var3 = this.b;
      } else {
         var3 = 0;
      }

      var4.g(var1 + var3, var2);
   }

   public final void h(int var1, Object var2) {
      asf var4 = this.a;
      int var3;
      if (this.c == 0) {
         var3 = this.b;
      } else {
         var3 = 0;
      }

      var4.h(var1 + var3, var2);
   }

   public final void i(int var1, int var2, int var3) {
      int var4;
      if (this.c == 0) {
         var4 = this.b;
      } else {
         var4 = 0;
      }

      this.a.i(var1 + var4, var2 + var4, var3);
   }

   public final void j(int var1, int var2) {
      asf var4 = this.a;
      int var3;
      if (this.c == 0) {
         var3 = this.b;
      } else {
         var3 = 0;
      }

      var4.j(var1 + var3, var2);
   }
}
