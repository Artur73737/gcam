import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

public class bzm extends bzf {
   public ArrayList aK = new ArrayList();

   public final void T(AmbientDelegate var1) {
      super.T(var1);
      int var3 = this.aK.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((bzf)this.aK.get(var2)).T(var1);
      }

   }

   public void V() {
      ArrayList var3 = this.aK;
      if (var3 != null) {
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            bzf var4 = (bzf)this.aK.get(var1);
            if (var4 instanceof bzm) {
               ((bzm)var4).V();
            }
         }

      }
   }

   public final void aa(bzf var1) {
      this.aK.remove(var1);
      var1.v();
   }

   public void v() {
      this.aK.clear();
      super.v();
   }
}
