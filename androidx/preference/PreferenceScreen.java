package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;

public final class PreferenceScreen extends PreferenceGroup {
   public final boolean e = true;

   public PreferenceScreen(Context var1, AttributeSet var2) {
      super(var1, var2, .cbo.f(var1, 2130969924, 16842891));
   }

   public final boolean ai() {
      return false;
   }

   protected final void c() {
      if (super.s == null && super.t == null && this.k() != 0) {
         .cqa var4 = super.k.e;
         if (var4 != null) {
            boolean var1 = false;

            for(Object var3 = var4; !var1 && var3 != null; var3 = ((.bv)var3).C) {
               if (var3 instanceof .cpz) {
                  var1 = ((.cpz)var3).a();
               }
            }

            boolean var2 = var1;
            if (!var1) {
               var2 = var1;
               if (var4.getContext() instanceof .cpz) {
                  var2 = ((.cpz)var4.getContext()).a();
               }
            }

            if (!var2 && var4.getActivity() instanceof .cpz) {
               ((.cpz)var4.getActivity()).a();
            }
         }

      }
   }
}
