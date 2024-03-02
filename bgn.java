import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class bgn {
   public final XmlPullParser a;
   private int b;

   public bgn(XmlPullParser var1) {
      this.a = var1;
      this.b = 0;
   }

   public final float a(TypedArray var1, String var2, int var3, float var4) {
      var4 = cbo.e(var1, this.a, var2, var3, var4);
      this.e(var1.getChangingConfigurations());
      return var4;
   }

   public final int b(TypedArray var1, String var2, int var3, int var4) {
      var3 = cbo.g(var1, this.a, var2, var3, var4);
      this.e(var1.getChangingConfigurations());
      return var3;
   }

   public final TypedArray c(Resources var1, Theme var2, AttributeSet var3, int[] var4) {
      TypedArray var5 = cbo.i(var1, var2, var3, var4);
      var5.getClass();
      this.e(var5.getChangingConfigurations());
      return var5;
   }

   public final String d(TypedArray var1, int var2) {
      String var3 = var1.getString(var2);
      this.e(var1.getChangingConfigurations());
      return var3;
   }

   public final void e(int var1) {
      this.b |= var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bgn)) {
         return false;
      } else {
         bgn var2 = (bgn)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return this.b == var2.b;
         }
      }
   }

   public final float f(TypedArray var1, int var2) {
      float var3 = var1.getDimension(var2, 0.0F);
      this.e(var1.getChangingConfigurations());
      return var3;
   }

   public final float g(TypedArray var1, int var2) {
      float var3 = var1.getFloat(var2, 0.0F);
      this.e(var1.getChangingConfigurations());
      return var3;
   }

   public final ktf h(TypedArray var1, Theme var2, String var3, int var4) {
      ktf var5 = cbo.u(var1, this.a, var2, var3, var4);
      this.e(var1.getChangingConfigurations());
      return var5;
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AndroidVectorParser(xmlParser=");
      var1.append(this.a);
      var1.append(", config=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
