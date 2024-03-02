import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cva extends ConstantState {
   int a;
   cuz b;
   ColorStateList c = null;
   Mode d;
   boolean e;
   Bitmap f;
   ColorStateList g;
   Mode h;
   int i;
   boolean j;
   boolean k;
   Paint l;

   public cva() {
      this.d = cvc.a;
      this.b = new cuz();
   }

   public cva(cva var1) {
      this.d = cvc.a;
      if (var1 != null) {
         this.a = var1.a;
         this.b = new cuz(var1.b);
         Paint var2 = var1.b.c;
         if (var2 != null) {
            this.b.c = new Paint(var2);
         }

         var2 = var1.b.b;
         if (var2 != null) {
            this.b.b = new Paint(var2);
         }

         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
      }

   }

   public final void a(int var1, int var2) {
      this.f.eraseColor(0);
      Canvas var3 = new Canvas(this.f);
      cuz var4 = this.b;
      var4.a(var4.d, cuz.a, var3, var1, var2);
   }

   public final boolean b() {
      cuz var1 = this.b;
      if (var1.k == null) {
         var1.k = var1.d.b();
      }

      return var1.k;
   }

   public int getChangingConfigurations() {
      return this.a;
   }

   public final Drawable newDrawable() {
      return new cvc(this);
   }

   public final Drawable newDrawable(Resources var1) {
      return new cvc(this);
   }
}
