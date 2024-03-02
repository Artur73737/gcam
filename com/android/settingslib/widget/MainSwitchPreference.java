package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.TwoStatePreference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainSwitchPreference extends TwoStatePreference implements .drf {
   private final List c = new ArrayList();
   private MainSwitchBar d;

   public MainSwitchPreference(Context var1) {
      super(var1);
      this.aj(var1, (AttributeSet)null);
   }

   public MainSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.aj(var1, var2);
   }

   public MainSwitchPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.aj(var1, var2);
   }

   public MainSwitchPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.aj(var1, var2);
   }

   private final void aj(Context var1, AttributeSet var2) {
      super.A = 2131624203;
      this.c.add(this);
      if (var2 != null) {
         TypedArray var3 = var1.obtainStyledAttributes(var2, .cqk.g, 0, 0);
         this.T(var3.getText(4));
         this.ai(var3.getBoolean(15, true));
         var3.recycle();
      }

   }

   public final void T(CharSequence var1) {
      super.T(var1);
      MainSwitchBar var2 = this.d;
      if (var2 != null) {
         var2.c(var1);
      }

   }

   public final void a(.cqj var1) {
      super.a(var1);
      var1.u = false;
      var1.v = false;
      MainSwitchBar var3 = (MainSwitchBar)var1.B(2131428183);
      this.d = var3;
      var3.setOnClickListener(new .ht(this, 4, (byte[])null));
      this.ai(super.y);
      this.k(super.a);
      var3 = this.d;
      if (var3 != null) {
         var3.c(super.q);
         var3 = this.d;
         var3.setVisibility(0);
         var3.b.setOnCheckedChangeListener(var3);
      }

      Iterator var2 = this.c.iterator();

      while(var2.hasNext()) {
         .drf var4 = (.drf)var2.next();
         this.d.a(var4);
      }

   }

   public final void ai(boolean var1) {
      if (super.y != var1) {
         super.y = var1;
         this.d();
      }

   }

   public final void eS(boolean var1) {
      super.k(var1);
   }

   public final void k(boolean var1) {
      super.k(var1);
      MainSwitchBar var2 = this.d;
      if (var2 != null && var2.d() != var1) {
         this.d.b(var1);
      }

   }
}
