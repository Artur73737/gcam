import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class uq implements ref {
   final Object a;
   final Object b;
   private final int c;

   public uq(Object var1, Object var2, int var3) {
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public uq(Object var1, Object var2, int var3, byte[] var4) {
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public final Object a(Object var1, que var2) {
      ahp var78;
      switch(this.c) {
      case 0:
         kh var83 = (kh)var1;
         if (var83 instanceof to || var83 instanceof tn) {
            ((ut)this.a).c.b();
            qzy.i((qzv)this.b, (CancellationException)null);
         }

         return qsn.a;
      case 1:
         kh var79 = (kh)var1;
         int var3;
         Object var80;
         Throwable var10000;
         boolean var10001;
         Throwable var81;
         if (var79 instanceof tp) {
            tz var82 = (tz)((qwz)this.b).a;
            tl var87 = ((tp)var79).a;
            var80 = var82.b;
            synchronized(var80){}

            label1361: {
               try {
                  var3 = var82.d;
               } catch (Throwable var71) {
                  var10000 = var71;
                  var10001 = false;
                  break label1361;
               }

               if (var3 == 4 || var3 == 5) {
                  return qsn.a;
               }

               label1290:
               try {
                  var82.c = var87;
                  qzv var92 = var82.a;
                  tv var88 = new tv(var82, (que)null);
                  qwo.o(var92, (qui)null, 0, var88, 3);
                  return qsn.a;
               } catch (Throwable var70) {
                  var10000 = var70;
                  var10001 = false;
                  break label1290;
               }
            }

            var81 = var10000;
            throw var81;
         } else if (var79 instanceof to) {
            ((tz)((qwz)this.b).a).c();
         } else if (var79 instanceof tn) {
            ((tz)((qwz)this.b).a).c();
            var1 = this.a;
            tn var4 = (tn)var79;
            var80 = ((sx)var1).b;
            synchronized(var80){}

            label1373: {
               qq var5;
               try {
                  var5 = var4.a;
               } catch (Throwable var77) {
                  var10000 = var77;
                  var10001 = false;
                  break label1373;
               }

               if (var5 != null) {
                  label1322: {
                     label1363: {
                        label1319:
                        try {
                           var3 = var5.a;
                           if (!c.n(var3, 6) && !c.n(var3, 1) && !c.n(var3, 2)) {
                              break label1319;
                           }
                           break label1363;
                        } catch (Throwable var75) {
                           var10000 = var75;
                           var10001 = false;
                           break label1373;
                        }

                        try {
                           qm var90 = qm.a;
                           ((sx)var1).g = var90;
                           StringBuilder var91 = new StringBuilder();
                           var91.append("Camera2CameraController encountered an unrecoverable error: ");
                           var91.append(var4.a);
                           break label1322;
                        } catch (Throwable var74) {
                           var10000 = var74;
                           var10001 = false;
                           break label1373;
                        }
                     }

                     try {
                        ql var89 = ql.a;
                        ((sx)var1).g = var89;
                     } catch (Throwable var73) {
                        var10000 = var73;
                        var10001 = false;
                        break label1373;
                     }
                  }

                  try {
                     qq var85 = var4.a;
                     ((sx)var1).c = var85;
                  } catch (Throwable var72) {
                     var10000 = var72;
                     var10001 = false;
                     break label1373;
                  }
               } else {
                  try {
                     qo var86 = qo.a;
                     ((sx)var1).g = var86;
                  } catch (Throwable var76) {
                     var10000 = var76;
                     var10001 = false;
                     break label1373;
                  }
               }

               return qsn.a;
            }

            var81 = var10000;
            throw var81;
         }

         return qsn.a;
      case 2:
         var78 = (ahp)var1;
         if (var78 instanceof ahg) {
            ((List)this.b).add(var78);
         } else if (var78 instanceof ahh) {
            ((List)this.b).remove(((ahh)var78).a);
         } else if (var78 instanceof ahf) {
            ((List)this.b).remove(((ahf)var78).a);
         }

         ((att)this.a).b(((Collection)this.b).isEmpty() ^ true);
         return qsn.a;
      case 3:
         var78 = (ahp)var1;
         if (var78 instanceof ahj) {
            ((List)this.b).add(var78);
         } else if (var78 instanceof ahk) {
            ((List)this.b).remove(((ahk)var78).a);
         }

         ((att)this.a).b(((Collection)this.b).isEmpty() ^ true);
         return qsn.a;
      case 4:
         var78 = (ahp)var1;
         if (var78 instanceof ahm) {
            ((List)this.b).add(var78);
         } else if (var78 instanceof ahn) {
            ((List)this.b).remove(((ahn)var78).a);
         }

         ((att)this.a).b(((Collection)this.b).isEmpty() ^ true);
         return qsn.a;
      case 5:
         var78 = (ahp)var1;
         if (var78 instanceof ahr) {
            ((List)this.b).add(var78);
         } else if (var78 instanceof ahs) {
            ((List)this.b).remove(((ahs)var78).a);
         } else if (var78 instanceof ahq) {
            ((List)this.b).remove(((ahq)var78).a);
         }

         ((att)this.a).b(((Collection)this.b).isEmpty() ^ true);
         return qsn.a;
      default:
         dbt var84 = (dbt)var1;
         ((dcu)this.a).e((dfb)this.b, var84);
         return qsn.a;
      }
   }
}
