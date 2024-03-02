package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class ErrorReport extends .loy implements ReflectedParcelable {
   public static final Creator CREATOR = new .ljr(19);
   public String A;
   public String B;
   public String C;
   public Bundle D;
   public boolean E;
   public int F;
   public int G;
   public boolean H;
   public String I;
   public String J;
   public int K;
   public String L;
   public String M;
   public String N;
   public String O;
   public String P;
   @Deprecated
   public String Q;
   public String R;
   public BitmapTeleporter S;
   public String T;
   public .lqn[] U;
   public String[] V;
   public boolean W;
   public String X;
   public .lqp Y;
   public .lqo Z;
   public ApplicationErrorReport a;
   @Deprecated
   public String aa;
   public boolean ab;
   public Bundle ac;
   public List ad;
   public boolean ae;
   public Bitmap af;
   public String ag;
   public List ah;
   public int ai;
   public int aj;
   public String[] ak;
   public String[] al;
   public String[] am;
   public boolean an;
   public boolean ao;
   public String ap;
   public String b;
   public int c;
   public String d;
   public String e;
   public String f;
   public String g;
   public String h;
   public String i;
   public String j;
   public int k;
   public String l;
   public String m;
   public String n;
   public String o;
   public String p;
   public String[] q;
   public String[] r;
   public String[] s;
   public String t;
   public String u;
   public byte[] v;
   public int w;
   public int x;
   public int y;
   public int z;

   public ErrorReport() {
      this.a = new ApplicationErrorReport();
   }

   public ErrorReport(ApplicationErrorReport var1, String var2, int var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, int var11, String var12, String var13, String var14, String var15, String var16, String[] var17, String[] var18, String[] var19, String var20, String var21, byte[] var22, int var23, int var24, int var25, int var26, String var27, String var28, String var29, Bundle var30, boolean var31, int var32, int var33, boolean var34, String var35, String var36, int var37, String var38, String var39, String var40, String var41, String var42, String var43, String var44, BitmapTeleporter var45, String var46, .lqn[] var47, String[] var48, boolean var49, String var50, .lqp var51, .lqo var52, String var53, boolean var54, Bundle var55, List var56, boolean var57, Bitmap var58, String var59, List var60, int var61, int var62, String[] var63, String[] var64, String[] var65, boolean var66, boolean var67, String var68) {
      new ApplicationErrorReport();
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
      this.p = var16;
      this.q = var17;
      this.r = var18;
      this.s = var19;
      this.t = var20;
      this.u = var21;
      this.v = var22;
      this.w = var23;
      this.x = var24;
      this.y = var25;
      this.z = var26;
      this.A = var27;
      this.B = var28;
      this.C = var29;
      this.D = var30;
      this.E = var31;
      this.F = var32;
      this.G = var33;
      this.H = var34;
      this.I = var35;
      this.J = var36;
      this.K = var37;
      this.L = var38;
      this.M = var39;
      this.N = var40;
      this.O = var41;
      this.P = var42;
      this.Q = var43;
      this.R = var44;
      this.S = var45;
      this.T = var46;
      this.U = var47;
      this.V = var48;
      this.W = var49;
      this.X = var50;
      this.Y = var51;
      this.Z = var52;
      this.aa = var53;
      this.ab = var54;
      this.ac = var55;
      this.ad = var56;
      this.ae = var57;
      this.af = var58;
      this.ag = var59;
      this.ah = var60;
      this.ai = var61;
      this.aj = var62;
      this.ak = var63;
      this.al = var64;
      this.am = var65;
      this.an = var66;
      this.ao = var67;
      this.ap = var68;
   }

   public ErrorReport(.lql var1, File var2) {
      this.a = new ApplicationErrorReport();
      Bundle var3 = var1.b;
      if (var3 != null && !var3.isEmpty()) {
         this.D = var1.b;
      }

      if (!TextUtils.isEmpty(var1.a)) {
         this.B = var1.a;
      }

      if (!TextUtils.isEmpty(var1.c)) {
         this.b = var1.c;
      }

      CrashInfo var6 = var1.d.crashInfo;
      if (var6 != null) {
         this.M = var6.throwMethodName;
         this.K = var6.throwLineNumber;
         this.L = var6.throwClassName;
         this.N = var6.stackTrace;
         this.I = var6.exceptionClassName;
         this.O = var6.exceptionMessage;
         this.J = var6.throwFileName;
      }

      .lqp var7 = var1.j;
      if (var7 != null) {
         this.Y = var7;
      }

      if (!TextUtils.isEmpty(var1.e)) {
         this.P = var1.e;
      }

      String var8 = var1.g;
      if (!TextUtils.isEmpty(var8)) {
         this.a.packageName = var8;
      }

      if (!TextUtils.isEmpty(var1.n)) {
         this.ag = var1.n;
      }

      Bitmap var9 = var1.m;
      if (var9 != null) {
         this.af = var9;
      }

      if (var2 != null) {
         this.S = var1.f;
         List var10 = var1.h;
         if (var10 != null && !var10.isEmpty()) {
            for(Iterator var4 = var10.iterator(); var4.hasNext(); ((.lqn)var4.next()).d = var2) {
            }

            this.U = (.lqn[])var10.toArray(new .lqn[0]);
         }
      }

      .lqo var5 = var1.k;
      if (var5 != null) {
         this.Z = var5;
      }

      this.W = var1.i;
      this.ae = var1.l;
      this.E = var1.o;
      this.an = var1.q;
      this.ap = var1.r;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = .mzx.cl(var1);
      .mzx.cz(var1, 2, this.a, var2);
      .mzx.cA(var1, 3, this.b);
      .mzx.cr(var1, 4, this.c);
      .mzx.cA(var1, 5, this.d);
      .mzx.cA(var1, 6, this.e);
      .mzx.cA(var1, 7, this.f);
      .mzx.cA(var1, 8, this.g);
      .mzx.cA(var1, 9, this.h);
      .mzx.cA(var1, 10, this.i);
      .mzx.cA(var1, 11, this.j);
      .mzx.cr(var1, 12, this.k);
      .mzx.cA(var1, 13, this.l);
      .mzx.cA(var1, 14, this.m);
      .mzx.cA(var1, 15, this.n);
      .mzx.cA(var1, 16, this.o);
      .mzx.cA(var1, 17, this.p);
      .mzx.cB(var1, 18, this.q);
      .mzx.cB(var1, 19, this.r);
      .mzx.cB(var1, 20, this.s);
      .mzx.cA(var1, 21, this.t);
      .mzx.cA(var1, 22, this.u);
      .mzx.cu(var1, 23, this.v);
      .mzx.cr(var1, 24, this.w);
      .mzx.cr(var1, 25, this.x);
      .mzx.cr(var1, 26, this.y);
      .mzx.cr(var1, 27, this.z);
      .mzx.cA(var1, 28, this.A);
      .mzx.cA(var1, 29, this.B);
      .mzx.cA(var1, 30, this.C);
      .mzx.ct(var1, 31, this.D);
      .mzx.co(var1, 32, this.E);
      .mzx.cr(var1, 33, this.F);
      .mzx.cr(var1, 34, this.G);
      .mzx.co(var1, 35, this.H);
      .mzx.cA(var1, 36, this.I);
      .mzx.cA(var1, 37, this.J);
      .mzx.cr(var1, 38, this.K);
      .mzx.cA(var1, 39, this.L);
      .mzx.cA(var1, 40, this.M);
      .mzx.cA(var1, 41, this.N);
      .mzx.cA(var1, 42, this.O);
      .mzx.cA(var1, 43, this.P);
      .mzx.cA(var1, 44, this.Q);
      .mzx.cA(var1, 45, this.R);
      .mzx.cz(var1, 46, this.S, var2);
      .mzx.cA(var1, 47, this.T);
      .mzx.cD(var1, 48, this.U, var2);
      .mzx.cB(var1, 49, this.V);
      .mzx.co(var1, 50, this.W);
      .mzx.cA(var1, 51, this.X);
      .mzx.cz(var1, 52, this.Y, var2);
      .mzx.cz(var1, 53, this.Z, var2);
      .mzx.cA(var1, 54, this.aa);
      .mzx.co(var1, 55, this.ab);
      .mzx.ct(var1, 56, this.ac);
      .mzx.cE(var1, 57, this.ad);
      .mzx.co(var1, 58, this.ae);
      .mzx.cz(var1, 59, this.af, var2);
      .mzx.cA(var1, 60, this.ag);
      .mzx.cC(var1, 61, this.ah);
      .mzx.cr(var1, 62, this.ai);
      .mzx.cr(var1, 63, this.aj);
      .mzx.cB(var1, 64, this.ak);
      .mzx.cB(var1, 65, this.al);
      .mzx.cB(var1, 66, this.am);
      .mzx.co(var1, 67, this.an);
      .mzx.co(var1, 68, this.ao);
      .mzx.cA(var1, 69, this.ap);
      .mzx.cn(var1, var3);
   }
}
