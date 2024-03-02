import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public final class amp extends qwq implements qvi {
   final Object a;
   private final int b;

   public amp(Object var1, int var2) {
      super(0);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a() {
      int var5 = this.b;
      int var3 = 0;
      byte var4 = 0;
      Boolean var8 = true;
      Object var131;
      Object var132;
      Throwable var133;
      int var6;
      boolean var7;
      axf var10;
      Throwable var10000;
      boolean var10001;
      int var125;
      switch(var5) {
      case 0:
         ((amq)this.a).g();
         kd.f((bnj)this.a);
         jk.h((blv)this.a);
         jk.k((bll)this.a);
         return var8;
      case 1:
         ((amn)this.a).g();
         kd.f((bnj)this.a);
         jk.h((blv)this.a);
         jk.k((bll)this.a);
         return var8;
      case 2:
         ((bwc)this.a).d();
         ((bwc)this.a).b();
         ((bwc)this.a).d();
         ((avi)((bwc)this.a).d).a();
         float var2 = Math.abs(Float.NaN);
         var7 = Float.isNaN(var2);
         float var1 = 1.0F;
         if (!var7 && var2 > 1.0E-6F) {
            bwc var147 = (bwc)this.a;
            if (Float.isNaN(var147.a())) {
               throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
            }

            var2 = (var147.a() + Float.NaN) / Float.NaN;
            if (var2 < 1.0E-6F) {
               var1 = 0.0F;
            } else if (!(var2 > 0.999999F)) {
               var1 = var2;
            }
         }

         return var1;
      case 3:
         return new lmk((anu)this.a);
      case 4:
         bxr var144 = ((lmk)this.a).aG();
         aak var138 = ant.a;
         return var144.eI(400.0F);
      case 5:
         ((aor)this.a).c();
         return var8;
      case 6:
         ((aor)this.a).d();
         return qsn.a;
      case 7:
         return ((apu)this.a).g();
      case 8:
         apz var141 = (apz)this.a;
         var7 = var141.g();
         var141.a.b(var7 ^ true);
         return qsn.a;
      case 9:
         HashMap var152 = new HashMap();
         aud var142 = (aud)this.a;

         for(var125 = var142.a.size(); var3 < var125; ++var3) {
            ora var148 = (ora)var142.a.get(var3);
            if (var148.d != null) {
               var131 = new atm(var148.b, var148.d);
            } else {
               var131 = var148.b;
            }

            var132 = var152.get(var131);
            if (var132 == null) {
               LinkedHashSet var137 = new LinkedHashSet();
               var152.put(var131, var137);
               var131 = var137;
            } else {
               var131 = var132;
            }

            ((LinkedHashSet)var131).add(var148);
         }

         return var152;
      case 10:
         Object var145 = this.a;
         var131 = ((auo)var145).c;
         synchronized(var131){}

         label2336: {
            qza var134;
            try {
               var134 = ((auo)var145).w();
               var3 = ((aui)((auo)var145).n.b()).compareTo(aui.b);
            } catch (Throwable var124) {
               var10000 = var124;
               var10001 = false;
               break label2336;
            }

            if (var3 > 0) {
               if (var134 != null) {
                  var134.gP(qsn.a);
               }

               return qsn.a;
            }

            label2326:
            try {
               throw qxb.u("Recomposer shutdown; frame clock awaiter will never resume", ((auo)var145).e);
            } catch (Throwable var123) {
               var10000 = var123;
               var10001 = false;
               break label2326;
            }
         }

         var133 = var10000;
         throw var133;
      case 11:
         do {
            var132 = this.a;
            axf var129 = ((bad)var132).f;
            synchronized(var129){}

            label2340: {
               try {
                  if (((bad)var132).c) {
                     continue;
                  }

                  ((bad)var132).c = true;
               } catch (Throwable var122) {
                  var10000 = var122;
                  var10001 = false;
                  break label2340;
               }

               label2341: {
                  label2342: {
                     try {
                        var10 = ((bad)var132).f;
                        var5 = var10.b;
                     } catch (Throwable var121) {
                        var10000 = var121;
                        var10001 = false;
                        break label2342;
                     }

                     if (var5 <= 0) {
                        break label2341;
                     }

                     Object[] var139;
                     try {
                        var139 = var10.a;
                     } catch (Throwable var120) {
                        var10000 = var120;
                        var10001 = false;
                        break label2342;
                     }

                     var3 = 0;

                     label2306:
                     while(true) {
                        axb var140;
                        Object[] var14;
                        qvt var151;
                        try {
                           bac var150 = (bac)var139[var3];
                           var140 = var150.d;
                           var151 = var150.a;
                           var14 = var140.b;
                           var6 = var140.a;
                        } catch (Throwable var119) {
                           var10000 = var119;
                           var10001 = false;
                           break;
                        }

                        for(var125 = 0; var125 < var6; ++var125) {
                           Object var13 = var14[var125];

                           try {
                              var13.getClass();
                              var151.eo(var13);
                           } catch (Throwable var118) {
                              var10000 = var118;
                              var10001 = false;
                              break label2306;
                           }
                        }

                        try {
                           var140.clear();
                        } catch (Throwable var117) {
                           var10000 = var117;
                           var10001 = false;
                           break;
                        }

                        var125 = var3 + 1;
                        var3 = var125;
                        if (var125 >= var5) {
                           break label2341;
                        }
                     }
                  }

                  Throwable var143 = var10000;

                  try {
                     ((bad)var132).c = false;
                     throw var143;
                  } catch (Throwable var115) {
                     var10000 = var115;
                     var10001 = false;
                     break label2340;
                  }
               }

               label2287:
               try {
                  ((bad)var132).c = false;
                  continue;
               } catch (Throwable var116) {
                  var10000 = var116;
                  var10001 = false;
                  break label2287;
               }
            }

            var133 = var10000;
            throw var133;
         } while(((bad)this.a).a());

         return qsn.a;
      case 12:
         ((bcd)this.a).d();
         return qsn.a;
      case 13:
         ((bgd)this.a).a();
         return qsn.a;
      case 14:
         ((bgl)this.a).e(true);
         return qsn.a;
      case 15:
         return ((prl)this.a).a;
      case 16:
         return ((bha)this.a).f();
      case 17:
         bjq var128 = ((myq)this.a).i();

         for(Iterator var130 = var128.f.entrySet().iterator(); var130.hasNext(); ((bjk)((Entry)var130.next()).getValue()).d = true) {
         }

         if (!var128.a.ac()) {
            bmd.ap(var128.a, false, 3);
         }

         return qsn.a;
      case 18:
         jom var126 = (jom)this.a;
         var126.a = false;
         HashSet var9 = new HashSet();
         var10 = (axf)var126.e;
         var6 = var10.b;
         Object[] var11;
         if (var6 > 0) {
            var11 = var10.a;
            var3 = 0;

            do {
               bmd var12 = (bmd)var11[var3];
               lmk var135 = (lmk)((axf)var126.d).a[var3];
               bba var146 = var12.n.e;
               if (var146.y) {
                  jom.i(var146, var135, var9);
               }

               var5 = var3 + 1;
               var3 = var5;
            } while(var5 < var6);
         }

         ((axf)var126.e).g();
         ((axf)var126.d).g();
         var10 = (axf)var126.c;
         var5 = var10.b;
         if (var5 > 0) {
            var11 = var10.a;
            var3 = var4;

            do {
               bky var136 = (bky)var11[var3];
               lmk var149 = (lmk)((axf)var126.f).a[var3];
               if (var136.y) {
                  jom.i(var136, var149, var9);
               }

               var125 = var3 + 1;
               var3 = var125;
            } while(var125 < var5);
         }

         ((axf)var126.c).g();
         ((axf)var126.f).g();
         Iterator var127 = var9.iterator();

         while(var127.hasNext()) {
            ((bky)var127.next()).m();
         }

         return qsn.a;
      case 19:
         ((bky)this.a).m();
         return qsn.a;
      default:
         ((bbk)this.a).a();
         return qsn.a;
      }
   }
}
