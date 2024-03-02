import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

@qus(
   b = "androidx.compose.animation.core.MutatorMutex$mutate$2",
   c = "InternalMutatorMutex.kt",
   d = "invokeSuspend",
   e = {184, 132}
)
public final class zv extends quw implements qvx {
   Object a;
   Object b;
   Object c;
   int d;
   final zt e;
   final qvt f;
   final blj g;
   private Object h;

   public zv(zt var1, blj var2, qvt var3, que var4) {
      super(2, var4);
      this.e = var1;
      this.g = var2;
      this.f = var3;
   }

   public final Object b(Object var1) {
      label322: {
         Object var2;
         blj var27;
         label321: {
            Object var3;
            label324: {
               qul var6 = qul.a;
               blj var33;
               Object var34;
               qvt var4;
               switch(this.d) {
               case 0:
                  pwm.bs(var1);
                  qzv var29 = (qzv)this.h;
                  zt var28 = this.e;
                  qug var30 = var29.gO().get(rbd.c);
                  var30.getClass();
                  var27 = new blj(var28, (rbd)var30);
                  var33 = this.g;

                  blj var32;
                  do {
                     var32 = (blj)((AtomicReference)var33.a).get();
                     if (var32 != null) {
                        var34 = var27.a;
                        Enum var31 = (Enum)var32.a;
                        if (((zt)var34).compareTo(var31) < 0) {
                           throw new CancellationException("Current mutation had a higher priority");
                        }
                     }
                  } while(!c.t((AtomicReference)var33.a, var32, var27));

                  if (var32 != null) {
                     ((rbd)var32.b).s(new zu());
                  }

                  var3 = this.g;
                  var2 = ((blj)var3).b;
                  var4 = this.f;
                  this.h = var27;
                  this.a = var2;
                  this.b = var4;
                  this.c = var3;
                  this.d = 1;
                  if (((rjo)var2).a(this) == var6) {
                     return var6;
                  }
                  break;
               case 1:
                  var3 = this.c;
                  var4 = (qvt)this.b;
                  var2 = this.a;
                  blj var5 = (blj)this.h;
                  pwm.bs(var1);
                  var27 = var5;
                  break;
               default:
                  var3 = (blj)this.b;
                  var2 = this.a;
                  var33 = (blj)this.h;

                  try {
                     pwm.bs(var1);
                  } finally {
                     ;
                  }

                  var27 = var33;
                  break label324;
               }

               try {
                  this.h = var27;
                  this.a = var2;
                  this.b = var3;
                  this.c = null;
                  this.d = 2;
                  var34 = var4.eo(this);
               } catch (Throwable var26) {
                  Throwable var35 = var26;

                  try {
                     c.u((AtomicReference)((blj)var3).a, var27);
                     throw var35;
                  } finally {
                     break label321;
                  }
               }

               if (var34 == var6) {
                  return var6;
               }
            }

            label308:
            try {
               c.u((AtomicReference)((blj)var3).a, var27);
               break label322;
            } finally {
               break label308;
            }
         }

         ((rjo)var2).b();
         throw var27;
      }

   }

   public final que c(Object var1, que var2) {
      zv var3 = new zv(this.e, this.g, this.f, var2);
      var3.h = var1;
      return var3;
   }
}
