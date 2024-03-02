import java.util.Iterator;

public final class bzs extends bzr {
   public int m;

   public bzs(bzz var1) {
      super(var1);
      byte var2;
      if (var1 instanceof bzw) {
         var2 = 2;
      } else {
         var2 = 3;
      }

      this.l = var2;
   }

   public final void c(int var1) {
      if (!this.i) {
         this.i = true;
         this.f = var1;
         Iterator var2 = this.j.iterator();

         while(var2.hasNext()) {
            ((bzp)var2.next()).f();
         }

      }
   }
}
