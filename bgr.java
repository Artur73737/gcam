import android.view.KeyEvent;

public final class bgr {
   public final KeyEvent a;

   // $FF: synthetic method
   public bgr(KeyEvent var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bgr;
      KeyEvent var3 = this.a;
      return var2 && c.E(var3, ((bgr)var1).a);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      KeyEvent var2 = this.a;
      StringBuilder var1 = new StringBuilder();
      var1.append("KeyEvent(nativeKeyEvent=");
      var1.append(var2);
      var1.append(')');
      return var1.toString();
   }
}
