package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class TwoStatePreference extends Preference {
   public boolean a;
   public boolean b;
   private CharSequence c;
   private CharSequence d;
   private boolean e;

   public TwoStatePreference(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public TwoStatePreference(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public TwoStatePreference(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public TwoStatePreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   protected final void ah(.cqj var1) {
      this.ga(var1.B(16908304));
   }

   protected void c() {
      boolean var1 = this.a ^ true;
      if (this.W(var1)) {
         this.k(var1);
      }

   }

   protected final Parcelable e() {
      Parcelable var1 = super.e();
      if (super.u) {
         return var1;
      } else {
         .cqo var2 = new .cqo(var1);
         var2.a = this.a;
         return var2;
      }
   }

   protected final Object f(TypedArray var1, int var2) {
      return var1.getBoolean(var2, false);
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cqo.class)) {
         super.g(var1);
      } else {
         .cqo var2 = (.cqo)var1;
         super.g(var2.getSuperState());
         this.k(var2.a);
      }
   }

   protected final void ga(View var1) {
      if (var1 instanceof TextView) {
         TextView var5 = (TextView)var1;
         boolean var3 = this.a;
         byte var2 = 0;
         if (var3 && !TextUtils.isEmpty(this.c)) {
            var5.setText(this.c);
         } else if (!this.a && !TextUtils.isEmpty(this.d)) {
            var5.setText(this.d);
         } else {
            CharSequence var4 = this.m();
            if (!TextUtils.isEmpty(var4)) {
               var5.setText(var4);
            } else {
               var2 = 8;
            }
         }

         if (var2 != var5.getVisibility()) {
            var5.setVisibility(var2);
         }

      }
   }

   protected final void h(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = false;
      }

      this.k(this.X((Boolean)var2));
   }

   public final boolean j() {
      if (this.b) {
         if (this.a) {
            return true;
         }
      } else if (!this.a) {
         return true;
      }

      if (!super.j()) {
         return false;
      } else {
         return true;
      }
   }

   public void k(boolean var1) {
      boolean var2;
      if (this.a != var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2 || !this.e) {
         this.a = var1;
         this.e = true;
         if (this.aa() && var1 != this.X(var1 ^ true)) {
            Editor var3 = super.k.b();
            var3.putBoolean(super.r, var1);
            super.U(var3);
         }

         if (var2) {
            this.B(this.j());
            this.d();
            return;
         }
      }

   }

   public final void l(CharSequence var1) {
      this.d = var1;
      if (!this.a) {
         this.d();
      }

   }

   public final void o(CharSequence var1) {
      this.c = var1;
      if (this.a) {
         this.d();
      }

   }
}
