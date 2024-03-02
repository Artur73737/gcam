package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.settingslib.widget.AppSwitchPreference;
import java.util.function.Function;

public class MaterialManagedAppSwitchPreference extends AppSwitchPreference implements .cpo, .kkt {
   public .jhe c;
   public .cpo d;
   public .jhd e;
   private Function f;

   public MaterialManagedAppSwitchPreference(Context var1) {
      super(var1);
      this.d = .kkv.b;
      this.ai(var1);
   }

   public MaterialManagedAppSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.d = .kkv.b;
      this.ai(var1);
   }

   private final void ai(Context var1) {
      ((.kku)((.gsr)var1.getApplicationContext()).e(.kku.class)).w(this);
      this.ae();
      .jgx var2 = .jgx.a(super.r);
      if (var2 != null) {
         super.v = this.e.b(var2);
         this.c.j(super.r, (Boolean)this.e.b(var2));
      } else {
         super.v = this.c.k(super.r);
      }

      super.n = this;
   }

   public final void O(.cpo var1) {
      this.d = var1;
   }

   public final boolean X(boolean var1) {
      return this.c.k(super.r);
   }

   public final void ag(Function var1) {
      this.f = var1;
   }

   public final boolean b(Preference var1, Object var2) {
      this.c.j(super.r, (Boolean)var2);
      return this.d.b(var1, var2);
   }

   protected final void c() {
      Function var1 = this.f;
      if (var1 == null || !(Boolean)var1.apply(this)) {
         super.c();
      }
   }

   public final .cpo u() {
      return this.d;
   }
}
