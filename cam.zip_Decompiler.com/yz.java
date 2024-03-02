import com.google.android.material.snackbar.Lqt.HUJCIBIkzRDQ;

public final class yz {
   private final zc a;
   private final int b;

   public yz(zc var1, int var2) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append(HUJCIBIkzRDQ.aIUhpLHRQk);
      String var1;
      switch(this.b) {
      case 1:
         var1 = "BoundReached";
         break;
      default:
         var1 = "Finished";
      }

      var2.append(var1);
      var2.append(", endState=");
      var2.append(this.a);
      var2.append(')');
      return var2.toString();
   }
}
