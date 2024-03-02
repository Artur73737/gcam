import java.util.ArrayList;

public class bzj extends bzf {
   public bzf[] as = new bzf[4];
   public int at = 0;

   public final void U(ArrayList var1, int var2, bzy var3) {
      byte var5 = 0;

      int var4;
      for(var4 = 0; var4 < this.at; ++var4) {
         var3.d(this.as[var4]);
      }

      for(var4 = var5; var4 < this.at; ++var4) {
         car.u(this.as[var4], var2, var1, var3);
      }

   }
}
