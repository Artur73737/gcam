package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.settingslib.widget.MainSwitchPreference;
import java.util.function.Function;

public class MaterialManagedMainSwitchPreference extends MainSwitchPreference implements .cpo, .kkt {
   public .jhe c;
   public .cpo d;
   public .jhd e;
   private Function f;

   public MaterialManagedMainSwitchPreference(Context var1) {
      super(var1);
      this.d = .kkv.a;
      this.aj(var1);
   }

   public MaterialManagedMainSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.d = .kkv.a;
      this.aj(var1);
   }

   public MaterialManagedMainSwitchPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = .kkv.a;
      this.aj(var1);
   }

   private final void aj(Context var1) {
      ((.kkw)((.gsr)var1.getApplicationContext()).e(.kkw.class)).x(this);
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
