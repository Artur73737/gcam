import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;

public final class bxb {
   public static final bxb a;
   public final float b;
   public final int c;

   static {
      a = new bxb(bxa.b, 17);
   }

   public bxb(float var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxb)) {
         return false;
      } else {
         float var2 = this.b;
         bxb var3 = (bxb)var1;
         if (Float.compare(var2, var3.b) == 0) {
            return c.n(this.c, var3.c);
         } else {
            return false;
         }
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.b) * 31 + this.c;
   }

   public final String toString() {
      StringBuilder var5 = new StringBuilder();
      var5.append("LineHeightStyle(alignment=");
      float var1 = this.b;
      float var2 = bxa.a;
      String var4;
      if (var1 == 0.0F) {
         var4 = "LineHeightStyle.Alignment.Top";
      } else if (var1 == bxa.a) {
         var4 = "LineHeightStyle.Alignment.Center";
      } else if (var1 == bxa.b) {
         var4 = "LineHeightStyle.Alignment.Proportional";
      } else if (var1 == bxa.c) {
         var4 = "LineHeightStyle.Alignment.Bottom";
      } else {
         StringBuilder var6 = new StringBuilder();
         var6.append("LineHeightStyle.Alignment(topPercentage = ");
         var6.append(var1);
         var6.append(')');
         var4 = var6.toString();
      }

      var5.append(var4);
      var5.append(", trim=");
      int var3 = this.c;
      if (var3 == 1) {
         var4 = "LineHeightStyle.Trim.FirstLineTop";
      } else if (var3 == 16) {
         var4 = gREaEL.yKN;
      } else if (var3 == 17) {
         var4 = "LineHeightStyle.Trim.Both";
      } else if (var3 == 0) {
         var4 = "LineHeightStyle.Trim.None";
      } else {
         var4 = "Invalid";
      }

      var5.append(var4);
      var5.append(')');
      return var5.toString();
   }
}
