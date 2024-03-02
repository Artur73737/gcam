public final class bez extends bfa {
   private final long e;
   private final long f;
   private final int g;
   private final long h;
   private float i;
   private dmw j;
   private final dmx k;

   public bez(dmx var1, long var2, long var4) {
      var1.getClass();
      super();
      this.k = var1;
      this.e = var2;
      this.f = var4;
      this.g = 1;
      if (bxw.a(var2) >= 0 && bxw.b(var2) >= 0 && bxx.b(var4) >= 0 && bxx.a(var4) >= 0 && bxx.b(var4) <= var1.h() && bxx.a(var4) <= var1.g()) {
         this.h = var4;
         this.i = 1.0F;
      } else {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }

   public final long a() {
      return car.J(this.h);
   }

   public final void b(bev var1) {
      gf.t(var1, this.k, this.e, this.f, car.I(qxg.e(bcl.c(var1.j())), qxg.e(bcl.a(var1.j()))), this.i, this.j, 1, 328);
   }

   public final void c(float var1) {
      this.i = var1;
   }

   public final void d(dmw var1) {
      this.j = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bez)) {
         return false;
      } else {
         dmx var3 = this.k;
         bez var4 = (bez)var1;
         if (!c.E(var3, var4.k)) {
            return false;
         } else if (!c.o(this.e, var4.e)) {
            return false;
         } else if (!c.o(this.f, var4.f)) {
            return false;
         } else {
            int var2 = var4.g;
            return c.n(1, 1);
         }
      }
   }

   public final int hashCode() {
      return ((this.k.hashCode() * 31 + c.p(this.e)) * 31 + c.p(this.f)) * 31 + 1;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("BitmapPainter(image=");
      var2.append(this.k);
      var2.append(", srcOffset=");
      var2.append(bxw.d(this.e));
      var2.append(", srcSize=");
      var2.append(bxx.d(this.f));
      var2.append(", filterQuality=");
      String var1;
      if (c.n(1, 0)) {
         var1 = "None";
      } else if (c.n(1, 1)) {
         var1 = "Low";
      } else if (c.n(1, 2)) {
         var1 = "Medium";
      } else if (c.n(1, 3)) {
         var1 = "High";
      } else {
         var1 = "Unknown";
      }

      var2.append(var1);
      var2.append(')');
      return var2.toString();
   }
}
