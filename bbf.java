import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.hardware.camera2.CaptureRequest.Key;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;

public final class bbf {
   public final Object a;
   public final Object b;
   public final Object c;

   public bbf() {
      this((byte[])null);
   }

   public bbf(Context var1, eze var2) {
      this.b = var1;
      this.a = (NotificationManager)var1.getSystemService(NotificationManager.class);
      this.c = var2;
   }

   public bbf(Context var1, myd var2, qrz var3) {
      this.c = var1;
      this.b = var2;
      this.a = var3;
   }

   public bbf(SQLiteDatabase var1, myd var2, Random var3, byte[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public bbf(View var1, dmw var2) {
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
      View var3 = (View)var1;
      AutofillManager var4 = (AutofillManager)var1.getContext().getSystemService(AutofillManager.class);
      if (var4 != null) {
         this.c = var4;
         var3 = (View)var1;
         var1.setImportantForAutofill(1);
      } else {
         throw new IllegalStateException("Autofill service could not be located.");
      }
   }

   public bbf(avi var1, bbf var2) {
      this.b = var1;
      this.c = var2;
      this.a = var1.a();
   }

   public bbf(bro var1, Map var2) {
      var2.getClass();
      super();
      this.c = var1;
      bro var5 = (bro)var1;
      this.b = var1.c;
      this.a = new LinkedHashSet();
      var5 = (bro)var1;
      List var6 = var1.h();
      int var4 = var6.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         var1 = (bro)var6.get(var3);
         if (var2.containsKey(var1.e)) {
            ((Set)this.a).add(var1.e);
         }
      }

   }

   public bbf(dam var1) {
      this(var1.a, var1.b, var1.c);
   }

   public bbf(Object var1, Object var2, Object var3) {
      this.c = var1;
      this.b = var2;
      this.a = var3;
   }

   public bbf(Object var1, Object var2, Object var3, byte[] var4) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public bbf(Object var1, Object var2, Object var3, char[] var4) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   public bbf(Object var1, Object var2, Object var3, int[] var4) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public bbf(Object var1, Object var2, Object var3, short[] var4) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public bbf(List var1) {
      this.b = var1;
      this.c = new ArrayList(var1.size());
      this.a = new ArrayList(var1.size());

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         ((List)this.c).add(((dlq)((lof)var1.get(var2)).c).a());
         Object var3 = ((lof)var1.get(var2)).d;
         ((List)this.a).add(((dlm)var3).a());
      }

   }

   public bbf(List var1, byte[] var2) {
      List var3 = Collections.emptyList();
      List var9 = Collections.emptyList();
      super();
      this.b = new HashMap();
      this.a = new HashMap();
      this.c = new ArrayList();
      Iterator var4 = var1.iterator();

      String var11;
      while(var4.hasNext()) {
         nwi var6 = (nwi)var4.next();
         if (TextUtils.isEmpty(var6.e())) {
            Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
         } else {
            nwi var5 = (nwi)((Map)this.b).put(var6.e(), var6);
            if (var5 != null) {
               var11 = var5.getClass().getCanonicalName();
               String var7 = var6.getClass().getCanonicalName();
               StringBuilder var12 = new StringBuilder();
               var12.append("Cannot override Backend ");
               var12.append(var11);
               var12.append(" with ");
               var12.append(var7);
               throw new IllegalArgumentException(var12.toString());
            }
         }
      }

      var4 = var3.iterator();

      while(var4.hasNext()) {
         nwn var8 = (nwn)var4.next();
         if (TextUtils.isEmpty(var8.a())) {
            Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
         } else {
            nwn var13 = (nwn)((Map)this.a).put(var8.a(), var8);
            if (var13 != null) {
               var11 = var13.getClass().getCanonicalName();
               String var14 = var8.getClass().getCanonicalName();
               StringBuilder var10 = new StringBuilder();
               var10.append("Cannot to override Transform ");
               var10.append(var11);
               var10.append(" with ");
               var10.append(var14);
               throw new IllegalArgumentException(var10.toString());
            }
         }
      }

      ((List)this.c).addAll(var9);
   }

   public bbf(Map var1, Set var2, Set var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public bbf(Set var1, Set var2, Set var3) {
      this.b = ozr.F(var1);
      this.a = ozr.F(var2);
      this.c = ozr.F(var3);
   }

   public bbf(UUID var1, dfb var2, Set var3) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public bbf(jqs var1) {
      this.a = new ArrayDeque();
      this.c = new SparseArray();
      this.b = var1;
   }

   public bbf(lmk var1) {
      mbx.a();
      this.a = var1;
      this.b = (ConstraintLayout)var1.f(2131427501);
      this.c = var1.f(2131428063);
   }

   public bbf(mws var1, opm var2, fwf var3) {
      this.c = var2;
      this.b = var3;
      this.a = var1.p;
   }

   public bbf(nbt var1, AmbientMode$AmbientController var2, Runnable var3) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   public bbf(nsj var1, fnu var2) {
      new AtomicInteger(0);
      new mcy("");
      new HashSet();
      ozr var4 = ozr.I(nyl.c, nyl.b);
      this.c = var4;
      var4 = ozr.H(new nym(var4));
      this.a = var4;
      this.b = var1;
      reo var5 = new reo((ree)((odh)var2.b).a, new nzk(var2, (que)null), 4);
      Object var6 = var2.c;
      qzr var8 = rah.b;
      qwo.o(qzy.k((qui)((otw)var6).e(var8)), (qui)null, 0, new rei(var5, (que)null), 3);
      boolean var3;
      if (var1 != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      onk.w(var3);
      onk.w(true);
      List var7 = nyy.a;
      erb var11 = new erb();
      erb var9 = erb.a;
      nsj var10 = (nsj)var1;
      qwo.o((qzv)((qsd)var1.c).a(), (qui)null, 0, new nzj(var1, var4, var7, var9, var11, (que)null), 3);
   }

   // $FF: synthetic method
   public bbf(byte[] var1) {
      Path var2 = new Path();
      super();
      this.a = var2;
      this.c = new RectF();
      this.b = new float[8];
      new Matrix();
   }

   public bbf(char[] var1) {
      this.c = new PointF();
      this.b = new PointF();
      this.a = new PointF();
   }

   public bbf(int[] var1) {
      this.c = new nxs();
      this.a = new ArrayList();
      this.b = new ArrayList();
   }

   public bbf(short[] var1) {
      this.a = new AtomicInteger(0);
      this.b = new AtomicInteger(0);
      this.c = new AtomicInteger(0);
   }

   public static lmt N() {
      return new lmt();
   }

   public static bbf ab(bbf var0) {
      return new bbf(new HashMap((Map)var0.a), new HashSet((Collection)var0.c), new HashSet((Collection)var0.b));
   }

   private final boolean ad() {
      return (Boolean)((mdq)this.c).eZ() || ((flx)this.a).m(fmd.bx);
   }

   // $FF: synthetic method
   public static void q(csp var0, fgb var1) {
      var0.e(1, (long)var1.a);
      var0.e(2, (long)var1.b);
      var0.e(3, (long)var1.c);
      var0.e(4, (long)var1.d);
      var0.e(5, var1.e);
   }

   // $FF: synthetic method
   public static void r(csp var0, Object var1) {
      fgp var2 = (fgp)var1;
      var0.e(1, (long)var2.a.ordinal());
      var0.e(2, (long)var2.b);
      var0.e(3, (long)var2.c);
      var0.e(4, (long)var2.d);
   }

   public final boolean A(Uri var1) {
      nzu var2 = this.B(var1);
      return ((nwi)var2.b).f((Uri)var2.d);
   }

   public final nzu B(Uri var1) {
      oyu var5 = oyz.e();
      Pattern var4 = nwb.a;
      oyu var6 = oyz.e();
      String var11 = var1.getEncodedFragment();
      oyz var12;
      if (!TextUtils.isEmpty(var11) && var11.startsWith("transform=")) {
         var11 = var11.substring(10);
         var12 = oyz.j(ouk.c("+").a().d(var11));
      } else {
         var12 = pby.a;
      }

      int var3 = var12.size();

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         String var7 = (String)var12.get(var2);
         Matcher var8 = nwb.a.matcher(var7);
         if (!var8.matches()) {
            throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(var7)));
         }

         var6.h(var8.group(1));
      }

      oyz var20 = var6.g();
      var3 = ((pby)var20).c;

      for(var2 = 0; var2 < var3; ++var2) {
         var11 = (String)var20.get(var2);
         nwn var16 = (nwn)((Map)this.a).get(var11);
         if (var16 == null) {
            String var9 = String.valueOf(var1);
            StringBuilder var13 = new StringBuilder();
            var13.append("No such transform: ");
            var13.append(var11);
            var13.append(": ");
            var13.append(var9);
            throw new nvw(var13.toString());
         }

         var5.h(var16);
      }

      var20 = var5.g().a();
      nvk var14 = new nvk();
      String var17 = var1.getScheme();
      nwi var15 = (nwi)((Map)this.b).get(var17);
      if (var15 == null) {
         nvw var10 = new nvw(String.format("Cannot open, unregistered backend: %s", var17));
         throw var10;
      } else {
         var14.a = var15;
         var14.c = (List)this.c;
         var14.b = var20;
         Uri var18 = var1;
         if (!var20.isEmpty()) {
            ArrayList var19 = new ArrayList(var1.getPathSegments());
            var18 = var1;
            if (!var19.isEmpty()) {
               var18 = var1;
               if (!var1.getPath().endsWith("/")) {
                  var11 = (String)var19.get(var19.size() - 1);

                  for(ListIterator var21 = var20.listIterator(var20.size()); var21.hasPrevious(); var11 = ((nwn)var21.previous()).b()) {
                  }

                  var19.set(var19.size() - 1, var11);
                  var18 = var1.buildUpon().path(TextUtils.join("/", var19)).encodedFragment((String)null).build();
               }
            }
         }

         var14.d = var18;
         return new nzu(var14);
      }
   }

   public final mwh C(mxd var1, String var2, long var3) {
      fwf var11 = (fwf)this.b;
      ScheduledExecutorService var7 = (ScheduledExecutorService)((qrz)var11.b).get();
      var7.getClass();
      Object var8 = ((qrz)var11.a).get();
      mws var10 = ((jsk)var11.c).a();
      min var9 = (min)((qrz)var11.d).get();
      var9.getClass();
      mic var16 = ((mia)var11.e).a();
      mwp var13 = new mwp(var7, (nwu)var8, var10, var9, var16);
      long var5 = SystemClock.elapsedRealtimeNanos();
      opm var14 = (opm)this.c;
      mxi var15 = (mxi)((qrz)var14.d).get();
      var15.getClass();
      mws var20 = ((jsk)var14.e).a();
      mnb var18 = (mnb)((qrz)var14.b).get();
      var18.getClass();
      hkl var12 = hkl.b;
      mic var19 = ((mia)var14.c).a();
      min var17 = (min)((qrz)var14.f).get();
      var17.getClass();
      var14 = (opm)((qrz)var14.a).get();
      var14.getClass();
      var1.getClass();
      return new mwh(var15, var20, var18, var12, var19, var17, var14, var1, var13, var2, var5, var3);
   }

   public final void D(XmlSerializer var1, nsj var2) {
      var1.startTag("", "node");
      ((nxs)this.c).e(var1, var2);
      Iterator var3 = ((List)this.a).iterator();

      while(var3.hasNext()) {
         ((bbf)var3.next()).D(var1, var2);
      }

      Iterator var5 = ((List)this.b).iterator();
      if (!var5.hasNext()) {
         var1.endTag("", "node");
      } else {
         noa var4 = (noa)var5.next();
         throw null;
      }
   }

   public final mmy E() {
      return new mmy(new HashSet(((Map)this.a).values()), new HashSet((Collection)this.c), new HashSet((Collection)this.b));
   }

   public final void F(mnp var1) {
      Iterator var2 = ((Set)this.b).iterator();

      while(var2.hasNext()) {
         mnp var3 = (mnp)var2.next();
         if (!mzx.aP(var1, var3, (mic)null)) {
            String var4 = String.valueOf(var3);
            String var5 = String.valueOf(var1);
            StringBuilder var6 = new StringBuilder();
            var6.append("Removing ");
            var6.append(var4);
            var6.append(" because it conflicts with ");
            var6.append(var5);
            Log.w("pck", var6.toString());
            var2.remove();
         }
      }

      ((Set)this.b).add(var1);
   }

   public final void G() {
      ((Set)this.b).clear();
   }

   public final void H(Key var1, Object var2) {
      ((Map)this.a).put(var1, mzx.aS(var1, var2));
   }

   public final void I(Set var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         mmb var2 = (mmb)var3.next();
         ((Map)this.a).put(var2.a, var2);
      }

   }

   public final mhq J() {
      return ((AmbientDelegate)this.c).Z();
   }

   public final psd K(Set var1) {
      synchronized(this){}

      Throwable var778;
      Throwable var10000;
      label5750: {
         mbv var8;
         boolean var10001;
         try {
            var8 = new mbv();
         } catch (Throwable var771) {
            var10000 = var771;
            var10001 = false;
            break label5750;
         }

         psd var772;
         label5751: {
            label5740: {
               mmt var9;
               Iterator var10;
               try {
                  var8.d(this.J());
                  var9 = new mmt(this);
                  var10 = var1.iterator();
               } catch (Throwable var766) {
                  var10000 = var766;
                  var10001 = false;
                  break label5740;
               }

               label5739:
               while(true) {
                  jng var6;
                  mnp var11;
                  Iterator var13;
                  label5737: {
                     try {
                        if (var10.hasNext()) {
                           var11 = (mnp)var10.next();
                           var13 = var11.a.iterator();
                           break label5737;
                        }
                     } catch (Throwable var770) {
                        var10000 = var770;
                        var10001 = false;
                        break;
                     }

                     try {
                        var772 = osh.aq(var9.a);
                        var6 = new jng(var9, 13);
                        var772 = pqp.i(var772, var6, pre.a);
                        break label5751;
                     } catch (Throwable var749) {
                        var10000 = var749;
                        var10001 = false;
                        break;
                     }
                  }

                  while(true) {
                     boolean var2;
                     long var4;
                     psd var775;
                     Object var7;
                     mqs var12;
                     mtz var14;
                     while(true) {
                        boolean var3;
                        try {
                           var3 = var13.hasNext();
                        } catch (Throwable var757) {
                           var10000 = var757;
                           var10001 = false;
                           break label5739;
                        }

                        var2 = true;
                        var775 = null;
                        if (!var3) {
                           Iterator var780;
                           try {
                              var780 = var11.b.iterator();
                           } catch (Throwable var756) {
                              var10000 = var756;
                              var10001 = false;
                              break label5739;
                           }

                           label5704:
                           while(true) {
                              mqt var781;
                              label5756: {
                                 mtz var773;
                                 Object var783;
                                 while(true) {
                                    try {
                                       if (!var780.hasNext()) {
                                          break label5704;
                                       }

                                       var781 = (mqt)var780.next();
                                       if (var9.b.contains(var781)) {
                                          continue;
                                       }

                                       if (var781.b > 0L) {
                                          var783 = var9.d.b;
                                          onk.k(true);
                                          var4 = var781.b;
                                          var773 = ((nom)var783).m(var4);
                                          break;
                                       }
                                    } catch (Throwable var767) {
                                       var10000 = var767;
                                       var10001 = false;
                                       break label5739;
                                    }

                                    try {
                                       var9.a.add(osh.au(mqu.g(var781)));
                                       break label5756;
                                    } catch (Throwable var752) {
                                       var10000 = var752;
                                       var10001 = false;
                                       break label5739;
                                    }
                                 }

                                 if (var773 == null) {
                                    try {
                                       Object var774 = ((nom)var783).b;
                                       var4 = var781.b;
                                       var772 = ((AmbientDelegate)var774).ac(var4);
                                       iuc var784 = new iuc(17);
                                       var772 = pqp.i(var772, var784, pre.a);
                                    } catch (Throwable var755) {
                                       var10000 = var755;
                                       var10001 = false;
                                       break label5739;
                                    }
                                 } else {
                                    try {
                                       var772 = osh.au(mrf.f(var773, (mtz)null, true));
                                    } catch (Throwable var754) {
                                       var10000 = var754;
                                       var10001 = false;
                                       break label5739;
                                    }
                                 }

                                 try {
                                    jng var785 = new jng(var781, 12);
                                    var772 = pqp.i(var772, var785, pre.a);
                                    var9.a.add(var772);
                                 } catch (Throwable var753) {
                                    var10000 = var753;
                                    var10001 = false;
                                    break label5739;
                                 }
                              }

                              try {
                                 var9.b.add(var781);
                              } catch (Throwable var751) {
                                 var10000 = var751;
                                 var10001 = false;
                                 break label5739;
                              }
                           }

                           try {
                              var9.c.add(var11);
                              continue label5739;
                           } catch (Throwable var750) {
                              var10000 = var750;
                              var10001 = false;
                              break label5739;
                           }
                        }

                        try {
                           var12 = (mqs)var13.next();
                           if (!var9.b.contains(var12)) {
                              var7 = var9.d.b;
                              var14 = ((nom)var7).n(var12);
                              break;
                           }
                        } catch (Throwable var768) {
                           var10000 = var768;
                           var10001 = false;
                           break label5739;
                        }
                     }

                     if (var14 == null) {
                        try {
                           var772 = ((AmbientDelegate)var12.e.a).ac(1L);
                        } catch (Throwable var765) {
                           var10000 = var765;
                           var10001 = false;
                           break label5739;
                        }
                     } else {
                        var772 = null;
                     }

                     label5761: {
                        label5720:
                        try {
                           if (var12.c <= 0L) {
                              break label5720;
                           }
                           break label5761;
                        } catch (Throwable var769) {
                           var10000 = var769;
                           var10001 = false;
                           break label5739;
                        }

                        var2 = false;
                     }

                     mtz var15;
                     try {
                        onk.k(var2);
                        var4 = var12.c;
                        var15 = ((nom)var7).m(var4);
                     } catch (Throwable var764) {
                        var10000 = var764;
                        var10001 = false;
                        break label5739;
                     }

                     if (var15 == null) {
                        try {
                           Object var776 = ((nom)var7).b;
                           var4 = var12.c;
                           var775 = ((AmbientDelegate)var776).ac(var4);
                        } catch (Throwable var763) {
                           var10000 = var763;
                           var10001 = false;
                           break label5739;
                        }
                     }

                     if (var14 != null && var15 != null) {
                        try {
                           var772 = osh.au(mrf.f(var15, var14, var12.i()));
                        } catch (Throwable var762) {
                           var10000 = var762;
                           var10001 = false;
                           break label5739;
                        }
                     } else {
                        psd var777 = var772;
                        if (var772 == null) {
                           try {
                              var14.getClass();
                              var777 = osh.au(var14);
                           } catch (Throwable var761) {
                              var10000 = var761;
                              var10001 = false;
                              break label5739;
                           }
                        }

                        var772 = var775;
                        if (var775 == null) {
                           try {
                              var15.getClass();
                              var772 = osh.au(var15);
                           } catch (Throwable var760) {
                              var10000 = var760;
                              var10001 = false;
                              break label5739;
                           }
                        }

                        try {
                           mop var779 = new mop(var12);
                           var772 = mzx.bM(var777, var772, var779);
                        } catch (Throwable var759) {
                           var10000 = var759;
                           var10001 = false;
                           break label5739;
                        }
                     }

                     try {
                        var6 = new jng(var12, 11);
                        var772 = pqp.i(var772, var6, pre.a);
                        var9.a.add(var772);
                        var9.b.add(var12);
                     } catch (Throwable var758) {
                        var10000 = var758;
                        var10001 = false;
                        break label5739;
                     }
                  }
               }
            }

            var778 = var10000;

            try {
               var8.close();
            } catch (Throwable var747) {
               Throwable var782 = var747;

               label5642:
               try {
                  c.C(var778, var782);
                  break label5642;
               } catch (Throwable var746) {
                  var10000 = var746;
                  var10001 = false;
                  break label5750;
               }
            }

            try {
               throw var778;
            } catch (Throwable var745) {
               var10000 = var745;
               var10001 = false;
               break label5750;
            }
         }

         label5649:
         try {
            var8.close();
            return var772;
         } catch (Throwable var748) {
            var10000 = var748;
            var10001 = false;
            break label5649;
         }
      }

      var778 = var10000;
      throw var778;
   }

   public final Set L(Set var1) {
      synchronized(this){}

      try {
         var1 = this.M(var1, pce.a);
      } finally {
         ;
      }

      return var1;
   }

   public final Set M(Set var1, Set var2) {
      synchronized(this){}

      Throwable var1926;
      Throwable var10000;
      label16787: {
         mbv var8;
         boolean var10001;
         try {
            var8 = new mbv();
         } catch (Throwable var1911) {
            var10000 = var1911;
            var10001 = false;
            break label16787;
         }

         ozr var1925;
         label16788: {
            label16777: {
               ArrayList var9;
               ArrayList var10;
               ArrayList var11;
               ArrayList var12;
               Iterator var1914;
               try {
                  var8.d(this.J());
                  var11 = new ArrayList();
                  var9 = new ArrayList();
                  var10 = new ArrayList();
                  var12 = new ArrayList();
                  var1914 = var2.iterator();
               } catch (Throwable var1908) {
                  var10000 = var1908;
                  var10001 = false;
                  break label16777;
               }

               label16776:
               while(true) {
                  mnr var1931;
                  mnp var1932;
                  Iterator var1933;
                  label16790: {
                     try {
                        if (var1914.hasNext()) {
                           var1931 = (mnr)var1914.next();
                           var1933 = var1931.a.iterator();
                           break label16790;
                        }
                     } catch (Throwable var1910) {
                        var10000 = var1910;
                        var10001 = false;
                        break;
                     }

                     Iterator var13;
                     try {
                        var13 = var1.iterator();
                     } catch (Throwable var1901) {
                        var10000 = var1901;
                        var10001 = false;
                        break;
                     }

                     Iterator var15;
                     Object var1913;
                     label16747:
                     while(true) {
                        ArrayList var14;
                        mnp var16;
                        while(true) {
                           try {
                              if (!var13.hasNext()) {
                                 break label16747;
                              }

                              var16 = (mnp)var13.next();
                              if (!var10.contains(var16)) {
                                 var10.add(var16);
                                 var14 = new ArrayList();
                                 var15 = var16.a.iterator();
                                 break;
                              }
                           } catch (Throwable var1905) {
                              var10000 = var1905;
                              var10001 = false;
                              break label16776;
                           }
                        }

                        while(true) {
                           int var3;
                           int var4;
                           label16793: {
                              long var5;
                              mtz var1912;
                              mrf var1916;
                              while(true) {
                                 mqs var17;
                                 mtz var18;
                                 Object var19;
                                 try {
                                    if (!var15.hasNext()) {
                                       break;
                                    }

                                    var17 = (mqs)var15.next();
                                    if (var12.contains(var17)) {
                                       continue;
                                    }

                                    var8.d(var17.e.g());
                                    var19 = this.b;
                                    var18 = ((nom)var19).n(var17);
                                 } catch (Throwable var1904) {
                                    var10000 = var1904;
                                    var10001 = false;
                                    break label16776;
                                 }

                                 if (var18 == null) {
                                    var1916 = null;
                                 } else {
                                    boolean var7;
                                    label16698: {
                                       label16697: {
                                          try {
                                             if (var17.c > 0L) {
                                                break label16697;
                                             }
                                          } catch (Throwable var1902) {
                                             var10000 = var1902;
                                             var10001 = false;
                                             break label16776;
                                          }

                                          var7 = false;
                                          break label16698;
                                       }

                                       var7 = true;
                                    }

                                    mtz var1915;
                                    try {
                                       onk.k(var7);
                                       var5 = var17.c;
                                       var1915 = ((nom)var19).m(var5);
                                    } catch (Throwable var1899) {
                                       var10000 = var1899;
                                       var10001 = false;
                                       break label16776;
                                    }

                                    var1912 = var1915;
                                    if (var1915 == null) {
                                       var1912 = var1915;

                                       try {
                                          if (var17.i()) {
                                             var1913 = ((nom)var19).b;
                                             var5 = var17.c;
                                             var1912 = ((AmbientDelegate)var1913).aa(var5);
                                          }
                                       } catch (Throwable var1898) {
                                          var10000 = var1898;
                                          var10001 = false;
                                          break label16776;
                                       }
                                    }

                                    if (var1912 == null) {
                                       try {
                                          var18.close();
                                       } catch (Throwable var1897) {
                                          var10000 = var1897;
                                          var10001 = false;
                                          break label16776;
                                       }

                                       var1916 = null;
                                    } else {
                                       try {
                                          var1916 = mrf.f(var1912, var18, var17.i());
                                       } catch (Throwable var1896) {
                                          var10000 = var1896;
                                          var10001 = false;
                                          break label16776;
                                       }
                                    }
                                 }

                                 if (var1916 == null) {
                                    break label16793;
                                 }

                                 try {
                                    var14.add(mqz.e(var17, var1916));
                                 } catch (Throwable var1900) {
                                    var10000 = var1900;
                                    var10001 = false;
                                    break label16776;
                                 }
                              }

                              try {
                                 var1914 = var16.b.iterator();
                              } catch (Throwable var1895) {
                                 var10000 = var1895;
                                 var10001 = false;
                                 break label16776;
                              }

                              label16725:
                              while(true) {
                                 mqt var1934;
                                 label16723:
                                 while(true) {
                                    while(true) {
                                       try {
                                          if (!var1914.hasNext()) {
                                             break label16725;
                                          }

                                          var1934 = (mqt)var1914.next();
                                          if (!var12.contains(var1934)) {
                                             if (var1934.b <= 0L) {
                                                break;
                                             }

                                             var1913 = this.b;
                                             onk.w(true);
                                             var5 = var1934.b;
                                             var1912 = ((nom)var1913).m(var5);
                                             break label16723;
                                          }
                                       } catch (Throwable var1903) {
                                          var10000 = var1903;
                                          var10001 = false;
                                          break label16776;
                                       }
                                    }

                                    try {
                                       var14.add(mqu.g(var1934));
                                    } catch (Throwable var1893) {
                                       var10000 = var1893;
                                       var10001 = false;
                                       break label16776;
                                    }
                                 }

                                 if (var1912 == null) {
                                    var1916 = null;
                                 } else {
                                    try {
                                       var1916 = mrf.f(var1912, (mtz)null, true);
                                    } catch (Throwable var1892) {
                                       var10000 = var1892;
                                       var10001 = false;
                                       break label16776;
                                    }
                                 }

                                 if (var1916 == null) {
                                    break label16793;
                                 }

                                 try {
                                    var14.add(mqu.e(var1934, var1916));
                                 } catch (Throwable var1894) {
                                    var10000 = var1894;
                                    var10001 = false;
                                    break label16776;
                                 }
                              }

                              try {
                                 var4 = var14.size();
                              } catch (Throwable var1888) {
                                 var10000 = var1888;
                                 var10001 = false;
                                 break label16776;
                              }

                              var3 = 0;

                              while(true) {
                                 if (var3 >= var4) {
                                    continue label16747;
                                 }

                                 try {
                                    mrd var1922 = (mrd)var14.get(var3);
                                    onk.H(var11.contains(var1922) ^ true);
                                    var12.add(var1922.d());
                                    var11.add(var1922);
                                 } catch (Throwable var1887) {
                                    var10000 = var1887;
                                    var10001 = false;
                                    break label16776;
                                 }

                                 ++var3;
                              }
                           }

                           try {
                              var4 = var14.size();
                           } catch (Throwable var1891) {
                              var10000 = var1891;
                              var10001 = false;
                              break label16776;
                           }

                           var3 = 0;

                           while(true) {
                              if (var3 >= var4) {
                                 continue label16747;
                              }

                              mhq var1921;
                              try {
                                 var1921 = ((mrd)var14.get(var3)).a();
                              } catch (Throwable var1890) {
                                 var10000 = var1890;
                                 var10001 = false;
                                 break label16776;
                              }

                              if (var1921 != null) {
                                 try {
                                    var1921.close();
                                 } catch (Throwable var1889) {
                                    var10000 = var1889;
                                    var10001 = false;
                                    break label16776;
                                 }
                              }

                              ++var3;
                           }
                        }
                     }

                     Iterator var1923;
                     ArrayMap var1929;
                     Object var1930;
                     try {
                        var1930 = this.a;
                        var1929 = new ArrayMap();
                        var1923 = var11.iterator();
                     } catch (Throwable var1885) {
                        var10000 = var1885;
                        var10001 = false;
                        break;
                     }

                     mrd var1917;
                     while(true) {
                        try {
                           if (!var1923.hasNext()) {
                              break;
                           }

                           var1917 = (mrd)var1923.next();
                           var1929.put(var1917.d(), var1917);
                        } catch (Throwable var1886) {
                           var10000 = var1886;
                           var10001 = false;
                           break label16776;
                        }
                     }

                     Iterator var1927;
                     ozp var1928;
                     try {
                        var1928 = ozr.D();
                        var1927 = var10.iterator();
                     } catch (Throwable var1880) {
                        var10000 = var1880;
                        var10001 = false;
                        break;
                     }

                     while(true) {
                        try {
                           if (!var1927.hasNext()) {
                              break;
                           }

                           var1932 = (mnp)var1927.next();
                           var15 = var9.iterator();
                        } catch (Throwable var1881) {
                           var10000 = var1881;
                           var10001 = false;
                           break label16776;
                        }

                        mnr var1924 = null;

                        while(true) {
                           mnr var1918;
                           try {
                              if (!var15.hasNext()) {
                                 break;
                              }

                              var1918 = (mnr)var15.next();
                              if (var1918.c != var1932) {
                                 continue;
                              }
                           } catch (Throwable var1884) {
                              var10000 = var1884;
                              var10001 = false;
                              break label16776;
                           }

                           var1924 = var1918;
                        }

                        if (var1924 != null) {
                           try {
                              var1928.h(var1924);
                           } catch (Throwable var1879) {
                              var10000 = var1879;
                              var10001 = false;
                              break label16776;
                           }
                        } else {
                           ozp var1935;
                           pdg var1937;
                           try {
                              var1935 = ozr.D();
                              var1937 = var1932.c.gq();
                           } catch (Throwable var1878) {
                              var10000 = var1878;
                              var10001 = false;
                              break label16776;
                           }

                           while(true) {
                              mmi var1939;
                              try {
                                 if (!var1937.hasNext()) {
                                    break;
                                 }

                                 var1939 = (mmi)var1937.next();
                                 var1917 = (mrd)var1929.get(var1939);
                              } catch (Throwable var1882) {
                                 var10000 = var1882;
                                 var10001 = false;
                                 break label16776;
                              }

                              var1913 = var1917;
                              if (var1917 == null) {
                                 label16811: {
                                    try {
                                       if (var1939 instanceof mqs) {
                                          mrf var1919 = mrf.g();
                                          var1913 = new mqz(var1939, var1919);
                                          var1919.e((mhq)var1913);
                                          break label16811;
                                       }
                                    } catch (Throwable var1883) {
                                       var10000 = var1883;
                                       var10001 = false;
                                       break label16776;
                                    }

                                    try {
                                       onk.k(var1939 instanceof mqt);
                                       var1913 = mqu.f(var1939);
                                    } catch (Throwable var1877) {
                                       var10000 = var1877;
                                       var10001 = false;
                                       break label16776;
                                    }
                                 }

                                 try {
                                    var1929.put(var1939, var1913);
                                 } catch (Throwable var1876) {
                                    var10000 = var1876;
                                    var10001 = false;
                                    break label16776;
                                 }
                              }

                              try {
                                 var1935.h(var1913);
                              } catch (Throwable var1875) {
                                 var10000 = var1875;
                                 var10001 = false;
                                 break label16776;
                              }
                           }

                           try {
                              var1925 = var1935.g();
                              var1928.h(mnr.o((mnb)var1930, var1932, var1925));
                           } catch (Throwable var1874) {
                              var10000 = var1874;
                              var10001 = false;
                              break label16776;
                           }
                        }
                     }

                     try {
                        var1925 = var1928.g();
                        break label16788;
                     } catch (Throwable var1873) {
                        var10000 = var1873;
                        var10001 = false;
                        break;
                     }
                  }

                  label16767:
                  while(true) {
                     mrd var1938;
                     while(true) {
                        try {
                           if (!var1933.hasNext()) {
                              break label16767;
                           }

                           var1938 = (mrd)var1933.next();
                           mmi var1936 = var1938.d();
                           if (var12.contains(var1936)) {
                              break;
                           }

                           var12.add(var1936);
                           var11.add(var1938);
                        } catch (Throwable var1909) {
                           var10000 = var1909;
                           var10001 = false;
                           break label16776;
                        }
                     }

                     try {
                        onk.w(var11.contains(var1938));
                     } catch (Throwable var1907) {
                        var10000 = var1907;
                        var10001 = false;
                        break label16776;
                     }
                  }

                  try {
                     var1932 = var1931.c;
                     onk.H(true ^ var10.contains(var1932));
                     var10.add(var1932);
                     var9.add(var1931);
                  } catch (Throwable var1906) {
                     var10000 = var1906;
                     var10001 = false;
                     break;
                  }
               }
            }

            var1926 = var10000;

            try {
               var8.close();
            } catch (Throwable var1871) {
               Throwable var1920 = var1871;

               label16577:
               try {
                  c.C(var1926, var1920);
                  break label16577;
               } catch (Throwable var1870) {
                  var10000 = var1870;
                  var10001 = false;
                  break label16787;
               }
            }

            try {
               throw var1926;
            } catch (Throwable var1869) {
               var10000 = var1869;
               var10001 = false;
               break label16787;
            }
         }

         label16584:
         try {
            var8.close();
            return var1925;
         } catch (Throwable var1872) {
            var10000 = var1872;
            var10001 = false;
            break label16584;
         }
      }

      var1926 = var10000;
      throw var1926;
   }

   public final pky O() {
      return kfq.f(((Activity)this.c).isInMultiWindowMode(), ((ind)this.b).a().e, ((kej)((mdh)this.a).eZ()).a);
   }

   public final jxr P(otw var1, otw var2, mdh var3, boolean var4) {
      jxr var18;
      label198: {
         Throwable var10000;
         label202: {
            ((min)this.a).e("RoiTracker");
            boolean var10001;
            if (var4) {
               label183: {
                  label182: {
                     try {
                        if (!((flx)this.b).m(fna.e)) {
                           ((flx)this.b).e();
                           break label182;
                        }
                     } catch (Throwable var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label202;
                     }

                     var4 = true;
                     break label183;
                  }

                  var4 = false;
               }
            } else {
               label201: {
                  label194: {
                     label193: {
                        try {
                           if (!((flx)this.b).m(fna.d)) {
                              if (((flx)this.b).m(fna.f)) {
                                 break label194;
                              }
                              break label193;
                           }
                        } catch (Throwable var16) {
                           var10000 = var16;
                           var10001 = false;
                           break label202;
                        }

                        var4 = true;
                        break label201;
                     }

                     var4 = false;
                     break label201;
                  }

                  var4 = true;
               }
            }

            label173:
            try {
               var18 = new jxr(var1, var2, ((flx)this.b).m(fna.g), ((flx)this.b).k(fna.h), ((flx)this.b).k(fna.i), var4, (Context)this.c, var3);
               break label198;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label173;
            }
         }

         Throwable var17 = var10000;
         ((min)this.a).f();
         throw var17;
      }

      ((min)this.a).f();
      return var18;
   }

   public final int Q() {
      synchronized(this){}

      int var1;
      try {
         if (((Deque)this.a).isEmpty()) {
            return 0;
         }

         var1 = ((nbc)((Deque)this.a).getLast()).b;
      } finally {
         ;
      }

      return var1;
   }

   public final jqn R() {
      synchronized(this){}

      while(true) {
         jqn var4;
         try {
            if (((Deque)this.a).isEmpty()) {
               return null;
            }

            long var1 = SystemClock.uptimeMillis();
            nbc var3 = (nbc)((Deque)this.a).removeFirst();
            if (var1 - var3.a > 60000L) {
               continue;
            }

            var4 = new jqn();
            var4.b = var3.b;
            var4.a = var1 - var3.a;
         } finally {
            ;
         }

         return var4;
      }
   }

   public final List S(int var1) {
      synchronized(this){}

      Throwable var10000;
      label113: {
         boolean var10001;
         Object var2;
         try {
            var2 = (List)((SparseArray)this.c).get(var1);
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label113;
         }

         if (var2 != null) {
            try {
               ((SparseArray)this.c).remove(var1);
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label113;
            }
         } else {
            try {
               var2 = new ArrayList();
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label113;
            }
         }

         return (List)var2;
      }

      Throwable var15 = var10000;
      throw var15;
   }

   public final void T(int var1, long var2) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         Object var4;
         try {
            var4 = (List)((SparseArray)this.c).get(var1);
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label124;
         }

         if (var4 == null) {
            try {
               var4 = new ArrayList();
               ((SparseArray)this.c).put(var1, var4);
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            ((List)var4).add(var2);
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label111;
         }
      }

      Throwable var17 = var10000;
      throw var17;
   }

   public final void U(jqk var1) {
      synchronized(this){}

      Throwable var10000;
      label116: {
         long var3;
         long var5;
         boolean var10001;
         jqm var23;
         try {
            var3 = SystemClock.elapsedRealtimeNanos();
            var5 = TimeUnit.MILLISECONDS.convert(var3, TimeUnit.NANOSECONDS);
            int var2 = ((Deque)this.a).size();
            Object var8 = this.a;
            nbc var7 = new nbc(SystemClock.uptimeMillis(), var2);
            ((Deque)var8).add(var7);
            Object var22 = this.b;
            Long var24 = var1.a();
            ((jqs)var22).p(8, (pnn)null, (pnq)null, (pod)null, var24);
            var23 = var1.i;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label116;
         }

         if (var23 != null) {
            try {
               var23.c = var3;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label116;
            }
         }

         label104:
         try {
            var1.a = var5;
            return;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label104;
         }
      }

      Throwable var21 = var10000;
      throw var21;
   }

   public final NotificationChannel V() {
      NotificationChannel var2 = ((NotificationManager)this.a).getNotificationChannel("Sideline");
      NotificationChannel var1 = var2;
      if (var2 == null) {
         var1 = new NotificationChannel("Sideline", ((Context)this.b).getString(2132018051), 3);
         var1.setSound((Uri)null, (AudioAttributes)null);
         ((NotificationManager)this.a).createNotificationChannel(var1);
      }

      return var1;
   }

   public final void W() {
      NotificationChannel var2 = this.V();
      Object var1 = this.b;
      String var7 = var2.getId();
      Builder var5 = new Builder((Context)var1, var7);
      String var4 = ((Context)this.b).getString(2132018610);
      Builder var3 = var5.setSmallIcon(2131231324).setColor(((Context)this.b).getColor(2131102114)).setContentTitle(var4).setContentText(((Context)this.b).getString(2132018609));
      Object var8 = this.c;
      Intent var9 = (new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK")).addFlags(268435456).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_ISSUE_TITLE", var4).putExtra("EXTRA_COMPONENT_ID", 43059L).putExtra("EXTRA_HAPPENED_TIME", System.currentTimeMillis()).putExtra("EXTRA_REQUIRE_BUGREPORT", true);
      var3.setContentIntent(PendingIntent.getActivity((Context)((eze)var8).a, 0, var9, 1140850688)).setAutoCancel(true);
      var8 = this.a;
      Notification var6 = var5.build();
      ((NotificationManager)var8).notify(70207, var6);
   }

   public final boolean X() {
      return ((flx)this.a).m(fmd.bw) && this.ad() && !((juf)this.b).e().a(jue.f);
   }

   public final boolean Y() {
      return ((flx)this.a).m(fmd.bv) && this.ad();
   }

   public final void Z() {
      Object var2 = this.a;
      Float var1 = fmd.a;
      ((flx)var2).e();
   }

   public final int a() {
      return ((Path)this.a).getFillType() == FillType.EVEN_ODD ? 1 : 0;
   }

   public final bbf aa() {
      bbf var1 = new bbf((int[])null);
      ((List)this.a).add(var1);
      return var1;
   }

   public final void ac(mzx var1) {
      ((Set)this.c).add(var1);
   }

   public final void b(bck var1) {
      Object var6 = this.c;
      float var5 = var1.a;
      float var2 = var1.b;
      float var3 = var1.c;
      float var4 = var1.d;
      ((RectF)var6).set(var5, var2, var3, var4);
      var6 = this.b;
      var2 = bcg.a(var1.e);
      ((float[])var6)[0] = var2;
      var6 = this.b;
      var2 = bcg.b(var1.e);
      ((float[])var6)[1] = var2;
      var6 = this.b;
      var2 = bcg.a(var1.f);
      ((float[])var6)[2] = var2;
      var6 = this.b;
      var2 = bcg.b(var1.f);
      ((float[])var6)[3] = var2;
      var6 = this.b;
      var2 = bcg.a(var1.g);
      ((float[])var6)[4] = var2;
      var6 = this.b;
      var2 = bcg.b(var1.g);
      ((float[])var6)[5] = var2;
      var6 = this.b;
      var2 = bcg.a(var1.h);
      ((float[])var6)[6] = var2;
      var6 = this.b;
      var2 = bcg.b(var1.h);
      ((float[])var6)[7] = var2;
      var6 = this.a;
      Object var8 = this.c;
      Object var7 = this.b;
      Direction var9 = Direction.CCW;
      float[] var10 = (float[])var7;
      RectF var11 = (RectF)var8;
      ((Path)var6).addRoundRect(var11, var10, var9);
   }

   public final void c() {
      ((Path)this.a).close();
   }

   public final void d(float var1, float var2, float var3, float var4, float var5, float var6) {
      ((Path)this.a).cubicTo(var1, var2, var3, var4, var5, var6);
   }

   public final void e(float var1, float var2) {
      ((Path)this.a).lineTo(var1, var2);
   }

   public final void f(float var1, float var2) {
      ((Path)this.a).moveTo(var1, var2);
   }

   public final void g(float var1, float var2, float var3, float var4) {
      ((Path)this.a).quadTo(var1, var2, var3, var4);
   }

   public final void h(float var1, float var2, float var3, float var4, float var5, float var6) {
      ((Path)this.a).rCubicTo(var1, var2, var3, var4, var5, var6);
   }

   public final void i(float var1, float var2) {
      ((Path)this.a).rLineTo(var1, var2);
   }

   public final void j(float var1, float var2, float var3, float var4) {
      ((Path)this.a).rQuadTo(var1, var2, var3, var4);
   }

   public final void k() {
      ((Path)this.a).reset();
   }

   public final void l() {
      ((Path)this.a).rewind();
   }

   public final void m(int var1) {
      Object var3 = this.a;
      FillType var2;
      if (c.n(var1, 1)) {
         var2 = FillType.EVEN_ODD;
      } else {
         var2 = FillType.WINDING;
      }

      ((Path)var3).setFillType(var2);
   }

   public final boolean n() {
      Object var3 = ((avi)this.b).a();
      Object var4 = this.a;
      boolean var2 = true;
      boolean var1 = var2;
      if (var3 == var4) {
         var3 = this.c;
         if (var3 != null) {
            if (!((bbf)var3).n()) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public final String o() {
      String var1 = ((UUID)this.a).toString();
      var1.getClass();
      return var1;
   }

   public final void p() {
      if (((SharedPreferences)this.a).getBoolean("pref_key_reboot_completed", false)) {
         Object var3 = this.c;
         fdg var2 = new fdg(this, 11);
         crc var1 = (crc)var3;
         var1.m();

         try {
            var2.run();
            ((crc)var3).q();
         } finally {
            var1.o();
         }

         ((SharedPreferences)this.a).edit().putBoolean("pref_key_reboot_completed", false).apply();
      }
   }

   public final int s() {
      if (((flx)this.c).m(flj.v)) {
         return 3;
      } else {
         ((flx)this.c).c();
         return 1;
      }
   }

   public final int t() {
      return ((AtomicInteger)this.a).get();
   }

   public final int u() {
      return ((AtomicInteger)this.b).get();
   }

   public final int v() {
      return ((AtomicInteger)this.c).incrementAndGet();
   }

   public final void w(String var1, String var2) {
      long var3 = DatabaseUtils.queryNumEntries((SQLiteDatabase)this.b, var1) - 10000L;
      if (var3 > 0L) {
         Object var5 = this.b;
         StringBuilder var6 = new StringBuilder();
         var6.append(var2);
         var6.append(" IN (SELECT ");
         var6.append(var2);
         var6.append(" FROM ");
         var6.append(var1);
         var6.append(" ORDER BY ");
         var6.append(var2);
         var6.append(" ASC LIMIT ");
         var6.append(var3);
         var6.append(nJwt.ABzsCQjhEgpYHoP);
         var2 = var6.toString();
         ((SQLiteDatabase)var5).delete(var1, var2, new String[0]);
      }

   }

   public final boolean x(Class var1, Class var2) {
      return ((Class)this.c).isAssignableFrom(var1) && var2.isAssignableFrom((Class)this.a);
   }

   public final Object y(Uri var1, nvl var2) {
      return var2.a(this.B(var1));
   }

   public final void z(Uri var1, Uri var2) {
      nzu var3 = this.B(var1);
      nzu var4 = this.B(var2);
      Object var5 = var3.b;
      if (var5 == var4.b) {
         Object var6 = var3.d;
         Uri var7 = (Uri)var4.d;
         ((nwi)var5).l((Uri)var6, var7);
      } else {
         throw new nvw("Cannot rename file across backends");
      }
   }
}
