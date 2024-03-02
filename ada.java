import com.google.android.apps.camera.processing.UOb.gKVNpqGY;

public final class ada {
   public final qvi a;
   public final qza b;

   public ada(qvi var1, qza var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      qzu var2 = (qzu)this.b.b.get(qzu.b);
      String var5;
      if (var2 != null) {
         var5 = var2.a;
      } else {
         var5 = null;
      }

      StringBuilder var3 = new StringBuilder();
      var3.append("Request@");
      int var1 = this.hashCode();
      qwo.c(16);
      String var4 = Integer.toString(var1, 16);
      var4.getClass();
      var3.append(var4);
      if (var5 != null) {
         StringBuilder var6 = new StringBuilder();
         var6.append('[');
         var6.append(var5);
         var6.append(gKVNpqGY.vLfwJd);
         var5 = var6.toString();
      } else {
         var5 = "(";
      }

      var3.append(var5);
      var3.append("currentBounds()=");
      var3.append(this.a.a());
      var3.append(", continuation=");
      var3.append(this.b);
      var3.append(')');
      return var3.toString();
   }
}
