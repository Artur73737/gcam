import android.view.ViewGroup.LayoutParams;

@Deprecated
public final class coz {
   public float a = -1.0F;
   public float b = -1.0F;
   public float c = -1.0F;
   public float d = -1.0F;
   public float e = -1.0F;
   public float f = -1.0F;
   public float g = -1.0F;
   public float h = -1.0F;
   public float i;
   public final cpa j = new cpa();

   public final void a(LayoutParams var1, int var2, int var3) {
      this.j.width = var1.width;
      this.j.height = var1.height;
      cpa var8 = this.j;
      boolean var7 = var8.b;
      boolean var6 = false;
      boolean var5;
      if ((var7 || var8.width == 0) && this.a < 0.0F) {
         var5 = true;
      } else {
         var5 = false;
      }

      var8 = this.j;
      if ((var8.a || var8.height == 0) && this.b < 0.0F) {
         var6 = true;
      }

      float var4 = this.a;
      if (var4 >= 0.0F) {
         var1.width = Math.round((float)var2 * var4);
      }

      var4 = this.b;
      if (var4 >= 0.0F) {
         var1.height = Math.round((float)var3 * var4);
      }

      if (this.i >= 0.0F) {
         if (var5) {
            var1.width = Math.round((float)var1.height * this.i);
            this.j.b = true;
         }

         if (var6) {
            var1.height = Math.round((float)var1.width / this.i);
            this.j.a = true;
         }
      }

   }

   public final void b(LayoutParams var1) {
      cpa var2 = this.j;
      if (!var2.b) {
         var1.width = var2.width;
      }

      var2 = this.j;
      if (!var2.a) {
         var1.height = var2.height;
      }

      cpa var3 = this.j;
      var3.b = false;
      var3.a = false;
   }

   public final String toString() {
      return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
   }
}
