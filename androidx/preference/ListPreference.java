package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;

public class ListPreference extends DialogPreference {
   private String F;
   private boolean G;
   public CharSequence[] g;
   public CharSequence[] h;
   public String i;

   public ListPreference(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ListPreference(Context var1, AttributeSet var2) {
      this(var1, var2, .cbo.f(var1, 2130969139, 16842897));
   }

   public ListPreference(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public ListPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      TypedArray var5 = var1.obtainStyledAttributes(var2, .cqk.e, var3, var4);
      this.g = .cbo.n(var5, 3, 0);
      this.h = .cbo.n(var5, 4, 1);
      if (.cbo.l(var5, 7, 7, false)) {
         if (.cpi.a == null) {
            .cpi.a = new .cpi(0);
         }

         this.R(.cpi.a);
      }

      var5.recycle();
      TypedArray var6 = var1.obtainStyledAttributes(var2, .cqk.g, var3, var4);
      this.F = .cbo.k(var6, 33, 7);
      var6.recycle();
   }

   protected final Parcelable e() {
      Parcelable var1 = super.e();
      if (super.u) {
         return var1;
      } else {
         .cph var2 = new .cph(var1);
         var2.a = this.i;
         return var2;
      }
   }

   protected final Object f(TypedArray var1, int var2) {
      return var1.getString(var2);
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cph.class)) {
         super.g(var1);
      } else {
         .cph var2 = (.cph)var1;
         super.g(var2.getSuperState());
         this.o(var2.a);
      }
   }

   protected final void h(Object var1) {
      this.o(this.w((String)var1));
   }

   public final int k(String var1) {
      if (var1 != null) {
         CharSequence[] var3 = this.h;
         if (var3 != null) {
            for(int var2 = var3.length - 1; var2 >= 0; --var2) {
               if (TextUtils.equals(this.h[var2].toString(), var1)) {
                  return var2;
               }
            }
         }
      }

      return -1;
   }

   public final CharSequence l() {
      int var1 = this.k(this.i);
      if (var1 >= 0) {
         CharSequence[] var2 = this.g;
         if (var2 != null) {
            return var2[var1];
         }
      }

      return null;
   }

   public final CharSequence m() {
      .cpr var1 = super.D;
      if (var1 != null) {
         return var1.a(this);
      } else {
         Object var4 = this.l();
         CharSequence var2 = super.m();
         String var3 = this.F;
         if (var3 == null) {
            return var2;
         } else {
            if (var4 == null) {
               var4 = "";
            }

            String var5 = String.format(var3, var4);
            if (TextUtils.equals(var5, var2)) {
               return var2;
            } else {
               Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
               return var5;
            }
         }
      }
   }

   public final void n(CharSequence var1) {
      super.n(var1);
      if (var1 == null) {
         this.F = null;
      } else {
         this.F = var1.toString();
      }
   }

   public final void o(String var1) {
      boolean var2 = TextUtils.equals(this.i, var1) ^ true;
      if (var2 || !this.G) {
         this.i = var1;
         this.G = true;
         this.ad(var1);
         if (var2) {
            this.d();
         }
      }

   }
}
