package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
   public final CharSequence[] g;
   public final CharSequence[] h;
   public final Set i;

   public MultiSelectListPreference(Context var1, AttributeSet var2) {
      int var3 = .cbo.f(var1, 2130969139, 16842897);
      super(var1, var2, var3, 0);
      this.i = new HashSet();
      TypedArray var4 = var1.obtainStyledAttributes(var2, .cqk.f, var3, 0);
      this.g = .cbo.n(var4, 2, 0);
      this.h = .cbo.n(var4, 3, 1);
      var4.recycle();
   }

   protected final Parcelable e() {
      Parcelable var1 = super.e();
      if (super.u) {
         return var1;
      } else {
         .cpk var2 = new .cpk(var1);
         var2.a = this.i;
         return var2;
      }
   }

   protected final Object f(TypedArray var1, int var2) {
      CharSequence[] var5 = var1.getTextArray(var2);
      HashSet var4 = new HashSet();
      int var3 = var5.length;

      for(var2 = 0; var2 < var3; ++var2) {
         var4.add(var5[var2].toString());
      }

      return var4;
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cpk.class)) {
         super.g(var1);
      } else {
         .cpk var2 = (.cpk)var1;
         super.g(var2.getSuperState());
         this.k(var2.a);
      }
   }

   protected final void h(Object var1) {
      this.k(this.x((Set)var1));
   }

   public final void k(Set var1) {
      this.i.clear();
      this.i.addAll(var1);
      if (this.aa() && !var1.equals(this.x((Set)null))) {
         Editor var2 = super.k.b();
         var2.putStringSet(super.r, var1);
         super.U(var2);
      }

      this.d();
   }
}
