package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;

public class PreferenceCategory extends PreferenceGroup {
   public PreferenceCategory(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PreferenceCategory(Context var1, AttributeSet var2) {
      super(var1, var2, .cbo.f(var1, 2130969917, 16842892), (byte[])null);
   }

   public final boolean Z() {
      return false;
   }

   public void a(.cqj var1) {
      super.a(var1);
      .cps.a(var1.a, true);
   }

   public final boolean j() {
      return !super.Z();
   }
}
