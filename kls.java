import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class kls extends ConstraintLayout {
   public TextView a;
   public TextView b;
   private Animator c;

   public kls(Context var1) {
      super(var1);
   }

   public kls(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void a(boolean var1) {
      if (var1) {
         this.b.setEnabled(true);
      } else {
         this.b.setEnabled(false);
      }

      Animator var2 = this.c;
      if (var2 != null) {
         var2.end();
      }

      ObjectAnimator var3;
      if (var1) {
         var3 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0F, 1.0F});
      } else {
         var3 = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0F, 0.0F});
      }

      var3.setDuration(217L);
      if (var1) {
         var3.addListener(new klq(this));
      } else {
         var3.addListener(new klr(this));
      }

      var3.start();
      this.c = var3;
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624100, this, true);
      this.a = (TextView)this.findViewById(2131427592);
      this.b = (TextView)this.findViewById(2131427507);
   }
}
