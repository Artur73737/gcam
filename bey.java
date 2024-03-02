import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;

public final class bey extends gf {
   public final float a;
   public final float b;
   public final int c;
   public final int d;
   private final bdj e;

   // $FF: synthetic method
   public bey(float var1, float var2, int var3, int var4, int var5) {
      if (1 == (var5 & 1)) {
         var1 = 0.0F;
      }

      this.a = var1;
      if ((var5 & 2) != 0) {
         var2 = 4.0F;
      }

      this.b = var2;
      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      this.c = var3;
      this.d = var4;
      this.e = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bey)) {
         return false;
      } else {
         float var2 = this.a;
         bey var3 = (bey)var1;
         if (var2 == var3.a && this.b == var3.b) {
            if (!c.n(this.c, var3.c)) {
               return false;
            } else if (!c.n(this.d, var3.d)) {
               return false;
            } else {
               bdj var4 = var3.e;
               return c.E((Object)null, (Object)null);
            }
         } else {
            return false;
         }
      }
   }

   public final int hashCode() {
      return (((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + this.c) * 31 + this.d) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Stroke(width=");
      var1.append(this.a);
      var1.append(", miter=");
      var1.append(this.b);
      var1.append(NgAyRSYlmLoD.fIhHyUJUIU);
      var1.append(bdu.a(this.c));
      var1.append(", join=");
      var1.append(bdv.a(this.d));
      var1.append(", pathEffect=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
