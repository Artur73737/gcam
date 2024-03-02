import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class cwo extends MarginLayoutParams {
   public boolean a = true;
   public int b = 1;
   public float c;
   public float d;
   public float e;
   public float f;

   public cwo() {
      super(-1, -1);
   }

   public cwo(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, cwg.b);
      this.a = var3.getBoolean(0, true);
      this.b = var3.getInt(1, 1);
      this.f = var3.getFloat(2, 0.0F);
      var3.recycle();
   }

   public cwo(LayoutParams var1) {
      super(var1);
   }
}
