package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.Arrays;
import java.util.List;

public class ConnectionConfiguration extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .luu(12);
   public final String a;
   public final String b;
   public final int c;
   public final int d;
   public final boolean e;
   public final boolean f;
   public volatile String g;
   public final boolean h;
   public final String i;
   public final String j;
   public final int k;
   public final List l;
   public final boolean m;
   public final boolean n;
   public final .lxc o;

   public ConnectionConfiguration(String var1, String var2, int var3, int var4, boolean var5, boolean var6, String var7, boolean var8, String var9, String var10, int var11, List var12, boolean var13, boolean var14, .lxc var15) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
      this.k = var11;
      this.l = var12;
      this.m = var13;
      this.n = var14;
      this.o = var15;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof ConnectionConfiguration)) {
         return false;
      } else {
         ConnectionConfiguration var2 = (ConnectionConfiguration)var1;
         return .c.F(this.a, var2.a) && .c.F(this.b, var2.b) && .c.F(this.c, var2.c) && .c.F(this.d, var2.d) && .c.F(this.e, var2.e) && .c.F(this.h, var2.h) && .c.F(this.m, var2.m) && .c.F(this.n, var2.n);
      }
   }

   public final int hashCode() {
      return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.h, this.m, this.n});
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("ConnectionConfiguration[ ");
      var1.append("Name=");
      var1.append(this.a);
      var1.append(", Address=");
      var1.append(this.b);
      var1.append(", Type=");
      var1.append(this.c);
      var1.append(", Role=");
      var1.append(this.d);
      var1.append(", Enabled=");
      var1.append(this.e);
      var1.append(", IsConnected=");
      var1.append(this.f);
      var1.append(", PeerNodeId=");
      var1.append(this.g);
      var1.append(", BtlePriority=");
      var1.append(this.h);
      var1.append(", NodeId=");
      var1.append(this.i);
      var1.append(", PackageName=");
      var1.append(this.j);
      var1.append(", ConnectionRetryStrategy=");
      var1.append(this.k);
      var1.append(", allowedConfigPackages=");
      var1.append(this.l);
      var1.append(RbaSbznIXS.IVc);
      var1.append(this.m);
      var1.append(", DataItemSyncEnabled=");
      var1.append(this.n);
      var1.append(", ConnectionRestrictions=");
      var1.append(this.o);
      var1.append("]");
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = .mzx.cl(var1);
      .mzx.cA(var1, 2, this.a);
      .mzx.cA(var1, 3, this.b);
      .mzx.cr(var1, 4, this.c);
      .mzx.cr(var1, 5, this.d);
      .mzx.co(var1, 6, this.e);
      .mzx.co(var1, 7, this.f);
      .mzx.cA(var1, 8, this.g);
      .mzx.co(var1, 9, this.h);
      .mzx.cA(var1, 10, this.i);
      .mzx.cA(var1, 11, this.j);
      .mzx.cr(var1, 12, this.k);
      .mzx.cC(var1, 13, this.l);
      .mzx.co(var1, 14, this.m);
      .mzx.co(var1, 15, this.n);
      .mzx.cz(var1, 16, this.o, var2);
      .mzx.cn(var1, var3);
   }
}
