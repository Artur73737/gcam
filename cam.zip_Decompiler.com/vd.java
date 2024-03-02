public final class vd {
   public final String a;
   public final qzv b;
   public final Object c;
   public boolean d;
   public un e;
   public final ree f;
   public rbd g;
   public final wk h;
   public bes i;
   private final int j;
   private final rfg k;
   private kh l;

   public vd(String var1, wk var2, qzv var3) {
      this.a = var1;
      this.h = var2;
      this.b = var3;
      this.j = uo.a.b();
      this.c = new Object();
      rfg var4 = rfm.c(1, 3, 0, 4);
      this.k = var4;
      this.f = rel.a(var4);
      ts var5 = ts.a;
      this.l = var5;
      if (!var4.c(var5)) {
         throw new IllegalStateException("Check failed.");
      }
   }

   public final void a(qq param1) {
      // $FF: Couldn't be decompiled
   }

   public final kh b() {
      Object var1 = this.c;
      synchronized(var1){}

      kh var2;
      try {
         var2 = this.l;
      } finally {
         ;
      }

      return var2;
   }

   public final void c(kh var1) {
      this.l = var1;
      if (!this.k.c(var1)) {
         throw new IllegalStateException(c.aH(this, var1, "Failed to emit ", " in "));
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("VirtualCamera-");
      var1.append(this.j);
      return var1.toString();
   }
}
