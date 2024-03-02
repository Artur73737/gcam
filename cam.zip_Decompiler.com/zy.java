import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class zy extends qwq implements qvt {
   final Object a;
   final Object b;
   private final int c;

   public zy(Object var1, Object var2, int var3) {
      super(1);
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   public zy(Object var1, Object var2, int var3, byte[] var4) {
      super(1);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var3 = this.c;
      Object var8 = null;
      azo var6 = null;
      Object var7 = null;
      float var2;
      long var4;
      Throwable var10000;
      boolean var10001;
      Throwable var102;
      Object var104;
      switch(var3) {
      case 0:
         za var113 = (za)var1;
         var113.getClass();
         ((qvx)this.a).a(var113.a(), ((qvt)((bpe)this.b).b).eo(var113.c));
         return qsn.a;
      case 1:
         var102 = (Throwable)var1;
         var104 = this.b;
         AvailabilityCallback var112 = (AvailabilityCallback)this.a;
         ((CameraManager)var104).unregisterAvailabilityCallback(var112);
         return qsn.a;
      case 2:
         ((nd)var1).getClass();
         var104 = this.b;
         var1 = this.a;
         var1.getClass();
         ((azw)((jed)var104).c).add(var1);
         return new aaj(this.b, this.a, 1);
      case 3:
         ((nd)var1).getClass();
         var104 = this.a;
         var1 = this.b;
         return new aaj((jed)var104, var1, 0);
      case 4:
         ((nd)var1).getClass();
         var104 = this.a;
         aaf var110 = (aaf)this.b;
         ((jed)var104).s(var110);
         var104 = this.a;
         var1 = this.b;
         return new aaj((jed)var104, var1, 2);
      case 5:
         var102 = (Throwable)var1;
         var1 = ((lmk)this.b).a;
         var104 = this.a;
         ((axf)var1).o(var104);
         return qsn.a;
      case 6:
         bhw var107 = (bhw)var1;
         var107.getClass();
         bio.b((bin)this.b, var107);
         if (!iy.n(var107)) {
            var4 = iy.j(var107);
            var107.b();
            ((rdu)this.a).u(new adp(var4));
         }

         return qsn.a;
      case 7:
         var4 = ((bci)var1).d;
         var104 = this.a;
         var1 = this.b;
         agc var108 = (agc)var104;
         return bci.i(var108.d(var108.c((afj)var1, var108.d(var4), 2)));
      case 8:
         ((Number)var1).longValue();
         ahe var105 = (ahe)this.b;
         var2 = var105.e;
         var105.e = 0.0F;
         ((qvt)this.a).eo(var2);
         return qsn.a;
      case 9:
         ((nd)var1).getClass();
         ((ald)this.b).c.remove(this.a);
         return new aaj(this.b, this.a, 3);
      case 10:
         var1.getClass();
         return new apu(var1, (zb)this.b, (qvt)this.a);
      case 11:
         yt var106 = (yt)var1;
         var106.getClass();
         ((aeb)this.b).b(((Number)var106.d()).floatValue() - ((qww)this.a).a);
         var1 = this.a;
         var2 = ((Number)var106.d()).floatValue();
         ((qww)var1).a = var2;
         return qsn.a;
      case 12:
         var102 = (Throwable)var1;
         var8 = this.b;
         var7 = ((asg)var8).a;
         var1 = this.a;
         synchronized(var7){}

         label1139: {
            List var109;
            try {
               var109 = ((asg)var8).b;
               var1 = ((qwz)var1).a;
            } catch (Throwable var101) {
               var10000 = var101;
               var10001 = false;
               break label1139;
            }

            bpe var103;
            if (var1 == null) {
               try {
                  qwp.b("awaiter");
               } catch (Throwable var100) {
                  var10000 = var100;
                  var10001 = false;
                  break label1139;
               }

               var103 = var6;
            } else {
               try {
                  var103 = (bpe)var1;
               } catch (Throwable var99) {
                  var10000 = var99;
                  var10001 = false;
                  break label1139;
               }
            }

            label1123:
            try {
               var109.remove(var103);
               return qsn.a;
            } catch (Throwable var98) {
               var10000 = var98;
               var10001 = false;
               break label1123;
            }
         }

         var102 = var10000;
         throw var102;
      case 13:
         var102 = (Throwable)var1;
         var104 = this.b;
         var1 = ((atn)var104).a;
         var7 = this.a;
         synchronized(var1){}

         try {
            ((atn)var104).b.remove(var7);
         } finally {
            ;
         }

         return qsn.a;
      case 14:
         label1143: {
            Throwable var9 = (Throwable)var1;
            Object var11 = this.b;
            Object var10 = ((auo)var11).c;
            var104 = this.a;
            synchronized(var10){}
            var1 = var8;
            if (var104 != null) {
               if (var9 != null) {
                  label1113: {
                     label1112: {
                        try {
                           if (!(var9 instanceof CancellationException)) {
                              break label1112;
                           }
                        } catch (Throwable var97) {
                           var10000 = var97;
                           var10001 = false;
                           break label1143;
                        }

                        var102 = (Throwable)var7;
                        break label1113;
                     }

                     var102 = var9;
                  }

                  if (var102 != null) {
                     try {
                        pwm.bv((Throwable)var104, var102);
                     } catch (Throwable var96) {
                        var10000 = var96;
                        var10001 = false;
                        break label1143;
                     }
                  }
               }

               var1 = var104;
            }

            label1101:
            try {
               var102 = (Throwable)var1;
               ((auo)var11).e = var102;
               ((auo)var11).n.d(aui.a);
               return qsn.a;
            } catch (Throwable var95) {
               var10000 = var95;
               var10001 = false;
               break label1101;
            }
         }

         var102 = var10000;
         throw var102;
      case 15:
         var1.getClass();
         ((asw)this.b).i(var1);
         var104 = this.a;
         if (var104 != null) {
            ((axb)var104).add(var1);
         }

         return qsn.a;
      case 16:
         var6 = (azo)var1;
         var6.getClass();
         var1 = azp.b;
         synchronized(var1){}

         try {
            var3 = azp.d++;
         } finally {
            ;
         }

         return new azg(var3, var6, (qvt)this.b, (qvt)this.a);
      case 17:
         var1.getClass();
         ((qvt)this.a).eo(var1);
         ((qvt)this.b).eo(var1);
         return qsn.a;
      case 18:
         var1.getClass();
         ((qvt)this.a).eo(var1);
         ((qvt)this.b).eo(var1);
         return qsn.a;
      case 19:
         var1.getClass();
         ((qvt)this.a).eo(var1);
         ((qvt)this.b).eo(var1);
         return qsn.a;
      default:
         ((bkd)var1).getClass();
         var1 = this.a;
         qvt var111 = ((bct)this.b).a;
         bkd.g((bke)var1, 0, 0, var111, 4);
         return qsn.a;
      }
   }
}
