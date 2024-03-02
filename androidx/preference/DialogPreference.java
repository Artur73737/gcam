package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
   public CharSequence a;
   public CharSequence b;
   public Drawable c;
   public CharSequence d;
   public CharSequence e;
   public int f;

   public DialogPreference(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public DialogPreference(Context var1, AttributeSet var2) {
      this(var1, var2, .cbo.f(var1, 2130969139, 16842897));
   }

   public DialogPreference(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public DialogPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      TypedArray var5 = var1.obtainStyledAttributes(var2, .cqk.c, var3, var4);
      String var6 = .cbo.k(var5, 9, 0);
      this.a = var6;
      if (var6 == null) {
         this.a = super.q;
      }

      this.b = .cbo.k(var5, 8, 1);
      Drawable var8 = var5.getDrawable(6);
      Drawable var7 = var8;
      if (var8 == null) {
         var7 = var5.getDrawable(2);
      }

      this.c = var7;
      this.d = .cbo.k(var5, 11, 3);
      this.e = .cbo.k(var5, 10, 4);
      this.f = .cbo.h(var5, 7, 5, 0);
      var5.recycle();
   }

   protected void c() {
      .cqa var1 = super.k.d;
      if (var1 != null) {
         var1.A(this);
      }

   }
}
