import android.graphics.Typeface;

public final class bue extends cdc {
   final bvi a;
   final qza b;

   public bue(qza var1, bvi var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void a(int var1) {
      qza var2 = this.b;
      StringBuilder var3 = new StringBuilder();
      var3.append("Unable to load font ");
      var3.append(this.a);
      var3.append(" (reason=");
      var3.append(var1);
      var3.append(')');
      var2.A(new IllegalStateException(var3.toString()));
   }

   public final void b(Typeface var1) {
      var1.getClass();
      this.b.gP(var1);
   }
}
