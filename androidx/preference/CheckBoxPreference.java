package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class CheckBoxPreference extends TwoStatePreference {
   private final .cqn c;

   public CheckBoxPreference(Context var1, AttributeSet var2) {
      int var3 = .cbo.f(var1, 2130968852, 16842895);
      super(var1, var2, var3, 0);
      this.c = new .cqn(this, 1);
      TypedArray var4 = var1.obtainStyledAttributes(var2, .cqk.b, var3, 0);
      this.o(.cbo.k(var4, 5, 0));
      this.l(.cbo.k(var4, 4, 1));
      super.b = .cbo.l(var4, 3, 2, false);
      var4.recycle();
   }

   private final void ai(View var1) {
      boolean var2 = var1 instanceof CompoundButton;
      if (var2) {
         ((CompoundButton)var1).setOnCheckedChangeListener((OnCheckedChangeListener)null);
      }

      if (var1 instanceof Checkable) {
         ((Checkable)var1).setChecked(this.a);
      }

      if (var2) {
         ((CompoundButton)var1).setOnCheckedChangeListener(this.c);
      }

   }

   public void a(.cqj var1) {
      super.a(var1);
      this.ai(var1.B(16908289));
      this.ah(var1);
   }

   public final void fZ(View var1) {
      this.H();
      if (((AccessibilityManager)super.j.getSystemService("accessibility")).isEnabled()) {
         this.ai(var1.findViewById(16908289));
         this.ga(var1.findViewById(16908304));
      }
   }
}
