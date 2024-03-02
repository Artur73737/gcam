package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

public class FRDProductSpecificDataEntry extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .lqq(2);
   final int a;
   final int b;
   final List c;
   final List d;
   final List e;
   final List f;
   final byte[][] g;
   final Boolean h;

   public FRDProductSpecificDataEntry(int var1, int var2, List var3, List var4, List var5, List var6, byte[][] var7, boolean var8) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof FRDProductSpecificDataEntry)) {
         return false;
      } else {
         FRDProductSpecificDataEntry var2 = (FRDProductSpecificDataEntry)var1;
         return this.a == var2.a && this.b == var2.b && .c.F(this.c, var2.c) && .c.F(this.d, var2.d) && .c.F(this.e, var2.e) && .c.F(this.f, var2.f) && Arrays.equals(this.g, var2.g) && .c.F(this.h, var2.h);
      }
   }

   public final int hashCode() {
      return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Arrays.deepHashCode(this.g), this.h});
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = .mzx.cl(var1);
      .mzx.cr(var1, 2, this.a);
      .mzx.cr(var1, 3, this.b);
      .mzx.cC(var1, 4, this.c);
      .mzx.cy(var1, 5, this.d);
      .mzx.cC(var1, 6, this.e);
      .mzx.cy(var1, 7, this.f);
      .mzx.cv(var1, 8, this.g);
      Boolean var3 = this.h;
      .mzx.cq(var1, 9, 4);
      var1.writeInt(var3);
      .mzx.cn(var1, var2);
   }
}
