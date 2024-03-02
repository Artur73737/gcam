package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import java.util.function.Function;

public class ManagedSwitchPreference extends SwitchPreference implements OnPreferenceChangeListener, .kkn {
   public static final int n = 0;
   public .jhe a;
   public OnPreferenceChangeListener b;
   public ColorStateList c;
   public ColorStateList d;
   public Integer e;
   public Integer f;
   public Integer g;
   public Runnable h;
   public String i;
   public String j;
   public View k;
   public OnClickListener l;
   public .jhd m;
   private Button o;
   private LinearLayout p;
   private String q;
   private Switch r;
   private TextView s;
   private Function t;

   public ManagedSwitchPreference(Context var1) {
      super(var1);
      this.b = .kkr.a;
      this.d(var1);
   }

   public ManagedSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = .kkr.a;
      this.d(var1);
   }

   public ManagedSwitchPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = .kkr.a;
      this.d(var1);
   }

   public static final int c(FrameLayout var0) {
      return var0.getVisibility() == 0 ? 2131231587 : 2131231588;
   }

   private final void d(Context var1) {
      ((.kks)((.gsr)var1.getApplicationContext()).e(.kks.class)).v(this);
      this.setPersistent(false);
      .jgx var2 = .jgx.a(this.getKey());
      if (var2 != null) {
         this.setDefaultValue(this.m.b(var2));
      } else {
         this.setDefaultValue(this.a.k(this.getKey()));
      }

      super.setOnPreferenceChangeListener(this);
   }

   public final void a(Function var1) {
      this.t = var1;
   }

   public final void b(String var1, Runnable var2) {
      this.q = var1;
      this.h = var2;
   }

   public final OnPreferenceChangeListener getOnPreferenceChangeListener() {
      return this.b;
   }

   public final boolean getPersistedBoolean(boolean var1) {
      return this.a.k(this.getKey());
   }

   protected final void onBindView(View var1) {
      super.onBindView(var1);
      Switch var2;
      if (this.c != null) {
         var2 = (Switch)var1.findViewById(16908352);
         this.r = var2;
         if (var2 != null) {
            var2.setThumbTintList(this.c);
            this.r.setThumbTintMode(Mode.MULTIPLY);
         }
      }

      if (this.d != null) {
         var2 = (Switch)var1.findViewById(16908352);
         this.r = var2;
         if (var2 != null) {
            var2.setTrackTintList(this.d);
            this.r.setTrackTintMode(Mode.MULTIPLY);
         }
      }

      if (this.e != null) {
         LinearLayout var6 = (LinearLayout)var1.findViewById(16908288);
         this.p = var6;
         if (var6 != null) {
            var6.setBackgroundColor(this.e);
         }
      }

      TextView var7;
      if (this.f != null) {
         var7 = (TextView)var1.findViewById(16908310);
         this.s = var7;
         if (var7 != null) {
            var7.setTextColor(this.f);
         }
      }

      if (this.j != null) {
         var7 = (TextView)var1.findViewById(2131428286);
         if (var7 != null) {
            var7.setText(this.j);
            var7.setTextColor(this.g);
         }
      }

      Button var9 = (Button)var1.findViewById(2131427389);
      this.o = var9;
      if (var9 != null) {
         String var3 = this.q;
         if (var3 != null && this.h != null) {
            var9.setText(var3);
            this.o.setOnClickListener(new .khd(this, 3));
         } else {
            var9.setVisibility(8);
         }
      }

      if (this.i != null && this.k != null) {
         var9 = (Button)var1.findViewById(2131427672);
         ImageView var4 = (ImageView)var1.findViewById(2131427674);
         LinearLayout var8 = (LinearLayout)var1.findViewById(2131427673);
         FrameLayout var5 = (FrameLayout)var1.findViewById(2131427565);
         if (var9 != null && var4 != null && var8 != null && var5 != null) {
            var9.setText(this.i);
            var9.setOnClickListener(new .imx(var5, var4, 9, (byte[])null));
            var4.setImageResource(c(var5));
            var8.setContentDescription(this.i);
            var8.setOnClickListener(new .khd(var9, 4));
            var5.removeAllViews();
            var5.addView(this.k);
         }
      }

      if (this.l != null) {
         var1 = var1.findViewById(2131427747);
         if (var1 != null) {
            var1.setOnClickListener(this.l);
            var1.setContentDescription(this.getContext().getString(2132017718, new Object[]{this.getTitle()}));
         }
      }

   }

   protected final void onClick() {
      Function var1 = this.t;
      if (var1 == null || !(Boolean)var1.apply(this)) {
         super.onClick();
      }
   }

   public final boolean onPreferenceChange(Preference var1, Object var2) {
      this.a.j(this.getKey(), (Boolean)var2);
      return this.b.onPreferenceChange(var1, var2);
   }

   public final void setOnPreferenceChangeListener(OnPreferenceChangeListener var1) {
      this.b = var1;
   }
}
