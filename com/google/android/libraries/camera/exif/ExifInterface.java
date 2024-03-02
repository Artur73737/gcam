package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeMap;

public class ExifInterface implements .mkp {
   public static final int A;
   public static final int B;
   public static final int C;
   public static final int D;
   public static final int E;
   public static final int F;
   public static final int G;
   public static final int H;
   public static final int I;
   public static final int J;
   public static final int K;
   public static final int L;
   public static final int M;
   public static final int N;
   public static final int O;
   public static final int P;
   public static final int Q;
   public static final int R;
   public static final int S;
   public static final int T;
   public static final int TAG_SOFTWARE;
   public static final int U;
   public static final int V;
   public static final int W;
   public static final int X;
   public static final int Y;
   public static final int Z;
   public static final int a = c(0, (short)256);
   public static final int aA;
   public static final int aB;
   public static final int aC;
   public static final int aD;
   public static final int aE;
   public static final int aF;
   public static final int aG;
   public static final int aH;
   public static final int aI;
   public static final int aJ;
   public static final int aK;
   public static final int aL;
   public static final int aM;
   public static final int aN;
   public static final int aO;
   public static final int aP;
   public static final int aQ;
   public static final int aR;
   public static final int aS;
   public static final int aT;
   public static final int aU;
   public static final int aV;
   public static final int aW;
   public static final int aX;
   public static final int aY;
   public static final int aZ;
   public static final int aa;
   public static final int ab;
   public static final int ac;
   public static final int ad;
   public static final int ae;
   public static final int af;
   public static final int ag;
   public static final int ah;
   public static final int ai;
   public static final int aj;
   public static final int ak;
   public static final int al;
   public static final int am;
   public static final int an;
   public static final int ao;
   public static final int ap;
   public static final int aq;
   public static final int ar;
   public static final int as;
   public static final int at;
   public static final int au;
   public static final int av;
   public static final int aw;
   public static final int ax;
   public static final int ay;
   public static final int az;
   public static final int b = c(0, (short)257);
   private static final HashSet bD;
   private static final Long bE;
   public static final int ba;
   public static final int bb;
   public static final int bc;
   public static final int bd;
   public static final int be;
   public static final int bf;
   public static final int bg;
   public static final int bh;
   public static final int bi;
   public static final int bj;
   public static final int bk;
   public static final int bl;
   public static final int bm;
   public static final int bn;
   public static final int bo;
   public static final int bp;
   public static final int bq;
   public static final int br;
   public static final int bs;
   public static final int bt;
   public static final int bu;
   public static final int bv;
   protected static final HashSet bw;
   public static final Long bx;
   public static final ByteOrder by;
   public static final int c = c(0, (short)258);
   public static final int d = c(0, (short)259);
   public static final int e = c(0, (short)262);
   public static final int f = c(0, (short)270);
   public static final int g = c(0, (short)271);
   public static final int h = c(0, (short)272);
   public static final int i;
   public static final int j;
   public static final int k;
   public static final int l;
   public static final int m;
   public static final int n;
   public static final int o;
   public static final int p;
   public static final int q;
   public static final int r;
   public static final int s;
   public static final int t;
   public static final int u;
   public static final int v;
   public static final int w;
   public static final int x;
   public static final int y;
   public static final int z;
   public .mko bA;
   public final DateFormat bB;
   public final Calendar bC;
   private final DateFormat bF;
   private SparseIntArray bG;
   public String bz = "";

   static {
      int var0 = c(0, (short)273);
      i = var0;
      j = c(0, (short)274);
      k = c(0, (short)277);
      l = c(0, (short)278);
      int var1 = c(0, (short)279);
      m = var1;
      n = c(0, (short)282);
      o = c(0, (short)283);
      p = c(0, (short)284);
      q = c(0, (short)296);
      r = c(0, (short)301);
      TAG_SOFTWARE = c(0, (short)305);
      s = c(0, (short)306);
      t = c(0, (short)315);
      u = c(0, (short)318);
      v = c(0, (short)319);
      w = c(0, (short)529);
      x = c(0, (short)530);
      y = c(0, (short)531);
      z = c(0, (short)532);
      A = c(0, (short)-32104);
      int var6 = c(0, (short)-30871);
      B = var6;
      int var4 = c(0, (short)-30683);
      C = var4;
      int var3 = c(1, (short)513);
      D = var3;
      int var2 = c(1, (short)514);
      E = var2;
      F = c(2, (short)-32102);
      G = c(2, (short)-32099);
      H = c(2, (short)-30686);
      I = c(2, (short)-30684);
      J = c(2, (short)-30681);
      K = c(2, (short)-30680);
      L = c(2, (short)-28672);
      M = c(2, (short)-28669);
      N = c(2, (short)-28668);
      O = c(2, (short)-28415);
      P = c(2, (short)-28414);
      Q = c(2, (short)-28159);
      R = c(2, (short)-28158);
      S = c(2, (short)-28157);
      T = c(2, (short)-28156);
      U = c(2, (short)-28155);
      V = c(2, (short)-28154);
      W = c(2, (short)-28153);
      X = c(2, (short)-28152);
      Y = c(2, (short)-28151);
      Z = c(2, (short)-28150);
      aa = c(2, (short)-28140);
      ab = c(2, (short)-28036);
      ac = c(2, (short)-28026);
      ad = c(2, (short)-28016);
      ae = c(2, (short)-28015);
      af = c(2, (short)-28014);
      ag = c(2, (short)-24576);
      ah = c(2, (short)-24575);
      ai = c(2, (short)-24574);
      aj = c(2, (short)-24573);
      ak = c(2, (short)-24572);
      int var5 = c(2, (short)-24571);
      al = var5;
      am = c(2, (short)-24053);
      an = c(2, (short)-24052);
      ao = c(2, (short)-24050);
      ap = c(2, (short)-24049);
      aq = c(2, (short)-24048);
      ar = c(2, (short)-24044);
      as = c(2, (short)-24043);
      at = c(2, (short)-24041);
      au = c(2, (short)-23808);
      av = c(2, (short)-23807);
      aw = c(2, (short)-23806);
      ax = c(2, (short)-23551);
      ay = c(2, (short)-23550);
      az = c(2, (short)-23549);
      aA = c(2, (short)-23548);
      aB = c(2, (short)-23547);
      aC = c(2, (short)-23546);
      aD = c(2, (short)-23545);
      aE = c(2, (short)-23544);
      aF = c(2, (short)-23543);
      aG = c(2, (short)-23542);
      aH = c(2, (short)-23541);
      aI = c(2, (short)-23540);
      aJ = c(2, (short)-23520);
      aK = c(2, (short)-23501);
      aL = c(2, (short)-23500);
      aM = c(2, (short)-28656);
      aN = c(2, (short)-28655);
      aO = c(2, (short)-28654);
      aP = c(2, (short)-27648);
      aQ = c(2, (short)-27645);
      aR = c(4, (short)0);
      aS = c(4, (short)1);
      aT = c(4, (short)2);
      aU = c(4, (short)3);
      aV = c(4, (short)4);
      aW = c(4, (short)5);
      aX = c(4, (short)6);
      aY = c(4, (short)7);
      aZ = c(4, (short)8);
      ba = c(4, (short)9);
      bb = c(4, (short)10);
      bc = c(4, (short)11);
      bd = c(4, (short)12);
      be = c(4, (short)13);
      bf = c(4, (short)14);
      bg = c(4, (short)15);
      bh = c(4, (short)16);
      bi = c(4, (short)17);
      bj = c(4, (short)18);
      bk = c(4, (short)19);
      bl = c(4, (short)20);
      bm = c(4, (short)23);
      bn = c(4, (short)24);
      bo = c(4, (short)25);
      bp = c(4, (short)26);
      bq = c(4, (short)27);
      br = c(4, (short)28);
      bs = c(4, (short)29);
      bt = c(4, (short)30);
      bu = c(3, (short)1);
      bv = c(3, (short)2);
      HashSet var7 = new HashSet();
      bD = var7;
      var7.add(n(var4));
      var7.add(n(var6));
      var7.add(n(var3));
      var7.add(n(var5));
      var7.add(n(var0));
      var7 = new HashSet(var7);
      bw = var7;
      var7.add(n(-1));
      var7.add(n(var2));
      var7.add(n(var1));
      Long var8 = 100L;
      bx = var8;
      bE = var8;
      by = ByteOrder.BIG_ENDIAN;
   }

   public ExifInterface() {
      this.bA = new .mko(by);
      this.bF = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);
      SimpleDateFormat var1 = new SimpleDateFormat("yyyy:MM:dd", Locale.ROOT);
      this.bB = var1;
      this.bC = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
      this.bG = null;
      var1.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
   }

   private static final String A(long var0) {
      return .onk.t(Long.toString(var0), 2);
   }

   public static int c(int var0, short var1) {
      return var0 << 16 | (char)var1;
   }

   protected static int d(int var0) {
      return (char)var0;
   }

   protected static int f(int[] var0) {
      int[] var6 = .mkz.a;
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < 5; var2 = var3) {
         int var5 = var0.length;
         int var4 = 0;

         while(true) {
            var3 = var2;
            if (var4 >= var5) {
               break;
            }

            var3 = var0[var4];
            if (var6[var1] == var3) {
               var3 = var2 | 1 << var1;
               break;
            }

            ++var4;
         }

         ++var1;
      }

      return var2;
   }

   public static int g(int var0) {
      return var0 >>> 16;
   }

   public static short n(int var0) {
      return (short)var0;
   }

   protected static short o(int var0) {
      return (short)(var0 >> 16 & 255);
   }

   public static boolean s(int var0, int var1) {
      int[] var3 = .mkz.a;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (var1 == var3[var2] && (var0 >>> 24 >> var2 & 1) == 1) {
            return true;
         }
      }

      return false;
   }

   public static boolean t(short var0) {
      return bD.contains(var0);
   }

   public static .mhp[] w(double var0) {
      var0 = Math.abs(var0);
      int var4 = (int)var0;
      double var2 = (double)var4;
      Double.isNaN(var2);
      Long var5 = bE;
      var5;
      .mhp var6 = new .mhp((long)var4, 1L);
      var0 = (var0 - var2) * 60.0D;
      var4 = (int)var0;
      .mhp var7 = new .mhp((long)var4, 1L);
      var5;
      var2 = (double)var4;
      Double.isNaN(var2);
      return new .mhp[]{var6, var7, new .mhp((long)((int)((var0 - var2) * 60.0D * 100.0D)), 100L)};
   }

   private final void z(InputStream var1, InputStream var2) {
      .mkq var10000;
      label199: {
         int var3;
         .mkv var6;
         boolean var10001;
         .mko var33;
         try {
            var6 = new .mkv(var1, this);
            var33 = new .mko(var6.a.b.order());
            var3 = var6.a();
         } catch (.mkq var32) {
            var10000 = var32;
            var10001 = false;
            break label199;
         }

         label196:
         while(true) {
            if (var3 == 5) {
               this.bA = var33;
               if (var2 == null) {
                  return;
               }

               .otx var36 = .myc.e(var2);
               if (var36 != null) {
                  try {
                     .myc.f((.dhm)var36.a).array();
                     String var37 = new String(.myc.f((.dhm)var36.b).array());
                     this.bz = var37;
                     return;
                  } catch (.dhl var10) {
                     throw new IOException("Could not parse XMP data.", var10);
                  }
               }

               return;
            }

            byte var5 = 0;
            byte var4 = 0;
            .mkw var7;
            byte[] var39;
            .mkz var40;
            switch(var3) {
            case 0:
               try {
                  var40 = new .mkz(var6.b);
                  var33.d(var40);
                  break;
               } catch (.mkq var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label196;
               }
            case 1:
               try {
                  var7 = var6.c;
               } catch (.mkq var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label196;
               }

               if (var7 != null) {
                  try {
                     if (!var7.e()) {
                        var3 = var7.g;
                        if (var3 >= var6.a.a) {
                           TreeMap var9 = var6.g;
                           .mks var41 = new .mks(var7, true);
                           var9.put(var3, var41);
                        }
                        break;
                     }
                  } catch (.mkq var30) {
                     var10000 = var30;
                     var10001 = false;
                     break label196;
                  }

                  .mkz var42;
                  try {
                     var42 = var33.b(var7.e);
                  } catch (.mkq var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label196;
                  }

                  if (var42 != null) {
                     try {
                        var42.e(var7);
                     } catch (.mkq var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label196;
                     }
                  }
               }
               break;
            case 2:
               .mkw var8;
               try {
                  var8 = var6.c;
               } catch (.mkq var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label196;
               }

               if (var8 != null) {
                  try {
                     if (var8.b == 7) {
                        var6.e(var8);
                     }
                  } catch (.mkq var28) {
                     var10000 = var28;
                     var10001 = false;
                     break label196;
                  }

                  try {
                     var40 = var33.b(var8.e);
                  } catch (.mkq var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label196;
                  }

                  if (var40 != null) {
                     try {
                        var40.e(var8);
                     } catch (.mkq var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label196;
                     }
                  }
               }
               break;
            case 3:
               try {
                  var7 = var6.f;
               } catch (.mkq var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label196;
               }

               if (var7 == null) {
                  var3 = var4;
               } else {
                  try {
                     var3 = (int)var7.b(0);
                  } catch (.mkq var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label196;
                  }
               }

               try {
                  var39 = new byte[var3];
                  if (var3 == var6.b(var39)) {
                     var33.b = var39;
                     break;
                  }
               } catch (.mkq var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label196;
               }

               try {
                  Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                  break;
               } catch (.mkq var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label196;
               }
            default:
               label206: {
                  try {
                     var7 = var6.e;
                  } catch (.mkq var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label196;
                  }

                  if (var7 == null) {
                     var3 = var5;
                  } else {
                     try {
                        var3 = (int)var7.b(0);
                     } catch (.mkq var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label196;
                     }
                  }

                  int var38;
                  label212: {
                     try {
                        var39 = new byte[var3];
                        if (var3 == var6.b(var39)) {
                           var38 = var6.d.a;
                           if (var38 >= var33.c.size()) {
                              break label212;
                           }

                           var33.c.set(var38, var39);
                           break label206;
                        }
                     } catch (.mkq var29) {
                        var10000 = var29;
                        var10001 = false;
                        break label196;
                     }

                     try {
                        Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                        break label206;
                     } catch (.mkq var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label196;
                     }
                  }

                  try {
                     var3 = var33.c.size();
                  } catch (.mkq var15) {
                     var10000 = var15;
                     var10001 = false;
                     break label196;
                  }

                  for(; var3 < var38; ++var3) {
                     try {
                        var33.c.add((Object)null);
                     } catch (.mkq var14) {
                        var10000 = var14;
                        var10001 = false;
                        break label196;
                     }
                  }

                  try {
                     var33.c.add(var39);
                  } catch (.mkq var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label196;
                  }
               }
            }

            try {
               var3 = var6.a();
            } catch (.mkq var11) {
               var10000 = var11;
               var10001 = false;
               break;
            }
         }
      }

      .mkq var34 = var10000;
      IOException var35 = new IOException("Invalid exif format : ", var34);
      throw var35;
   }

   public final .mhp a(int var1) {
      .mhp[] var2 = this.v(var1, this.e(var1));
      return var2 != null && var2.length != 0 ? new .mhp(var2[0]) : null;
   }

   public final Integer b(int var1) {
      .mkw var2 = this.l(var1, this.e(var1));
      int[] var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.m();
      }

      return var3 != null && var3.length > 0 ? var3[0] : null;
   }

   public final int e(int var1) {
      return this.h().get(var1) == 0 ? -1 : g(var1);
   }

   public String getTagStringValue(int var1) {
      .mkw var2 = this.l(var1, this.e(var1));
      return var2 == null ? null : var2.d();
   }

   public final SparseIntArray h() {
      SparseIntArray var9;
      if (this.bG == null) {
         this.bG = new SparseIntArray();
         int var3 = f(new int[]{0, 1}) << 24;
         var9 = this.bG;
         var9.getClass();
         int var2 = g;
         int var1 = var3 | 131072;
         var9.put(var2, var1);
         int var5 = a;
         int var4 = var3 | 262145;
         var9.put(var5, var4);
         var9.put(b, var4);
         var9.put(c, 196611 | var3);
         int var6 = d;
         var5 = var3 | 196609;
         var9.put(var6, var5);
         var9.put(e, var5);
         var9.put(j, var5);
         var9.put(k, var5);
         var9.put(p, var5);
         var9.put(x, var3 | 196610);
         var9.put(y, var5);
         int var7 = n;
         var6 = var3 | 327681;
         var9.put(var7, var6);
         var9.put(o, var6);
         var9.put(q, var5);
         var5 = i;
         var6 = 262144 | var3;
         var9.put(var5, var6);
         var9.put(l, var4);
         var9.put(m, var6);
         var9.put(r, 197376 | var3);
         var9.put(u, 327682 | var3);
         var5 = v;
         var6 = 327686 | var3;
         var9.put(var5, var6);
         var9.put(w, var3 | 327683);
         var9.put(z, var6);
         var9.put(s, var3 | 131092);
         var9.put(f, var1);
         var9.put(var2, var1);
         var9.put(h, var1);
         var9.put(TAG_SOFTWARE, var1);
         var9.put(t, var1);
         var9.put(A, var1);
         var9.put(B, var4);
         var9.put(C, var4);
         var1 = f(new int[]{1}) << 24 | 262145;
         var9.put(D, var1);
         var9.put(E, var1);
         var1 = f(new int[]{2}) << 24;
         var2 = L;
         var3 = 458756 | var1;
         var9.put(var2, var3);
         var9.put(ag, var3);
         var2 = var1 | 196609;
         var9.put(ah, var2);
         var9.put(O, var3);
         var5 = var1 | 327681;
         var9.put(P, var5);
         var4 = var1 | 262145;
         var9.put(ai, var4);
         var9.put(aj, var4);
         var6 = ab;
         var3 = var1 | 458752;
         var9.put(var6, var3);
         var9.put(ac, var3);
         var9.put(ak, 131085 | var1);
         var6 = var1 | 131092;
         var9.put(M, var6);
         var9.put(N, var6);
         var6 = var1 | 131072;
         var9.put(ad, var6);
         var9.put(ae, var6);
         var9.put(af, var6);
         var9.put(aJ, 131105 | var1);
         var9.put(aK, var6);
         var9.put(aL, var6);
         var9.put(F, var5);
         var9.put(G, var5);
         var9.put(H, var2);
         var9.put(I, var6);
         var6 = J;
         var7 = 196608 | var1;
         var9.put(var6, var7);
         var9.put(K, var3);
         int var8 = Q;
         var6 = 655361 | var1;
         var9.put(var8, var6);
         var9.put(R, var5);
         var9.put(S, var6);
         var9.put(T, var6);
         var9.put(U, var5);
         var9.put(V, var5);
         var9.put(W, var2);
         var9.put(X, var2);
         var9.put(Y, var2);
         var9.put(Z, var5);
         var9.put(aa, var7);
         var9.put(am, var5);
         var9.put(an, var3);
         var9.put(ao, var5);
         var9.put(ap, var5);
         var9.put(aq, var2);
         var9.put(ar, var1 | 196610);
         var9.put(as, var5);
         var9.put(at, var2);
         var7 = 458753 | var1;
         var9.put(au, var7);
         var9.put(av, var7);
         var9.put(aw, var3);
         var9.put(ax, var2);
         var9.put(ay, var2);
         var9.put(az, var2);
         var9.put(aA, var5);
         var9.put(aB, var2);
         var9.put(aC, var2);
         var9.put(aD, var5);
         var9.put(aE, var2);
         var9.put(aF, var2);
         var9.put(aG, var2);
         var9.put(aH, var3);
         var9.put(aI, var2);
         var9.put(al, var4);
         var1 |= 131079;
         var9.put(aM, var1);
         var9.put(aO, var1);
         var9.put(aN, var1);
         var9.put(aP, var6);
         var9.put(aQ, var6);
         var1 = f(new int[]{4}) << 24;
         var9.put(aR, 65540 | var1);
         var3 = aS;
         var2 = 131074 | var1;
         var9.put(var3, var2);
         var9.put(aU, var2);
         var4 = var1 | 327683;
         var9.put(aT, var4);
         var9.put(aV, var4);
         var9.put(aW, 65537 | var1);
         var3 = var1 | 327681;
         var9.put(aX, var3);
         var9.put(aY, var4);
         var4 = var1 | 131072;
         var9.put(aZ, var4);
         var9.put(ba, var2);
         var9.put(bb, var2);
         var9.put(bc, var3);
         var9.put(bd, var2);
         var9.put(be, var3);
         var9.put(bf, var2);
         var9.put(bg, var3);
         var9.put(bh, var2);
         var9.put(bi, var3);
         var9.put(bj, var4);
         var9.put(bk, var2);
         var9.put(bl, var3);
         var9.put(bm, var2);
         var9.put(bn, var3);
         var9.put(bo, var2);
         var9.put(bp, var3);
         var2 = var1 | 458752;
         var9.put(bq, var2);
         var9.put(br, var2);
         var9.put(bs, 131083 | var1);
         var9.put(bt, var1 | 196619);
         var1 = f(new int[]{3}) << 24;
         var9.put(bu, var1 | 131072);
         var9.put(bv, var1 | 458752);
      }

      var9 = this.bG;
      var9.getClass();
      return var9;
   }

   public final .mkw i(int var1, Object var2) {
      int var8 = this.h().get(var1);
      if (var8 != 0 && var2 != null) {
         int var6 = g(var1);
         short var4 = o(var8);
         int var7 = d(var8);
         byte var5 = 0;
         boolean var9;
         if (var7 != 0) {
            var9 = true;
         } else {
            var9 = false;
         }

         if (s(var8, var6)) {
            .mkw var12 = new .mkw(n(var1), var4, var7, var6, var9);
            if (var2 instanceof Short) {
               var9 = var12.g((char)(Short)var2);
            } else if (var2 instanceof String) {
               var9 = var12.h((String)var2);
            } else if (var2 instanceof int[]) {
               var9 = var12.j((int[])var2);
            } else if (var2 instanceof long[]) {
               var9 = var12.k((long[])var2);
            } else if (var2 instanceof .mhp) {
               var9 = var12.l(new .mhp[]{(.mhp)var2});
            } else if (var2 instanceof .mhp[]) {
               var9 = var12.l((.mhp[])var2);
            } else if (var2 instanceof byte[]) {
               var9 = var12.i((byte[])var2);
            } else if (var2 instanceof Integer) {
               var9 = var12.g((Integer)var2);
            } else if (var2 instanceof Long) {
               var9 = var12.k(new long[]{(Long)var2});
            } else if (var2 instanceof Byte) {
               var9 = var12.i(new byte[]{(Byte)var2});
            } else if (var2 instanceof Short[]) {
               Short[] var14 = (Short[])var2;
               int[] var13 = new int[var14.length];

               for(var1 = 0; var1 < var14.length; ++var1) {
                  Short var15 = var14[var1];
                  char var19;
                  if (var15 == null) {
                     var19 = 0;
                  } else {
                     var19 = (char)var15;
                  }

                  var13[var1] = var19;
               }

               var9 = var12.j(var13);
            } else if (var2 instanceof Integer[]) {
               Integer[] var16 = (Integer[])var2;
               int[] var24 = new int[var16.length];

               for(var1 = 0; var1 < var16.length; ++var1) {
                  Integer var21 = var16[var1];
                  int var20;
                  if (var21 == null) {
                     var20 = 0;
                  } else {
                     var20 = var21;
                  }

                  var24[var1] = var20;
               }

               var9 = var12.j(var24);
            } else if (var2 instanceof Long[]) {
               Long[] var17 = (Long[])var2;
               long[] var22 = new long[var17.length];

               for(var1 = var5; var1 < var17.length; ++var1) {
                  Long var25 = var17[var1];
                  long var10;
                  if (var25 == null) {
                     var10 = 0L;
                  } else {
                     var10 = var25;
                  }

                  var22[var1] = var10;
               }

               var9 = var12.k(var22);
            } else {
               if (!(var2 instanceof Byte[])) {
                  return null;
               }

               Byte[] var18 = (Byte[])var2;
               byte[] var23 = new byte[var18.length];

               for(var1 = 0; var1 < var18.length; ++var1) {
                  Byte var26 = var18[var1];
                  byte var3;
                  if (var26 == null) {
                     var3 = 0;
                  } else {
                     var3 = var26;
                  }

                  var23[var1] = var3;
               }

               var9 = var12.i(var23);
            }

            if (var9) {
               return var12;
            }
         }
      }

      return null;
   }

   public final .mkw j(int var1) {
      int var2 = this.h().get(var1);
      if (var2 == 0) {
         return null;
      } else {
         int var4 = d(var2);
         boolean var5;
         if (var4 != 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         int var3 = g(var1);
         return new .mkw(n(var1), o(var2), var4, var3, var5);
      }
   }

   public final .mkw k(int var1) {
      return this.l(var1, this.e(var1));
   }

   public final .mkw l(int var1, int var2) {
      if (!.mkw.f(var2)) {
         return null;
      } else {
         .mko var4 = this.bA;
         short var3 = n(var1);
         .mkz var5 = var4.a[var2];
         return var5 == null ? null : var5.b(var3);
      }
   }

   public final OutputStream m(OutputStream var1) {
      return new .mld(new .mkx(new BufferedOutputStream(var1, 65536), this, this.bA));
   }

   public final void p(int var1) {
      int var2 = this.e(var1);
      this.bA.h(n(var1), var2);
   }

   public final void q(byte[] var1) {
      this.r(var1, false);
   }

   public final void r(byte[] var1, boolean var2) {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
      ByteArrayInputStream var4;
      if (var2) {
         var4 = new ByteArrayInputStream(var1);
      } else {
         var4 = null;
      }

      this.z(var3, var4);
   }

   public void readExif(String var1) {
      if (var1 != null) {
         BufferedInputStream var2 = new BufferedInputStream(new FileInputStream(var1));
         this.z(var2, (InputStream)null);
         var2.close();
      } else {
         throw new IllegalArgumentException("Argument is null");
      }
   }

   public final .mhp[] u(int var1) {
      return this.v(var1, this.e(var1));
   }

   public final .mhp[] v(int var1, int var2) {
      .mkw var3 = this.l(var1, var2);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.f;
         return var4 instanceof .mhp[] ? (.mhp[])var4 : null;
      }
   }

   public final void x(int param1, long param2, TimeZone param4) {
      // $FF: Couldn't be decompiled
   }

   public final void y(.mkw var1) {
      this.bA.j(var1);
   }
}
