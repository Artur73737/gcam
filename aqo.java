import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class aqo extends ViewGroup {
   public final int a = 5;
   public final List b;
   public final List c;
   public int d;
   public final bpe e;

   public aqo(Context var1) {
      super(var1);
      ArrayList var2 = new ArrayList();
      this.b = var2;
      ArrayList var3 = new ArrayList();
      this.c = var3;
      this.e = new bpe((byte[])null, (byte[])null);
      this.setClipChildren(false);
      aqp var4 = new aqp(var1);
      this.addView(var4);
      var2.add(var4);
      var3.add(var4);
      this.d = 1;
      this.setTag(2131427749, true);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
   }

   protected final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }
}
