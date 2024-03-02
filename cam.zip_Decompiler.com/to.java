public final class to extends kh {
   public final qq a;

   public to(qq var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof to)) {
         return false;
      } else {
         to var2 = (to)var1;
         return c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      qq var1 = this.a;
      return var1 == null ? 0 : var1.a;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CameraStateClosing(cameraErrorCode=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
