package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;

public class SwitchPreferenceCompat extends TwoStatePreference {
   private final CharSequence c;
   private final CharSequence d;
   private final .cqn e = new .cqn(this, 2);

   public SwitchPreferenceCompat(Context var1, AttributeSet var2) {
      super(var1, var2, 2130970180, 0);
      TypedArray var3 = var1.obtainStyledAttributes(var2, .cqk.m, 2130970180, 0);
      this.o(.cbo.k(var3, 7, 0));
      this.l(.cbo.k(var3, 6, 1));
      this.c = .cbo.k(var3, 9, 3);
      this.d();
      this.d = .cbo.k(var3, 8, 4);
      this.d();
      super.b = .cbo.l(var3, 5, 2, false);
      var3.recycle();
   }

   private final void ai(View var1) {
      boolean var2 = var1 instanceof SwitchCompat;
      if (var2) {
         ((SwitchCompat)var1).setOnCheckedChangeListener((OnCheckedChangeListener)null);
      }

      if (var1 instanceof Checkable) {
         ((Checkable)var1).setChecked(this.a);
      }

      if (var2) {
         SwitchCompat var3 = (SwitchCompat)var1;
         var3.e(this.c);
         var3.requestLayout();
         if (var3.isChecked()) {
            var3.b();
         }

         var3.d(this.d);
         var3.requestLayout();
         if (!var3.isChecked()) {
            var3.a();
         }

         var3.setOnCheckedChangeListener(this.e);
      }

   }

   public final void a(.cqj var1) {
      super.a(var1);
      this.ai(var1.B(2131428292));
      this.ah(var1);
   }

   public final void fZ(View var1) {
      this.H();
      if (((AccessibilityManager)super.j.getSystemService(TRoaEYDrhZZT.iXJw)).isEnabled()) {
         this.ai(var1.findViewById(2131428292));
         this.ga(var1.findViewById(16908304));
      }
   }
}
