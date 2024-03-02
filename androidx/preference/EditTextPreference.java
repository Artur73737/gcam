package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public class EditTextPreference extends DialogPreference {
   public String g;

   public EditTextPreference(Context var1, AttributeSet var2) {
      int var3 = .cbo.f(var1, 2130969196, 16842898);
      super(var1, var2, var3, 0);
      TypedArray var4 = var1.obtainStyledAttributes(var2, .cqk.d, var3, 0);
      if (.cbo.l(var4, 0, 0, false)) {
         if (.cpi.b == null) {
            .cpi.b = new .cpi(1);
         }

         this.R(.cpi.b);
      }

      var4.recycle();
   }

   protected final Parcelable e() {
      Parcelable var1 = super.e();
      if (super.u) {
         return var1;
      } else {
         .cpe var2 = new .cpe(var1);
         var2.a = this.g;
         return var2;
      }
   }

   protected final Object f(TypedArray var1, int var2) {
      return var1.getString(var2);
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cpe.class)) {
         super.g(var1);
      } else {
         .cpe var2 = (.cpe)var1;
         super.g(var2.getSuperState());
         this.i(var2.a);
      }
   }

   protected final void h(Object var1) {
      this.i(this.w((String)var1));
   }

   public final void i(String var1) {
      boolean var2 = this.j();
      this.g = var1;
      this.ad(var1);
      boolean var3 = this.j();
      if (var3 != var2) {
         this.B(var3);
      }

      this.d();
   }

   public final boolean j() {
      return TextUtils.isEmpty(this.g) || super.j();
   }
}
