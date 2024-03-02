import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.constraint.Pv.bmSypa;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import com.google.geo.lightfield.processing.vc.ejXS;
import com.google.googlex.gcam.base.HmAh.MBdHSCLVFh;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class cp {
   private final Map A = DesugarCollections.synchronizedMap(new HashMap());
   private final cew B;
   private final cew C;
   private final cew D;
   private final cew E;
   private final cc F;
   private boolean G;
   private ArrayList H;
   private ArrayList I;
   private ArrayList J;
   private final Runnable K;
   private final c L;
   private final AmbientMode$AmbientController M;
   public final cu a = new cu();
   ArrayList b;
   public final ce c = new ce(this);
   public pc d;
   public final ot e = new ch(this);
   public final AtomicInteger f = new AtomicInteger();
   public final CopyOnWriteArrayList g;
   int h;
   public cd i;
   public ca j;
   public bv k;
   bv l;
   public pj m;
   public pj n;
   public pj o;
   ArrayDeque p;
   public boolean q;
   public boolean r;
   public boolean s;
   public boolean t;
   public cr u;
   public final bpe v;
   private final ArrayList w = new ArrayList();
   private boolean x;
   private ArrayList y;
   private final Map z = DesugarCollections.synchronizedMap(new HashMap());

   public cp() {
      DesugarCollections.synchronizedMap(new HashMap());
      this.v = new bpe(this);
      this.g = new CopyOnWriteArrayList();
      this.B = new bw(this, 2);
      this.C = new bw(this, 3);
      this.D = new bw(this, 4);
      this.E = new bw(this, 5);
      this.M = new AmbientMode$AmbientController(this);
      this.h = -1;
      this.F = new ci(this);
      this.L = new c();
      this.p = new ArrayDeque();
      this.K = new bl(this, 5, (byte[])null);
   }

   public static boolean S(int var0) {
      return Log.isLoggable("FragmentManager", var0);
   }

   public static final boolean X(bv var0) {
      if (!var0.K || !var0.L) {
         Iterator var3 = var0.B.a.e().iterator();
         boolean var2 = false;

         boolean var1;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var0 = (bv)var3.next();
            var1 = var2;
            if (var0 != null) {
               var1 = X(var0);
            }

            var2 = var1;
         } while(!var1);
      }

      return true;
   }

   static final boolean Y(bv var0) {
      boolean var1 = true;
      if (var0 == null) {
         return true;
      } else {
         if (var0.L) {
            if (var0.z == null) {
               return var1;
            }

            if (Y(var0.C)) {
               return true;
            }
         }

         var1 = false;
         return var1;
      }
   }

   static final void aa(bv var0) {
      if (S(2)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("show: ");
         var1.append(var0);
      }

      if (var0.G) {
         var0.G = false;
         var0.U ^= true;
      }

   }

   private final ViewGroup ag(bv var1) {
      ViewGroup var2 = var1.N;
      if (var2 != null) {
         return var2;
      } else if (var1.E <= 0) {
         return null;
      } else {
         if (this.j.b()) {
            View var3 = this.j.a(var1.E);
            if (var3 instanceof ViewGroup) {
               return (ViewGroup)var3;
            }
         }

         return null;
      }
   }

   private final Set ah() {
      HashSet var1 = new HashSet();
      Iterator var3 = this.a.d().iterator();

      while(var3.hasNext()) {
         ViewGroup var2 = ((bv)((llo)var3.next()).c).N;
         if (var2 != null) {
            var1.add(do.C(var2, this.af()));
         }
      }

      return var1;
   }

   private final void ai() {
      if (this.V()) {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      }
   }

   private final void aj() {
      this.x = false;
      this.I.clear();
      this.H.clear();
   }

   private final void ak() {
      if (this.G) {
         this.G = false;
         this.aq();
      }

   }

   private final void al() {
      Iterator var1 = this.ah().iterator();

      while(var1.hasNext()) {
         ((dl)var1.next()).d();
      }

   }

   private final void am(boolean var1) {
      if (!this.x) {
         if (this.i == null) {
            if (this.t) {
               throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
               throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
         } else if (Looper.myLooper() == this.i.d.getLooper()) {
            if (!var1) {
               this.ai();
            }

            if (this.H == null) {
               this.H = new ArrayList();
               this.I = new ArrayList();
            }
         } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
         }
      } else {
         throw new IllegalStateException("FragmentManager is already executing transactions");
      }
   }

   private final void an(ArrayList var1, ArrayList var2, int var3, int var4) {
      boolean var12 = ((at)var1.get(var3)).s;
      ArrayList var13 = this.J;
      if (var13 == null) {
         this.J = new ArrayList();
      } else {
         var13.clear();
      }

      this.J.addAll(this.a.f());
      bv var23 = this.l;
      int var7 = var3;

      int var5;
      int var6;
      bv var14;
      boolean var21;
      for(boolean var8 = false; var7 < var4; var8 = var21) {
         at var15 = (at)var1.get(var7);
         ArrayList var16;
         cv var24;
         if ((Boolean)var2.get(var7)) {
            var16 = this.J;
            var5 = var15.d.size() - 1;

            while(true) {
               var14 = var23;
               if (var5 < 0) {
                  break;
               }

               var24 = (cv)var15.d.get(var5);
               switch(var24.a) {
               case 1:
               case 7:
                  var16.remove(var24.b);
               case 2:
               case 4:
               case 5:
               default:
                  break;
               case 3:
               case 6:
                  var16.add(var24.b);
                  break;
               case 8:
                  var23 = null;
                  break;
               case 9:
                  var23 = var24.b;
                  break;
               case 10:
                  var24.i = var24.h;
               }

               --var5;
            }
         } else {
            var16 = this.J;
            var6 = 0;

            while(true) {
               var14 = var23;
               if (var6 >= var15.d.size()) {
                  break;
               }

               var24 = (cv)var15.d.get(var6);
               bv var17;
               switch(var24.a) {
               case 1:
               case 7:
                  var16.add(var24.b);
                  var5 = var6;
                  var14 = var23;
                  break;
               case 2:
                  var17 = var24.b;
                  int var11 = var17.E;
                  int var9 = var16.size() - 1;
                  boolean var10 = false;
                  var5 = var6;
                  var6 = var11;

                  for(; var9 >= 0; --var9) {
                     bv var18 = (bv)var16.get(var9);
                     if (var18.E == var6) {
                        if (var18 == var17) {
                           var10 = true;
                        } else {
                           if (var18 == var23) {
                              var15.d.add(var5, new cv(9, var18, (byte[])null));
                              ++var5;
                              var23 = null;
                           }

                           cv var19 = new cv(3, var18, (byte[])null);
                           var19.d = var24.d;
                           var19.f = var24.f;
                           var19.e = var24.e;
                           var19.g = var24.g;
                           var15.d.add(var5, var19);
                           var16.remove(var18);
                           ++var5;
                        }
                     }
                  }

                  if (var10) {
                     var15.d.remove(var5);
                     --var5;
                     var14 = var23;
                  } else {
                     var24.a = 1;
                     var24.c = true;
                     var16.add(var17);
                     var14 = var23;
                  }
                  break;
               case 3:
               case 6:
                  var16.remove(var24.b);
                  var17 = var24.b;
                  var14 = var23;
                  var5 = var6;
                  if (var17 == var23) {
                     var15.d.add(var6, new cv(9, var17));
                     var5 = var6 + 1;
                     var14 = null;
                  }
                  break;
               case 4:
               case 5:
               default:
                  var14 = var23;
                  var5 = var6;
                  break;
               case 8:
                  var15.d.add(var6, new cv(9, var23, (byte[])null));
                  var24.c = true;
                  var14 = var24.b;
                  var5 = var6 + 1;
               }

               var6 = var5 + 1;
               var23 = var14;
            }
         }

         if (!var8 && !var15.j) {
            var21 = false;
         } else {
            var21 = true;
         }

         ++var7;
         var23 = var14;
      }

      this.J.clear();
      if (!var12 && this.h > 0) {
         for(var5 = var3; var5 < var4; ++var5) {
            var13 = ((at)var1.get(var5)).d;
            var7 = var13.size();

            for(var6 = 0; var6 < var7; ++var6) {
               var14 = ((cv)var13.get(var6)).b;
               if (var14 != null && var14.z != null) {
                  llo var33 = this.ad(var14);
                  this.a.l(var33);
               }
            }
         }
      }

      bv var25;
      for(var6 = var3; var6 < var4; ++var6) {
         at var34 = (at)var1.get(var6);
         var12 = (Boolean)var2.get(var6);
         String var26 = RbaSbznIXS.dZVrlydN;
         StringBuilder var20;
         cv var30;
         cp var32;
         if (var12) {
            var34.a(-1);

            for(var7 = var34.d.size() - 1; var7 >= 0; --var7) {
               var30 = (cv)var34.d.get(var7);
               var25 = var30.b;
               if (var25 != null) {
                  var25.t = false;
                  var25.t(true);
                  short var22;
                  switch(var34.i) {
                  case 4097:
                     var22 = 8194;
                     break;
                  case 4099:
                     var22 = 4099;
                     break;
                  case 4100:
                     var22 = 8197;
                     break;
                  case 8194:
                     var22 = 4097;
                     break;
                  case 8197:
                     var22 = 4100;
                     break;
                  default:
                     var22 = 0;
                  }

                  var25.s(var22);
                  var25.u(var34.r, var34.q);
               }

               switch(var30.a) {
               case 1:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, true);
                  var34.a.I(var25);
                  break;
               case 2:
               default:
                  var20 = new StringBuilder();
                  var20.append(var26);
                  var20.append(var30.a);
                  throw new IllegalArgumentException(var20.toString());
               case 3:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.ac(var25);
                  break;
               case 4:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var32 = var34.a;
                  aa(var25);
                  break;
               case 5:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, true);
                  var34.a.F(var25);
                  break;
               case 6:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.l(var25);
                  break;
               case 7:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, true);
                  var34.a.m(var25);
                  break;
               case 8:
                  var34.a.M((bv)null);
                  break;
               case 9:
                  var34.a.M(var25);
                  break;
               case 10:
                  var34.a.L(var25, var30.h);
               }
            }
         } else {
            var34.a(1);
            var7 = var34.d.size();

            for(var5 = 0; var5 < var7; ++var5) {
               var30 = (cv)var34.d.get(var5);
               var25 = var30.b;
               if (var25 != null) {
                  var25.t = false;
                  var25.t(false);
                  var25.s(var34.i);
                  var25.u(var34.q, var34.r);
               }

               switch(var30.a) {
               case 1:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, false);
                  var34.a.ac(var25);
                  break;
               case 2:
               default:
                  var20 = new StringBuilder();
                  var20.append(var26);
                  var20.append(var30.a);
                  throw new IllegalArgumentException(var20.toString());
               case 3:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.I(var25);
                  break;
               case 4:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.F(var25);
                  break;
               case 5:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, false);
                  var32 = var34.a;
                  aa(var25);
                  break;
               case 6:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.m(var25);
                  break;
               case 7:
                  var25.q(var30.d, var30.e, var30.f, var30.g);
                  var34.a.K(var25, false);
                  var34.a.l(var25);
                  break;
               case 8:
                  var34.a.M(var25);
                  break;
               case 9:
                  var34.a.M((bv)null);
                  break;
               case 10:
                  var34.a.L(var25, var30.i);
               }
            }
         }
      }

      var12 = (Boolean)var2.get(var4 - 1);

      at var27;
      ArrayList var35;
      for(var5 = var3; var5 < var4; ++var5) {
         var27 = (at)var1.get(var5);
         if (var12) {
            for(var6 = var27.d.size() - 1; var6 >= 0; --var6) {
               var14 = ((cv)var27.d.get(var6)).b;
               if (var14 != null) {
                  this.ad(var14).e();
               }
            }
         } else {
            var35 = var27.d;
            var7 = var35.size();

            for(var6 = 0; var6 < var7; ++var6) {
               var23 = ((cv)var35.get(var6)).b;
               if (var23 != null) {
                  this.ad(var23).e();
               }
            }
         }
      }

      this.G(this.h, true);
      HashSet var29 = new HashSet();

      for(var5 = var3; var5 < var4; ++var5) {
         var35 = ((at)var1.get(var5)).d;
         var7 = var35.size();

         for(var6 = 0; var6 < var7; ++var6) {
            var25 = ((cv)var35.get(var6)).b;
            if (var25 != null) {
               ViewGroup var28 = var25.N;
               if (var28 != null) {
                  var29.add(dl.b(var28, this));
               }
            }
         }
      }

      Iterator var31 = var29.iterator();

      while(var31.hasNext()) {
         dl var36 = (dl)var31.next();
         var36.d = var12;
         var36.e();
         var36.c();
      }

      for(; var3 < var4; ++var3) {
         var27 = (at)var1.get(var3);
         if ((Boolean)var2.get(var3) && var27.c >= 0) {
            var27.c = -1;
         }
      }

   }

   private final void ao(ArrayList var1, ArrayList var2) {
      if (!var1.isEmpty()) {
         if (var1.size() != var2.size()) {
            IllegalStateException var8 = new IllegalStateException("Internal error with the back stack records");
            throw var8;
         } else {
            int var7 = var1.size();
            int var3 = 0;

            int var4;
            int var5;
            for(var4 = 0; var3 < var7; var4 = var5) {
               int var6 = var3;
               var5 = var4;
               if (!((at)var1.get(var3)).s) {
                  if (var4 != var3) {
                     this.an(var1, var2, var4, var3);
                  }

                  var5 = var3 + 1;
                  var4 = var5;
                  if ((Boolean)var2.get(var3)) {
                     while(true) {
                        var5 = var4;
                        if (var4 >= var7) {
                           break;
                        }

                        var5 = var4;
                        if (!(Boolean)var2.get(var4)) {
                           break;
                        }

                        var5 = var4;
                        if (((at)var1.get(var4)).s) {
                           break;
                        }

                        ++var4;
                     }
                  }

                  this.an(var1, var2, var3, var5);
                  var6 = var5 - 1;
               }

               var3 = var6 + 1;
            }

            if (var4 != var7) {
               this.an(var1, var2, var4, var7);
            }

         }
      }
   }

   private final void ap(bv var1) {
      ViewGroup var2 = this.ag(var1);
      if (var2 != null && var1.e() + var1.f() + var1.g() + var1.h() > 0) {
         if (var2.getTag(2131428437) == null) {
            var2.setTag(2131428437, var1);
         }

         ((bv)var2.getTag(2131428437)).t(var1.v());
      }

   }

   private final void aq() {
      Iterator var1 = this.a.d().iterator();

      while(var1.hasNext()) {
         this.ae((llo)var1.next());
      }

   }

   private final void ar(RuntimeException var1) {
      Log.e("FragmentManager", var1.getMessage());
      Log.e("FragmentManager", "Activity state:");
      PrintWriter var3 = new PrintWriter(new dg());
      cd var2 = this.i;
      if (var2 != null) {
         try {
            ((bx)var2).a.dump("  ", (FileDescriptor)null, var3, new String[0]);
         } catch (Exception var5) {
            Log.e("FragmentManager", "Failed dumping state", var5);
         }
      } else {
         try {
            this.C("  ", (FileDescriptor)null, var3, new String[0]);
         } catch (Exception var4) {
            Log.e("FragmentManager", "Failed dumping state", var4);
         }
      }

      throw var1;
   }

   public static bv f(View var0) {
      while(var0 != null) {
         bv var1 = g(var0);
         if (var1 != null) {
            return var1;
         }

         ViewParent var2 = var0.getParent();
         if (var2 instanceof View) {
            var0 = (View)var2;
         } else {
            var0 = null;
         }
      }

      return null;
   }

   static bv g(View var0) {
      Object var1 = var0.getTag(2131427708);
      return var1 instanceof bv ? (bv)var1 : null;
   }

   public final void A(int var1) {
      label288: {
         Throwable var10000;
         label290: {
            boolean var10001;
            Iterator var2;
            try {
               this.x = true;
               var2 = this.a.b.values().iterator();
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label290;
            }

            while(true) {
               llo var3;
               try {
                  if (!var2.hasNext()) {
                     break;
                  }

                  var3 = (llo)var2.next();
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label290;
               }

               if (var3 != null) {
                  try {
                     var3.a = var1;
                  } catch (Throwable var31) {
                     var10000 = var31;
                     var10001 = false;
                     break label290;
                  }
               }
            }

            try {
               this.G(var1, false);
               var2 = this.ah().iterator();
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label290;
            }

            while(true) {
               try {
                  if (!var2.hasNext()) {
                     break label288;
                  }

                  ((dl)var2.next()).d();
               } catch (Throwable var29) {
                  var10000 = var29;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var34 = var10000;
         this.x = false;
         throw var34;
      }

      this.x = false;
      this.ab(true);
   }

   public final void B() {
      this.s = true;
      this.u.g = true;
      this.A(4);
   }

   public final void C(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      cu var8 = this.a;
      if (!var8.b.isEmpty()) {
         var3.print(var1);
         var3.println("Active Fragments:");
         Iterator var9 = var8.b.values().iterator();

         while(var9.hasNext()) {
            llo var11 = (llo)var9.next();
            var3.print(var1);
            if (var11 != null) {
               String var10 = String.valueOf(var1);
               Object var49 = var11.c;
               var3.println(var49);
               ((bv)var49).dump(var10.concat("    "), var2, var3, var4);
            } else {
               var3.println("null");
            }
         }
      }

      int var7 = var8.a.size();
      byte var6 = 0;
      int var5;
      bv var43;
      if (var7 > 0) {
         var3.print(var1);
         var3.println("Added Fragments:");

         for(var5 = 0; var5 < var7; ++var5) {
            var43 = (bv)var8.a.get(var5);
            var3.print(var1);
            var3.print(gKVNpqGY.DWgY);
            var3.print(var5);
            var3.print(": ");
            var3.println(var43.toString());
         }
      }

      ArrayList var44 = this.y;
      if (var44 != null) {
         var7 = var44.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Fragments Created Menus:");

            for(var5 = 0; var5 < var7; ++var5) {
               var43 = (bv)this.y.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var43.toString());
            }
         }
      }

      var44 = this.b;
      if (var44 != null) {
         var7 = var44.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Back Stack:");

            for(var5 = 0; var5 < var7; ++var5) {
               String var45 = String.valueOf(var1);
               at var47 = (at)this.b.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var47.toString());
               var47.d(var45.concat("    "), var3);
            }
         }
      }

      var3.print(var1);
      StringBuilder var46 = new StringBuilder();
      var46.append("Back Stack Index: ");
      var46.append(this.f.get());
      var3.println(var46.toString());
      var44 = this.w;
      synchronized(var44){}

      label671: {
         Throwable var10000;
         boolean var10001;
         label672: {
            try {
               var7 = this.w.size();
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label672;
            }

            if (var7 > 0) {
               try {
                  var3.print(var1);
                  var3.println("Pending Actions:");
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label672;
               }

               for(var5 = var6; var5 < var7; ++var5) {
                  try {
                     cn var48 = (cn)this.w.get(var5);
                     var3.print(var1);
                     var3.print("  #");
                     var3.print(var5);
                     var3.print(": ");
                     var3.println(var48);
                  } catch (Throwable var39) {
                     var10000 = var39;
                     var10001 = false;
                     break label672;
                  }
               }
            }

            label621:
            try {
               break label671;
            } catch (Throwable var38) {
               var10000 = var38;
               var10001 = false;
               break label621;
            }
         }

         while(true) {
            Throwable var42 = var10000;

            try {
               throw var42;
            } catch (Throwable var37) {
               var10000 = var37;
               var10001 = false;
               continue;
            }
         }
      }

      var3.print(var1);
      var3.println("FragmentManager misc state:");
      var3.print(var1);
      var3.print("  mHost=");
      var3.println(this.i);
      var3.print(var1);
      var3.print("  mContainer=");
      var3.println(this.j);
      if (this.k != null) {
         var3.print(var1);
         var3.print(ejXS.uSuCoLTl);
         var3.println(this.k);
      }

      var3.print(var1);
      var3.print("  mCurState=");
      var3.print(this.h);
      var3.print(bmSypa.cNglals);
      var3.print(this.r);
      var3.print(" mStopped=");
      var3.print(this.s);
      var3.print(" mDestroyed=");
      var3.println(this.t);
      if (this.q) {
         var3.print(var1);
         var3.print("  mNeedMenuInvalidate=");
         var3.println(this.q);
      }

   }

   final void D(cn param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   final void E(cn var1, boolean var2) {
      if (!var2 || this.i != null && !this.t) {
         this.am(var2);
         var1.f(this.H, this.I);
         this.x = true;

         try {
            this.ao(this.H, this.I);
         } finally {
            this.aj();
         }

         this.N();
         this.ak();
         this.a.h();
      }
   }

   final void F(bv var1) {
      if (S(2)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("hide: ");
         var2.append(var1);
      }

      if (!var1.G) {
         var1.G = true;
         var1.U ^= true;
         this.ap(var1);
      }

   }

   final void G(int var1, boolean var2) {
      if (this.i == null && var1 != -1) {
         throw new IllegalStateException("No activity");
      } else if (var2 || var1 != this.h) {
         this.h = var1;
         cu var4 = this.a;
         ArrayList var5 = var4.a;
         int var3 = var5.size();

         llo var10;
         for(var1 = 0; var1 < var3; ++var1) {
            bv var6 = (bv)var5.get(var1);
            var10 = (llo)var4.b.get(var6.k);
            if (var10 != null) {
               var10.e();
            }
         }

         Iterator var7 = var4.b.values().iterator();

         while(var7.hasNext()) {
            var10 = (llo)var7.next();
            if (var10 != null) {
               var10.e();
               bv var9 = (bv)var10.c;
               if (var9.r && !var9.w()) {
                  var2 = var9.t;
                  var4.m(var10);
               }
            }
         }

         this.aq();
         if (this.q) {
            cd var8 = this.i;
            if (var8 != null && this.h == 7) {
               var8.e();
               this.q = false;
            }
         }

      }
   }

   public final void H() {
      if (this.i != null) {
         this.r = false;
         this.s = false;
         this.u.g = false;
         Iterator var1 = this.a.f().iterator();

         while(var1.hasNext()) {
            bv var2 = (bv)var1.next();
            if (var2 != null) {
               var2.B.H();
            }
         }

      }
   }

   final void I(bv var1) {
      if (S(2)) {
         StringBuilder var3 = new StringBuilder();
         var3.append("remove: ");
         var3.append(var1);
         var3.append(" nesting=");
         var3.append(var1.y);
      }

      boolean var2 = var1.w();
      if (!var1.H || var2 ^ true) {
         this.a.i(var1);
         if (X(var1)) {
            this.q = true;
         }

         var1.r = true;
         this.ap(var1);
      }
   }

   final void J(Parcelable var1) {
      Bundle var17 = (Bundle)var1;
      Iterator var11 = var17.keySet().iterator();

      String var13;
      while(var11.hasNext()) {
         var13 = (String)var11.next();
         if (var13.startsWith("result_")) {
            Bundle var12 = var17.getBundle(var13);
            if (var12 != null) {
               var12.setClassLoader(this.i.c.getClassLoader());
               var13 = var13.substring(7);
               this.A.put(var13, var12);
            }
         }
      }

      HashMap var26 = new HashMap();
      Iterator var31 = var17.keySet().iterator();

      Bundle var14;
      String var28;
      while(var31.hasNext()) {
         var28 = (String)var31.next();
         if (var28.startsWith("fragment_")) {
            var14 = var17.getBundle(var28);
            if (var14 != null) {
               var14.setClassLoader(this.i.c.getClassLoader());
               var26.put(var28.substring(9), var14);
            }
         }
      }

      cu var29 = this.a;
      var29.c.clear();
      var29.c.putAll(var26);
      var28 = bmSypa.sbEeySkTNMAjp;
      cq var27 = (cq)var17.getParcelable(var28);
      if (var27 != null) {
         this.a.b.clear();
         ArrayList var33 = var27.a;
         int var3 = var33.size();
         byte var5 = 0;

         int var2;
         String var18;
         bv var20;
         StringBuilder var37;
         String var41;
         for(var2 = 0; var2 < var3; ++var2) {
            var18 = (String)var33.get(var2);
            var14 = this.a.a(var18, (Bundle)null);
            if (var14 != null) {
               ct var15 = (ct)var14.getParcelable(var28);
               cr var19 = this.u;
               var41 = var15.b;
               var20 = (bv)var19.b.get(var41);
               llo var21;
               if (var20 != null) {
                  if (S(2)) {
                     StringBuilder var44 = new StringBuilder();
                     var44.append("restoreSaveState: re-attaching retained ");
                     var44.append(var20);
                  }

                  var21 = new llo(this.v, this.a, var20, var14);
               } else {
                  var21 = new llo(this.v, this.a, this.i.c.getClassLoader(), this.h(), var14);
               }

               Object var45 = var21.c;
               bv var16 = (bv)var45;
               var16.g = var14;
               var16.z = this;
               if (S(2)) {
                  var37 = new StringBuilder();
                  var37.append("restoreSaveState: active (");
                  var37.append(var16.k);
                  var37.append("): ");
                  var37.append(var45);
               }

               var21.f(this.i.c.getClassLoader());
               this.a.l(var21);
               var21.a = this.h;
            }
         }

         Iterator var30 = (new ArrayList(this.u.b.values())).iterator();

         while(var30.hasNext()) {
            var20 = (bv)var30.next();
            if (!this.a.j(var20.k)) {
               if (S(2)) {
                  StringBuilder var34 = new StringBuilder();
                  var34.append("Discarding retained Fragment ");
                  var34.append(var20);
                  var34.append(" that was not found in the set of active Fragments ");
                  var34.append(var27.a);
               }

               this.u.e(var20);
               var20.z = this;
               llo var36 = new llo(this.v, this.a, var20);
               var36.a = 1;
               var36.e();
               var20.r = true;
               var36.e();
            }
         }

         cu var22 = this.a;
         ArrayList var32 = var27.b;
         var22.a.clear();
         bv var39;
         if (var32 != null) {
            for(var30 = var32.iterator(); var30.hasNext(); var22.g(var39)) {
               var41 = (String)var30.next();
               var39 = var22.b(var41);
               if (var39 == null) {
                  throw new IllegalStateException(c.aA(var41, "No instantiated fragment for (", ")"));
               }

               if (S(2)) {
                  var37 = new StringBuilder();
                  var37.append("restoreSaveState: added (");
                  var37.append(var41);
                  var37.append("): ");
                  var37.append(var39);
               }
            }
         }

         au[] var23 = var27.c;
         if (var23 != null) {
            this.b = new ArrayList(var23.length);
            var2 = 0;

            while(true) {
               var23 = var27.c;
               if (var2 >= var23.length) {
                  break;
               }

               au var35 = var23[var2];
               at var24 = new at(this);
               int var4 = 0;
               var3 = 0;

               while(true) {
                  int[] var42 = var35.a;
                  if (var4 >= var42.length) {
                     var24.i = var35.e;
                     var24.l = var35.f;
                     var24.j = true;
                     var24.m = var35.h;
                     var24.n = var35.i;
                     var24.o = var35.j;
                     var24.p = var35.k;
                     var24.q = var35.l;
                     var24.r = var35.m;
                     var24.s = var35.n;
                     var24.c = var35.g;

                     for(var3 = 0; var3 < var35.b.size(); ++var3) {
                        var13 = (String)var35.b.get(var3);
                        if (var13 != null) {
                           ((cv)var24.d.get(var3)).b = this.c(var13);
                        }
                     }

                     var24.a(1);
                     if (S(2)) {
                        StringBuilder var38 = new StringBuilder();
                        var38.append("restoreAllState: back stack #");
                        var38.append(var2);
                        var38.append(" (index ");
                        var38.append(var24.c);
                        var38.append("): ");
                        var38.append(var24);
                        PrintWriter var40 = new PrintWriter(new dg());
                        var24.e("  ", var40, false);
                        var40.close();
                     }

                     this.b.add(var24);
                     ++var2;
                     break;
                  }

                  cv var43 = new cv();
                  int var6 = var4 + 1;
                  var43.a = var42[var4];
                  if (S(2)) {
                     var37 = new StringBuilder();
                     var37.append("Instantiate ");
                     var37.append(var24);
                     var37.append(" op #");
                     var37.append(var3);
                     var37.append(" base fragment #");
                     var37.append(var35.a[var6]);
                  }

                  var43.h = clw.values()[var35.c[var3]];
                  var43.i = clw.values()[var35.d[var3]];
                  var42 = var35.a;
                  var4 = var6 + 1;
                  boolean var10;
                  if (var42[var6] != 0) {
                     var10 = true;
                  } else {
                     var10 = false;
                  }

                  var43.c = var10;
                  var6 = var4 + 1;
                  var4 = var42[var4];
                  var43.d = var4;
                  int var8 = var6 + 1;
                  int var7 = var42[var6];
                  var43.e = var7;
                  var6 = var8 + 1;
                  var8 = var42[var8];
                  var43.f = var8;
                  int var9 = var42[var6];
                  var43.g = var9;
                  var24.e = var4;
                  var24.f = var7;
                  var24.g = var8;
                  var24.h = var9;
                  var24.k(var43);
                  ++var3;
                  var4 = var6 + 1;
               }
            }
         } else {
            this.b = null;
         }

         this.f.set(var27.d);
         var18 = var27.e;
         if (var18 != null) {
            var20 = this.c(var18);
            this.l = var20;
            this.v(var20);
         }

         ArrayList var25 = var27.f;
         if (var25 != null) {
            for(var2 = var5; var2 < var25.size(); ++var2) {
               this.z.put((String)var25.get(var2), (aw)var27.g.get(var2));
            }
         }

         this.p = new ArrayDeque(var27.h);
      }
   }

   final void K(bv var1, boolean var2) {
      ViewGroup var3 = this.ag(var1);
      if (var3 != null && var3 instanceof cb) {
         ((cb)var3).a = var2 ^ true;
      }

   }

   final void L(bv var1, clw var2) {
      if (!var1.equals(this.c(var1.k)) || var1.A != null && var1.z != this) {
         throw new IllegalArgumentException(c.aH(this, var1, "Fragment ", nJwt.oXGqTTUiqpiI));
      } else {
         var1.X = var2;
      }
   }

   final void M(bv var1) {
      if (var1 == null || var1.equals(this.c(var1.k)) && (var1.A == null || var1.z == this)) {
         bv var2 = this.l;
         this.l = var1;
         this.v(var2);
         this.v(this.l);
      } else {
         throw new IllegalArgumentException(c.aH(this, var1, "Fragment ", " is not an active fragment of FragmentManager "));
      }
   }

   public final void N() {
      ArrayList var3 = this.w;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label238: {
         boolean var2;
         try {
            var2 = this.w.isEmpty();
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label238;
         }

         boolean var1 = true;
         if (!var2) {
            label231:
            try {
               this.e.d(true);
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label231;
            }
         } else {
            label243: {
               try {
                  ;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label243;
               }

               if (this.a() <= 0 || !this.U(this.k)) {
                  var1 = false;
               }

               if (S(3)) {
                  StringBuilder var25 = new StringBuilder();
                  var25.append("OnBackPressedCallback for FragmentManager ");
                  var25.append(this);
                  var25.append(MBdHSCLVFh.bXEQuCPJCJiPJ);
                  var25.append(var1);
               }

               this.e.d(var1);
               return;
            }
         }
      }

      while(true) {
         Throwable var4 = var10000;

         try {
            throw var4;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   final boolean O(MenuItem var1) {
      if (this.h <= 0) {
         return false;
      } else {
         Iterator var2 = this.a.f().iterator();

         bv var3;
         do {
            if (!var2.hasNext()) {
               return false;
            }

            var3 = (bv)var2.next();
         } while(var3 == null || var3.G || !var3.B.O(var1));

         return true;
      }
   }

   public final boolean P(Menu var1, MenuInflater var2) {
      int var3 = this.h;
      byte var4 = 0;
      if (var3 <= 0) {
         return false;
      } else {
         Iterator var8 = this.a.f().iterator();
         ArrayList var6 = null;
         boolean var5 = false;

         while(true) {
            bv var9;
            do {
               do {
                  do {
                     if (!var8.hasNext()) {
                        if (this.y != null) {
                           for(var3 = var4; var3 < this.y.size(); ++var3) {
                              bv var10 = (bv)this.y.get(var3);
                              if (var6 != null) {
                                 var6.contains(var10);
                              }
                           }
                        }

                        this.y = var6;
                        return var5;
                     }

                     var9 = (bv)var8.next();
                  } while(var9 == null);
               } while(!Y(var9));
            } while(var9.G);

            boolean var11;
            if (var9.K && var9.L) {
               var11 = true;
            } else {
               var11 = false;
            }

            if (var11 | var9.B.P(var1, var2)) {
               ArrayList var7 = var6;
               if (var6 == null) {
                  var7 = new ArrayList();
               }

               var7.add(var9);
               var5 = true;
               var6 = var7;
            }
         }
      }
   }

   public final boolean Q(MenuItem var1) {
      if (this.h <= 0) {
         return false;
      } else {
         Iterator var2 = this.a.f().iterator();

         bv var3;
         do {
            if (!var2.hasNext()) {
               return false;
            }

            var3 = (bv)var2.next();
         } while(var3 == null || var3.G || !var3.B.Q(var1));

         return true;
      }
   }

   public final boolean R(Menu var1) {
      if (this.h <= 0) {
         return false;
      } else {
         Iterator var5 = this.a.f().iterator();
         boolean var3 = false;

         while(true) {
            bv var4;
            do {
               do {
                  do {
                     if (!var5.hasNext()) {
                        return var3;
                     }

                     var4 = (bv)var5.next();
                  } while(var4 == null);
               } while(!Y(var4));
            } while(var4.G);

            boolean var2;
            if (var4.K && var4.L) {
               var2 = true;
            } else {
               var2 = false;
            }

            if (var4.B.R(var1) | var2) {
               var3 = true;
            }
         }
      }
   }

   public final boolean T() {
      bv var1 = this.k;
      if (var1 == null) {
         return true;
      } else {
         return var1.isAdded() && var1.getParentFragmentManager().T();
      }
   }

   final boolean U(bv var1) {
      if (var1 == null) {
         return true;
      } else {
         cp var2 = var1.z;
         return var1.equals(var2.l) && this.U(var2.k);
      }
   }

   public final boolean V() {
      return this.r || this.s;
   }

   public final boolean W() {
      this.ab(false);
      boolean var1 = true;
      this.am(true);
      bv var2 = this.l;
      if (var2 == null || !var2.getChildFragmentManager().W()) {
         var1 = this.Z(this.H, this.I, -1, 0);
         if (var1) {
            this.x = true;

            try {
               this.ao(this.H, this.I);
            } finally {
               this.aj();
            }
         }

         this.N();
         this.ak();
         this.a.h();
      }

      return var1;
   }

   final boolean Z(ArrayList var1, ArrayList var2, int var3, int var4) {
      ArrayList var7 = this.b;
      if (var7 != null) {
         if (var7.isEmpty()) {
            var3 = -1;
         } else if (var3 < 0) {
            if (var4 != 0) {
               var3 = 0;
            } else {
               var3 = this.b.size() - 1;
            }
         } else {
            int var5;
            for(var5 = this.b.size() - 1; var5 >= 0 && var3 != ((at)this.b.get(var5)).c; --var5) {
            }

            if (var5 < 0) {
               var3 = var5;
            } else {
               int var6 = var5;
               if (var4 == 0) {
                  if (var5 == this.b.size() - 1) {
                     var3 = -1;
                  } else {
                     var3 = var5 + 1;
                  }
               } else {
                  while(var6 > 0) {
                     var7 = this.b;
                     var4 = var6 - 1;
                     if (var3 != ((at)var7.get(var4)).c) {
                        break;
                     }

                     var6 = var4;
                  }

                  var3 = var6;
               }
            }
         }
      } else {
         var3 = -1;
      }

      if (var3 < 0) {
         return false;
      } else {
         for(var4 = this.b.size() - 1; var4 >= var3; --var4) {
            var1.add((at)this.b.remove(var4));
            var2.add(true);
         }

         return true;
      }
   }

   public final int a() {
      ArrayList var1 = this.b;
      return var1 != null ? var1.size() : 0;
   }

   public final void ab(boolean var1) {
      this.am(var1);

      label623:
      while(true) {
         ArrayList var7 = this.H;
         ArrayList var6 = this.I;
         ArrayList var5 = this.w;
         synchronized(var5){}

         Throwable var64;
         Throwable var10000;
         boolean var10001;
         label633: {
            try {
               if (this.w.isEmpty()) {
                  break;
               }
            } catch (Throwable var63) {
               var10000 = var63;
               var10001 = false;
               break label633;
            }

            label630: {
               int var4;
               try {
                  var4 = this.w.size();
               } catch (Throwable var62) {
                  var10000 = var62;
                  var10001 = false;
                  break label630;
               }

               int var3 = 0;
               boolean var2 = false;

               while(true) {
                  if (var3 >= var4) {
                     try {
                        this.w.clear();
                        this.i.d.removeCallbacks(this.K);
                     } catch (Throwable var60) {
                        var10000 = var60;
                        var10001 = false;
                        break label633;
                     }

                     if (!var2) {
                        break label623;
                     }

                     this.x = true;

                     try {
                        this.ao(this.H, this.I);
                        continue label623;
                     } finally {
                        this.aj();
                     }
                  }

                  try {
                     var1 = ((cn)this.w.get(var3)).f(var7, var6);
                  } catch (Throwable var61) {
                     var10000 = var61;
                     var10001 = false;
                     break;
                  }

                  var2 |= var1;
                  ++var3;
               }
            }

            var64 = var10000;

            label596:
            try {
               this.w.clear();
               this.i.d.removeCallbacks(this.K);
               throw var64;
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label596;
            }
         }

         while(true) {
            var64 = var10000;

            try {
               throw var64;
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               continue;
            }
         }
      }

      this.N();
      this.ak();
      this.a.h();
   }

   final llo ac(bv var1) {
      String var2 = var1.mPreviousWho;
      if (var2 != null) {
         ckr.a(var1, var2);
      }

      if (S(2)) {
         StringBuilder var3 = new StringBuilder();
         var3.append("add: ");
         var3.append(var1);
      }

      llo var4 = this.ad(var1);
      var1.z = this;
      this.a.l(var4);
      if (!var1.H) {
         this.a.g(var1);
         var1.r = false;
         if (var1.O == null) {
            var1.U = false;
         }

         if (X(var1)) {
            this.q = true;
         }
      }

      return var4;
   }

   final llo ad(bv var1) {
      llo var2 = this.a.k(var1.k);
      if (var2 != null) {
         return var2;
      } else {
         llo var3 = new llo(this.v, this.a, var1);
         var3.f(this.i.c.getClassLoader());
         var3.a = this.h;
         return var3;
      }
   }

   final void ae(llo var1) {
      bv var2 = (bv)var1.c;
      if (var2.P) {
         if (this.x) {
            this.G = true;
            return;
         }

         var2.P = false;
         var1.e();
      }

   }

   final c af() {
      bv var1 = this.k;
      return var1 != null ? var1.z.af() : this.L;
   }

   final Bundle b() {
      Bundle var6 = new Bundle();
      Iterator var4 = this.ah().iterator();

      while(true) {
         boolean var3 = var4.hasNext();
         int var1 = 0;
         if (!var3) {
            this.al();
            this.ab(true);
            this.r = true;
            this.u.g = true;
            cu var9 = this.a;
            ArrayList var7 = new ArrayList(var9.b.size());
            Iterator var60 = var9.b.values().iterator();

            bv var58;
            while(var60.hasNext()) {
               llo var12 = (llo)var60.next();
               if (var12 != null) {
                  Object var8 = var12.c;
                  var58 = (bv)var8;
                  String var11 = var58.k;
                  Bundle var10 = new Bundle();
                  bv var13 = (bv)var12.c;
                  Bundle var77;
                  if (var13.f == -1) {
                     var77 = var13.g;
                     if (var77 != null) {
                        var10.putAll(var77);
                     }
                  }

                  var10.putParcelable("state", new ct((bv)var12.c));
                  if (((bv)var12.c).f >= 0) {
                     var77 = new Bundle();
                     ((bv)var12.c).onSaveInstanceState(var77);
                     if (!var77.isEmpty()) {
                        var10.putBundle("savedInstanceState", var77);
                     }

                     Object var15 = var12.b;
                     bv var14 = (bv)var12.c;
                     ((bpe)var15).A(var14, var77, false);
                     var77 = new Bundle();
                     ((bv)var12.c).ae.i(var77);
                     if (!var77.isEmpty()) {
                        var10.putBundle(xKbMW.jRIotfqebkZ, var77);
                     }

                     var77 = ((bv)var12.c).B.b();
                     if (!var77.isEmpty()) {
                        var10.putBundle("childFragmentManager", var77);
                     }

                     if (((bv)var12.c).O != null) {
                        var12.g();
                     }

                     SparseArray var78 = ((bv)var12.c).h;
                     if (var78 != null) {
                        var10.putSparseParcelableArray("viewState", var78);
                     }

                     var77 = ((bv)var12.c).i;
                     if (var77 != null) {
                        var10.putBundle("viewRegistryState", var77);
                     }
                  }

                  Bundle var75 = ((bv)var12.c).l;
                  if (var75 != null) {
                     var10.putBundle("arguments", var75);
                  }

                  var9.a(var11, var10);
                  var7.add(var58.k);
                  if (S(2)) {
                     StringBuilder var70 = new StringBuilder();
                     var70.append("Saved state of ");
                     var70.append(var8);
                     var70.append(": ");
                     var70.append(var58.g);
                  }
               }
            }

            HashMap var67 = this.a.c;
            if (!var67.isEmpty()) {
               cu var72 = this.a;
               ArrayList var68 = var72.a;
               synchronized(var68){}

               ArrayList var59;
               au[] var62;
               label1183: {
                  Throwable var10000;
                  boolean var10001;
                  label1161: {
                     try {
                        var3 = var72.a.isEmpty();
                     } catch (Throwable var57) {
                        var10000 = var57;
                        var10001 = false;
                        break label1161;
                     }

                     var62 = null;
                     if (var3) {
                        label1143: {
                           try {
                              ;
                           } catch (Throwable var53) {
                              var10000 = var53;
                              var10001 = false;
                              break label1143;
                           }

                           var59 = null;
                        }
                     } else {
                        label1184: {
                           Iterator var74;
                           try {
                              var59 = new ArrayList(var72.a.size());
                              var74 = var72.a.iterator();
                           } catch (Throwable var55) {
                              var10000 = var55;
                              var10001 = false;
                              break label1184;
                           }

                           while(true) {
                              try {
                                 if (!var74.hasNext()) {
                                    break;
                                 }

                                 bv var73 = (bv)var74.next();
                                 var59.add(var73.k);
                                 if (S(2)) {
                                    StringBuilder var76 = new StringBuilder();
                                    var76.append("saveAllState: adding fragment (");
                                    var76.append(var73.k);
                                    var76.append("): ");
                                    var76.append(var73);
                                 }
                              } catch (Throwable var56) {
                                 var10000 = var56;
                                 var10001 = false;
                                 break label1184;
                              }
                           }

                           label1145:
                           try {
                              ;
                           } catch (Throwable var54) {
                              var10000 = var54;
                              var10001 = false;
                              break label1145;
                           }
                        }
                     }
                     break label1183;
                  }

                  while(true) {
                     Throwable var61 = var10000;

                     try {
                        throw var61;
                     } catch (Throwable var52) {
                        var10000 = var52;
                        var10001 = false;
                        continue;
                     }
                  }
               }

               var68 = this.b;
               if (var68 != null) {
                  int var2 = var68.size();
                  if (var2 > 0) {
                     for(var62 = new au[var2]; var1 < var2; ++var1) {
                        var62[var1] = new au((at)this.b.get(var1));
                        if (S(2)) {
                           StringBuilder var69 = new StringBuilder();
                           var69.append("saveAllState: adding back stack #");
                           var69.append(var1);
                           var69.append(": ");
                           var69.append(this.b.get(var1));
                        }
                     }
                  }
               }

               cq var71 = new cq();
               var71.a = var7;
               var71.b = var59;
               var71.c = var62;
               var71.d = this.f.get();
               var58 = this.l;
               if (var58 != null) {
                  var71.e = var58.k;
               }

               var71.f.addAll(this.z.keySet());
               var71.g.addAll(this.z.values());
               var71.h = new ArrayList(this.p);
               var6.putParcelable("state", var71);
               var4 = this.A.keySet().iterator();

               String var65;
               Bundle var66;
               while(var4.hasNext()) {
                  var65 = (String)var4.next();
                  String var63 = String.valueOf(var65);
                  var66 = (Bundle)this.A.get(var65);
                  var6.putBundle("result_".concat(var63), var66);
               }

               var60 = var67.keySet().iterator();

               while(var60.hasNext()) {
                  var65 = (String)var60.next();
                  String var64 = String.valueOf(var65);
                  var66 = (Bundle)var67.get(var65);
                  var6.putBundle("fragment_".concat(var64), var66);
               }
            }

            return var6;
         }

         dl var5 = (dl)var4.next();
         if (var5.e) {
            var5.e = false;
            var5.c();
         }
      }
   }

   final bv c(String var1) {
      return this.a.b(var1);
   }

   public final bv d(int var1) {
      cu var4 = this.a;
      int var2 = var4.a.size() - 1;

      Object var3;
      while(true) {
         if (var2 < 0) {
            Iterator var6 = var4.b.values().iterator();

            while(var6.hasNext()) {
               llo var5 = (llo)var6.next();
               if (var5 != null) {
                  var3 = var5.c;
                  if (((bv)var3).D == var1) {
                     return (bv)var3;
                  }
               }
            }

            var3 = null;
            break;
         }

         var3 = (bv)var4.a.get(var2);
         if (var3 != null && ((bv)var3).D == var1) {
            break;
         }

         --var2;
      }

      return (bv)var3;
   }

   public final bv e(String var1) {
      cu var4 = this.a;
      int var2 = var4.a.size() - 1;

      Object var5;
      while(true) {
         if (var2 < 0) {
            Iterator var8 = var4.b.values().iterator();

            while(var8.hasNext()) {
               llo var6 = (llo)var8.next();
               if (var6 != null) {
                  Object var7 = var6.c;
                  if (var1.equals(((bv)var7).F)) {
                     var5 = var7;
                     return (bv)var5;
                  }
               }
            }

            var5 = null;
            break;
         }

         bv var3 = (bv)var4.a.get(var2);
         if (var3 != null && var1.equals(var3.F)) {
            var5 = var3;
            break;
         }

         --var2;
      }

      return (bv)var5;
   }

   public final cc h() {
      bv var1 = this.k;
      return var1 != null ? var1.z.h() : this.F;
   }

   public final cw i() {
      return new at(this);
   }

   public final void j(cs var1) {
      this.g.add(var1);
   }

   public final void k(cd var1, ca var2, bv var3) {
      if (this.i == null) {
         this.i = var1;
         this.j = var2;
         this.k = var3;
         if (var3 != null) {
            this.j(new cj());
         } else if (var1 instanceof cs) {
            this.j(var1);
         }

         if (this.k != null) {
            this.N();
         }

         if (var1 instanceof pd) {
            pc var4 = ((bx)var1).a.g;
            this.d = var4;
            Object var7;
            if (var3 != null) {
               var7 = var3;
            } else {
               var7 = var1;
            }

            ot var5 = this.e;
            var7.getClass();
            var5.getClass();
            clx var9 = ((cmc)var7).getLifecycle();
            if (var9.b != clw.a) {
               var5.b(new oz(var4, var9, var5));
               var4.e();
               var5.d = new pb(var4, 1);
            }
         }

         cr var6;
         if (var3 != null) {
            cr var11 = var3.z.u;
            var6 = (cr)var11.c.get(var3.k);
            if (var6 == null) {
               var6 = new cr(var11.e);
               var11.c.put(var3.k, var6);
            }

            this.u = var6;
         } else if (var1 instanceof cnm) {
            gfv var14 = var1.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging();
            cnj var13 = cr.a;
            var14.getClass();
            cnn var8 = cnn.a;
            var8.getClass();
            this.u = (cr)clu.c(cr.class, var14, var13, var8);
         } else {
            this.u = new cr(false);
         }

         var6 = this.u;
         var6.g = this.V();
         this.a.d = var6;
         var1 = this.i;
         if (var1 instanceof cry && var3 == null) {
            crx var10 = var1.getSavedStateRegistry();
            var10.b("android:support:fragments", new cf(this, 0));
            Bundle var12 = var10.a("android:support:fragments");
            if (var12 != null) {
               this.J(var12);
            }
         }

         var1 = this.i;
         if (var1 instanceof po) {
            pn var15 = var1.c();
            String var16;
            if (var3 != null) {
               var16 = String.valueOf(var3.k).concat(":");
            } else {
               var16 = "";
            }

            pt var17 = new pt();
            ck var20 = new ck(this, 1);
            var16 = "FragmentManager:".concat(var16);
            this.m = var15.a(var16.concat("StartActivityForResult"), var17, var20);
            cl var19 = new cl();
            var20 = new ck(this, 0);
            this.n = var15.a(var16.concat("StartIntentSenderForResult"), var19, var20);
            ps var21 = new ps();
            cg var23 = new cg(this);
            this.o = var15.a(var16.concat("RequestPermissions"), var21, var23);
         }

         var1 = this.i;
         if (var1 instanceof cco) {
            var1.d(this.B);
         }

         var1 = this.i;
         cew var18;
         if (var1 instanceof ccp) {
            var18 = this.C;
            ((bx)var1).a.i.add(var18);
         }

         var1 = this.i;
         if (var1 instanceof dh) {
            var18 = this.D;
            ((bx)var1).a.k.add(var18);
         }

         cd var22 = this.i;
         if (var22 instanceof di) {
            cew var25 = this.E;
            ((bx)var22).a.l.add(var25);
         }

         var22 = this.i;
         if (var22 instanceof cfl && var3 == null) {
            AmbientMode$AmbientController var26 = this.M;
            ve var24 = ((bx)var22).a.q;
            ((CopyOnWriteArrayList)var24.a).add(var26);
            ((Runnable)var24.b).run();
         }

      } else {
         throw new IllegalStateException("Already attached");
      }
   }

   final void l(bv var1) {
      StringBuilder var2;
      if (S(2)) {
         var2 = new StringBuilder();
         var2.append("attach: ");
         var2.append(var1);
      }

      if (var1.H) {
         var1.H = false;
         if (!var1.q) {
            this.a.g(var1);
            if (S(2)) {
               var2 = new StringBuilder();
               var2.append("add from attach: ");
               var2.append(var1);
            }

            if (X(var1)) {
               this.q = true;
            }
         }
      }

   }

   final void m(bv var1) {
      StringBuilder var2;
      if (S(2)) {
         var2 = new StringBuilder();
         var2.append("detach: ");
         var2.append(var1);
      }

      if (!var1.H) {
         var1.H = true;
         if (var1.q) {
            if (S(2)) {
               var2 = new StringBuilder();
               var2.append("remove from detach: ");
               var2.append(var1);
            }

            this.a.i(var1);
            if (X(var1)) {
               this.q = true;
            }

            this.ap(var1);
         }
      }

   }

   public final void n() {
      this.r = false;
      this.s = false;
      this.u.g = false;
      this.A(4);
   }

   final void o(Configuration var1, boolean var2) {
      if (var2 && this.i instanceof cco) {
         this.ar(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
      }

      Iterator var4 = this.a.f().iterator();

      while(var4.hasNext()) {
         bv var3 = (bv)var4.next();
         if (var3 != null) {
            var3.onConfigurationChanged(var1);
            if (var2) {
               var3.B.o(var1, true);
            }
         }
      }

   }

   final void p() {
      this.r = false;
      this.s = false;
      this.u.g = false;
      this.A(1);
   }

   public final void q() {
      this.t = true;
      this.ab(true);
      this.al();
      cd var2 = this.i;
      boolean var1;
      if (var2 instanceof cnm) {
         var1 = this.a.d.f;
      } else {
         var1 = true ^ ((Activity)var2.c).isChangingConfigurations();
      }

      Iterator var5;
      if (var1) {
         Iterator var4 = this.z.values().iterator();

         while(var4.hasNext()) {
            var5 = ((aw)var4.next()).a.iterator();

            while(var5.hasNext()) {
               String var3 = (String)var5.next();
               this.a.d.c(var3);
            }
         }
      }

      this.A(-1);
      var2 = this.i;
      cew var6;
      if (var2 instanceof ccp) {
         var6 = this.C;
         ((bx)var2).a.i.remove(var6);
      }

      var2 = this.i;
      if (var2 instanceof cco) {
         var2.f(this.B);
      }

      var2 = this.i;
      if (var2 instanceof dh) {
         var6 = this.D;
         ((bx)var2).a.k.remove(var6);
      }

      cd var8 = this.i;
      if (var8 instanceof di) {
         cew var7 = this.E;
         ((bx)var8).a.l.remove(var7);
      }

      var8 = this.i;
      if (var8 instanceof cfl && this.k == null) {
         AmbientMode$AmbientController var9 = this.M;
         ve var10 = ((bx)var8).a.q;
         ((CopyOnWriteArrayList)var10.a).remove(var9);
         if ((cca)((Map)var10.c).remove(var9) != null) {
            throw null;
         }

         ((Runnable)var10.b).run();
      }

      this.i = null;
      this.j = null;
      this.k = null;
      if (this.d != null) {
         var5 = this.e.c.iterator();

         while(var5.hasNext()) {
            ((om)var5.next()).a();
         }

         this.d = null;
      }

      pj var11 = this.m;
      if (var11 != null) {
         var11.a();
         this.n.a();
         this.o.a();
      }

   }

   final void r(boolean var1) {
      if (var1 && this.i instanceof ccp) {
         this.ar(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
      }

      Iterator var3 = this.a.f().iterator();

      while(var3.hasNext()) {
         bv var2 = (bv)var3.next();
         if (var2 != null) {
            var2.onLowMemory();
            if (var1) {
               var2.B.r(true);
            }
         }
      }

   }

   final void s(boolean var1, boolean var2) {
      if (var2 && this.i instanceof dh) {
         this.ar(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
      }

      Iterator var3 = this.a.f().iterator();

      while(var3.hasNext()) {
         bv var4 = (bv)var3.next();
         if (var4 != null && var2) {
            var4.B.s(var1, true);
         }
      }

   }

   public final void t() {
      Iterator var2 = this.a.e().iterator();

      while(var2.hasNext()) {
         bv var1 = (bv)var2.next();
         if (var1 != null) {
            var1.B.t();
         }
      }

   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("FragmentManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      bv var2 = this.k;
      if (var2 != null) {
         var1.append(var2.getClass().getSimpleName());
         var1.append("{");
         var1.append(Integer.toHexString(System.identityHashCode(this.k)));
         var1.append("}");
      } else {
         cd var3 = this.i;
         if (var3 != null) {
            var1.append(var3.getClass().getSimpleName());
            var1.append("{");
            var1.append(Integer.toHexString(System.identityHashCode(this.i)));
            var1.append("}");
         } else {
            var1.append("null");
         }
      }

      var1.append("}}");
      return var1.toString();
   }

   public final void u(Menu var1) {
      if (this.h > 0) {
         Iterator var2 = this.a.f().iterator();

         while(var2.hasNext()) {
            bv var3 = (bv)var2.next();
            if (var3 != null && !var3.G) {
               var3.B.u(var1);
            }
         }

      }
   }

   public final void v(bv var1) {
      if (var1 != null && var1.equals(this.c(var1.k))) {
         boolean var2 = var1.z.U(var1);
         Boolean var3 = var1.p;
         if (var3 == null || var3 != var2) {
            var1.p = var2;
            cp var4 = var1.B;
            var4.N();
            var4.v(var4.l);
         }
      }

   }

   public final void w() {
      this.A(5);
   }

   final void x(boolean var1, boolean var2) {
      if (var2 && this.i instanceof di) {
         this.ar(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
      }

      Iterator var3 = this.a.f().iterator();

      while(var3.hasNext()) {
         bv var4 = (bv)var3.next();
         if (var4 != null && var2) {
            var4.B.x(var1, true);
         }
      }

   }

   public final void y() {
      this.r = false;
      this.s = false;
      this.u.g = false;
      this.A(7);
   }

   public final void z() {
      this.r = false;
      this.s = false;
      this.u.g = false;
      this.A(5);
   }
}
