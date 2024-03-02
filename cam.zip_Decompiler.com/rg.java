public final class rg extends ja {
   private final int a;
   private final boolean b;

   public rg(int var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(super.toString());
      var1.append("(cameraError = ");
      var1.append(qq.b(this.a));
      var1.append(", willAttemptRetry = ");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
