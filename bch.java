import android.support.constraint.Pv.bmSypa;

public final class bch {
   public float a = 0.0F;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d = 0.0F;

   public final void a(float var1, float var2, float var3, float var4) {
      this.a = Math.max(var1, this.a);
      this.b = Math.max(var2, this.b);
      this.c = Math.min(var3, this.c);
      this.d = Math.min(var4, this.d);
   }

   public final boolean b() {
      return this.a >= this.c || this.b >= this.d;
   }

   public final void c() {
      this.a = 0.0F;
      this.b = 0.0F;
      this.c = 0.0F;
      this.d = 0.0F;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MutableRect(");
      var1.append(er.k(this.a));
      String var2 = bmSypa.tvwemTXJaQR;
      var1.append(var2);
      var1.append(er.k(this.b));
      var1.append(var2);
      var1.append(er.k(this.c));
      var1.append(var2);
      var1.append(er.k(this.d));
      var1.append(')');
      return var1.toString();
   }
}
