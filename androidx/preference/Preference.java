package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference implements Comparable {
   public int A;
   public int B;
   public PreferenceGroup C;
   public .cpr D;
   public .cqe E;
   private boolean F;
   private boolean G;
   private boolean H;
   private boolean I;
   private boolean J;
   private List K;
   private boolean L;
   private .cpq M;
   private final OnClickListener N;
   private CharSequence a;
   private int b;
   private Drawable c;
   private Bundle d;
   private boolean e;
   private boolean f;
   private boolean g;
   private String h;
   private boolean i;
   public final Context j;
   public .cqg k;
   public long l;
   public boolean m;
   public .cpo n;
   public .cpp o;
   public int p;
   public CharSequence q;
   public String r;
   public Intent s;
   public String t;
   public boolean u;
   public Object v;
   public boolean w;
   public boolean x;
   public boolean y;
   public boolean z;

   public Preference(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public Preference(Context var1, AttributeSet var2) {
      this(var1, var2, .cbo.f(var1, 2130969930, 16842894));
   }

   public Preference(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public Preference(Context var1, AttributeSet var2, int var3, int var4) {
      this.p = Integer.MAX_VALUE;
      this.e = true;
      this.f = true;
      this.u = true;
      this.i = true;
      this.F = true;
      this.w = true;
      this.G = true;
      this.H = true;
      this.x = true;
      this.J = true;
      this.A = 2131624147;
      this.N = new .ht(this, 3);
      this.j = var1;
      TypedArray var6 = var1.obtainStyledAttributes(var2, .cqk.g, var3, var4);
      this.b = .cbo.h(var6, 23, 0, 0);
      this.r = .cbo.k(var6, 26, 6);
      this.q = .cbo.j(var6, 34, 4);
      this.a = .cbo.j(var6, 33, 7);
      this.p = .cbo.o(var6, 28, 8);
      this.t = .cbo.k(var6, 22, 13);
      this.A = .cbo.h(var6, 27, 3, 2131624147);
      this.B = .cbo.h(var6, 35, 9, 0);
      this.e = .cbo.l(var6, 21, 2, true);
      this.f = .cbo.l(var6, 30, 5, true);
      this.u = .cbo.l(var6, 29, 1, true);
      this.h = .cbo.k(var6, 19, 10);
      this.G = .cbo.l(var6, 16, 16, this.f);
      this.H = .cbo.l(var6, 17, 17, this.f);
      if (var6.hasValue(18)) {
         this.v = this.f(var6, 18);
      } else if (var6.hasValue(11)) {
         this.v = this.f(var6, 11);
      }

      this.J = .cbo.l(var6, 31, 12, true);
      boolean var5 = var6.hasValue(32);
      this.I = var5;
      if (var5) {
         this.x = .cbo.l(var6, 32, 14, true);
      }

      this.y = .cbo.l(var6, 24, 15, false);
      this.w = .cbo.l(var6, 25, 25, true);
      this.z = .cbo.l(var6, 20, 20, false);
      var6.recycle();
   }

   private final void k(View var1, boolean var2) {
      var1.setEnabled(var2);
      if (var1 instanceof ViewGroup) {
         ViewGroup var4 = (ViewGroup)var1;

         for(int var3 = var4.getChildCount() - 1; var3 >= 0; --var3) {
            this.k(var4.getChildAt(var3), var2);
         }
      }

   }

   public void A(Bundle var1) {
      if (this.Y()) {
         this.L = false;
         Parcelable var2 = this.e();
         if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
         }

         if (var2 != null) {
            var1.putParcelable(this.r, var2);
            return;
         }
      }

   }

   public void B(boolean var1) {
      List var4 = this.K;
      if (var4 != null) {
         int var3 = var4.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            ((Preference)var4.get(var2)).ab(var1);
         }

      }
   }

   public final void C() {
      .cqe var1 = this.E;
      if (var1 != null) {
         var1.l();
      }

   }

   public void D() {
      this.I();
   }

   public final void E(.cqg var1) {
      this.k = var1;
      if (!this.m) {
         this.l = var1.a();
      }

      if (this.aa() && this.r().contains(this.r)) {
         this.G(true, (Object)null);
      } else {
         Object var2 = this.v;
         if (var2 != null) {
            this.G(false, var2);
         }

      }
   }

   public void F() {
      this.V();
   }

   @Deprecated
   protected void G(boolean var1, Object var2) {
      this.h(var2);
   }

   public final void H() {
      if (this.Z() && this.f) {
         this.c();
         .cpp var1 = this.o;
         if (var1 == null || !var1.a()) {
            .cqg var2 = this.k;
            if (var2 != null) {
               .cqa var3 = var2.c;
               if (var3 != null && var3.B(this)) {
                  return;
               }
            }

            Intent var4 = this.s;
            if (var4 != null) {
               this.j.startActivity(var4);
            }

         }
      }
   }

   public final void I() {
      if (!TextUtils.isEmpty(this.h)) {
         Preference var1 = this.v(this.h);
         if (var1 != null) {
            if (var1.K == null) {
               var1.K = new ArrayList();
            }

            var1.K.add(this);
            this.ab(var1.j());
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append("Dependency \"");
            var2.append(this.h);
            var2.append("\" not found for preference \"");
            var2.append(this.r);
            var2.append("\" (title: \"");
            var2.append(this.q);
            var2.append("\"");
            throw new IllegalStateException(var2.toString());
         }
      }
   }

   public final void J(String var1) {
      this.V();
      this.h = var1;
      this.I();
   }

   public final void K(boolean var1) {
      if (this.e != var1) {
         this.e = var1;
         this.B(this.j());
         this.d();
      }

   }

   public final void L(int var1) {
      this.M(.fr.a(this.j, var1));
      this.b = var1;
   }

   public final void M(Drawable var1) {
      if (this.c != var1) {
         this.c = var1;
         this.b = 0;
         this.d();
      }

   }

   public final void N(String var1) {
      this.r = var1;
      if (this.g && !this.Y()) {
         if (!TextUtils.isEmpty(this.r)) {
            this.g = true;
         } else {
            throw new IllegalStateException("Preference does not have a key assigned.");
         }
      }
   }

   public void O(.cpo var1) {
      this.n = var1;
   }

   public final void P(int var1) {
      if (var1 != this.p) {
         this.p = var1;
         this.C();
      }

   }

   public final void Q(int var1) {
      this.n(this.j.getString(var1));
   }

   public final void R(.cpr var1) {
      this.D = var1;
      this.d();
   }

   public final void S(int var1) {
      this.T(this.j.getString(var1));
   }

   public void T(CharSequence var1) {
      if (!TextUtils.equals(var1, this.q)) {
         this.q = var1;
         this.d();
      }

   }

   public final void U(Editor var1) {
      if (!this.k.a) {
         var1.apply();
      }

   }

   public final void V() {
      String var1 = this.h;
      if (var1 != null) {
         Preference var2 = this.v(var1);
         if (var2 != null) {
            List var3 = var2.K;
            if (var3 != null) {
               var3.remove(this);
            }
         }
      }

   }

   public final boolean W(Object var1) {
      .cpo var2 = this.n;
      return var2 == null || var2.b(this, var1);
   }

   protected boolean X(boolean var1) {
      return !this.aa() ? var1 : this.k.d().getBoolean(this.r, var1);
   }

   public final boolean Y() {
      return !TextUtils.isEmpty(this.r);
   }

   public boolean Z() {
      return this.e && this.i && this.F;
   }

   public void a(.cqj var1) {
      byte var3;
      CharSequence var8;
      View var9;
      Integer var13;
      label97: {
         var9 = var1.a;
         var9.setOnClickListener(this.N);
         var9.setId(0);
         TextView var7 = (TextView)var1.B(16908304);
         var3 = 8;
         if (var7 != null) {
            var8 = this.m();
            if (!TextUtils.isEmpty(var8)) {
               var7.setText(var8);
               var7.setVisibility(0);
               var13 = var7.getCurrentTextColor();
               break label97;
            }

            var7.setVisibility(8);
         }

         var13 = null;
      }

      TextView var10 = (TextView)var1.B(16908310);
      if (var10 != null) {
         var8 = this.q;
         if (!TextUtils.isEmpty(var8)) {
            var10.setText(var8);
            var10.setVisibility(0);
            if (this.I) {
               var10.setSingleLine(this.x);
            }

            if (!this.f && this.Z() && var13 != null) {
               var10.setTextColor(var13);
            }
         } else {
            var10.setVisibility(8);
         }
      }

      ImageView var14 = (ImageView)var1.B(16908294);
      byte var12;
      if (var14 != null) {
         label100: {
            int var4 = this.b;
            int var2 = var4;
            if (var4 == 0) {
               if (this.c == null) {
                  break label100;
               }

               var2 = 0;
            }

            if (this.c == null) {
               this.c = .fr.a(this.j, var2);
            }

            Drawable var16 = this.c;
            if (var16 != null) {
               var14.setImageDrawable(var16);
            }
         }

         if (this.c != null) {
            var14.setVisibility(0);
         } else {
            if (!this.y) {
               var12 = 8;
            } else {
               var12 = 4;
            }

            var14.setVisibility(var12);
         }
      }

      View var17 = var1.B(2131427761);
      View var15 = var17;
      if (var17 == null) {
         var15 = var1.B(16908350);
      }

      if (var15 != null) {
         if (this.c != null) {
            var15.setVisibility(0);
         } else {
            if (!this.y) {
               var12 = var3;
            } else {
               var12 = 4;
            }

            var15.setVisibility(var12);
         }
      }

      if (this.J) {
         this.k(var9, this.Z());
      } else {
         this.k(var9, true);
      }

      boolean var5 = this.f;
      var9.setFocusable(var5);
      var9.setClickable(var5);
      var1.u = this.G;
      var1.v = this.H;
      boolean var6 = this.z;
      if (var6 && this.M == null) {
         this.M = new .cpq(this);
      }

      .cpq var11;
      if (var6) {
         var11 = this.M;
      } else {
         var11 = null;
      }

      var9.setOnCreateContextMenuListener(var11);
      var9.setLongClickable(var6);
      if (var6 && !var5) {
         .cfx.m(var9, (Drawable)null);
      }

   }

   protected final boolean aa() {
      return this.k != null && this.u && this.Y();
   }

   public final void ab(boolean var1) {
      if (this.i == var1) {
         this.i = var1 ^ true;
         this.B(this.j());
         this.d();
      }

   }

   public final void ac(boolean var1) {
      if (this.F == var1) {
         this.F = var1 ^ true;
         this.B(this.j());
         this.d();
      }

   }

   protected final void ad(String var1) {
      if (this.aa()) {
         if (!TextUtils.equals(var1, this.w((String)null))) {
            Editor var2 = this.k.b();
            var2.putString(this.r, var1);
            this.U(var2);
         }
      }
   }

   public final void ae() {
      this.u = false;
   }

   public final void af() {
      if (this.f) {
         this.f = false;
         this.d();
      }

   }

   protected void c() {
   }

   protected void d() {
      .cqe var2 = this.E;
      if (var2 != null) {
         int var1 = var2.d.indexOf(this);
         if (var1 != -1) {
            var2.a.e(var1, this);
         }
      }

   }

   protected Parcelable e() {
      this.L = true;
      return .cpn.EMPTY_STATE;
   }

   public long eP() {
      return this.l;
   }

   protected Object f(TypedArray var1, int var2) {
      return null;
   }

   public void fZ(View var1) {
      this.H();
   }

   protected void g(Parcelable var1) {
      this.L = true;
      if (var1 != .cpn.EMPTY_STATE && var1 != null) {
         throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
      }
   }

   protected void h(Object var1) {
   }

   public boolean j() {
      return !this.Z();
   }

   public CharSequence m() {
      .cpr var1 = this.D;
      return var1 != null ? var1.a(this) : this.a;
   }

   public void n(CharSequence var1) {
      if (this.D == null) {
         if (!TextUtils.equals(this.a, var1)) {
            this.a = var1;
            this.d();
         }

      } else {
         throw new IllegalStateException("Preference already has a SummaryProvider set.");
      }
   }

   protected final float p(float var1) {
      return !this.aa() ? var1 : this.k.d().getFloat(this.r, var1);
   }

   protected final int q(int var1) {
      return !this.aa() ? var1 : this.k.d().getInt(this.r, var1);
   }

   public final SharedPreferences r() {
      .cqg var1 = this.k;
      return var1 != null ? var1.d() : null;
   }

   public final Drawable s() {
      if (this.c == null) {
         int var1 = this.b;
         if (var1 != 0) {
            this.c = .fr.a(this.j, var1);
         }
      }

      return this.c;
   }

   public final Bundle t() {
      if (this.d == null) {
         this.d = new Bundle();
      }

      return this.d;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      CharSequence var2 = this.q;
      if (!TextUtils.isEmpty(var2)) {
         var1.append(var2);
         var1.append(' ');
      }

      var2 = this.m();
      if (!TextUtils.isEmpty(var2)) {
         var1.append(var2);
         var1.append(' ');
      }

      if (var1.length() > 0) {
         var1.setLength(var1.length() - 1);
      }

      return var1.toString();
   }

   public .cpo u() {
      return this.n;
   }

   protected final Preference v(String var1) {
      .cqg var2 = this.k;
      return var2 == null ? null : var2.e(var1);
   }

   protected final String w(String var1) {
      return !this.aa() ? var1 : this.k.d().getString(this.r, var1);
   }

   public final Set x(Set var1) {
      return !this.aa() ? var1 : this.k.d().getStringSet(this.r, var1);
   }

   final void y(PreferenceGroup var1) {
      if (var1 != null && this.C != null) {
         throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
      } else {
         this.C = var1;
      }
   }

   public void z(Bundle var1) {
      if (this.Y()) {
         Parcelable var2 = var1.getParcelable(this.r);
         if (var2 != null) {
            this.L = false;
            this.g(var2);
            if (!this.L) {
               throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
         }
      }

   }
}
