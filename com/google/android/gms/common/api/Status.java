package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.material.search.Ztp.sYWXtqVx;
import java.util.ArrayList;
import java.util.Arrays;

public final class Status extends .loy implements ReflectedParcelable, .lle {
   public static final Creator CREATOR = new .ljr(7);
   public static final Status a = new Status(0);
   public static final Status b = new Status(14);
   public static final Status c = new Status(8);
   public static final Status d = new Status(15);
   public static final Status e = new Status(16);
   public final int f;
   public final String g;
   public final PendingIntent h;
   public final .ljq i;

   public Status(int var1) {
      this(var1, (String)null);
   }

   public Status(int var1, String var2) {
      this(var1, var2, (byte[])null);
   }

   public Status(int var1, String var2, PendingIntent var3, .ljq var4) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   public Status(int var1, String var2, byte[] var3) {
      this(var1, var2, (PendingIntent)null, (.ljq)null);
   }

   public final Status a() {
      return this;
   }

   public final boolean b() {
      return this.f <= 0;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof Status)) {
         return false;
      } else {
         Status var2 = (Status)var1;
         return this.f == var2.f && .c.F(this.g, var2.g) && .c.F(this.h, var2.h) && .c.F(this.i, var2.i);
      }
   }

   public final int hashCode() {
      return Arrays.hashCode(new Object[]{this.f, this.g, this.h, this.i});
   }

   public final String toString() {
      ArrayList var3 = new ArrayList();
      String var2 = this.g;
      String var1 = var2;
      if (var2 == null) {
         var1 = .mzx.du(this.f);
      }

      .mzx.dr(sYWXtqVx.XOfWVausZXBGMS, var1, var3);
      .mzx.dr("resolution", this.h, var3);
      return .mzx.dq(var3, this);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = .mzx.cl(var1);
      .mzx.cr(var1, 1, this.f);
      .mzx.cA(var1, 2, this.g);
      .mzx.cz(var1, 3, this.h, var2);
      .mzx.cz(var1, 4, this.i, var2);
      .mzx.cn(var1, var3);
   }
}
