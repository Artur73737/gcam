public final class tp extends kh {
   public final tl a;

   public tp(tl var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof tp)) {
         return false;
      } else {
         tp var2 = (tp)var1;
         return c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CameraStateOpen(cameraDevice=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
