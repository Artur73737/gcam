import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

public class fro extends View {
   public final miu b = new miu();

   public fro(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final Matrix a() {
      return this.b.a();
   }

   public final void layout(int var1, int var2, int var3, int var4) {
      super.layout(var1, var2, var3, var4);
      this.b.f(var1, var2, var3, var4, mho.e(rjf.i(this.getContext())));
   }
}
