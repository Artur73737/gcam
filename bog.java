import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import androidx.window.area.reflectionguard.TU.aGGlrXh;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;
import com.google.android.material.search.Ztp.sYWXtqVx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class bog extends AccessibilityNodeProvider {
   final bol a;

   public bog(bol var1) {
      this.a = var1;
   }

   public final void addExtraDataToAccessibilityNodeInfo(int var1, AccessibilityNodeInfo var2, String var3, Bundle var4) {
      var2.getClass();
      var3.getClass();
      this.a.t(var1, var2, var3, var4);
   }

   public final AccessibilityNodeInfo createAccessibilityNodeInfo(int var1) {
      bol var17 = this.a;
      bpe var15 = var17.b.v();
      clw var26;
      if (var15 != null) {
         clx var25 = ((cmc)var15.a).getLifecycle();
         if (var25 != null) {
            var26 = var25.b;
         } else {
            var26 = null;
         }
      } else {
         var26 = null;
      }

      AccessibilityNodeInfo var75;
      if (var26 == clw.a) {
         var75 = null;
      } else {
         cht var18 = cht.b(AccessibilityNodeInfo.obtain());
         bpe var19 = (bpe)var17.s().get(var1);
         if (var19 == null) {
            var75 = null;
         } else {
            Object var16 = var19.b;
            int var6;
            int var7;
            bro var33;
            boa var36;
            if (var1 == -1) {
               ViewParent var29 = cfx.e(var17.b);
               View var31;
               if (var29 instanceof View) {
                  var31 = (View)var29;
               } else {
                  var31 = null;
               }

               var18.b = -1;
               var18.a.setParent(var31);
            } else {
               var33 = (bro)var16;
               if (var33.f() == null) {
                  IllegalStateException var76 = new IllegalStateException(c.aK(var1, "semanticsNode ", sYWXtqVx.EbXQZysHm));
                  throw var76;
               }

               var33 = var33.f();
               var33.getClass();
               var7 = var33.e;
               var6 = var7;
               if (var7 == var17.b.I.L().e) {
                  var6 = -1;
               }

               var36 = var17.b;
               var18.b = var6;
               var18.a.setParent(var36, var6);
            }

            var36 = var17.b;
            var18.c = var1;
            var18.a.setSource(var36, var1);
            Object var38 = var19.a;
            var36 = var17.b;
            Rect var40 = (Rect)var38;
            long var13 = var36.b(es.i((float)var40.left, (float)var40.top));
            long var11 = var17.b.b(es.i((float)var40.right, (float)var40.bottom));
            float var5 = (float)Math.floor((double)bci.b(var13));
            float var4 = (float)Math.floor((double)bci.c(var13));
            float var3 = (float)Math.ceil((double)bci.b(var11));
            float var2 = (float)Math.ceil((double)bci.c(var11));
            Rect var41 = new Rect((int)var5, (int)var4, (int)var3, (int)var2);
            var18.a.setBoundsInScreen(var41);
            var18.l("android.view.View");
            bro var42 = (bro)var16;
            bri var20 = (bri)la.l(var42.c, brp.q);
            String var44;
            if (var20 != null && (var42.d || var42.h().isEmpty())) {
               var6 = var20.a;
               if (c.n(var6, 4)) {
                  var18.u(var17.b.getContext().getResources().getString(2132018520));
               } else if (c.n(var6, 2)) {
                  var18.u(var17.b.getContext().getResources().getString(2132018517));
               } else {
                  if (c.n(var6, 0)) {
                     var44 = "android.widget.Button";
                  } else if (c.n(var6, 1)) {
                     var44 = aGGlrXh.MoToRnHI;
                  } else if (c.n(var6, 3)) {
                     var44 = "android.widget.RadioButton";
                  } else if (c.n(var6, 5)) {
                     var44 = "android.widget.ImageView";
                  } else if (c.n(var6, 6)) {
                     var44 = "android.widget.Spinner";
                  } else {
                     var44 = null;
                  }

                  if (!c.n(var6, 5) || var42.j() || var42.c.b) {
                     var18.l(var44);
                  }
               }
            }

            if (var42.c.d(brk.h)) {
               var18.l("android.widget.EditText");
            }

            if (var42.e().d(brp.s)) {
               var18.l("android.widget.TextView");
            }

            var44 = var17.b.getContext().getPackageName();
            var18.a.setPackageName(var44);
            var18.a.setImportantForAccessibility(true);
            List var57 = var42.h();
            var7 = var57.size();

            int var8;
            for(var6 = 0; var6 < var7; ++var6) {
               bro var21 = (bro)var57.get(var6);
               if (var17.s().containsKey(var21.e)) {
                  byc var22 = (byc)var17.b.d().a.get(var21.b);
                  if (var22 != null) {
                     var18.a.addChild(var22);
                  } else {
                     boa var55 = var17.b;
                     var8 = var21.e;
                     var18.a.addChild(var55, var8);
                  }
               }
            }

            if (var17.i == var1) {
               var18.i(true);
               var18.h(chr.h);
            } else {
               var18.i(false);
               var18.h(chr.g);
            }

            var18.y(var17.n(var42));
            if (var42.c.d(brp.A)) {
               var18.a.setContentInvalid(true);
               CharSequence var58 = (CharSequence)la.l(var42.c, brp.A);
               var18.a.setError(var58);
            }

            var18.x(var17.r(var42));
            var18.j(bol.K(var42));
            brv var60 = (brv)la.l(var42.c, brp.y);
            if (var60 != null) {
               if (var60 == brv.a) {
                  var18.k(true);
               } else if (var60 == brv.b) {
                  var18.k(false);
               }
            }

            Boolean var61 = (Boolean)la.l(var42.c, brp.x);
            boolean var10;
            if (var61 != null) {
               var10 = var61;
               if (var20 != null && c.n(var20.a, 4)) {
                  var18.a.setSelected(var10);
               } else {
                  var18.k(var10);
               }
            }

            if (!var42.c.b || var42.h().isEmpty()) {
               var44 = bom.c(var42);
               var18.a.setContentDescription(var44);
            }

            String var45 = (String)la.l(var42.c, brp.r);
            if (var45 != null) {
               for(Object var62 = var16; var62 != null; var62 = var33.f()) {
                  var33 = (bro)var62;
                  if (var33.c.d(brq.a)) {
                     if ((Boolean)var33.c.a(brq.a)) {
                        var18.a.setViewIdResourceName(var45);
                     }
                     break;
                  }
               }
            }

            if ((qsn)la.l(var42.c, brp.h) != null) {
               var18.q(true);
            }

            var10 = var42.e().d(brp.z);
            var18.a.setPassword(var10);
            var10 = var42.c.d(brk.h);
            var18.a.setEditable(var10);
            var10 = bom.e(var42);
            var18.a.setEnabled(var10);
            var10 = var42.c.d(brp.k);
            var18.a.setFocusable(var10);
            if (var18.B()) {
               var10 = (Boolean)var42.c.a(brp.k);
               var18.a.setFocused(var10);
               if (var18.C()) {
                  var18.g(2);
               } else {
                  var18.g(1);
               }
            }

            var10 = bom.g(var42);
            var18.a.setVisibleToUser(var10);
            if ((brg)la.l(var42.c, brp.j) != null) {
               byte var24;
               if (c.n(0, 0)) {
                  var24 = 1;
               } else if (c.n(0, 1)) {
                  var24 = 2;
               } else {
                  var24 = 1;
               }

               var18.a.setLiveRegion(var24);
            }

            var18.m(false);
            if ((brc)la.l(var42.c, brk.b) != null) {
               var10 = c.E(la.l(var42.c, brp.x), true);
               var18.m(var10 ^ true);
               if (bom.e(var42) && !var10) {
                  var18.h(new chr(16, (CharSequence)null));
               }
            }

            var18.r(false);
            if ((brc)la.l(var42.c, brk.c) != null) {
               var18.r(true);
               if (bom.e(var42)) {
                  var18.h(new chr(32, (CharSequence)null));
               }
            }

            if ((brc)la.l(var42.c, brk.m) != null) {
               var18.h(new chr(16384, (CharSequence)null));
            }

            if (bom.e(var42)) {
               if ((brc)la.l(var42.c, brk.h) != null) {
                  var18.h(new chr(2097152, (CharSequence)null));
               }

               if ((brc)la.l(var42.c, brk.l) != null) {
                  var18.h(new chr(16908372, (CharSequence)null));
               }

               if ((brc)la.l(var42.c, brk.n) != null) {
                  var18.h(new chr(65536, (CharSequence)null));
               }

               if ((brc)la.l(var42.c, brk.o) != null && var18.C()) {
                  ClipDescription var63 = ((ClipboardManager)var17.b.K.a).getPrimaryClipDescription();
                  if (var63 != null && var63.hasMimeType("text/*")) {
                     var18.h(new chr(32768, (CharSequence)null));
                  }
               }
            }

            var44 = bol.O(var42);
            if (var44 != null && var44.length() != 0) {
               var6 = var17.l(var42);
               var7 = var17.k(var42);
               var18.a.setTextSelection(var6, var7);
               brc var64 = (brc)la.l(var42.c, brk.g);
               var18.h(new chr(131072, (CharSequence)null));
               var18.g(256);
               var18.g(512);
               var18.s(11);
               var57 = (List)la.l(var42.c, brp.a);
               if ((var57 == null || var57.isEmpty()) && var42.c.d(brk.a) && (!var42.c.d(brk.h) || c.E(la.l(var42.c, brp.k), true))) {
                  label520: {
                     bmd var65 = c.y(var42.b, bmv.p);
                     if (var65 != null) {
                        brl var66 = var65.t();
                        if (var66 == null || !c.E(la.l(var66, brp.k), true)) {
                           break label520;
                        }
                     }

                     var18.s(var18.a.getMovementGranularities() | 20);
                  }
               }
            }

            ArrayList var67 = new ArrayList();
            var67.add("androidx.compose.ui.semantics.id");
            CharSequence var27 = var18.d();
            if (var27 != null && var27.length() != 0 && var42.c.d(brk.a)) {
               var67.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }

            if (var42.c.d(brp.r)) {
               var67.add("androidx.compose.ui.semantics.testTag");
            }

            bnw var48 = bnw.a;
            AccessibilityNodeInfo var28 = var18.a;
            var28.getClass();
            var48.a(var28, var67);
            brh var68 = (brh)la.l(var42.c, brp.c);
            if (var68 != null) {
               if (var42.c.d(brk.f)) {
                  var18.l("android.widget.SeekBar");
               } else {
                  var18.l("android.widget.ProgressBar");
               }

               if (var68 != brh.a) {
                  RangeInfo var69 = RangeInfo.obtain(1, ((Number)qxo.b()).floatValue(), ((Number)qxo.a()).floatValue(), 0.0F);
                  var18.a.setRangeInfo(var69);
               }

               if (var42.c.d(brk.f) && bom.e(var42)) {
                  if (!(qxb.h(((Number)qxo.a()).floatValue(), ((Number)qxo.b()).floatValue()) <= 0.0F)) {
                     var18.h(chr.m);
                  }

                  if (!(qxb.i(((Number)qxo.b()).floatValue(), ((Number)qxo.a()).floatValue()) >= 0.0F)) {
                     var18.h(chr.n);
                  }
               }
            }

            bod.a(var18, var42);
            bro var30;
            if ((kr)la.l(var42.e(), brp.f) != null) {
               var18.n(dmx.n(1, -1, 0));
            } else {
               ArrayList var50 = new ArrayList();
               if (la.l(var42.e(), brp.e) != null) {
                  var57 = var42.h();
                  var7 = var57.size();

                  for(var6 = 0; var6 < var7; ++var6) {
                     var30 = (bro)var57.get(var6);
                     if (var30.e().d(brp.x)) {
                        var50.add(var30);
                     }
                  }
               }

               if (!var50.isEmpty()) {
                  var10 = kh.i(var50);
                  if (var10) {
                     var6 = 1;
                  } else {
                     var6 = var50.size();
                  }

                  if (var10) {
                     var7 = var50.size();
                  } else {
                     var7 = 1;
                  }

                  var18.n(dmx.n(var6, var7, 0));
               }
            }

            if ((kr)la.l(var42.e(), brp.g) != null) {
               throw null;
            }

            var30 = var42.f();
            if (var30 != null && la.l(var30.e(), brp.e) != null && (kr)la.l(var30.e(), brp.f) == null && var42.e().d(brp.x)) {
               var67 = new ArrayList();
               List var51 = var30.h();
               int var9 = var51.size();
               var7 = 0;

               for(var6 = 0; var7 < var9; var6 = var8) {
                  var30 = (bro)var51.get(var7);
                  var8 = var6;
                  if (var30.e().d(brp.x)) {
                     var67.add(var30);
                     var8 = var6;
                     if (var30.b.j() < var42.b.j()) {
                        var8 = var6 + 1;
                     }
                  }

                  ++var7;
               }

               if (!var67.isEmpty()) {
                  var10 = kh.i(var67);
                  if (!var10) {
                     var7 = var6;
                  } else {
                     var7 = 0;
                  }

                  if (!var10) {
                     var6 = 0;
                  }

                  var18.o(eze.Z(var7, 1, var6, 1, (Boolean)var42.e().b(brp.x, bph.f)));
               }
            }

            brj var53 = (brj)la.l(var42.c, brp.o);
            brc var32 = (brc)la.l(var42.c, brk.d);
            if (var53 != null && var32 != null) {
               if (!kh.j(var42)) {
                  var18.l("android.widget.HorizontalScrollView");
               }

               if (((Number)var53.b.a()).floatValue() > 0.0F) {
                  var18.w(true);
               }

               if (bom.e(var42)) {
                  chr var70;
                  if (bol.I(var53)) {
                     var18.h(chr.m);
                     if (var42.b.j == bxy.b) {
                        var70 = chr.z;
                     } else {
                        var70 = chr.B;
                     }

                     var18.h(var70);
                  }

                  if (bol.H(var53)) {
                     var18.h(chr.n);
                     if (var42.b.j == bxy.b) {
                        var70 = chr.B;
                     } else {
                        var70 = chr.z;
                     }

                     var18.h(var70);
                  }
               }
            }

            brj var71 = (brj)la.l(var42.c, brp.p);
            if (var71 != null && var32 != null) {
               if (!kh.j(var42)) {
                  var18.l("android.widget.ScrollView");
               }

               if (((Number)var71.b.a()).floatValue() > 0.0F) {
                  var18.w(true);
               }

               if (bom.e(var42)) {
                  if (bol.I(var71)) {
                     var18.h(chr.m);
                     var18.h(chr.A);
                  }

                  if (bol.H(var71)) {
                     var18.h(chr.n);
                     var18.h(chr.y);
                  }
               }
            }

            bof.a(var18, var42);
            var18.t((CharSequence)la.l(var42.c, brp.d));
            if (bom.e(var42)) {
               if ((brc)la.l(var42.c, brk.p) != null) {
                  var18.h(new chr(262144, (CharSequence)null));
               }

               if ((brc)la.l(var42.c, brk.q) != null) {
                  var18.h(new chr(524288, (CharSequence)null));
               }

               if ((brc)la.l(var42.c, brk.r) != null) {
                  var18.h(new chr(1048576, (CharSequence)null));
               }

               if (var42.c.d(brk.t)) {
                  List var52 = (List)var42.c.a(brk.t);
                  var7 = var52.size();
                  var6 = bol.a.length;
                  if (var7 >= 32) {
                     throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                  }

                  xp var72 = new xp();
                  LinkedHashMap var54 = new LinkedHashMap();
                  xp var34 = var17.k;
                  if (var34.a) {
                     xq.b(var34);
                  }

                  bre var73;
                  if (c.s(var34.b, var34.d, var1) < 0) {
                     if (var52.size() > 0) {
                        var73 = (bre)var52.get(0);
                        var1 = bol.a[0];
                        throw null;
                     }
                  } else {
                     Map var56 = (Map)xq.a(var17.k, var1);
                     int[] var23 = bol.a;
                     var23.getClass();
                     ArrayList var35 = new ArrayList(32);

                     for(var6 = 0; var6 < 32; ++var6) {
                        var35.add(var23[var6]);
                     }

                     ArrayList var59 = new ArrayList();
                     if (var52.size() > 0) {
                        var73 = (bre)var52.get(0);
                        var56.getClass();
                        throw null;
                     }

                     if (var59.size() > 0) {
                        var73 = (bre)var59.get(0);
                        ((Number)var35.get(0)).intValue();
                        throw null;
                     }
                  }

                  var17.j.d(var1, var72);
                  var17.k.d(var1, var54);
               }
            }

            var18.v(var17.E(var42));
            HashMap var37 = var17.q;
            Integer var74 = var1;
            Integer var39 = (Integer)var37.get(var74);
            if (var39 != null) {
               var39.intValue();
               View var46 = bom.a(var17.b.d(), var39);
               if (var46 != null) {
                  var18.a.setTraversalBefore(var46);
               } else {
                  boa var49 = var17.b;
                  var6 = var39;
                  var18.a.setTraversalBefore(var49, var6);
               }

               var28 = var18.a;
               var28.getClass();
               var17.t(var1, var28, var17.s, (Bundle)null);
            }

            var74 = (Integer)var17.r.get(var74);
            if (var74 != null) {
               var74.intValue();
               View var43 = bom.a(var17.b.d(), var74);
               if (var43 != null) {
                  var18.a.setTraversalAfter(var43);
               } else {
                  boa var47 = var17.b;
                  var6 = var74;
                  var18.a.setTraversalAfter(var47, var6);
               }

               var75 = var18.a;
               var75.getClass();
               var17.t(var1, var75, var17.t, (Bundle)null);
            }

            var75 = var18.a;
         }
      }

      return var75;
   }

   public final boolean performAction(int var1, int var2, Bundle var3) {
      bol var20 = this.a;
      bpe var18 = (bpe)var20.s().get(var1);
      boolean var16 = false;
      if (var18 != null) {
         Object var21 = var18.b;
         byte var6 = -1;
         bro var19 = null;
         var18 = null;
         boolean var11 = true;
         boolean var8;
         brc var24;
         switch(var2) {
         case 64:
            if (var20.F() && !var20.B(var1)) {
               var2 = var20.i;
               if (var2 != Integer.MIN_VALUE) {
                  bol.M(var20, var2, 65536, (Integer)null, 12);
               }

               var20.i = var1;
               var20.b.invalidate();
               bol.M(var20, var1, 32768, (Integer)null, 12);
               var16 = true;
            }
            break;
         case 128:
            if (var20.B(var1)) {
               var20.i = Integer.MIN_VALUE;
               var20.b.invalidate();
               bol.M(var20, var1, 65536, (Integer)null, 12);
               return true;
            }
            break;
         case 256:
         case 512:
            if (var3 != null) {
               if (var2 == 256) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               int var9 = var3.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
               boolean var17 = var3.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
               var19 = (bro)var21;
               var1 = var19.e;
               Integer var25 = var20.m;
               if (var25 == null || var1 != var25) {
                  var20.l = -1;
                  var20.m = var19.e;
               }

               String var54 = bol.O(var19);
               if (var54 != null && var54.length() != 0) {
                  String var22 = bol.O(var19);
                  Object var27;
                  if (var22 != null) {
                     if (var22.length() == 0) {
                        var27 = var18;
                     } else {
                        Locale var31;
                        switch(var9) {
                        case 1:
                           var31 = var20.b.getContext().getResources().getConfiguration().locale;
                           var31.getClass();
                           if (bnq.b == null) {
                              bnq.b = new bnq(var31);
                           }

                           var27 = bnq.b;
                           var27.getClass();
                           ((bnp)var27).a = var22;
                           ((bnq)var27).c.setText(var22);
                           break;
                        case 2:
                           var31 = var20.b.getContext().getResources().getConfiguration().locale;
                           var31.getClass();
                           if (bnv.b == null) {
                              bnv.b = new bnv(var31);
                           }

                           var27 = bnv.b;
                           var27.getClass();
                           ((bnp)var27).a = var22;
                           ((bnv)var27).c.setText(var22);
                           break;
                        case 4:
                        case 16:
                           if (!var19.c.d(brk.a)) {
                              var27 = var18;
                           } else {
                              ArrayList var28 = new ArrayList();
                              if (c.E((Boolean)((qvt)((brc)var19.c.a(brk.a)).a).eo(var28), true)) {
                                 bsq var40 = (bsq)var28.get(0);
                                 if (var9 == 4) {
                                    if (bnr.b == null) {
                                       bnr.b = new bnr();
                                    }

                                    var27 = bnr.b;
                                    var27.getClass();
                                    var40.getClass();
                                    ((bnp)var27).a = var22;
                                    ((bnr)var27).c = var40;
                                 } else {
                                    if (bns.b == null) {
                                       bns.b = new bns();
                                    }

                                    var27 = bns.b;
                                    var27.getClass();
                                    var40.getClass();
                                    ((bnp)var27).a = var22;
                                    ((bns)var27).c = var40;
                                    ((bns)var27).d = var19;
                                 }
                              } else {
                                 var27 = var18;
                              }
                           }
                           break;
                        case 8:
                           if (bnt.b == null) {
                              bnt.b = new bnt();
                           }

                           var27 = bnt.b;
                           var27.getClass();
                           ((bnp)var27).a = var22;
                           break;
                        default:
                           var27 = var18;
                        }
                     }
                  } else {
                     var27 = var18;
                  }

                  if (var27 != null) {
                     var1 = var20.k(var19);
                     if (var1 == -1) {
                        if (var8) {
                           var1 = 0;
                        } else {
                           var1 = var54.length();
                        }
                     }

                     int[] var34;
                     if (var8) {
                        var34 = ((bnu)var27).c(var1);
                     } else {
                        var34 = ((bnu)var27).d(var1);
                     }

                     if (var34 != null) {
                        int var29 = var34[0];
                        var2 = var34[1];
                        int var7;
                        if (var17 && !var19.c.d(brp.a) && var19.c.d(brp.v)) {
                           var7 = var20.l(var19);
                           var1 = var7;
                           if (var7 == -1) {
                              if (!var8) {
                                 var1 = var2;
                              } else {
                                 var1 = var29;
                              }
                           }

                           if (!var8) {
                              var7 = var29;
                           } else {
                              var7 = var2;
                           }
                        } else {
                           if (!var8) {
                              var1 = var29;
                           } else {
                              var1 = var2;
                           }

                           var7 = var1;
                        }

                        short var36;
                        if (!var8) {
                           var36 = 512;
                        } else {
                           var36 = 256;
                        }

                        var20.o = new boh(var19, var36, var9, var29, var2, SystemClock.uptimeMillis());
                        var20.J(var19, var1, var7, true);
                        var16 = true;
                     }
                  }
               }
            }
            break;
         case 16384:
            var24 = (brc)la.l(((bro)var21).c, brk.m);
            if (var24 != null) {
               return (Boolean)((qvi)var24.a).a();
            }
            break;
         case 131072:
            if (var3 != null) {
               var1 = var3.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
            } else {
               var1 = -1;
            }

            if (var3 != null) {
               var2 = var3.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
            } else {
               var2 = var6;
            }

            bro var23 = (bro)var21;
            var16 = var20.J(var23, var1, var2, false);
            if (var16) {
               bol.M(var20, var20.m(var23.e), 0, (Integer)null, 12);
               return var16;
            }
            break;
         default:
            bro var55 = (bro)var21;
            if (bom.e(var55)) {
               float var4;
               float var5;
               long var12;
               String var42;
               brj var48;
               brc var49;
               switch(var2) {
               case 1:
                  var24 = (brc)la.l(var55.c, brk.s);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 2:
                  if (c.E(la.l(var55.c, brp.k), true)) {
                     var20.b.w.b(false);
                     return true;
                  }
                  break;
               case 16:
                  var24 = (brc)la.l(var55.c, brk.b);
                  Boolean var39;
                  if (var24 != null) {
                     var39 = (Boolean)((qvi)var24.a).a();
                  } else {
                     var39 = null;
                  }

                  bol.M(var20, var1, 1, (Integer)null, 12);
                  if (var39 != null) {
                     return var39;
                  }
                  break;
               case 32:
                  var24 = (brc)la.l(var55.c, brk.c);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 4096:
               case 8192:
               case 16908344:
               case 16908345:
               case 16908346:
               case 16908347:
                  boolean var30;
                  if (var2 == 4096) {
                     var30 = true;
                  } else {
                     var30 = false;
                  }

                  boolean var33;
                  if (var2 == 8192) {
                     var33 = true;
                  } else {
                     var33 = false;
                  }

                  if (var2 == 16908345) {
                     var8 = true;
                  } else {
                     var8 = false;
                  }

                  boolean var35;
                  if (var2 == 16908347) {
                     var35 = true;
                  } else {
                     var35 = false;
                  }

                  boolean var10;
                  if (var2 == 16908344) {
                     var10 = true;
                  } else {
                     var10 = false;
                  }

                  boolean var32;
                  if (!var8 && !var35 && !var30) {
                     if (var33) {
                        var32 = true;
                     } else {
                        var32 = false;
                     }
                  } else {
                     var32 = true;
                  }

                  boolean var26;
                  if (!var10 && var2 != 16908346 && !var30) {
                     if (var33) {
                        var26 = var11;
                     } else {
                        var26 = false;
                     }
                  } else {
                     var26 = var11;
                  }

                  if (var30 || var33) {
                     brh var38 = (brh)la.l(var55.c, brp.c);
                     var49 = (brc)la.l(var55.c, brk.f);
                     if (var38 != null && var49 != null) {
                        var5 = (qxb.h(((Number)qxo.a()).floatValue(), ((Number)qxo.b()).floatValue()) - qxb.i(((Number)qxo.b()).floatValue(), ((Number)qxo.a()).floatValue())) / 20.0F;
                        var4 = var5;
                        if (var33) {
                           var4 = -var5;
                        }

                        var16 = (Boolean)((qvt)var49.a).eo(var4 + 0.0F);
                        break;
                     }
                  }

                  var12 = iy.e(var55.b.r()).d();
                  var24 = (brc)la.l(var55.c, brk.d);
                  if (var24 != null) {
                     var48 = (brj)la.l(var55.c, brp.o);
                     if (var48 != null && var32) {
                        label383: {
                           var5 = bcl.c(var12);
                           if (!var8) {
                              var4 = var5;
                              if (!var33) {
                                 break label383;
                              }
                           }

                           var4 = -var5;
                        }

                        var5 = var4;
                        if (var55.b.j == bxy.b) {
                           label426: {
                              if (!var8) {
                                 var5 = var4;
                                 if (!var35) {
                                    break label426;
                                 }
                              }

                              var5 = -var4;
                           }
                        }

                        if (bol.G(var48, var5)) {
                           var16 = (Boolean)((qvx)var24.a).a(var5, 0.0F);
                           break;
                        }
                     }

                     var48 = (brj)la.l(var55.c, brp.p);
                     if (var48 != null && var26) {
                        label367: {
                           var5 = bcl.a(var12);
                           if (!var10) {
                              var4 = var5;
                              if (!var33) {
                                 break label367;
                              }
                           }

                           var4 = -var5;
                        }

                        if (bol.G(var48, var4)) {
                           return (Boolean)((qvx)var24.a).a(0.0F, var4);
                        }
                     }
                  }
                  break;
               case 32768:
                  var24 = (brc)la.l(var55.c, brk.o);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 65536:
                  var24 = (brc)la.l(var55.c, brk.n);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 262144:
                  var24 = (brc)la.l(var55.c, brk.p);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 524288:
                  var24 = (brc)la.l(var55.c, brk.q);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 1048576:
                  var24 = (brc)la.l(var55.c, brk.r);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 2097152:
                  String var37;
                  if (var3 != null) {
                     var37 = var3.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                  } else {
                     var37 = var19;
                  }

                  var49 = (brc)la.l(var55.c, brk.h);
                  if (var49 != null) {
                     qvt var51 = (qvt)var49.a;
                     var42 = var37;
                     if (var37 == null) {
                        var42 = "";
                     }

                     return (Boolean)var51.eo(new bry(var42));
                  }
                  break;
               case 16908342:
                  bro var43 = var55.f();
                  if (var43 != null) {
                     var24 = (brc)la.l(var43.e(), brk.d);
                  } else {
                     var24 = null;
                  }

                  while(var43 != null && var24 == null) {
                     var43 = var43.f();
                     if (var43 != null) {
                        var24 = (brc)la.l(var43.e(), brk.d);
                     } else {
                        var24 = null;
                     }
                  }

                  if (var43 != null) {
                     bcj var47 = iy.e(var43.b.r());
                     bjf var50 = var43.b.r().i();
                     if (var50 != null) {
                        var12 = iy.d(var50);
                     } else {
                        var12 = bci.a;
                     }

                     var47 = var47.g(var12);
                     long var14 = var55.a();
                     bmz var52 = var55.d();
                     if (var52 != null) {
                        var12 = var52.c;
                     } else {
                        var12 = 0L;
                     }

                     bcj var53 = es.h(var14, car.J(var12));
                     brj var56 = (brj)la.l(var43.c, brp.o);
                     var48 = (brj)la.l(var43.c, brp.p);
                     var5 = bol.j(var53.b - var47.b, var53.d - var47.d);
                     var4 = var5;
                     if (var55.b.j == bxy.b) {
                        var4 = -var5;
                     }

                     var5 = bol.j(var53.c - var47.c, var53.e - var47.e);
                     var16 = (Boolean)((qvx)var24.a).a(var4, var5);
                  }
                  break;
               case 16908349:
                  if (var3 != null) {
                     var42 = gKVNpqGY.oZlEDry;
                     if (var3.containsKey(var42)) {
                        brc var46 = (brc)la.l(var55.c, brk.f);
                        if (var46 != null) {
                           return (Boolean)((qvt)var46.a).eo(var3.getFloat(var42));
                        }
                     }
                  }
                  break;
               case 16908358:
                  var24 = (brc)la.l(var55.c, brk.u);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 16908359:
                  var24 = (brc)la.l(var55.c, brk.w);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 16908360:
                  var24 = (brc)la.l(var55.c, brk.v);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 16908361:
                  var24 = (brc)la.l(var55.c, brk.x);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               case 16908372:
                  var24 = (brc)la.l(var55.c, brk.l);
                  if (var24 != null) {
                     return (Boolean)((qvi)var24.a).a();
                  }
                  break;
               default:
                  xp var41 = (xp)xq.a(var20.j, var1);
                  if (var41 != null && (CharSequence)xq.a(var41, var2) != null) {
                     List var44 = (List)la.l(var55.c, brk.t);
                     if (var44 != null && var44.size() > 0) {
                        bre var45 = (bre)var44.get(0);
                        throw null;
                     }
                  }
               }
            }
         }
      }

      return var16;
   }
}
