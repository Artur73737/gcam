import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// $FF: synthetic class
public final class boc implements Runnable {
   public final bol a;

   // $FF: synthetic method
   public boc(bol var1) {
      this.a = var1;
   }

   public final void run() {
      bol var16 = this.a;
      kd.i(var16.b);
      if (var16.D()) {
         var16.R(var16.b.I.L(), var16.y);
      }

      Map var19 = var16.s();
      var19.getClass();
      ArrayList var18 = new ArrayList(var16.x);
      var16.x.clear();
      Iterator var17 = var19.keySet().iterator();

      label343:
      while(true) {
         int var6;
         Integer var12;
         Object var15;
         bbf var20;
         int var23;
         bpe var26;
         Object var27;
         Object var31;
         do {
            if (!var17.hasNext()) {
               xj var69 = new xj();
               Iterator var63 = var16.p.iterator();

               int var25;
               while(var63.hasNext()) {
                  Integer var57 = (Integer)var63.next();
                  var26 = (bpe)var16.s().get(var57);
                  if (var26 != null) {
                     var27 = var26.b;
                  } else {
                     var27 = null;
                  }

                  if (var27 == null || !bom.f((bro)var27)) {
                     var69.add(var57);
                     var57.getClass();
                     var25 = var57;
                     bbf var38 = (bbf)var16.u.get(var57);
                     String var42;
                     if (var38 != null) {
                        var15 = var38.b;
                        bru var40 = brp.d;
                        var42 = (String)la.l((brl)var15, var40);
                     } else {
                        var42 = null;
                     }

                     var16.w(var25, 32, var42);
                  }
               }

               xj var47 = var16.p;
               var23 = var69.c;
               var25 = var47.c;

               for(var25 = 0; var25 < var23; ++var25) {
                  var47.remove(var69.b(var25));
               }

               var25 = var47.c;
               var16.u.clear();
               Iterator var51 = var16.s().entrySet().iterator();

               while(var51.hasNext()) {
                  Entry var59 = (Entry)var51.next();
                  if (bom.f((bro)((bpe)var59.getValue()).b) && var16.p.add(var59.getKey())) {
                     var16.w(((Number)var59.getKey()).intValue(), 16, (String)((bro)((bpe)var59.getValue()).b).c.a(brp.d));
                  }

                  Map var64 = var16.u;
                  var31 = var59.getKey();
                  Object var45 = ((bpe)var59.getValue()).b;
                  Map var60 = var16.s();
                  var64.put(var31, new bbf((bro)var45, var60));
               }

               var16.y = new bbf(var16.b.I.L(), var16.s());
               var16.v = false;
               return;
            }

            var6 = ((Number)var17.next()).intValue();
            Map var13 = var16.u;
            var12 = var6;
            var20 = (bbf)var13.get(var12);
         } while(var20 == null);

         var26 = (bpe)var19.get(var12);
         if (var26 != null) {
            var27 = var26.b;
         } else {
            var27 = null;
         }

         var27.getClass();
         bro var29 = (bro)var27;
         Iterator var21 = var29.c.iterator();
         boolean var1 = false;

         while(true) {
            while(true) {
               Entry var14;
               bru var22;
               bpy var28;
               do {
                  if (!var21.hasNext()) {
                     if (!var1) {
                        Iterator var68 = ((brl)var20.b).iterator();

                        do {
                           if (!var68.hasNext()) {
                              continue label343;
                           }

                           var14 = (Entry)var68.next();
                        } while(var29.e().d((bru)var14.getKey()));
                     }

                     bol.M(var16, var16.m(var6), 2048, 0, 8);
                     continue label343;
                  }

                  var14 = (Entry)var21.next();
                  if (c.E(var14.getKey(), brp.o) || c.E(var14.getKey(), brp.p)) {
                     var28 = bom.b(var18, var6);
                     boolean var2;
                     if (var28 != null) {
                        var2 = false;
                     } else {
                        var28 = new bpy(var6, var16.x);
                        var2 = true;
                     }

                     var16.x.add(var28);
                     if (var2) {
                        break;
                     }
                  }

                  var31 = var14.getValue();
                  var15 = var20.b;
                  var22 = (bru)var14.getKey();
               } while(c.E(var31, la.l((brl)var15, var22)));

               bru var33 = (bru)var14.getKey();
               bru var36;
               bry var44;
               List var52;
               String var53;
               List var56;
               if (c.E(var33, brp.s)) {
                  var31 = var20.b;
                  var36 = brp.s;
                  var56 = (List)la.l((brl)var31, var36);
                  bry var66;
                  if (var56 != null) {
                     var66 = (bry)pwm.aw(var56);
                  } else {
                     var66 = null;
                  }

                  var52 = (List)la.l(var29.c, brp.s);
                  if (var52 != null) {
                     var44 = (bry)pwm.aw(var52);
                  } else {
                     var44 = null;
                  }

                  if (!c.E(var66, var44)) {
                     var23 = var29.e;
                     var53 = String.valueOf(var44);
                     ebt var67 = var16.z;
                     if (var67 != null) {
                        long var9 = (long)var23;
                        var15 = var67.b;
                        AutofillId var65 = (AutofillId)cgm.l((View)var67.a).a;
                        AutofillId var55 = cie.c((ContentCaptureSession)var15, var65, var9);
                        if (var55 == null) {
                           throw new IllegalStateException("Invalid content capture ID");
                        }

                        cie.e((ContentCaptureSession)var67.b, var55, var53);
                     }
                  }
               } else {
                  String var62;
                  if (c.E(var33, brp.d)) {
                     var31 = var14.getValue();
                     var31.getClass();
                     var62 = (String)var31;
                     var15 = var20.b;
                     var36 = brp.d;
                     if (((brl)var15).d(var36)) {
                        var16.w(var6, 8, var62);
                     }
                  } else if (!c.E(var33, brp.b) && !c.E(var33, brp.y)) {
                     if (c.E(var33, brp.c)) {
                        bol.M(var16, var16.m(var6), 2048, 64, 8);
                        bol.M(var16, var16.m(var6), 2048, 0, 8);
                     } else if (c.E(var33, brp.x)) {
                        bri var61 = (bri)la.l(var29.e(), brp.q);
                        if (var61 != null && c.n(var61.a, 4)) {
                           if (c.E(la.l(var29.e(), brp.x), true)) {
                              AccessibilityEvent var48 = var16.o(var16.m(var6), 4);
                              bro var49 = new bro(var29.a, true, var29.b, var29.c);
                              var56 = (List)la.l(var49.e(), brp.a);
                              if (var56 != null) {
                                 var62 = ei.f(var56, ",");
                              } else {
                                 var62 = null;
                              }

                              var52 = (List)la.l(var49.e(), brp.s);
                              if (var52 != null) {
                                 var53 = ei.f(var52, ",");
                              } else {
                                 var53 = null;
                              }

                              if (var62 != null) {
                                 var48.setContentDescription(var62);
                              }

                              if (var53 != null) {
                                 var48.getText().add(var53);
                              }

                              var16.Q(var48);
                           } else {
                              bol.M(var16, var16.m(var6), 2048, 0, 8);
                           }
                        } else {
                           bol.M(var16, var16.m(var6), 2048, 64, 8);
                           bol.M(var16, var16.m(var6), 2048, 0, 8);
                        }
                     } else if (c.E(var33, brp.a)) {
                        var23 = var16.m(var6);
                        var31 = var14.getValue();
                        var31.getClass();
                        var16.P(var23, 2048, 4, (List)var31);
                     } else {
                        boolean var11 = c.E(var33, brp.v);
                        var31 = "";
                        Object var32;
                        bsr var34;
                        if (!var11) {
                           if (c.E(var33, brp.w)) {
                              var44 = bol.L(var29.c);
                              if (var44 != null) {
                                 var31 = var44.a;
                              }

                              var34 = (bsr)var29.c.a(brp.w);
                              var16.Q(var16.p(var16.m(var6), bsr.d(0L), bsr.a(0L), ((String)var31).length(), bol.N((CharSequence)var31)));
                              var16.x(var29.e);
                           } else if (!c.E(var33, brp.o) && !c.E(var33, brp.p)) {
                              if (c.E(var33, brp.k)) {
                                 var31 = var14.getValue();
                                 var31.getClass();
                                 if ((Boolean)var31) {
                                    var16.Q(var16.o(var16.m(var29.e), 8));
                                 }

                                 bol.M(var16, var16.m(var29.e), 2048, 0, 8);
                              } else if (c.E(var33, brk.t)) {
                                 var56 = (List)var29.c.a(brk.t);
                                 var15 = var20.b;
                                 var36 = brk.t;
                                 List var46 = (List)la.l((brl)var15, var36);
                                 if (var46 != null) {
                                    LinkedHashSet var43 = new LinkedHashSet();
                                    bre var30;
                                    if (var56.size() > 0) {
                                       var30 = (bre)var56.get(0);
                                       throw null;
                                    }

                                    LinkedHashSet var58 = new LinkedHashSet();
                                    if (var46.size() > 0) {
                                       var30 = (bre)var46.get(0);
                                       throw null;
                                    }

                                    if (var43.containsAll(var58) && var58.containsAll(var43)) {
                                       var1 = false;
                                    } else {
                                       var1 = true;
                                    }
                                 } else if (var56.isEmpty() ^ true) {
                                    var1 = true;
                                 }
                              } else if (var14.getValue() instanceof brc) {
                                 var31 = var14.getValue();
                                 var31.getClass();
                                 brc var50 = (brc)var31;
                                 var15 = var20.b;
                                 var36 = (bru)var14.getKey();
                                 var32 = la.l((brl)var15, var36);
                                 if (var50 == var32) {
                                    var1 = true;
                                 } else if (!(var32 instanceof brc)) {
                                    var1 = false;
                                 } else {
                                    var50 = (brc)var32;
                                    if (!c.E((Object)null, (Object)null)) {
                                       var1 = false;
                                    } else {
                                       qsa var54 = var50.a;
                                       var1 = true;
                                    }
                                 }

                                 var1 ^= true;
                              } else {
                                 var1 = true;
                              }
                           } else {
                              var16.v(var29.b);
                              var28 = bom.b(var16.x, var6);
                              var28.getClass();
                              var28.d = (brj)la.l(var29.c, brp.o);
                              var28.e = (brj)la.l(var29.c, brp.p);
                              var16.y(var28);
                           }
                        } else if (!var29.c.d(brk.h)) {
                           bol.M(var16, var16.m(var6), 2048, 2, 8);
                        } else {
                           bry var35 = bol.L((brl)var20.b);
                           var32 = var35;
                           if (var35 == null) {
                              var32 = "";
                           }

                           var35 = bol.L(var29.c);
                           if (var35 != null) {
                              var31 = var35;
                           }

                           CharSequence var41 = bol.N((CharSequence)var31);
                           int var8 = ((CharSequence)var32).length();
                           int var7 = ((CharSequence)var31).length();
                           int var4 = qxb.l(var8, var7);
                           int var3 = 0;

                           while(true) {
                              if (var3 >= var4) {
                                 var23 = 0;
                                 break;
                              }

                              if (((CharSequence)var32).charAt(var3) != ((CharSequence)var31).charAt(var3)) {
                                 var23 = 0;
                                 break;
                              }

                              ++var3;
                           }

                           while(var23 < var4 - var3 && ((CharSequence)var32).charAt(var8 - 1 - var23) == ((CharSequence)var31).charAt(var7 - 1 - var23)) {
                              ++var23;
                           }

                           boolean var24;
                           if (((bro)var20.c).c.d(brk.h) && !((bro)var20.c).e().d(brp.z) && var29.e().d(brp.z)) {
                              var24 = true;
                           } else {
                              var24 = false;
                           }

                           boolean var5;
                           if (((bro)var20.c).c.d(brk.h) && ((bro)var20.c).e().d(brp.z) && !var29.e().d(brp.z)) {
                              var5 = true;
                           } else {
                              var5 = false;
                           }

                           AccessibilityEvent var39;
                           if (!var24 && !var5) {
                              var39 = var16.o(var16.m(var6), 16);
                              var39.setFromIndex(var3);
                              var39.setRemovedCount(var8 - var23 - var3);
                              var39.setAddedCount(var7 - var23 - var3);
                              var39.setBeforeText((CharSequence)var32);
                              var39.getText().add(var41);
                           } else {
                              var23 = var16.m(var6);
                              Integer var37 = 0;
                              var39 = var16.p(var23, var37, var37, var7, var41);
                           }

                           var39.setClassName("android.widget.EditText");
                           var16.Q(var39);
                           if (var24 || var5) {
                              var34 = (bsr)var29.c.a(brp.w);
                              var39.setFromIndex(bsr.d(0L));
                              var39.setToIndex(bsr.a(0L));
                              var16.Q(var39);
                           }
                        }
                     }
                  } else {
                     bol.M(var16, var16.m(var6), 2048, 64, 8);
                     bol.M(var16, var16.m(var6), 2048, 0, 8);
                  }
               }
            }
         }
      }
   }
}
