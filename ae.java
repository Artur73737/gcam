import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public final class ae {
   private static final int[] b = new int[]{0, 4, 8};
   private static final SparseIntArray c;
   public final HashMap a = new HashMap();

   static {
      SparseIntArray var0 = new SparseIntArray();
      c = var0;
      int[] var1 = af.a;
      var0.append(85, 25);
      var0.append(86, 26);
      var0.append(88, 29);
      var0.append(89, 30);
      var0.append(95, 36);
      var0.append(94, 35);
      var0.append(67, 4);
      var0.append(66, 3);
      var0.append(62, 1);
      var0.append(103, 6);
      var0.append(104, 7);
      var0.append(74, 17);
      var0.append(75, 18);
      var0.append(76, 19);
      var0.append(0, 27);
      var0.append(90, 32);
      var0.append(91, 33);
      var0.append(73, 10);
      var0.append(72, 9);
      var0.append(108, 13);
      var0.append(111, 16);
      var0.append(109, 14);
      var0.append(106, 11);
      var0.append(110, 15);
      var0.append(107, 12);
      var0.append(98, 40);
      var0.append(83, 39);
      var0.append(82, 41);
      var0.append(97, 42);
      var0.append(81, 20);
      var0.append(96, 37);
      var0.append(71, 5);
      var0.append(84, 60);
      var0.append(93, 60);
      var0.append(87, 60);
      var0.append(65, 60);
      var0.append(61, 60);
      var0.append(5, 24);
      var0.append(7, 28);
      var0.append(25, 31);
      var0.append(26, 8);
      var0.append(6, 34);
      var0.append(8, 2);
      var0.append(3, 23);
      var0.append(4, 21);
      var0.append(2, 22);
      var0.append(15, 43);
      var0.append(28, 44);
      var0.append(23, 45);
      var0.append(24, 46);
      var0.append(20, 47);
      var0.append(21, 48);
      var0.append(16, 49);
      var0.append(17, 50);
      var0.append(18, 51);
      var0.append(19, 52);
      var0.append(27, 53);
      var0.append(99, 54);
      var0.append(77, 55);
      var0.append(100, 56);
      var0.append(78, 57);
      var0.append(101, 58);
      var0.append(79, 59);
      var0.append(1, 38);
   }

   private static int f(TypedArray var0, int var1, int var2) {
      var2 = var0.getResourceId(var1, var2);
      return var2 == -1 ? var0.getInt(var1, -1) : var2;
   }

   private static final String g(int var0) {
      switch(var0) {
      case 3:
         return "top";
      case 4:
         return "bottom";
      case 5:
         return "baseline";
      case 6:
         return "start";
      default:
         return "end";
      }
   }

   // $FF: synthetic method
   private static String h(byte var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("right to ");
      var1.append(g(var0));
      var1.append(" undefined");
      return var1.toString();
   }

   public final void a(ConstraintLayout var1) {
      int var3 = var1.getChildCount();
      HashSet var5 = new HashSet(this.a.keySet());

      Integer var8;
      for(int var2 = 0; var2 < var3; ++var2) {
         View var6 = var1.getChildAt(var2);
         int var4 = var6.getId();
         HashMap var7 = this.a;
         var8 = var4;
         if (var7.containsKey(var8)) {
            var5.remove(var8);
            ad var13 = (ad)this.a.get(var8);
            ac var11 = (ac)var6.getLayoutParams();
            var13.a(var11);
            var6.setLayoutParams(var11);
            var6.setVisibility(var13.G);
            var6.setAlpha(var13.R);
            var6.setRotationX(var13.U);
            var6.setRotationY(var13.V);
            var6.setScaleX(var13.W);
            var6.setScaleY(var13.X);
            var6.setPivotX(var13.Y);
            var6.setPivotY(var13.Z);
            var6.setTranslationX(var13.aa);
            var6.setTranslationY(var13.ab);
            var6.setTranslationZ(var13.ac);
            if (var13.S) {
               var6.setElevation(var13.T);
            }
         }
      }

      Iterator var12 = var5.iterator();

      while(var12.hasNext()) {
         var8 = (Integer)var12.next();
         ad var9 = (ad)this.a.get(var8);
         if (var9.a) {
            Guideline var10 = new Guideline(var1.getContext());
            var10.setId(var8);
            ac var14 = ConstraintLayout.b();
            var9.a(var14);
            var1.addView(var10, var14);
         }
      }

   }

   public final void b(int var1, int var2) {
      HashMap var3 = this.a;
      Integer var4 = var1;
      if (var3.containsKey(var4)) {
         ad var5 = (ad)this.a.get(var4);
         switch(var2) {
         case 3:
            var5.m = -1;
            var5.l = -1;
            var5.C = -1;
            var5.I = -1;
            break;
         case 4:
            var5.n = -1;
            var5.o = -1;
            var5.D = -1;
            var5.K = -1;
            return;
         case 5:
            var5.p = -1;
            return;
         case 6:
            var5.q = -1;
            var5.r = -1;
            var5.F = -1;
            var5.M = -1;
            return;
         default:
            var5.s = -1;
            var5.t = -1;
            var5.E = -1;
            var5.L = -1;
            return;
         }
      }

   }

   public final void c(int var1, int var2, int var3, int var4) {
      HashMap var6 = this.a;
      Integer var7 = var1;
      if (!var6.containsKey(var7)) {
         this.a.put(var7, new ad());
      }

      byte var5 = (byte)var4;
      ad var8 = (ad)this.a.get(var7);
      switch(var2) {
      case 3:
         if (var4 == 3) {
            var8.l = var3;
            var8.m = -1;
            var8.p = -1;
            return;
         } else {
            if (var4 == 4) {
               var8.m = var3;
               var8.l = -1;
               var8.p = -1;
               return;
            }

            throw new IllegalArgumentException(h(var5));
         }
      case 4:
         if (var4 == 4) {
            var8.o = var3;
            var8.n = -1;
            var8.p = -1;
            return;
         } else {
            if (var4 == 3) {
               var8.n = var3;
               var8.o = -1;
               var8.p = -1;
               return;
            }

            throw new IllegalArgumentException(h(var5));
         }
      case 5:
         if (var4 == 5) {
            var8.p = var3;
            var8.o = -1;
            var8.n = -1;
            var8.l = -1;
            var8.m = -1;
            return;
         }

         throw new IllegalArgumentException(h(var5));
      case 6:
         if (var4 == 6) {
            var8.r = var3;
            var8.q = -1;
            return;
         } else {
            if (var4 == 7) {
               var8.q = var3;
               var8.r = -1;
               return;
            }

            throw new IllegalArgumentException(h(var5));
         }
      default:
         if (var4 == 7) {
            var8.t = var3;
            var8.s = -1;
         } else if (var4 == 6) {
            var8.s = var3;
            var8.t = -1;
         } else {
            throw new IllegalArgumentException(h(var5));
         }
      }
   }

   public final void d(int var1, int var2, int var3, int var4, int var5) {
      HashMap var8 = this.a;
      Integer var7 = var1;
      if (!var8.containsKey(var7)) {
         this.a.put(var7, new ad());
      }

      byte var6 = (byte)var4;
      ad var9 = (ad)this.a.get(var7);
      switch(var2) {
      case 3:
         if (var4 == 3) {
            var9.l = var3;
            var9.m = -1;
            var9.p = -1;
         } else {
            if (var4 != 4) {
               throw new IllegalArgumentException(h(var6));
            }

            var9.m = var3;
            var9.l = -1;
            var9.p = -1;
         }

         var9.C = var5;
         return;
      case 4:
         if (var4 == 4) {
            var9.o = var3;
            var9.n = -1;
            var9.p = -1;
         } else {
            if (var4 != 3) {
               throw new IllegalArgumentException(h(var6));
            }

            var9.n = var3;
            var9.o = -1;
            var9.p = -1;
         }

         var9.D = var5;
         return;
      case 5:
         if (var4 == 5) {
            var9.p = var3;
            var9.o = -1;
            var9.n = -1;
            var9.l = -1;
            var9.m = -1;
            return;
         }

         throw new IllegalArgumentException(h(var6));
      case 6:
         if (var4 == 6) {
            var9.r = var3;
            var9.q = -1;
         } else {
            if (var4 != 7) {
               throw new IllegalArgumentException(h(var6));
            }

            var9.q = var3;
            var9.r = -1;
         }

         var9.F = var5;
         return;
      default:
         if (var4 == 7) {
            var9.t = var3;
            var9.s = -1;
         } else {
            if (var4 != 6) {
               throw new IllegalArgumentException(h(var6));
            }

            var9.s = var3;
            var9.t = -1;
         }

         var9.E = var5;
      }
   }

   public final void e(Context var1, int var2) {
      XmlResourceParser var7 = var1.getResources().getXml(var2);

      IOException var10000;
      label473: {
         XmlPullParserException var138;
         label472: {
            boolean var10001;
            try {
               var2 = var7.getEventType();
            } catch (XmlPullParserException var133) {
               var138 = var133;
               var10001 = false;
               break label472;
            } catch (IOException var134) {
               var10000 = var134;
               var10001 = false;
               break label473;
            }

            label469:
            while(true) {
               if (var2 == 1) {
                  return;
               }

               switch(var2) {
               case 0:
                  try {
                     var7.getName();
                  } catch (XmlPullParserException var13) {
                     var138 = var13;
                     var10001 = false;
                     break label469;
                  } catch (IOException var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label473;
                  }
               case 1:
               default:
                  break;
               case 2:
                  int var3;
                  String var6;
                  ad var8;
                  TypedArray var137;
                  try {
                     var6 = var7.getName();
                     AttributeSet var9 = Xml.asAttributeSet(var7);
                     var8 = new ad();
                     var137 = var1.obtainStyledAttributes(var9, af.b);
                     var3 = var137.getIndexCount();
                  } catch (XmlPullParserException var129) {
                     var138 = var129;
                     var10001 = false;
                     break label469;
                  } catch (IOException var130) {
                     var10000 = var130;
                     var10001 = false;
                     break label473;
                  }

                  for(var2 = 0; var2 < var3; ++var2) {
                     int var4;
                     int var5;
                     SparseIntArray var10;
                     try {
                        var4 = var137.getIndex(var2);
                        var10 = c;
                        var5 = var10.get(var4);
                     } catch (XmlPullParserException var127) {
                        var138 = var127;
                        var10001 = false;
                        break label469;
                     } catch (IOException var128) {
                        var10000 = var128;
                        var10001 = false;
                        break label473;
                     }

                     switch(var5) {
                     case 1:
                        try {
                           var8.p = f(var137, var4, var8.p);
                           break;
                        } catch (XmlPullParserException var19) {
                           var138 = var19;
                           var10001 = false;
                           break label469;
                        } catch (IOException var20) {
                           var10000 = var20;
                           var10001 = false;
                           break label473;
                        }
                     case 2:
                        try {
                           var8.D = var137.getDimensionPixelSize(var4, var8.D);
                           break;
                        } catch (XmlPullParserException var21) {
                           var138 = var21;
                           var10001 = false;
                           break label469;
                        } catch (IOException var22) {
                           var10000 = var22;
                           var10001 = false;
                           break label473;
                        }
                     case 3:
                        try {
                           var8.o = f(var137, var4, var8.o);
                           break;
                        } catch (XmlPullParserException var23) {
                           var138 = var23;
                           var10001 = false;
                           break label469;
                        } catch (IOException var24) {
                           var10000 = var24;
                           var10001 = false;
                           break label473;
                        }
                     case 4:
                        try {
                           var8.n = f(var137, var4, var8.n);
                           break;
                        } catch (XmlPullParserException var25) {
                           var138 = var25;
                           var10001 = false;
                           break label469;
                        } catch (IOException var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label473;
                        }
                     case 5:
                        try {
                           var8.w = var137.getString(var4);
                           break;
                        } catch (XmlPullParserException var27) {
                           var138 = var27;
                           var10001 = false;
                           break label469;
                        } catch (IOException var28) {
                           var10000 = var28;
                           var10001 = false;
                           break label473;
                        }
                     case 6:
                        try {
                           var8.x = var137.getDimensionPixelOffset(var4, var8.x);
                           break;
                        } catch (XmlPullParserException var29) {
                           var138 = var29;
                           var10001 = false;
                           break label469;
                        } catch (IOException var30) {
                           var10000 = var30;
                           var10001 = false;
                           break label473;
                        }
                     case 7:
                        try {
                           var8.y = var137.getDimensionPixelOffset(var4, var8.y);
                           break;
                        } catch (XmlPullParserException var31) {
                           var138 = var31;
                           var10001 = false;
                           break label469;
                        } catch (IOException var32) {
                           var10000 = var32;
                           var10001 = false;
                           break label473;
                        }
                     case 8:
                        try {
                           var8.E = var137.getDimensionPixelSize(var4, var8.E);
                           break;
                        } catch (XmlPullParserException var33) {
                           var138 = var33;
                           var10001 = false;
                           break label469;
                        } catch (IOException var34) {
                           var10000 = var34;
                           var10001 = false;
                           break label473;
                        }
                     case 9:
                        try {
                           var8.n = f(var137, var4, var8.t);
                           break;
                        } catch (XmlPullParserException var35) {
                           var138 = var35;
                           var10001 = false;
                           break label469;
                        } catch (IOException var36) {
                           var10000 = var36;
                           var10001 = false;
                           break label473;
                        }
                     case 10:
                        try {
                           var8.s = f(var137, var4, var8.s);
                           break;
                        } catch (XmlPullParserException var37) {
                           var138 = var37;
                           var10001 = false;
                           break label469;
                        } catch (IOException var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label473;
                        }
                     case 11:
                        try {
                           var8.K = var137.getDimensionPixelSize(var4, var8.K);
                           break;
                        } catch (XmlPullParserException var39) {
                           var138 = var39;
                           var10001 = false;
                           break label469;
                        } catch (IOException var40) {
                           var10000 = var40;
                           var10001 = false;
                           break label473;
                        }
                     case 12:
                        try {
                           var8.L = var137.getDimensionPixelSize(var4, var8.L);
                           break;
                        } catch (XmlPullParserException var41) {
                           var138 = var41;
                           var10001 = false;
                           break label469;
                        } catch (IOException var42) {
                           var10000 = var42;
                           var10001 = false;
                           break label473;
                        }
                     case 13:
                        try {
                           var8.H = var137.getDimensionPixelSize(var4, var8.H);
                           break;
                        } catch (XmlPullParserException var43) {
                           var138 = var43;
                           var10001 = false;
                           break label469;
                        } catch (IOException var44) {
                           var10000 = var44;
                           var10001 = false;
                           break label473;
                        }
                     case 14:
                        try {
                           var8.J = var137.getDimensionPixelSize(var4, var8.J);
                           break;
                        } catch (XmlPullParserException var45) {
                           var138 = var45;
                           var10001 = false;
                           break label469;
                        } catch (IOException var46) {
                           var10000 = var46;
                           var10001 = false;
                           break label473;
                        }
                     case 15:
                        try {
                           var8.M = var137.getDimensionPixelSize(var4, var8.M);
                           break;
                        } catch (XmlPullParserException var47) {
                           var138 = var47;
                           var10001 = false;
                           break label469;
                        } catch (IOException var48) {
                           var10000 = var48;
                           var10001 = false;
                           break label473;
                        }
                     case 16:
                        try {
                           var8.I = var137.getDimensionPixelSize(var4, var8.I);
                           break;
                        } catch (XmlPullParserException var49) {
                           var138 = var49;
                           var10001 = false;
                           break label469;
                        } catch (IOException var50) {
                           var10000 = var50;
                           var10001 = false;
                           break label473;
                        }
                     case 17:
                        try {
                           var8.e = var137.getDimensionPixelOffset(var4, var8.e);
                           break;
                        } catch (XmlPullParserException var51) {
                           var138 = var51;
                           var10001 = false;
                           break label469;
                        } catch (IOException var52) {
                           var10000 = var52;
                           var10001 = false;
                           break label473;
                        }
                     case 18:
                        try {
                           var8.f = var137.getDimensionPixelOffset(var4, var8.f);
                           break;
                        } catch (XmlPullParserException var53) {
                           var138 = var53;
                           var10001 = false;
                           break label469;
                        } catch (IOException var54) {
                           var10000 = var54;
                           var10001 = false;
                           break label473;
                        }
                     case 19:
                        try {
                           var8.g = var137.getFloat(var4, var8.g);
                           break;
                        } catch (XmlPullParserException var55) {
                           var138 = var55;
                           var10001 = false;
                           break label469;
                        } catch (IOException var56) {
                           var10000 = var56;
                           var10001 = false;
                           break label473;
                        }
                     case 20:
                        try {
                           var8.u = var137.getFloat(var4, var8.u);
                           break;
                        } catch (XmlPullParserException var57) {
                           var138 = var57;
                           var10001 = false;
                           break label469;
                        } catch (IOException var58) {
                           var10000 = var58;
                           var10001 = false;
                           break label473;
                        }
                     case 21:
                        try {
                           var8.c = var137.getLayoutDimension(var4, var8.c);
                           break;
                        } catch (XmlPullParserException var59) {
                           var138 = var59;
                           var10001 = false;
                           break label469;
                        } catch (IOException var60) {
                           var10000 = var60;
                           var10001 = false;
                           break label473;
                        }
                     case 22:
                        try {
                           var4 = var137.getInt(var4, var8.G);
                           var8.G = var4;
                           var8.G = b[var4];
                           break;
                        } catch (XmlPullParserException var61) {
                           var138 = var61;
                           var10001 = false;
                           break label469;
                        } catch (IOException var62) {
                           var10000 = var62;
                           var10001 = false;
                           break label473;
                        }
                     case 23:
                        try {
                           var8.b = var137.getLayoutDimension(var4, var8.b);
                           break;
                        } catch (XmlPullParserException var63) {
                           var138 = var63;
                           var10001 = false;
                           break label469;
                        } catch (IOException var64) {
                           var10000 = var64;
                           var10001 = false;
                           break label473;
                        }
                     case 24:
                        try {
                           var8.A = var137.getDimensionPixelSize(var4, var8.A);
                           break;
                        } catch (XmlPullParserException var65) {
                           var138 = var65;
                           var10001 = false;
                           break label469;
                        } catch (IOException var66) {
                           var10000 = var66;
                           var10001 = false;
                           break label473;
                        }
                     case 25:
                        try {
                           var8.h = f(var137, var4, var8.h);
                           break;
                        } catch (XmlPullParserException var67) {
                           var138 = var67;
                           var10001 = false;
                           break label469;
                        } catch (IOException var68) {
                           var10000 = var68;
                           var10001 = false;
                           break label473;
                        }
                     case 26:
                        try {
                           var8.i = f(var137, var4, var8.i);
                           break;
                        } catch (XmlPullParserException var69) {
                           var138 = var69;
                           var10001 = false;
                           break label469;
                        } catch (IOException var70) {
                           var10000 = var70;
                           var10001 = false;
                           break label473;
                        }
                     case 27:
                        try {
                           var8.z = var137.getInt(var4, var8.z);
                           break;
                        } catch (XmlPullParserException var71) {
                           var138 = var71;
                           var10001 = false;
                           break label469;
                        } catch (IOException var72) {
                           var10000 = var72;
                           var10001 = false;
                           break label473;
                        }
                     case 28:
                        try {
                           var8.B = var137.getDimensionPixelSize(var4, var8.B);
                           break;
                        } catch (XmlPullParserException var73) {
                           var138 = var73;
                           var10001 = false;
                           break label469;
                        } catch (IOException var74) {
                           var10000 = var74;
                           var10001 = false;
                           break label473;
                        }
                     case 29:
                        try {
                           var8.j = f(var137, var4, var8.j);
                           break;
                        } catch (XmlPullParserException var75) {
                           var138 = var75;
                           var10001 = false;
                           break label469;
                        } catch (IOException var76) {
                           var10000 = var76;
                           var10001 = false;
                           break label473;
                        }
                     case 30:
                        try {
                           var8.k = f(var137, var4, var8.k);
                           break;
                        } catch (XmlPullParserException var77) {
                           var138 = var77;
                           var10001 = false;
                           break label469;
                        } catch (IOException var78) {
                           var10000 = var78;
                           var10001 = false;
                           break label473;
                        }
                     case 31:
                        try {
                           var8.F = var137.getDimensionPixelSize(var4, var8.F);
                           break;
                        } catch (XmlPullParserException var79) {
                           var138 = var79;
                           var10001 = false;
                           break label469;
                        } catch (IOException var80) {
                           var10000 = var80;
                           var10001 = false;
                           break label473;
                        }
                     case 32:
                        try {
                           var8.q = f(var137, var4, var8.q);
                           break;
                        } catch (XmlPullParserException var81) {
                           var138 = var81;
                           var10001 = false;
                           break label469;
                        } catch (IOException var82) {
                           var10000 = var82;
                           var10001 = false;
                           break label473;
                        }
                     case 33:
                        try {
                           var8.r = f(var137, var4, var8.r);
                           break;
                        } catch (XmlPullParserException var83) {
                           var138 = var83;
                           var10001 = false;
                           break label469;
                        } catch (IOException var84) {
                           var10000 = var84;
                           var10001 = false;
                           break label473;
                        }
                     case 34:
                        try {
                           var8.C = var137.getDimensionPixelSize(var4, var8.C);
                           break;
                        } catch (XmlPullParserException var85) {
                           var138 = var85;
                           var10001 = false;
                           break label469;
                        } catch (IOException var86) {
                           var10000 = var86;
                           var10001 = false;
                           break label473;
                        }
                     case 35:
                        try {
                           var8.m = f(var137, var4, var8.m);
                           break;
                        } catch (XmlPullParserException var87) {
                           var138 = var87;
                           var10001 = false;
                           break label469;
                        } catch (IOException var88) {
                           var10000 = var88;
                           var10001 = false;
                           break label473;
                        }
                     case 36:
                        try {
                           var8.l = f(var137, var4, var8.l);
                           break;
                        } catch (XmlPullParserException var89) {
                           var138 = var89;
                           var10001 = false;
                           break label469;
                        } catch (IOException var90) {
                           var10000 = var90;
                           var10001 = false;
                           break label473;
                        }
                     case 37:
                        try {
                           var8.v = var137.getFloat(var4, var8.v);
                           break;
                        } catch (XmlPullParserException var91) {
                           var138 = var91;
                           var10001 = false;
                           break label469;
                        } catch (IOException var92) {
                           var10000 = var92;
                           var10001 = false;
                           break label473;
                        }
                     case 38:
                        try {
                           var8.d = var137.getResourceId(var4, var8.d);
                           break;
                        } catch (XmlPullParserException var93) {
                           var138 = var93;
                           var10001 = false;
                           break label469;
                        } catch (IOException var94) {
                           var10000 = var94;
                           var10001 = false;
                           break label473;
                        }
                     case 39:
                        try {
                           var8.O = var137.getFloat(var4, var8.O);
                           break;
                        } catch (XmlPullParserException var95) {
                           var138 = var95;
                           var10001 = false;
                           break label469;
                        } catch (IOException var96) {
                           var10000 = var96;
                           var10001 = false;
                           break label473;
                        }
                     case 40:
                        try {
                           var8.N = var137.getFloat(var4, var8.N);
                           break;
                        } catch (XmlPullParserException var97) {
                           var138 = var97;
                           var10001 = false;
                           break label469;
                        } catch (IOException var98) {
                           var10000 = var98;
                           var10001 = false;
                           break label473;
                        }
                     case 41:
                        try {
                           var8.P = var137.getInt(var4, var8.P);
                           break;
                        } catch (XmlPullParserException var99) {
                           var138 = var99;
                           var10001 = false;
                           break label469;
                        } catch (IOException var100) {
                           var10000 = var100;
                           var10001 = false;
                           break label473;
                        }
                     case 42:
                        try {
                           var8.Q = var137.getInt(var4, var8.Q);
                           break;
                        } catch (XmlPullParserException var101) {
                           var138 = var101;
                           var10001 = false;
                           break label469;
                        } catch (IOException var102) {
                           var10000 = var102;
                           var10001 = false;
                           break label473;
                        }
                     case 43:
                        try {
                           var8.R = var137.getFloat(var4, var8.R);
                           break;
                        } catch (XmlPullParserException var103) {
                           var138 = var103;
                           var10001 = false;
                           break label469;
                        } catch (IOException var104) {
                           var10000 = var104;
                           var10001 = false;
                           break label473;
                        }
                     case 44:
                        try {
                           var8.S = true;
                           var8.T = var137.getFloat(var4, var8.T);
                           break;
                        } catch (XmlPullParserException var105) {
                           var138 = var105;
                           var10001 = false;
                           break label469;
                        } catch (IOException var106) {
                           var10000 = var106;
                           var10001 = false;
                           break label473;
                        }
                     case 45:
                        try {
                           var8.U = var137.getFloat(var4, var8.U);
                           break;
                        } catch (XmlPullParserException var107) {
                           var138 = var107;
                           var10001 = false;
                           break label469;
                        } catch (IOException var108) {
                           var10000 = var108;
                           var10001 = false;
                           break label473;
                        }
                     case 46:
                        try {
                           var8.V = var137.getFloat(var4, var8.V);
                           break;
                        } catch (XmlPullParserException var109) {
                           var138 = var109;
                           var10001 = false;
                           break label469;
                        } catch (IOException var110) {
                           var10000 = var110;
                           var10001 = false;
                           break label473;
                        }
                     case 47:
                        try {
                           var8.W = var137.getFloat(var4, var8.W);
                           break;
                        } catch (XmlPullParserException var111) {
                           var138 = var111;
                           var10001 = false;
                           break label469;
                        } catch (IOException var112) {
                           var10000 = var112;
                           var10001 = false;
                           break label473;
                        }
                     case 48:
                        try {
                           var8.X = var137.getFloat(var4, var8.X);
                           break;
                        } catch (XmlPullParserException var113) {
                           var138 = var113;
                           var10001 = false;
                           break label469;
                        } catch (IOException var114) {
                           var10000 = var114;
                           var10001 = false;
                           break label473;
                        }
                     case 49:
                        try {
                           var8.Y = var137.getFloat(var4, var8.Y);
                           break;
                        } catch (XmlPullParserException var115) {
                           var138 = var115;
                           var10001 = false;
                           break label469;
                        } catch (IOException var116) {
                           var10000 = var116;
                           var10001 = false;
                           break label473;
                        }
                     case 50:
                        try {
                           var8.Z = var137.getFloat(var4, var8.Z);
                           break;
                        } catch (XmlPullParserException var117) {
                           var138 = var117;
                           var10001 = false;
                           break label469;
                        } catch (IOException var118) {
                           var10000 = var118;
                           var10001 = false;
                           break label473;
                        }
                     case 51:
                        try {
                           var8.aa = var137.getFloat(var4, var8.aa);
                           break;
                        } catch (XmlPullParserException var119) {
                           var138 = var119;
                           var10001 = false;
                           break label469;
                        } catch (IOException var120) {
                           var10000 = var120;
                           var10001 = false;
                           break label473;
                        }
                     case 52:
                        try {
                           var8.ab = var137.getFloat(var4, var8.ab);
                           break;
                        } catch (XmlPullParserException var121) {
                           var138 = var121;
                           var10001 = false;
                           break label469;
                        } catch (IOException var122) {
                           var10000 = var122;
                           var10001 = false;
                           break label473;
                        }
                     case 53:
                        try {
                           var8.ac = var137.getFloat(var4, var8.ac);
                           break;
                        } catch (XmlPullParserException var123) {
                           var138 = var123;
                           var10001 = false;
                           break label469;
                        } catch (IOException var124) {
                           var10000 = var124;
                           var10001 = false;
                           break label473;
                        }
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                     case 58:
                     case 59:
                     default:
                        try {
                           Log.w("ConstraintSet", c.aD(var4, "Unknown attribute 0x", var10));
                           break;
                        } catch (XmlPullParserException var17) {
                           var138 = var17;
                           var10001 = false;
                           break label469;
                        } catch (IOException var18) {
                           var10000 = var18;
                           var10001 = false;
                           break label473;
                        }
                     case 60:
                        try {
                           Log.w("ConstraintSet", c.aD(var4, "unused attribute 0x", var10));
                        } catch (XmlPullParserException var125) {
                           var138 = var125;
                           var10001 = false;
                           break label469;
                        } catch (IOException var126) {
                           var10000 = var126;
                           var10001 = false;
                           break label473;
                        }
                     }
                  }

                  try {
                     var137.recycle();
                     if (var6.equalsIgnoreCase("Guideline")) {
                        var8.a = true;
                     }
                  } catch (XmlPullParserException var131) {
                     var138 = var131;
                     var10001 = false;
                     break label469;
                  } catch (IOException var132) {
                     var10000 = var132;
                     var10001 = false;
                     break label473;
                  }

                  try {
                     this.a.put(var8.d, var8);
                  } catch (XmlPullParserException var15) {
                     var138 = var15;
                     var10001 = false;
                     break label469;
                  } catch (IOException var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label473;
                  }
               }

               try {
                  var2 = var7.next();
               } catch (XmlPullParserException var11) {
                  var138 = var11;
                  var10001 = false;
                  break;
               } catch (IOException var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label473;
               }
            }
         }

         XmlPullParserException var136 = var138;
         var136.printStackTrace();
         return;
      }

      IOException var135 = var10000;
      var135.printStackTrace();
   }
}
