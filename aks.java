public final class aks {
   public final Object a;
   public final att b;
   public final ava c;
   private final aku d;
   private final att e;
   private final ava f;

   public aks(Object var1, aku var2) {
      this.a = var1;
      this.d = var2;
      this.c = lg.d(-1);
      this.f = lg.d(0);
      this.e = sg.d((Object)null);
      this.b = sg.d((Object)null);
   }

   private final void g(int var1) {
      this.f.h(var1);
   }

   public final int a() {
      return this.f.f();
   }

   public final void b() {
      if (this.a() > 0) {
         this.g(this.a() - 1);
         if (this.a() == 0) {
            this.d.a.remove(this);
            aks var1 = this.c();
            if (var1 != null) {
               var1.b();
            }

            this.e((aks)null);
         }
      } else {
         throw new IllegalStateException("Release should only be called once");
      }
   }

   public final aks c() {
      return (aks)this.e.a();
   }

   public final aks d() {
      return (aks)this.b.a();
   }

   public final void e(aks var1) {
      this.e.b(var1);
   }

   public final void f() {
      if (this.a() == 0) {
         this.d.a.add(this);
         aks var1 = this.d();
         if (var1 != null) {
            var1.f();
         } else {
            var1 = null;
         }

         this.e(var1);
      }

      this.g(this.a() + 1);
   }
}
