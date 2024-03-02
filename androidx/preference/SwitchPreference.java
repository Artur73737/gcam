package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SwitchPreference extends TwoStatePreference {
   private final .cqn c;
   private CharSequence d;
   private CharSequence e;

   public SwitchPreference(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SwitchPreference(Context var1, AttributeSet var2) {
      this(var1, var2, .cbo.f(var1, 2130970181, 16843629));
   }

   public SwitchPreference(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public SwitchPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.c = new .cqn(this, 0);
      TypedArray var5 = var1.obtainStyledAttributes(var2, .cqk.l, var3, var4);
      this.o(.cbo.k(var5, 7, 0));
      this.l(.cbo.k(var5, 6, 1));
      this.d = .cbo.k(var5, 9, 3);
      this.d();
      this.e = .cbo.k(var5, 8, 4);
      this.d();
      super.b = .cbo.l(var5, 5, 2, false);
      var5.recycle();
   }

   private final void ai(View var1) {
      boolean var2 = var1 instanceof Switch;
      if (var2) {
         ((Switch)var1).setOnCheckedChangeListener((OnCheckedChangeListener)null);
      }

      if (var1 instanceof Checkable) {
         ((Checkable)var1).setChecked(this.a);
      }

      if (var2) {
         Switch var3 = (Switch)var1;
         var3.setTextOn(this.d);
         var3.setTextOff(this.e);
         var3.setOnCheckedChangeListener(this.c);
      }

   }

   public void a(.cqj var1) {
      super.a(var1);
      this.ai(var1.B(16908352));
      this.ah(var1);
   }

   public final void fZ(View var1) {
      this.H();
      if (((AccessibilityManager)super.j.getSystemService("accessibility")).isEnabled()) {
         this.ai(var1.findViewById(16908352));
         this.ga(var1.findViewById(16908304));
      }
   }
}
