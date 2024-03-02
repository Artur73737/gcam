package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class TogglingData extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .lqq(7);
   String a;
   String b;
   public String c;

   private TogglingData() {
   }

   public TogglingData(String var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = .mzx.cl(var1);
      .mzx.cA(var1, 2, this.a);
      .mzx.cA(var1, 3, this.b);
      .mzx.cA(var1, 4, this.c);
      .mzx.cn(var1, var2);
   }
}
