package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

public class GoogleHelp extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .lqu();
   boolean A;
   boolean B;
   int C;
   String D;
   boolean E;
   String F;
   boolean G;
   ND4CSettings H;
   boolean I;
   List J;
   String K;
   final int a;
   String b;
   Account c;
   Bundle d;
   String e;
   String f;
   Bitmap g;
   boolean h;
   boolean i;
   List j;
   @Deprecated
   Bundle k;
   @Deprecated
   Bitmap l;
   @Deprecated
   byte[] m;
   @Deprecated
   int n;
   @Deprecated
   int o;
   String p;
   public Uri q;
   List r;
   .lqp s;
   List t;
   boolean u;
   ErrorReport v = new ErrorReport();
   public TogglingData w;
   int x;
   PendingIntent y;
   public int z;

   public GoogleHelp(int var1, String var2, Account var3, Bundle var4, String var5, String var6, Bitmap var7, boolean var8, boolean var9, List var10, Bundle var11, Bitmap var12, byte[] var13, int var14, int var15, String var16, Uri var17, List var18, int var19, .lqp var20, List var21, boolean var22, ErrorReport var23, TogglingData var24, int var25, PendingIntent var26, int var27, boolean var28, boolean var29, int var30, String var31, boolean var32, String var33, boolean var34, ND4CSettings var35, boolean var36, List var37, String var38) {
      if (!TextUtils.isEmpty(var2)) {
         this.a = var1;
         this.z = var27;
         this.A = var28;
         this.B = var29;
         this.C = var30;
         this.D = var31;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = var7;
         this.h = var8;
         this.i = var9;
         this.E = var32;
         this.j = var10;
         this.y = var26;
         this.k = var11;
         this.l = var12;
         this.m = var13;
         this.n = var14;
         this.o = var15;
         this.p = var16;
         this.q = var17;
         this.r = var18;
         if (var1 < 4) {
            .lqp var39 = new .lqp();
            var39.a = var19;
            this.s = var39;
         } else {
            if (var20 == null) {
               var20 = new .lqp();
            }

            this.s = var20;
         }

         this.t = var21;
         this.u = var22;
         this.v = var23;
         if (var23 != null) {
            var23.X = "GoogleHelp";
         }

         this.w = var24;
         this.x = var25;
         this.F = var33;
         this.G = var34;
         this.H = var35;
         this.I = var36;
         this.J = var37;
         this.K = var38;
      } else {
         throw new IllegalStateException("Help requires a non-empty appContext");
      }
   }

   public final void a(int var1, String var2, Intent var3) {
      this.r.add(new .lrg(var1, var2, var3));
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = .mzx.cl(var1);
      .mzx.cr(var1, 1, this.a);
      .mzx.cA(var1, 2, this.b);
      .mzx.cz(var1, 3, this.c, var2);
      .mzx.ct(var1, 4, this.d);
      .mzx.co(var1, 5, this.h);
      .mzx.co(var1, 6, this.i);
      .mzx.cC(var1, 7, this.j);
      .mzx.ct(var1, 10, this.k);
      .mzx.cz(var1, 11, this.l, var2);
      .mzx.cA(var1, 14, this.p);
      .mzx.cz(var1, 15, this.q, var2);
      .mzx.cE(var1, 16, this.r);
      .mzx.cr(var1, 17, 0);
      .mzx.cE(var1, 18, this.t);
      .mzx.cu(var1, 19, this.m);
      .mzx.cr(var1, 20, this.n);
      .mzx.cr(var1, 21, this.o);
      .mzx.co(var1, 22, this.u);
      .mzx.cz(var1, 23, this.v, var2);
      .mzx.cz(var1, 25, this.s, var2);
      .mzx.cA(var1, 28, this.e);
      .mzx.cz(var1, 31, this.w, var2);
      .mzx.cr(var1, 32, this.x);
      .mzx.cz(var1, 33, this.y, var2);
      .mzx.cA(var1, 34, this.f);
      .mzx.cz(var1, 35, this.g, var2);
      .mzx.cr(var1, 36, this.z);
      .mzx.co(var1, 37, this.A);
      .mzx.co(var1, 38, this.B);
      .mzx.cr(var1, 39, this.C);
      .mzx.cA(var1, 40, this.D);
      .mzx.co(var1, 41, this.E);
      .mzx.cA(var1, 42, this.F);
      .mzx.co(var1, 43, this.G);
      .mzx.cz(var1, 44, this.H, var2);
      .mzx.co(var1, 45, this.I);
      .mzx.cE(var1, 46, this.J);
      .mzx.cA(var1, 47, this.K);
      .mzx.cn(var1, var3);
   }
}
