package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .ljr(6);
   final int a;
   public final String b;

   public Scope(int var1, String var2) {
      .mzx.dl(var2, "scopeUri must not be null or empty");
      this.a = var1;
      this.b = var2;
   }

   public Scope(String var1) {
      this(1, var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Scope) ? false : this.b.equals(((Scope)var1).b);
      }
   }

   public final int hashCode() {
      return this.b.hashCode();
   }

   public final String toString() {
      return this.b;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = .mzx.cl(var1);
      .mzx.cr(var1, 1, this.a);
      .mzx.cA(var1, 2, this.b);
      .mzx.cn(var1, var2);
   }
}
