import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

public final class cqj extends mn {
   public final Drawable s;
   public ColorStateList t;
   public boolean u;
   public boolean v;
   private final SparseArray w;

   public cqj(View var1) {
      super(var1);
      SparseArray var3 = new SparseArray(4);
      this.w = var3;
      TextView var2 = (TextView)var1.findViewById(16908310);
      var3.put(16908310, var2);
      var3.put(16908304, var1.findViewById(16908304));
      var3.put(16908294, var1.findViewById(16908294));
      var3.put(2131427761, var1.findViewById(2131427761));
      var3.put(16908350, var1.findViewById(16908350));
      this.s = var1.getBackground();
      if (var2 != null) {
         this.t = var2.getTextColors();
      }

   }

   public final View B(int var1) {
      View var2 = (View)this.w.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         var2 = this.a.findViewById(var1);
         if (var2 != null) {
            this.w.put(var1, var2);
         }

         return var2;
      }
   }
}
