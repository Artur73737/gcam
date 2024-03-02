package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .atw(16);
   final int a;
   public final String b;
   public final String c;
   public final String d;
   public final String e;
   public final Uri f;
   public String g;
   public final long h;
   public final String i;
   final List j;
   public final String k;
   public final String l;
   private final Set m = new HashSet();

   public GoogleSignInAccount(int var1, String var2, String var3, String var4, String var5, Uri var6, String var7, long var8, String var10, List var11, String var12, String var13) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var10;
      this.j = var11;
      this.k = var12;
      this.l = var13;
   }

   public final Set a() {
      HashSet var1 = new HashSet(this.j);
      var1.addAll(this.m);
      return var1;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GoogleSignInAccount)) {
         return false;
      } else {
         GoogleSignInAccount var2 = (GoogleSignInAccount)var1;
         return var2.i.equals(this.i) && var2.a().equals(this.a());
      }
   }

   public final int hashCode() {
      return (this.i.hashCode() + 527) * 31 + this.a().hashCode();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = .mzx.cl(var1);
      .mzx.cr(var1, 1, this.a);
      .mzx.cA(var1, 2, this.b);
      .mzx.cA(var1, 3, this.c);
      .mzx.cA(var1, 4, this.d);
      .mzx.cA(var1, 5, this.e);
      .mzx.cz(var1, 6, this.f, var2);
      .mzx.cA(var1, 7, this.g);
      .mzx.cs(var1, 8, this.h);
      .mzx.cA(var1, 9, this.i);
      .mzx.cE(var1, 10, this.j);
      .mzx.cA(var1, 11, this.k);
      .mzx.cA(var1, 12, this.l);
      .mzx.cn(var1, var3);
   }
}
