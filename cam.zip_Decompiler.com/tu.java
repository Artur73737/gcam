final class tu {
   public final tk a;
   public final wl b;

   public tu(tk var1, wl var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof tu)) {
         return false;
      } else {
         tu var2 = (tu)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return c.E(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ConfiguredCameraCaptureSession(session=");
      var1.append(this.a);
      var1.append(", processor=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
