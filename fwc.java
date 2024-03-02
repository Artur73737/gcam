import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class fwc extends SurfaceView {
   public final miu a = new miu();

   public fwc(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void layout(int var1, int var2, int var3, int var4) {
      super.layout(var1, var2, var3, var4);
      this.a.f(var1, var2, var3, var4, mho.e(rjf.i(this.getContext())));
   }
}
