import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class asw implements auh, ass {
   public final AtomicReference a;
   public final Object b;
   public final HashSet c;
   public final aut d;
   public asw e;
   public int f;
   public final asq g;
   public boolean h;
   public final bco i;
   public final bco j;
   public dhq k;
   private final ast l;
   private final asf m;
   private final HashSet n;
   private boolean o;
   private qvx p;
   private final bco q;
   private final dmx r;
   private final dmx s;

   public asw(ast var1, asf var2) {
      this.l = var1;
      this.m = var2;
      this.a = new AtomicReference((Object)null);
      this.b = new Object();
      HashSet var6 = new HashSet();
      this.c = var6;
      aut var3 = new aut();
      this.d = var3;
      this.i = new bco((byte[])null);
      this.n = new HashSet();
      this.j = new bco((byte[])null);
      dmx var4 = new dmx((byte[])null, (byte[])null, (char[])null);
      this.r = var4;
      dmx var5 = new dmx((byte[])null, (byte[])null, (char[])null);
      this.s = var5;
      this.q = new bco((byte[])null);
      this.k = new dhq((byte[])null, (byte[])null);
      asq var8 = new asq(var2, var1, var3, var6, var4, var5, this);
      var1.g(var8);
      this.g = var8;
      qvx var7 = ash.a;
      this.p = ash.a;
   }

   private final HashSet n(HashSet var1, Object var2, boolean var3) {
      bco var7 = this.i;
      int var4 = var7.s(var2);
      HashSet var6 = var1;
      if (var4 >= 0) {
         axb var9 = var7.t(var4);
         Object[] var11 = var9.b;
         int var5 = var9.a;
         var4 = 0;

         while(true) {
            var6 = var1;
            if (var4 >= var5) {
               break;
            }

            Object var10 = var11[var4];
            var10.getClass();
            aug var8 = (aug)var10;
            var6 = var1;
            if (!this.q.x(var2, var8)) {
               var6 = var1;
               if (var8.l(var2) != 1) {
                  if (var8.k() && !var3) {
                     this.n.add(var8);
                     var6 = var1;
                  } else {
                     var6 = var1;
                     if (var1 == null) {
                        var6 = new HashSet();
                     }

                     var6.add(var8);
                  }
               }
            }

            ++var4;
            var1 = var6;
         }
      }

      return var6;
   }

   private final void o(Set var1, boolean var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      HashSet var11;
      bco var13;
      Object var14;
      axb var20;
      HashSet var21;
      Object var22;
      Object[] var26;
      if (var1 instanceof axb) {
         var20 = (axb)var1;
         Object[] var12 = var20.b;
         var5 = var20.a;
         var21 = null;
         var3 = 0;

         while(true) {
            var11 = var21;
            if (var3 >= var5) {
               break;
            }

            var14 = var12[var3];
            var14.getClass();
            if (var14 instanceof aug) {
               ((aug)var14).l((Object)null);
            } else {
               var11 = this.n(var21, var14, var2);
               var13 = this.j;
               var4 = var13.s(var14);
               var21 = var11;
               if (var4 >= 0) {
                  var20 = var13.t(var4);
                  var26 = var20.b;
                  var6 = var20.a;
                  var4 = 0;

                  while(true) {
                     var21 = var11;
                     if (var4 >= var6) {
                        break;
                     }

                     var22 = var26[var4];
                     var22.getClass();
                     var11 = this.n(var11, (ate)var22, var2);
                     ++var4;
                  }
               }
            }

            ++var3;
         }
      } else {
         Iterator var24 = var1.iterator();
         var21 = null;

         label156:
         while(true) {
            while(true) {
               var11 = var21;
               if (!var24.hasNext()) {
                  break label156;
               }

               var14 = var24.next();
               if (var14 instanceof aug) {
                  ((aug)var14).l((Object)null);
               } else {
                  var11 = this.n(var21, var14, var2);
                  var13 = this.j;
                  var3 = var13.s(var14);
                  var21 = var11;
                  if (var3 >= 0) {
                     var20 = var13.t(var3);
                     var26 = var20.b;
                     var4 = var20.a;
                     var3 = 0;

                     while(true) {
                        var21 = var11;
                        if (var3 >= var4) {
                           break;
                        }

                        var22 = var26[var3];
                        var22.getClass();
                        var11 = this.n(var11, (ate)var22, var2);
                        ++var3;
                     }
                  }
               }
            }
         }
      }

      int var7;
      int var8;
      int var9;
      int var10;
      Object var25;
      if (var2 && !this.n.isEmpty()) {
         var13 = this.i;
         var14 = var13.b;
         var22 = var13.c;
         var25 = var13.d;
         var4 = var13.a;
         var6 = 0;

         for(var3 = 0; var6 < var4; var3 = var7) {
            int[] var31 = (int[])var14;
            var9 = var31[var6];
            axb var30 = ((axb[])var22)[var9];
            var30.getClass();
            Object[] var29 = var30.b;
            var10 = var30.a;
            var5 = 0;

            for(var7 = 0; var7 < var10; var5 = var8) {
               Object var19 = var29[var7];
               var19.getClass();
               aug var32 = (aug)var19;
               var8 = var5;
               if (!this.n.contains(var32)) {
                  label189: {
                     if (var11 != null) {
                        var8 = var5;
                        if (var11.contains(var32)) {
                           break label189;
                        }
                     }

                     if (var5 != var7) {
                        var29[var5] = var19;
                     }

                     var8 = var5 + 1;
                  }
               }

               ++var7;
            }

            for(var7 = var5; var7 < var10; ++var7) {
               var29[var7] = null;
            }

            var30.a = var5;
            var7 = var3;
            if (var5 > 0) {
               if (var3 != var6) {
                  var5 = var31[var3];
                  var31[var3] = var9;
                  var31[var6] = var5;
               }

               var7 = var3 + 1;
            }

            ++var6;
         }

         var5 = var13.a;

         for(var4 = var3; var4 < var5; ++var4) {
            var6 = ((int[])var14)[var4];
            ((Object[])var25)[var6] = null;
         }

         var13.a = var3;
         this.n.clear();
         this.p();
      } else {
         if (var11 != null) {
            bco var15 = this.i;
            Object var18 = var15.b;
            var25 = var15.c;
            Object var16 = var15.d;
            var8 = var15.a;
            var5 = 0;

            for(var3 = 0; var5 < var8; var3 = var6) {
               int[] var23 = (int[])var18;
               var9 = var23[var5];
               axb var28 = ((axb[])var25)[var9];
               var28.getClass();
               Object[] var17 = var28.b;
               var10 = var28.a;
               var6 = 0;

               for(var4 = 0; var6 < var10; var4 = var7) {
                  Object var27 = var17[var6];
                  var27.getClass();
                  var7 = var4;
                  if (!var11.contains((aug)var27)) {
                     if (var4 != var6) {
                        var17[var4] = var27;
                     }

                     var7 = var4 + 1;
                  }

                  ++var6;
               }

               for(var6 = var4; var6 < var10; ++var6) {
                  var17[var6] = null;
               }

               var28.a = var4;
               var6 = var3;
               if (var4 > 0) {
                  if (var3 != var5) {
                     var4 = var23[var3];
                     var23[var3] = var9;
                     var23[var5] = var4;
                  }

                  var6 = var3 + 1;
               }

               ++var5;
            }

            var5 = var15.a;

            for(var4 = var3; var4 < var5; ++var4) {
               var6 = ((int[])var18)[var4];
               ((Object[])var16)[var6] = null;
            }

            var15.a = var3;
            this.p();
         }

      }
   }

   private final void p() {
      bco var11 = this.j;
      Object var12 = var11.b;
      Object var9 = var11.c;
      Object var10 = var11.d;
      int var6 = var11.a;
      int var3 = 0;

      int var1;
      int var2;
      int var4;
      for(var1 = 0; var3 < var6; var1 = var4) {
         int[] var13 = (int[])var12;
         int var7 = var13[var3];
         axb var14 = ((axb[])var9)[var7];
         var14.getClass();
         Object[] var15 = var14.b;
         int var8 = var14.a;
         var2 = 0;

         int var5;
         for(var4 = 0; var4 < var8; var2 = var5) {
            Object var17 = var15[var4];
            var17.getClass();
            ate var16 = (ate)var17;
            var5 = var2;
            if (this.i.w(var16)) {
               if (var2 != var4) {
                  var15[var2] = var17;
               }

               var5 = var2 + 1;
            }

            ++var4;
         }

         for(var4 = var2; var4 < var8; ++var4) {
            var15[var4] = null;
         }

         var14.a = var2;
         var4 = var1;
         if (var2 > 0) {
            if (var1 != var3) {
               var2 = var13[var1];
               var13[var1] = var7;
               var13[var3] = var2;
            }

            var4 = var1 + 1;
         }

         ++var3;
      }

      var3 = var11.a;

      for(var2 = var1; var2 < var3; ++var2) {
         var4 = ((int[])var12)[var2];
         ((Object[])var10)[var4] = null;
      }

      var11.a = var1;
      if (!this.n.isEmpty()) {
         Iterator var18 = this.n.iterator();
         var18.getClass();

         while(var18.hasNext()) {
            if (((aug)var18.next()).k() ^ true) {
               var18.remove();
            }
         }
      }

   }

   private final void q(Object var1) {
      bco var4 = this.i;
      int var2 = var4.s(var1);
      if (var2 >= 0) {
         axb var5 = var4.t(var2);
         Object[] var6 = var5.b;
         int var3 = var5.a;

         for(var2 = 0; var2 < var3; ++var2) {
            Object var7 = var6[var2];
            var7.getClass();
            aug var8 = (aug)var7;
            if (var8.l(var1) == 4) {
               this.q.y(var1, var8);
            }
         }
      }

   }

   private final boolean r(aug var1, Object var2) {
      return this.j() && this.g.Z(var1, var2);
   }

   private final int s(aug var1, nxj var2, Object var3) {
      Object var9 = this.b;
      synchronized(var9){}

      Throwable var10000;
      label1040: {
         asw var8;
         boolean var10001;
         try {
            var8 = this.e;
         } catch (Throwable var101) {
            var10000 = var101;
            var10001 = false;
            break label1040;
         }

         qsc var102;
         label1032: {
            label1044: {
               if (var8 != null) {
                  label1028: {
                     label1027: {
                        int var4;
                        int var5;
                        int var6;
                        try {
                           aut var10 = this.d;
                           var4 = this.f;
                           if (var10.f) {
                              break label1044;
                           }

                           if (var4 >= var10.b) {
                              break label1032;
                           }

                           if (!var10.e(var2)) {
                              break label1027;
                           }

                           var5 = pu.f(var10.a, var4);
                           var6 = var2.a;
                        } catch (Throwable var100) {
                           var10000 = var100;
                           var10001 = false;
                           break label1040;
                        }

                        if (var4 <= var6) {
                           if (var6 >= var5 + var4) {
                              var8 = null;
                           }
                           break label1028;
                        }
                     }

                     var8 = null;
                  }
               } else {
                  var8 = null;
               }

               if (var8 == null) {
                  boolean var7;
                  try {
                     var7 = this.r(var1, var3);
                  } catch (Throwable var98) {
                     var10000 = var98;
                     var10001 = false;
                     break label1040;
                  }

                  if (var7) {
                     return 4;
                  }

                  if (var3 == null) {
                     try {
                        this.k.h(var1, (Object)null);
                     } catch (Throwable var97) {
                        var10000 = var97;
                        var10001 = false;
                        break label1040;
                     }
                  } else {
                     label1008: {
                        dhq var104;
                        label1007: {
                           axb var105;
                           try {
                              var104 = this.k;
                              if (var104.f(var1) < 0) {
                                 break label1007;
                              }

                              var105 = (axb)var104.g(var1);
                           } catch (Throwable var99) {
                              var10000 = var99;
                              var10001 = false;
                              break label1040;
                           }

                           if (var105 != null) {
                              try {
                                 var105.add(var3);
                              } catch (Throwable var96) {
                                 var10000 = var96;
                                 var10001 = false;
                                 break label1040;
                              }
                           }
                           break label1008;
                        }

                        try {
                           axb var11 = new axb();
                           var11.add(var3);
                           var104.h(var1, var11);
                        } catch (Throwable var95) {
                           var10000 = var95;
                           var10001 = false;
                           break label1040;
                        }
                     }
                  }
               }

               if (var8 != null) {
                  return var8.s(var1, var2, var3);
               }

               this.l.l(this);
               if (this.j()) {
                  return 3;
               }

               return 2;
            }

            try {
               asr.k("Writer is active");
               var102 = new qsc();
               throw var102;
            } catch (Throwable var94) {
               var10000 = var94;
               var10001 = false;
               break label1040;
            }
         }

         label992:
         try {
            asr.k("Invalid group index");
            var102 = new qsc();
            throw var102;
         } catch (Throwable var93) {
            var10000 = var93;
            var10001 = false;
            break label992;
         }
      }

      Throwable var103 = var10000;
      throw var103;
   }

   private final void t(dmx var1) {
      asv var11 = new asv(this.c);

      label6336: {
         Throwable var10000;
         Throwable var664;
         label6337: {
            boolean var10;
            boolean var10001;
            try {
               var10 = var1.k();
            } catch (Throwable var663) {
               var10000 = var663;
               var10001 = false;
               break label6337;
            }

            if (var10) {
               if (!this.s.k()) {
                  return;
               }
               break label6336;
            }

            try {
               Trace.beginSection("Compose:applyChanges");
            } catch (Throwable var662) {
               var10000 = var662;
               var10001 = false;
               break label6337;
            }

            label6338: {
               label6320: {
                  auw var12;
                  try {
                     var12 = this.d.b();
                  } catch (Throwable var661) {
                     var10000 = var661;
                     var10001 = false;
                     break label6320;
                  }

                  try {
                     var1.m(this.m, var12, var11);
                     break label6338;
                  } finally {
                     label6215:
                     try {
                        var12.s();
                     } catch (Throwable var641) {
                        var10000 = var641;
                        var10001 = false;
                        break label6215;
                     }
                  }
               }

               var664 = var10000;

               try {
                  Trace.endSection();
                  throw var664;
               } catch (Throwable var640) {
                  var10000 = var640;
                  var10001 = false;
                  break label6337;
               }
            }

            this.m.e();

            int var2;
            int var3;
            label6339: {
               try {
                  Trace.endSection();
                  var11.b();
                  if (var11.a.isEmpty()) {
                     break label6339;
                  }

                  Trace.beginSection("Compose:sideeffects");
               } catch (Throwable var656) {
                  var10000 = var656;
                  var10001 = false;
                  break label6337;
               }

               label6340: {
                  label6341: {
                     List var665;
                     try {
                        var665 = var11.a;
                        var3 = var665.size();
                     } catch (Throwable var659) {
                        var10000 = var659;
                        var10001 = false;
                        break label6341;
                     }

                     for(var2 = 0; var2 < var3; ++var2) {
                        try {
                           ((qvi)var665.get(var2)).a();
                        } catch (Throwable var658) {
                           var10000 = var658;
                           var10001 = false;
                           break label6341;
                        }
                     }

                     label6296:
                     try {
                        var11.a.clear();
                        break label6340;
                     } catch (Throwable var657) {
                        var10000 = var657;
                        var10001 = false;
                        break label6296;
                     }
                  }

                  var664 = var10000;

                  try {
                     Trace.endSection();
                     throw var664;
                  } catch (Throwable var642) {
                     var10000 = var642;
                     var10001 = false;
                     break label6337;
                  }
               }

               try {
                  Trace.endSection();
               } catch (Throwable var655) {
                  var10000 = var655;
                  var10001 = false;
                  break label6337;
               }
            }

            label6343: {
               try {
                  if (!this.o) {
                     break label6343;
                  }

                  Trace.beginSection("Compose:unobserve");
               } catch (Throwable var645) {
                  var10000 = var645;
                  var10001 = false;
                  break label6337;
               }

               label6344: {
                  label6345: {
                     int var7;
                     Object var13;
                     Object var14;
                     bco var17;
                     Object var666;
                     try {
                        this.o = false;
                        var17 = this.i;
                        var13 = var17.b;
                        var666 = var17.c;
                        var14 = var17.d;
                        var7 = var17.a;
                     } catch (Throwable var654) {
                        var10000 = var654;
                        var10001 = false;
                        break label6345;
                     }

                     int var4 = 0;
                     var2 = 0;

                     label6278:
                     while(true) {
                        var3 = 0;
                        int var5;
                        if (var4 >= var7) {
                           try {
                              var4 = var17.a;
                           } catch (Throwable var648) {
                              var10000 = var648;
                              var10001 = false;
                              break;
                           }

                           for(var3 = var2; var3 < var4; ++var3) {
                              try {
                                 var5 = ((int[])var13)[var3];
                                 ((Object[])var14)[var5] = null;
                              } catch (Throwable var647) {
                                 var10000 = var647;
                                 var10001 = false;
                                 break label6278;
                              }
                           }

                           try {
                              var17.a = var2;
                              this.p();
                              break label6344;
                           } catch (Throwable var646) {
                              var10000 = var646;
                              var10001 = false;
                              break;
                           }
                        }

                        int var8;
                        int var9;
                        axb var16;
                        Object[] var667;
                        try {
                           var8 = ((int[])var13)[var4];
                           var16 = ((axb[])var666)[var8];
                           var16.getClass();
                           var667 = var16.b;
                           var9 = var16.a;
                        } catch (Throwable var652) {
                           var10000 = var652;
                           var10001 = false;
                           break;
                        }

                        int var6;
                        for(var5 = 0; var5 < var9; var3 = var6) {
                           Object var15 = var667[var5];

                           try {
                              var15.getClass();
                           } catch (Throwable var651) {
                              var10000 = var651;
                              var10001 = false;
                              break label6278;
                           }

                           var6 = var3;

                           label6350: {
                              try {
                                 if (!((aug)var15).j()) {
                                    break label6350;
                                 }
                              } catch (Throwable var653) {
                                 var10000 = var653;
                                 var10001 = false;
                                 break label6278;
                              }

                              if (var3 != var5) {
                                 var667[var3] = var15;
                              }

                              var6 = var3 + 1;
                           }

                           ++var5;
                        }

                        for(var5 = var3; var5 < var9; ++var5) {
                           var667[var5] = null;
                        }

                        try {
                           var16.a = var3;
                        } catch (Throwable var650) {
                           var10000 = var650;
                           var10001 = false;
                           break;
                        }

                        var5 = var2;
                        if (var3 > 0) {
                           if (var2 != var4) {
                              try {
                                 var3 = ((int[])var13)[var2];
                                 ((int[])var13)[var2] = var8;
                                 ((int[])var13)[var4] = var3;
                              } catch (Throwable var649) {
                                 var10000 = var649;
                                 var10001 = false;
                                 break;
                              }
                           }

                           var5 = var2 + 1;
                        }

                        ++var4;
                        var2 = var5;
                     }
                  }

                  var664 = var10000;

                  try {
                     Trace.endSection();
                     throw var664;
                  } catch (Throwable var643) {
                     var10000 = var643;
                     var10001 = false;
                     break label6337;
                  }
               }

               try {
                  Trace.endSection();
               } catch (Throwable var644) {
                  var10000 = var644;
                  var10001 = false;
                  break label6337;
               }
            }

            if (!this.s.k()) {
               return;
            }
            break label6336;
         }

         var664 = var10000;
         if (this.s.k()) {
            var11.a();
         }

         throw var664;
      }

      var11.a();
   }

   public final void a() {
      this.a.set((Object)null);
      this.r.i();
      this.s.i();
      this.c.clear();
   }

   public final void b() {
      Object var2 = this.b;
      synchronized(var2){}

      label1776: {
         Throwable var10000;
         label1775: {
            boolean var10001;
            label1780: {
               try {
                  if (this.g.i) {
                     break label1780;
                  }

                  if (this.h) {
                     break label1776;
                  }
               } catch (Throwable var254) {
                  var10000 = var254;
                  var10001 = false;
                  break label1775;
               }

               boolean var1 = true;

               dmx var255;
               try {
                  this.h = true;
                  qvx var3 = ash.a;
                  this.p = ash.b;
                  var255 = this.g.w;
               } catch (Throwable var253) {
                  var10000 = var253;
                  var10001 = false;
                  break label1775;
               }

               if (var255 != null) {
                  try {
                     this.t(var255);
                  } catch (Throwable var252) {
                     var10000 = var252;
                     var10001 = false;
                     break label1775;
                  }
               }

               label1759: {
                  try {
                     if (this.d.b > 0) {
                        break label1759;
                     }
                  } catch (Throwable var251) {
                     var10000 = var251;
                     var10001 = false;
                     break label1775;
                  }

                  var1 = false;
               }

               label1781: {
                  if (!var1) {
                     try {
                        if (this.c.isEmpty()) {
                           break label1781;
                        }
                     } catch (Throwable var250) {
                        var10000 = var250;
                        var10001 = false;
                        break label1775;
                     }
                  }

                  asv var4;
                  try {
                     var4 = new asv(this.c);
                  } catch (Throwable var249) {
                     var10000 = var249;
                     var10001 = false;
                     break label1775;
                  }

                  if (var1) {
                     auw var256;
                     try {
                        var256 = this.d.b();
                     } catch (Throwable var248) {
                        var10000 = var248;
                        var10001 = false;
                        break label1775;
                     }

                     try {
                        asr.j(var256, var4);
                     } finally {
                        try {
                           var256.s();
                        } catch (Throwable var241) {
                           var10000 = var241;
                           var10001 = false;
                           break label1775;
                        }
                     }

                     this.m.b();
                     this.m.e();
                     var4.b();
                  }

                  try {
                     var4.a();
                  } catch (Throwable var246) {
                     var10000 = var246;
                     var10001 = false;
                     break label1775;
                  }
               }

               asq var257;
               try {
                  var257 = this.g;
                  Trace.beginSection("Compose:Composer.dispose");
               } catch (Throwable var245) {
                  var10000 = var245;
                  var10001 = false;
                  break label1775;
               }

               try {
                  var257.b.i(var257);
                  var257.v.m();
                  var257.f.clear();
                  var257.t.i();
                  var257.x.ay();
                  var257.a.b();
                  break label1776;
               } finally {
                  try {
                     Trace.endSection();
                  } catch (Throwable var242) {
                     var10000 = var242;
                     var10001 = false;
                     break label1775;
                  }
               }
            }

            label1731:
            try {
               IllegalStateException var259 = new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
               throw var259;
            } catch (Throwable var243) {
               var10000 = var243;
               var10001 = false;
               break label1731;
            }
         }

         Throwable var258 = var10000;
         throw var258;
      }

      this.l.m(this);
   }

   public final void c(qvx var1) {
      if (!this.h) {
         this.p = var1;
         this.l.k(this, var1);
      } else {
         throw new IllegalStateException("The composition is disposed");
      }
   }

   public final void d() {
      Object var1 = this.b;
      synchronized(var1){}
      boolean var10 = false;

      try {
         var10 = true;
         this.t(this.r);
         this.g();
         var10 = false;
      } finally {
         if (var10) {
            try {
               if (!this.c.isEmpty()) {
                  asv var2 = new asv(this.c);
                  var2.a();
               }

            } catch (Exception var11) {
               this.a();
               throw var11;
            } finally {
               ;
            }
         }
      }

   }

   public final void e() {
      Object var1 = this.b;
      synchronized(var1){}
      boolean var10 = false;

      try {
         var10 = true;
         dmx var2 = this.s;
         if (var2.l()) {
            this.t(var2);
            var10 = false;
         } else {
            var10 = false;
         }
      } finally {
         if (var10) {
            try {
               if (!this.c.isEmpty()) {
                  asv var3 = new asv(this.c);
                  var3.a();
               }

            } catch (Exception var11) {
               this.a();
               throw var11;
            } finally {
               ;
            }
         }
      }

   }

   public final void f() {
      Object var3 = this.a.getAndSet(asx.a);
      if (var3 != null) {
         if (c.E(var3, asx.a)) {
            asr.k("pending composition has not been applied");
            throw new qsc();
         }

         if (var3 instanceof Set) {
            this.o((Set)var3, true);
            return;
         }

         if (!(var3 instanceof Object[])) {
            StringBuilder var6 = new StringBuilder();
            var6.append("corrupt pendingModifications drain: ");
            AtomicReference var4 = this.a;
            var6.append(var4);
            asr.k("corrupt pendingModifications drain: ".concat(var4.toString()));
            throw new qsc();
         }

         Set[] var5 = (Set[])var3;
         int var2 = var5.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            this.o(var5[var1], true);
         }
      }

   }

   public final void g() {
      Object var3 = this.a.getAndSet((Object)null);
      if (!c.E(var3, asx.a)) {
         if (var3 instanceof Set) {
            this.o((Set)var3, false);
            return;
         }

         if (!(var3 instanceof Object[])) {
            if (var3 == null) {
               asr.k("calling recordModificationsOf and applyChanges concurrently is not supported");
               throw new qsc();
            }

            StringBuilder var4 = new StringBuilder();
            var4.append("corrupt pendingModifications drain: ");
            AtomicReference var6 = this.a;
            var4.append(var6);
            asr.k("corrupt pendingModifications drain: ".concat(var6.toString()));
            throw new qsc();
         }

         Set[] var5 = (Set[])var3;
         int var2 = var5.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            this.o(var5[var1], false);
         }
      }

   }

   public final void h(Object var1) {
      asq var4 = this.g;
      if (var4.h <= 0) {
         aug var6 = var4.N();
         if (var6 != null) {
            var6.m();
            if ((var6.a & 32) == 0) {
               dhq var5 = var6.f;
               dhq var7 = var5;
               if (var5 == null) {
                  var7 = new dhq((char[])null, (byte[])null);
                  var6.f = var7;
               }

               if (var7.i(var1, var6.d) == var6.d) {
                  return;
               }

               if (var1 instanceof ate) {
                  var5 = var6.e;
                  var7 = var5;
                  if (var5 == null) {
                     var7 = new dhq((byte[])null, (byte[])null);
                     var6.e = var7;
                  }

                  var7.h(var1, ((ate)var1).f().d);
               }
            }

            this.i.y(var1, var6);
            if (var1 instanceof ate) {
               this.j.v(var1);
               Object[] var9 = ((ate)var1).f().c();
               int var3 = var9.length;

               for(int var2 = 0; var2 < var3; ++var2) {
                  Object var8 = var9[var2];
                  if (var8 == null) {
                     break;
                  }

                  this.j.y(var8, var1);
               }
            }
         }
      }

   }

   public final void i(Object var1) {
      Object var4 = this.b;
      synchronized(var4){}

      Throwable var10000;
      label165: {
         int var2;
         bco var5;
         boolean var10001;
         try {
            this.q(var1);
            var5 = this.j;
            var2 = var5.s(var1);
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label165;
         }

         if (var2 < 0) {
            return;
         }

         int var3;
         Object[] var18;
         try {
            axb var20 = var5.t(var2);
            var18 = var20.b;
            var3 = var20.a;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label165;
         }

         var2 = 0;

         while(true) {
            if (var2 >= var3) {
               return;
            }

            Object var21 = var18[var2];

            try {
               var21.getClass();
               this.q((ate)var21);
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      Throwable var19 = var10000;
      throw var19;
   }

   public final boolean j() {
      return this.g.i;
   }

   public final int k(aug var1, Object var2) {
      if ((var1.a & 2) != 0) {
         var1.c(true);
      }

      nxj var3 = var1.g;
      if (var3 != null && var3.f()) {
         if (!this.d.e(var3)) {
            Object var7 = this.b;
            synchronized(var7){}

            asw var4;
            try {
               var4 = this.e;
            } finally {
               ;
            }

            return var4 != null && var4.r(var1, var2) ? 4 : 1;
         } else {
            return var1.c != null ? this.s(var1, var3, var2) : 1;
         }
      } else {
         return 1;
      }
   }

   public final void l() {
      this.o = true;
   }

   public final dhq m() {
      dhq var1 = this.k;
      this.k = new dhq((byte[])null, (byte[])null);
      return var1;
   }
}
