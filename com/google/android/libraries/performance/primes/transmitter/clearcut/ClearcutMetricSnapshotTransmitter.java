package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ClearcutMetricSnapshotTransmitter implements .nrk {
   public static final .oup a;
   public volatile .lix b;
   public volatile .lix c;
   private volatile .nrr d;
   private volatile .nsa e;
   private final .oup f;

   static {
      a = .onk.q(.hks.h);
   }

   public ClearcutMetricSnapshotTransmitter() {
      this.f = .onk.q(.hks.i);
   }

   public final .psd a(Context var1, .nrj var2) {
      .nzu var6 = .nrs.j;
      var2.e(var6);
      .qfe var5 = var2.l;
      Object var152 = var6.b;
      boolean var4;
      if (var5.b.get(var152) != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      .onk.x(var4, "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
      Throwable var10000;
      Throwable var144;
      boolean var10001;
      if (this.e == null) {
         label5010: {
            synchronized(this){}

            label4984: {
               try {
                  if (this.e == null) {
                     .nsa var149 = new .nsa();
                     this.e = var149;
                  }
               } catch (Throwable var143) {
                  var10000 = var143;
                  var10001 = false;
                  break label4984;
               }

               label4981:
               try {
                  break label5010;
               } catch (Throwable var142) {
                  var10000 = var142;
                  var10001 = false;
                  break label4981;
               }
            }

            while(true) {
               var144 = var10000;

               try {
                  throw var144;
               } catch (Throwable var135) {
                  var10000 = var135;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      .rlu var153 = var2.b;
      .rlu var151 = var153;
      if (var153 == null) {
         var151 = .rlu.u;
      }

      .qfi var8 = (.qfi)var151.ae(5);
      var8.s(var151);
      .nsa.b(.nsa.a, var8);
      .rjz var156 = ((.rlu)var8.b).i;
      .rjz var154 = var156;
      if (var156 == null) {
         var154 = .rjz.c;
      }

      .qfi var7;
      .qfi var161;
      if ((var154.a & 1) != 0) {
         var156 = ((.rlu)var8.b).i;
         var154 = var156;
         if (var156 == null) {
            var154 = .rjz.c;
         }

         .rjy var159 = var154.b;
         .rjy var163 = var159;
         if (var159 == null) {
            var163 = .rjy.l;
         }

         var7 = (.qfi)var163.ae(5);
         var7.s(var163);
         .nsa.b(.nsa.b, var7);
         var156 = ((.rlu)var8.b).i;
         var154 = var156;
         if (var156 == null) {
            var154 = .rjz.c;
         }

         var161 = (.qfi)var154.ae(5);
         var161.s(var154);
         if (!var161.b.ad()) {
            var161.p();
         }

         var154 = (.rjz)var161.b;
         .rjy var158 = (.rjy)var7.i();
         var158.getClass();
         var154.b = var158;
         var154.a |= 1;
         if (!var8.b.ad()) {
            var8.p();
         }

         var151 = (.rlu)var8.b;
         var156 = (.rjz)var161.i();
         var156.getClass();
         var151.i = var156;
         var151.a |= 256;
      }

      .rlf var165 = ((.rlu)var8.b).g;
      .rlf var180 = var165;
      if (var165 == null) {
         var180 = .rlf.l;
      }

      .qfw var195;
      if ((var180.a & 256) != 0) {
         var165 = ((.rlu)var8.b).g;
         var180 = var165;
         if (var165 == null) {
            var180 = .rlf.l;
         }

         .pph var168 = var180.h;
         .pph var187 = var168;
         if (var168 == null) {
            var187 = .pph.f;
         }

         .qfi var9 = (.qfi)var187.ae(5);
         var9.s(var187);
         .ppe var169 = ((.pph)var9.b).d;
         .ppe var188 = var169;
         if (var169 == null) {
            var188 = .ppe.f;
         }

         var169 = .nsa.c(var188);
         if (!var9.b.ad()) {
            var9.p();
         }

         var187 = (.pph)var9.b;
         var169.getClass();
         var187.d = var169;
         var187.a |= 1;
         List var190 = Collections.unmodifiableList(var187.e);
         if (!var9.b.ad()) {
            var9.p();
         }

         ((.pph)var9.b).e = .qhe.b;
         Iterator var192 = var190.iterator();

         .ppe var160;
         while(var192.hasNext()) {
            var160 = .nsa.c((.ppe)var192.next());
            if (!var9.b.ad()) {
               var9.p();
            }

            var168 = (.pph)var9.b;
            var160.getClass();
            var168.b();
            var168.e.add(var160);
         }

         var187 = (.pph)var9.b;
         .ppf var193;
         if (var187.b == 4) {
            var193 = (.ppf)var187.c;
         } else {
            var193 = .ppf.b;
         }

         var195 = var193.a;
         .qfi var10 = .ppf.b.O();
         Iterator var11 = var195.iterator();

         .ppf var183;
         while(var11.hasNext()) {
            .ppg var178 = (.ppg)var11.next();
            var160 = var178.b;
            var188 = var160;
            if (var160 == null) {
               var188 = .ppe.f;
            }

            .ppg var197;
            if ((var188.a & 2) != 0) {
               var7 = (.qfi)var178.ae(5);
               var7.s(var178);
               var169 = .nsa.c(var188);
               if (!var7.b.ad()) {
                  var7.p();
               }

               var197 = (.ppg)var7.b;
               var169.getClass();
               var197.b = var169;
               var197.a |= 1;
               var197 = (.ppg)var7.i();
            } else {
               var197 = var178;
            }

            if (!var10.b.ad()) {
               var10.p();
            }

            var183 = (.ppf)var10.b;
            var197.getClass();
            var183.b();
            var183.a.add(var197);
         }

         var183 = (.ppf)var10.i();
         if (!var9.b.ad()) {
            var9.p();
         }

         var187 = (.pph)var9.b;
         var183.getClass();
         var187.c = var183;
         var187.b = 4;
         var165 = ((.rlu)var8.b).g;
         var180 = var165;
         if (var165 == null) {
            var180 = .rlf.l;
         }

         var161 = (.qfi)var180.ae(5);
         var161.s(var180);
         .pph var164 = (.pph)var9.i();
         if (!var161.b.ad()) {
            var161.p();
         }

         var180 = (.rlf)var161.b;
         var164.getClass();
         var180.h = var164;
         var180.a |= 256;
         var165 = (.rlf)var161.i();
         if (!var8.b.ad()) {
            var8.p();
         }

         var151 = (.rlu)var8.b;
         var165.getClass();
         var151.g = var165;
         var151.a |= 64;
      }

      .rlo var186 = ((.rlu)var8.b).h;
      .rlo var198 = var186;
      if (var186 == null) {
         var198 = .rlo.k;
      }

      int var3;
      .qfv var167;
      .qfi var199;
      if (var198.j.size() != 0) {
         var186 = ((.rlu)var8.b).h;
         var198 = var186;
         if (var186 == null) {
            var198 = .rlo.k;
         }

         var161 = (.qfi)var198.ae(5);
         var161.s(var198);

         for(var3 = 0; var3 < ((.rlo)var161.b).j.size(); ++var3) {
            .rln var166 = (.rln)((.rlo)var161.b).j.get(var3);
            var199 = (.qfi)var166.ae(5);
            var199.s(var166);
            if (!((.rln)var199.b).b.isEmpty()) {
               if (!var199.b.ad()) {
                  var199.p();
               }

               ((.rln)var199.b).c = .qgl.b;
               List var172 = .nsa.a(((.rln)var199.b).b);
               if (!var199.b.ad()) {
                  var199.p();
               }

               var166 = (.rln)var199.b;
               var167 = var166.c;
               if (!var167.c()) {
                  var166.c = .qfn.U(var167);
               }

               .qdy.e(var172, var166.c);
            }

            if (!var199.b.ad()) {
               var199.p();
            }

            var166 = (.rln)var199.b;
            var166.a &= -2;
            var166.b = .rln.f.b;
            if (!var161.b.ad()) {
               var161.p();
            }

            .rlo var170 = (.rlo)var161.b;
            .rln var200 = (.rln)var199.i();
            var200.getClass();
            var170.c();
            var170.j.set(var3, var200);
         }

         if (!var8.b.ad()) {
            var8.p();
         }

         var151 = (.rlu)var8.b;
         var186 = (.rlo)var161.i();
         var186.getClass();
         var151.h = var186;
         var151.a |= 128;
      }

      .rkr var189 = ((.rlu)var8.b).f;
      .rkr var201 = var189;
      if (var189 == null) {
         var201 = .rkr.b;
      }

      if (var201.a.size() != 0) {
         var189 = ((.rlu)var8.b).f;
         var201 = var189;
         if (var189 == null) {
            var201 = .rkr.b;
         }

         var161 = (.qfi)var201.ae(5);
         var161.s(var201);

         for(var3 = 0; var3 < ((.rkr)var161.b).a.size(); ++var3) {
            .rkq var173 = (.rkq)((.rkr)var161.b).a.get(var3);
            var199 = (.qfi)var173.ae(5);
            var199.s(var173);
            if (!((.rkq)var199.b).d.isEmpty()) {
               if (!var199.b.ad()) {
                  var199.p();
               }

               ((.rkq)var199.b).e = .qgl.b;
               List var175 = .nsa.a(((.rkq)var199.b).d);
               if (!var199.b.ad()) {
                  var199.p();
               }

               .rkq var176 = (.rkq)var199.b;
               var167 = var176.e;
               if (!var167.c()) {
                  var176.e = .qfn.U(var167);
               }

               .qdy.e(var175, var176.e);
            }

            if (!var199.b.ad()) {
               var199.p();
            }

            var173 = (.rkq)var199.b;
            var173.a &= -524289;
            var173.d = .rkq.g.d;
            if (!var161.b.ad()) {
               var161.p();
            }

            .rkr var181 = (.rkr)var161.b;
            .rkq var171 = (.rkq)var199.i();
            var171.getClass();
            var195 = var181.a;
            if (!var195.c()) {
               var181.a = .qfn.V(var195);
            }

            var181.a.set(var3, var171);
         }

         if (!var8.b.ad()) {
            var8.p();
         }

         var151 = (.rlu)var8.b;
         var189 = (.rkr)var161.i();
         var189.getClass();
         var151.f = var189;
         var151.a |= 32;
      }

      .rkt var191 = ((.rlu)var8.b).k;
      .rkt var202 = var191;
      if (var191 == null) {
         var202 = .rkt.f;
      }

      if (var202.d.size() != 0) {
         var191 = ((.rlu)var8.b).k;
         var202 = var191;
         if (var191 == null) {
            var202 = .rkt.f;
         }

         var161 = (.qfi)var202.ae(5);
         var161.s(var202);

         for(var3 = 0; var3 < ((.rkt)var161.b).d.size(); ++var3) {
            .rku var203 = (.rku)((.rkt)var161.b).d.get(var3);
            var7 = (.qfi)var203.ae(5);
            var7.s(var203);
            .nsa.b(.nsa.c, var7);
            if (!var161.b.ad()) {
               var161.p();
            }

            var202 = (.rkt)var161.b;
            .rku var174 = (.rku)var7.i();
            var174.getClass();
            .qfw var184 = var202.d;
            if (!var184.c()) {
               var202.d = .qfn.V(var184);
            }

            var202.d.set(var3, var174);
         }

         if (!var8.b.ad()) {
            var8.p();
         }

         var151 = (.rlu)var8.b;
         var191 = (.rkt)var161.i();
         var191.getClass();
         var151.k = var191;
         var151.a |= 4096;
      }

      .rlu var185 = (.rlu)var8.i();
      if ((Boolean)this.f.a()) {
         return .psa.a;
      } else {
         .nzu var204 = .nrs.j;
         var2.e(var204);
         Object var145 = var2.l.k((.qfm)var204.b);
         if (var145 == null) {
            var145 = var204.a;
         } else {
            var204.e(var145);
         }

         .nrs var162 = (.nrs)var145;
         var4 = var162.h;
         var3 = var185.a;
         .nrr var146 = this.d;
         .nrr var205 = var146;
         if (var146 == null) {
            synchronized(this){}

            label5005: {
               label5006: {
                  try {
                     var205 = this.d;
                  } catch (Throwable var141) {
                     var10000 = var141;
                     var10001 = false;
                     break label5006;
                  }

                  var146 = var205;
                  if (var205 == null) {
                     try {
                        var146 = new .nrr();
                        this.d = var146;
                     } catch (Throwable var140) {
                        var10000 = var140;
                        var10001 = false;
                        break label5006;
                     }
                  }

                  label4911:
                  try {
                     break label5005;
                  } catch (Throwable var139) {
                     var10000 = var139;
                     var10001 = false;
                     break label4911;
                  }
               }

               while(true) {
                  var144 = var10000;

                  try {
                     throw var144;
                  } catch (Throwable var133) {
                     var10000 = var133;
                     var10001 = false;
                     continue;
                  }
               }
            }

            var205 = var146;
         }

         boolean var150;
         if ((var3 & 64) != 0) {
            var150 = true;
         } else {
            var150 = false;
         }

         .psd var157;
         if (!var4) {
            var157 = .osh.au(true);
         } else {
            Boolean var147 = (Boolean)var205.a.get();
            if (var147 != null) {
               var157 = .osh.au(var147);
            } else {
               .lkv var194 = var205.c;
               .lkv var148 = var194;
               if (var194 == null) {
                  label5015: {
                     synchronized(var205){}

                     label5009: {
                        try {
                           var194 = var205.c;
                        } catch (Throwable var138) {
                           var10000 = var138;
                           var10001 = false;
                           break label5009;
                        }

                        var148 = var194;
                        if (var194 == null) {
                           try {
                              var148 = .lwp.a(var1);
                              var205.c = var148;
                           } catch (Throwable var137) {
                              var10000 = var137;
                              var10001 = false;
                              break label5009;
                           }
                        }

                        label4890:
                        try {
                           break label5015;
                        } catch (Throwable var136) {
                           var10000 = var136;
                           var10001 = false;
                           break label4890;
                        }
                     }

                     while(true) {
                        var144 = var10000;

                        try {
                           throw var144;
                        } catch (Throwable var134) {
                           var10000 = var134;
                           var10001 = false;
                           continue;
                        }
                     }
                  }
               }

               if (var150 ^ true && !var205.b.getAndSet(true)) {
                  .lmp var196 = .mzx.dt(new .nrp(var205), var148.e, .lwq.class.getSimpleName());
                  .lzz var177 = new .lzz(var148, var196, ((.lwo)var148.c).b, 1);
                  .lpc var182 = new .lpc(var148, 3);
                  .lmt var179 = .bbf.N();
                  var179.a = var177;
                  var179.b = var182;
                  var179.c = var196;
                  var179.d = new .ljt[]{.lwi.a};
                  var179.e = 4507;
                  var148.k(var179.a());
               }

               .prx var155 = .prx.q(.mzx.D(var148.g()));
               .nrq var206 = new .nrq(var205, 0);
               var3 = .orj.a;
               var157 = .ppw.i(.pqp.i(var155, new .ori(.orn.b(), var206), .pre.a), Throwable.class, .nit.e, .pre.a);
            }
         }

         return .pqp.j(var157, new .nrw(this, var1, var185, var162), .pre.a);
      }
   }
}
