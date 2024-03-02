import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

public class ar extends am {
   public final ArrayList al = new ArrayList();

   public void D() {
      this.q();
      ArrayList var3 = this.al;
      if (var3 != null) {
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            am var4 = (am)this.al.get(var1);
            if (var4 instanceof ar) {
               ((ar)var4).D();
            }
         }

      }
   }

   public final void F(am var1) {
      this.al.remove(var1);
      var1.r = null;
   }

   public void i() {
      this.al.clear();
      super.i();
   }

   public final void n(int var1, int var2) {
      super.n(var1, var2);
      var2 = this.al.size();

      for(var1 = 0; var1 < var2; ++var1) {
         ((am)this.al.get(var1)).n(super.w + super.A, super.x + super.B);
      }

   }

   public final void q() {
      super.q();
      ArrayList var3 = this.al;
      if (var3 != null) {
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            am var4 = (am)this.al.get(var1);
            var4.n(this.b(), this.c());
            if (!(var4 instanceof an)) {
               var4.q();
            }
         }

      }
   }

   public final void z(AmbientDelegate var1) {
      super.z(var1);
      int var3 = this.al.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((am)this.al.get(var2)).z(var1);
      }

   }
}
