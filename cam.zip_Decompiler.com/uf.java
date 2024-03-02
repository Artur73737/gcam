public final class uf {
   public final sf a;
   public final qq b;

   // $FF: synthetic method
   public uf(sf var1, qq var2, int var3) {
      if (1 == (var3 & 1)) {
         var1 = null;
      }

      this.a = var1;
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof uf)) {
         return false;
      } else {
         uf var2 = (uf)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return c.E(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      sf var3 = this.a;
      int var2 = 0;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      qq var4 = this.b;
      if (var4 != null) {
         var2 = var4.a;
      }

      return var1 * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OpenCameraResult(cameraState=");
      var1.append(this.a);
      var1.append(", errorCode=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
