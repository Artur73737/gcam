import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;

public final class bck {
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final long e;
   public final long f;
   public final long g;
   public final long h;

   static {
      et.n(0.0F, 0.0F, 0.0F, 0.0F, bcg.a);
   }

   public bck(float var1, float var2, float var3, float var4, long var5, long var7, long var9, long var11) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var7;
      this.g = var9;
      this.h = var11;
   }

   public final float a() {
      return this.d - this.b;
   }

   public final float b() {
      return this.c - this.a;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bck)) {
         return false;
      } else {
         bck var2 = (bck)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var2.c) != 0) {
            return false;
         } else if (Float.compare(this.d, var2.d) != 0) {
            return false;
         } else if (!c.o(this.e, var2.e)) {
            return false;
         } else if (!c.o(this.f, var2.f)) {
            return false;
         } else if (!c.o(this.g, var2.g)) {
            return false;
         } else {
            return c.o(this.h, var2.h);
         }
      }
   }

   public final int hashCode() {
      return ((((((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + c.p(this.e)) * 31 + c.p(this.f)) * 31 + c.p(this.g)) * 31 + c.p(this.h);
   }

   public final String toString() {
      long var1 = this.e;
      long var5 = this.f;
      long var7 = this.g;
      long var3 = this.h;
      StringBuilder var9 = new StringBuilder();
      var9.append(er.k(this.a));
      var9.append(", ");
      var9.append(er.k(this.b));
      var9.append(", ");
      var9.append(er.k(this.c));
      var9.append(", ");
      var9.append(er.k(this.d));
      String var11 = var9.toString();
      StringBuilder var10;
      if (c.o(var1, var5) && c.o(var5, var7) && c.o(var7, var3)) {
         if (bcg.a(var1) == bcg.b(var1)) {
            var10 = new StringBuilder();
            var10.append("RoundRect(rect=");
            var10.append(var11);
            var10.append(", radius=");
            var10.append(er.k(bcg.a(var1)));
            var10.append(')');
            return var10.toString();
         } else {
            var10 = new StringBuilder();
            var10.append("RoundRect(rect=");
            var10.append(var11);
            var10.append(", x=");
            var10.append(er.k(bcg.a(var1)));
            var10.append(", y=");
            var10.append(er.k(bcg.b(var1)));
            var10.append(')');
            return var10.toString();
         }
      } else {
         var10 = new StringBuilder();
         var10.append("RoundRect(rect=");
         var10.append(var11);
         var10.append(", topLeft=");
         var10.append(bcg.c(var1));
         var10.append(diyLl.WywHHpgTquFPKT);
         var10.append(bcg.c(var5));
         var10.append(", bottomRight=");
         var10.append(bcg.c(var7));
         var10.append(", bottomLeft=");
         var10.append(bcg.c(var3));
         var10.append(')');
         return var10.toString();
      }
   }
}
