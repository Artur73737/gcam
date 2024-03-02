package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import java.util.function.Function;

public class MaterialManagedSwitchPreference extends SwitchPreference implements .cpo, .kkt {
   private Button F;
   private String G;
   private Function H;
   public .jhe c;
   public .cpo d;
   public Runnable e;
   public String f;
   public View g;
   public OnClickListener h;
   public .jhd i;

   public MaterialManagedSwitchPreference(Context var1) {
      super(var1);
      this.d = .kkv.c;
      this.ak(var1);
   }

   public MaterialManagedSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.d = .kkv.c;
      this.ak(var1);
   }

   public MaterialManagedSwitchPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = .kkv.c;
      this.ak(var1);
   }

   public static final int aj(FrameLayout var0) {
      return var0.getVisibility() == 0 ? 2131231587 : 2131231588;
   }

   private final void ak(Context var1) {
      ((.kky)((.gsr)var1.getApplicationContext()).e(.kky.class)).y(this);
      this.ae();
      .jgx var2 = .jgx.a(super.r);
      if (var2 != null) {
         super.v = this.i.b(var2);
         this.c.j(super.r, (Boolean)this.i.b(var2));
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

   public final void a(.cqj var1) {
      super.a(var1);
      Button var3 = (Button)var1.a.findViewById(2131427389);
      this.F = var3;
      if (var3 != null) {
         String var2 = this.G;
         if (var2 != null && this.e != null) {
            var3.setText(var2);
            this.F.setOnClickListener(new .khd(this, 5));
         } else {
            var3.setVisibility(8);
         }
      }

      if (this.f != null && this.g != null) {
         Button var5 = (Button)var1.a.findViewById(2131427672);
         ImageView var8 = (ImageView)var1.a.findViewById(2131427674);
         LinearLayout var4 = (LinearLayout)var1.a.findViewById(2131427673);
         FrameLayout var7 = (FrameLayout)var1.a.findViewById(2131427565);
         if (var5 != null && var8 != null && var4 != null && var7 != null) {
            var5.setText(this.f);
            var5.setOnClickListener(new .imx(var7, var8, 10, (byte[])null));
            var8.setImageResource(aj(var7));
            var4.setContentDescription(this.f);
            var4.setOnClickListener(new .khd(var5, 6));
            var7.removeAllViews();
            var7.addView(this.g);
         }
      }

      if (this.h != null) {
         View var6 = var1.a.findViewById(2131427747);
         if (var6 != null) {
            var6.setOnClickListener(this.h);
         }
      }

   }

   public final void ag(Function var1) {
      this.H = var1;
   }

   public final void ai(String var1, Runnable var2) {
      this.G = var1;
      this.e = var2;
   }

   public final boolean b(Preference var1, Object var2) {
      this.c.j(super.r, (Boolean)var2);
      return this.d.b(var1, var2);
   }

   protected final void c() {
      Function var1 = this.H;
      if (var1 == null || !(Boolean)var1.apply(this)) {
         super.c();
      }
   }

   public final .cpo u() {
      return this.d;
   }
}
