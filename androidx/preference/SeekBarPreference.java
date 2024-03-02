package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SeekBarPreference extends Preference {
   private final boolean F;
   private final OnSeekBarChangeListener G = new .kdn(this, 1);
   private final OnKeyListener H = new .cql(this);
   public int a;
   public int b;
   public boolean c;
   public SeekBar d;
   public final boolean e;
   public final boolean f;
   private int g;
   private int h;
   private TextView i;

   public SeekBarPreference(Context var1, AttributeSet var2) {
      super(var1, var2, 2130970016, 0);
      TypedArray var6 = var1.obtainStyledAttributes(var2, .cqk.k, 2130970016, 0);
      this.b = var6.getInt(3, 0);
      int var4 = var6.getInt(1, 100);
      int var5 = this.b;
      int var3 = var4;
      if (var4 < var5) {
         var3 = var5;
      }

      if (var3 != this.g) {
         this.g = var3;
         this.d();
      }

      var3 = var6.getInt(4, 0);
      if (var3 != this.h) {
         this.h = Math.min(this.g - this.b, Math.abs(var3));
         this.d();
      }

      this.e = var6.getBoolean(2, true);
      this.F = var6.getBoolean(5, false);
      this.f = var6.getBoolean(6, false);
      var6.recycle();
   }

   private final void o(int var1, boolean var2) {
      int var4 = this.b;
      int var3 = var1;
      if (var1 < var4) {
         var3 = var4;
      }

      var4 = this.g;
      var1 = var3;
      if (var3 > var4) {
         var1 = var4;
      }

      if (var1 != this.a) {
         this.a = var1;
         this.l(var1);
         if (this.aa() && var1 != this.q(~var1)) {
            Editor var5 = super.k.b();
            var5.putInt(super.r, var1);
            super.U(var5);
         }

         if (var2) {
            this.d();
            return;
         }
      }

   }

   public final void a(.cqj var1) {
      super.a(var1);
      var1.a.setOnKeyListener(this.H);
      this.d = (SeekBar)var1.B(2131428173);
      TextView var3 = (TextView)var1.B(2131428174);
      this.i = var3;
      if (this.F) {
         var3.setVisibility(0);
      } else {
         var3.setVisibility(8);
         this.i = null;
      }

      SeekBar var4 = this.d;
      if (var4 == null) {
         Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
      } else {
         var4.setOnSeekBarChangeListener(this.G);
         this.d.setMax(this.g - this.b);
         int var2 = this.h;
         if (var2 != 0) {
            this.d.setKeyProgressIncrement(var2);
         } else {
            this.h = this.d.getKeyProgressIncrement();
         }

         this.d.setProgress(this.a - this.b);
         this.l(this.a);
         this.d.setEnabled(this.Z());
      }
   }

   protected final Parcelable e() {
      Parcelable var1 = super.e();
      if (super.u) {
         return var1;
      } else {
         .cqm var2 = new .cqm(var1);
         var2.a = this.a;
         var2.b = this.b;
         var2.c = this.g;
         return var2;
      }
   }

   protected final Object f(TypedArray var1, int var2) {
      return var1.getInt(var2, 0);
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cqm.class)) {
         super.g(var1);
      } else {
         .cqm var2 = (.cqm)var1;
         super.g(var2.getSuperState());
         this.a = var2.a;
         this.b = var2.b;
         this.g = var2.c;
         this.d();
      }
   }

   protected final void h(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = 0;
      }

      this.o(this.q((Integer)var2), true);
   }

   public final void k(SeekBar var1) {
      int var2 = this.b + var1.getProgress();
      if (var2 != this.a) {
         if (this.W(var2)) {
            this.o(var2, false);
            return;
         }

         var1.setProgress(this.a - this.b);
         this.l(this.a);
      }

   }

   public final void l(int var1) {
      TextView var2 = this.i;
      if (var2 != null) {
         var2.setText(String.valueOf(var1));
      }

   }
}
