import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

public final class wy {
   public Drawable a;
   public final CardView b;

   public wy(CardView var1) {
      this.b = var1;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.b.d.set(var1, var2, var3, var4);
      CardView var5 = this.b;
      CardView.a(var5, var1 + var5.c.left, var2 + this.b.c.top, var3 + this.b.c.right, var4 + this.b.c.bottom);
   }

   public final boolean b() {
      return this.b.b;
   }

   public final boolean c() {
      return this.b.a;
   }
}
