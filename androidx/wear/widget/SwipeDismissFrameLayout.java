package androidx.wear.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.ArrayList;

public class SwipeDismissFrameLayout extends .cww {
   public final ArrayList b;

   public SwipeDismissFrameLayout(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public SwipeDismissFrameLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public SwipeDismissFrameLayout(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public SwipeDismissFrameLayout(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.b = new ArrayList();
   }

   protected final void a() {
      .cwn.c(this);
   }

   protected final void b() {
      .cwn.b(this);
      int var1 = this.b.size() - 1;
      if (var1 >= 0) {
         AmbientMode$AmbientCallback var2 = (AmbientMode$AmbientCallback)this.b.get(var1);
         throw null;
      }
   }

   protected final void c() {
      .cwn.c(this);
   }
}
