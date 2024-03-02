import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class ajb extends qwq implements qvx {
   final Object a;
   private final int b;

   public ajb(Object var1, int var2) {
      super(2);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var6 = this.b;
      int var5 = 0;
      CharSequence var11 = null;
      Iterator var12 = null;
      float var3;
      long var9;
      azk var28;
      asm var30;
      bmd var37;
      Object var41;
      Set var54;
      switch(var6) {
      case 0:
         var9 = ((bxx)var1).a;
         ((bxy)var2).getClass();
         var5 = bxx.a(var9);
         return bxw.c(car.K(0, ((bat)this.a).a(0, var5)));
      case 1:
         bhw var57 = (bhw)var1;
         var3 = ((Number)var2).floatValue();
         var57.getClass();
         var57.b();
         ((qww)this.a).a = var3;
         return qsn.a;
      case 2:
         var9 = ((bxx)var1).a;
         bxy var56 = (bxy)var2;
         var56.getClass();
         var5 = bxx.b(var9);
         return bxw.c(car.K(((bas)this.a).a(var5, var56), 0));
      case 3:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            apw.b(((aor)this.a).b(), (bbb)null, 0L, 0L, 0L, 0L, 0, false, 0, 0, (qvt)null, (bss)null, var30, 0, 0, 131070);
         }

         return qsn.a;
      case 4:
         var54 = (Set)var1;
         var28 = (azk)var2;
         var54.getClass();
         var28.getClass();
         var41 = this.a;
         var2 = ((auo)var41).c;
         synchronized(var2){}
         boolean var16 = false;

         qza var55;
         label562: {
            try {
               var16 = true;
               if (((aui)((auo)var41).n.b()).compareTo(aui.e) >= 0) {
                  ((auo)var41).f.a(var54);
                  var55 = ((auo)var41).w();
                  var16 = false;
                  break label562;
               }

               var16 = false;
            } finally {
               if (var16) {
                  ;
               }
            }

            var55 = var12;
         }

         if (var55 != null) {
            var55.gP(qsn.a);
         }

         return qsn.a;
      case 5:
         var54 = (Set)var1;
         var28 = (azk)var2;
         var54.getClass();
         var28.getClass();
         ((rdb)this.a).u(var54);
         return qsn.a;
      case 6:
         AmbientMode$AmbientController var53 = (AmbientMode$AmbientController)var1;
         var53.getClass();
         var41 = ((qvx)this.a).a(var53, var2);

         for(var6 = ((List)var41).size(); var5 < var6; ++var5) {
            var2 = ((List)var41).get(var5);
            if (var2 != null && !((azc)var53.a).f(var2)) {
               throw new IllegalArgumentException("item can't be saved");
            }
         }

         if (!((Collection)var41).isEmpty()) {
            return new ArrayList((Collection)var41);
         }

         return null;
      case 7:
         Set var48 = (Set)var1;
         azk var49 = (azk)var2;
         var48.getClass();
         var49.getClass();
         Object var50 = this.a;

         bad var27;
         Object var47;
         do {
            var27 = (bad)var50;
            var47 = var27.b.get();
            if (var47 == null) {
               var1 = var48;
            } else if (var47 instanceof Set) {
               var1 = pwm.aS(new Set[]{(Set)var47, var48});
            } else {
               if (!(var47 instanceof List)) {
                  bad.b();
                  throw new qsc();
               }

               var1 = pwm.aA((Collection)var47, pwm.ak(var48));
            }
         } while(!c.t(var27.b, var47, var1));

         if (((bad)this.a).a()) {
            var1 = this.a;
            ((bad)var1).a.eo(new amp(var1, 11));
         }

         return qsn.a;
      case 8:
         bbb var46 = (bbb)var1;
         var1 = (baz)var2;
         var46.getClass();
         var1.getClass();
         if (var1 instanceof baw) {
            qvy var40 = ((baw)var1).a;
            qxb.e(var40, 3);
            bbb var43 = (bbb)var40.a(bbb.d, this.a, 0);
            var1 = dq.l((asm)this.a, var43);
         }

         return var46.g((bbb)var1);
      case 9:
         var37 = (bmd)var1;
         ast var26 = (ast)var2;
         var37.getClass();
         var26.getClass();
         ((myq)this.a).i().b = var26;
         return qsn.a;
      case 10:
         var37 = (bmd)var1;
         qvx var25 = (qvx)var2;
         var37.getClass();
         var25.getClass();
         bjq var44 = ((myq)this.a).i();
         var37.g(new bjo(var44, var25, var44.o));
         return qsn.a;
      case 11:
         bmd var42 = (bmd)var1;
         myq var35 = (myq)var2;
         var42.getClass();
         var35.getClass();
         var2 = this.a;
         bjq var36 = var42.p;
         if (var36 == null) {
            var36 = new bjq(var42, (bkm)((myq)var2).d);
            var42.p = var36;
         }

         ((myq)var2).e = var36;
         ((myq)this.a).i().d();
         bjq var24 = ((myq)this.a).i();
         var1 = ((myq)this.a).d;
         if (var24.c != var1) {
            var24.c = (bkm)var1;
            var24.c(0);
         }

         return qsn.a;
      case 12:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            ((bno)this.a).a(var30, 8);
         }

         return qsn.a;
      case 13:
         bvp var32 = (bvp)var1;
         btd var23 = (btd)var2;
         var32.getClass();
         var23.getClass();
         View var33 = (View)this.a;
         new dmw(var33);
         Choreographer.getInstance().getClass();
         bwc var34 = new bwc(var33);
         return new ebt(new btd(), var34, (byte[])null);
      case 14:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            String var22 = (String)((kqh)this.a).k.a();
            kqh var39 = (kqh)this.a;
            var3 = var39.c;
            var5 = ((Number)var39.j.a()).intValue();
            float var4 = ((kqh)this.a).a();
            var41 = this.a;
            kqh var45 = (kqh)var41;
            kfq.J(var22, var3, var5, var4, var45.a, var45.d, var45.b, var45.i, new kqd(var41), var45.e, var45.f, var45.h, var45.g, var30, 2359296, 299520);
         }

         return qsn.a;
      case 15:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            edt.a((Context)null, false, false, false, sr.t(var30, 2057575572, new ajb(this.a, 14)), var30, 1572864);
         }

         return qsn.a;
      case 16:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            ari.a(kh.g(2131231181, var30), ((kqe)this.a).a, (bbb)null, lg.f(var30).t(), var30, 8, 4);
         }

         return qsn.a;
      case 17:
         var30 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var30.G()) {
            var30.q();
         } else {
            bfa var21 = kh.g(((kqf)this.a).a, var30);
            kqf var38 = (kqf)this.a;
            ari.a(var21, var38.b, (bbb)null, bcq.i(var38.d), var30, 8, 4);
         }

         return qsn.a;
      case 18:
         var11 = (CharSequence)var1;
         var5 = ((Number)var2).intValue();
         var11.getClass();
         var2 = this.a;
         String var18;
         qsg var19;
         if (((Collection)var2).size() == 1) {
            switch(((List)var2).size()) {
            case 0:
               throw new NoSuchElementException("List is empty.");
            case 1:
               var18 = (String)((List)var2).get(0);
               var5 = qwp.t(var11, var18, var5, 4);
               if (var5 < 0) {
                  var19 = null;
               } else {
                  var19 = pwm.bq(var5, var18);
               }
               break;
            default:
               throw new IllegalArgumentException("List has more than one element.");
            }
         } else {
            qxq var20 = new qxq(qxb.k(var5, 0), var11.length());
            int var7;
            int var8;
            String var13;
            if (var11 instanceof String) {
               label528: {
                  label527: {
                     label591: {
                        var6 = var20.a;
                        var7 = var20.b;
                        var8 = var20.c;
                        if (var8 > 0) {
                           var5 = var6;
                           if (var6 <= var7) {
                              break label591;
                           }
                        }

                        if (var8 >= 0 || var7 > var6) {
                           break label527;
                        }

                        var5 = var6;
                     }

                     while(true) {
                        var12 = ((Iterable)var2).iterator();

                        String var14;
                        do {
                           if (!var12.hasNext()) {
                              var1 = null;
                              break;
                           }

                           var1 = var12.next();
                           var13 = (String)var1;
                           var14 = (String)var11;
                           var6 = var13.length();
                           var13.getClass();
                        } while(!var13.regionMatches(0, var14, var5, var6));

                        var18 = (String)var1;
                        if (var18 != null) {
                           var19 = pwm.bq(var5, var18);
                           break label528;
                        }

                        if (var5 == var7) {
                           break;
                        }

                        var5 += var8;
                     }
                  }

                  var19 = null;
               }
            } else {
               label504: {
                  label503: {
                     label593: {
                        var6 = var20.a;
                        var8 = var20.b;
                        var7 = var20.c;
                        if (var7 > 0) {
                           var5 = var6;
                           if (var6 <= var8) {
                              break label593;
                           }
                        }

                        if (var7 >= 0 || var8 > var6) {
                           break label503;
                        }

                        var5 = var6;
                     }

                     while(true) {
                        var12 = ((Iterable)var2).iterator();

                        do {
                           if (!var12.hasNext()) {
                              var1 = null;
                              break;
                           }

                           var1 = var12.next();
                           var13 = (String)var1;
                        } while(!qwp.x(var13, 0, var11, var5, var13.length()));

                        var18 = (String)var1;
                        if (var18 != null) {
                           var19 = pwm.bq(var5, var18);
                           break label504;
                        }

                        if (var5 == var8) {
                           break;
                        }

                        var5 += var7;
                     }
                  }

                  var19 = null;
               }
            }
         }

         if (var19 != null) {
            return pwm.bq(var19.a, ((String)var19.b).length());
         }

         return null;
      default:
         var5 = ((Number)var1).intValue();
         qug var58 = (qug)var2;
         var58.getClass();
         quh var51 = var58.getKey();
         qug var29 = ((rhf)this.a).b.get(var51);
         Integer var59;
         if (var51 != rbd.c) {
            if (var58 != var29) {
               var5 = Integer.MIN_VALUE;
            } else {
               ++var5;
            }

            var59 = var5;
         } else {
            rbd var31 = (rbd)var29;
            rbd var60 = (rbd)var58;

            while(true) {
               if (var60 == null) {
                  var60 = var11;
                  break;
               }

               if (var60 == var31 || !(var60 instanceof rin)) {
                  break;
               }

               qze var61 = ((rin)var60).gT();
               if (var61 != null) {
                  var60 = var61.c();
               } else {
                  var60 = null;
               }
            }

            if (var60 != var31) {
               StringBuilder var52 = new StringBuilder();
               var52.append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
               var52.append(var60);
               var52.append(", expected child of ");
               var52.append(var31);
               var52.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
               IllegalStateException var62 = new IllegalStateException(var52.toString());
               throw var62;
            }

            if (var31 != null) {
               ++var5;
            }

            var59 = var5;
         }

         return var59;
      }
   }
}
