package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import java.util.function.Function;

public class BlockableListPreference extends ListPreference implements .kkn {
   private Function a;

   public BlockableListPreference(Context var1) {
      super(var1);
   }

   public BlockableListPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public BlockableListPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final void a(Function var1) {
      this.a = var1;
   }

   protected final void onClick() {
      Function var1 = this.a;
      if (var1 == null || !(Boolean)var1.apply(this)) {
         super.onClick();
      }
   }
}
