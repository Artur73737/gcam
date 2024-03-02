import java.util.ArrayList;
import java.util.List;

public final class asg implements atr {
   public final Object a;
   public List b;
   public List c;
   private final qvi e;
   private Throwable f;

   public asg() {
      this((qvi)null);
   }

   public asg(qvi var1) {
      this.e = var1;
      this.a = new Object();
      this.b = new ArrayList();
      this.c = new ArrayList();
   }

   public final Object a(qvt var1, que var2) {
      qza var143 = new qza(quy.h(var2), 1);
      var143.r();
      qwz var7 = new qwz();
      Object var6 = this.a;
      synchronized(var6){}

      Object var141;
      label1136: {
         Throwable var10000;
         label1135: {
            Throwable var8;
            boolean var10001;
            try {
               var8 = this.f;
            } catch (Throwable var140) {
               var10000 = var140;
               var10001 = false;
               break label1135;
            }

            if (var8 != null) {
               label1118:
               try {
                  var143.gP(pwm.br(var8));
               } catch (Throwable var135) {
                  var10000 = var135;
                  var10001 = false;
                  break label1118;
               }
            } else {
               label1140: {
                  boolean var5;
                  List var151;
                  try {
                     bpe var150 = new bpe(var1, var143);
                     var7.a = var150;
                     var5 = this.b.isEmpty();
                     var151 = this.b;
                     var141 = var7.a;
                  } catch (Throwable var139) {
                     var10000 = var139;
                     var10001 = false;
                     break label1140;
                  }

                  bpe var142;
                  if (var141 == null) {
                     try {
                        qwp.b("awaiter");
                     } catch (Throwable var138) {
                        var10000 = var138;
                        var10001 = false;
                        break label1140;
                     }

                     var142 = null;
                  } else {
                     try {
                        var142 = (bpe)var141;
                     } catch (Throwable var137) {
                        var10000 = var137;
                        var10001 = false;
                        break label1140;
                     }
                  }

                  try {
                     var151.add(var142);
                  } catch (Throwable var136) {
                     var10000 = var136;
                     var10001 = false;
                     break label1140;
                  }

                  var143.s(new zy(this, var7, 12));
                  if (!var5) {
                     break label1136;
                  }

                  try {
                     this.e.a();
                  } catch (Throwable var134) {
                     Throwable var147 = var134;
                     var141 = this.a;
                     synchronized(var141){}

                     label1142: {
                        Throwable var148;
                        try {
                           var148 = this.f;
                        } catch (Throwable var133) {
                           var10000 = var133;
                           var10001 = false;
                           break label1142;
                        }

                        if (var148 != null) {
                           break label1136;
                        }

                        int var4;
                        List var149;
                        try {
                           this.f = var147;
                           var149 = this.b;
                           var4 = var149.size();
                        } catch (Throwable var132) {
                           var10000 = var132;
                           var10001 = false;
                           break label1142;
                        }

                        for(int var3 = 0; var3 < var4; ++var3) {
                           try {
                              ((que)((bpe)var149.get(var3)).b).gP(pwm.br(var147));
                           } catch (Throwable var131) {
                              var10000 = var131;
                              var10001 = false;
                              break label1142;
                           }
                        }

                        label1094:
                        try {
                           this.b.clear();
                           break label1136;
                        } catch (Throwable var130) {
                           var10000 = var130;
                           var10001 = false;
                           break label1094;
                        }
                     }

                     Throwable var145 = var10000;
                     throw var145;
                  }
               }
            }
            break label1136;
         }

         Throwable var144 = var10000;
         throw var144;
      }

      var141 = var143.c();
      qul var146 = qul.a;
      return var141;
   }

   public final Object fold(Object var1, qvx var2) {
      return quy.i(this, var1, var2);
   }

   public final qug get(quh var1) {
      return nd.c(this, var1);
   }

   // $FF: synthetic method
   public final quh getKey() {
      return atr.d;
   }

   public final qui minusKey(quh var1) {
      return nd.d(this, var1);
   }

   public final qui plus(qui var1) {
      return nd.e(this, var1);
   }
}
