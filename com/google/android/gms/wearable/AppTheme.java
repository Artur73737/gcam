package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class AppTheme extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .luu(11);
   private final int a;
   private final int b;
   private final int c;
   private final int d;

   public AppTheme() {
      this.a = 0;
      this.b = 0;
      this.c = 0;
      this.d = 0;
   }

   public AppTheme(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof AppTheme)) {
         return false;
      } else {
         AppTheme var2 = (AppTheme)var1;
         return this.b == var2.b && this.a == var2.a && this.c == var2.c && this.d == var2.d;
      }
   }

   public final int hashCode() {
      return ((this.b * 31 + this.a) * 31 + this.c) * 31 + this.d;
   }

   public final String toString() {
      int var3 = this.b;
      int var4 = this.a;
      int var1 = this.c;
      int var2 = this.d;
      StringBuilder var5 = new StringBuilder();
      var5.append("AppTheme {dynamicColor =");
      var5.append(var3);
      var5.append(", colorTheme =");
      var5.append(var4);
      var5.append(", screenAlignment =");
      var5.append(var1);
      var5.append(", screenItemsSize =");
      var5.append(var2);
      var5.append("}");
      return var5.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var5 = .mzx.cl(var1);
      int var4 = this.a;
      byte var3 = 1;
      var2 = var4;
      if (var4 == 0) {
         var2 = 1;
      }

      .mzx.cr(var1, 1, var2);
      var4 = this.b;
      var2 = var4;
      if (var4 == 0) {
         var2 = 1;
      }

      .mzx.cr(var1, 2, var2);
      var2 = this.c;
      if (var2 == 0) {
         var2 = var3;
      }

      var3 = 3;
      .mzx.cr(var1, 3, var2);
      var2 = this.d;
      if (var2 == 0) {
         var2 = var3;
      }

      .mzx.cr(var1, 4, var2);
      .mzx.cn(var1, var5);
   }
}
