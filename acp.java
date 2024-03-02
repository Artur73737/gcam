import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

@qus(
   b = "androidx.compose.foundation.MutatorMutex$mutateWith$2",
   c = "MutatorMutex.kt",
   d = "invokeSuspend",
   e = {220, 173}
)
public final class acp extends quw implements qvx {
   Object a;
   Object b;
   Object c;
   Object d;
   int e;
   final acn f;
   final qvx g;
   final Object h;
   final bpe i;
   private Object j;

   public acp(acn var1, bpe var2, qvx var3, Object var4, que var5) {
      super(2, var5);
      this.f = var1;
      this.i = var2;
      this.g = var3;
      this.h = var4;
   }

   public final Object b(Object var1) {
      label322: {
         Object var2;
         bpe var28;
         label321: {
            Object var3;
            label324: {
               qul var7 = qul.a;
               Object var4;
               qvx var5;
               switch(this.e) {
               case 0:
                  pwm.bs(var1);
                  qzv var30 = (qzv)this.j;
                  acn var29 = this.f;
                  qug var31 = var30.gO().get(rbd.c);
                  var31.getClass();
                  var28 = new bpe(var29, (rbd)var31);
                  bpe var32 = this.i;

                  bpe var35;
                  do {
                     var35 = (bpe)((AtomicReference)var32.a).get();
                     if (var35 != null) {
                        var3 = var28.b;
                        Enum var33 = (Enum)var35.b;
                        if (((acn)var3).compareTo(var33) < 0) {
                           throw new CancellationException("Current mutation had a higher priority");
                        }
                     }
                  } while(!c.t((AtomicReference)var32.a, var35, var28));

                  if (var35 != null) {
                     ((rbd)var35.a).s(new aco());
                  }

                  var3 = this.i;
                  var2 = ((bpe)var3).b;
                  var5 = this.g;
                  var4 = this.h;
                  this.j = var28;
                  this.a = var2;
                  this.b = var5;
                  this.c = var4;
                  this.d = var3;
                  this.e = 1;
                  if (((rjo)var2).a(this) == var7) {
                     return var7;
                  }
                  break;
               case 1:
                  var3 = this.d;
                  var4 = this.c;
                  var5 = (qvx)this.b;
                  var2 = this.a;
                  bpe var6 = (bpe)this.j;
                  pwm.bs(var1);
                  var28 = var6;
                  break;
               default:
                  var3 = (bpe)this.b;
                  var2 = this.a;
                  bpe var34 = (bpe)this.j;

                  try {
                     pwm.bs(var1);
                  } finally {
                     ;
                  }

                  var28 = var34;
                  break label324;
               }

               Object var37;
               try {
                  this.j = var28;
                  this.a = var2;
                  this.b = var3;
                  this.c = null;
                  this.d = null;
                  this.e = 2;
                  var37 = var5.a(var4, this);
               } catch (Throwable var27) {
                  Throwable var36 = var27;

                  try {
                     c.u((AtomicReference)((bpe)var3).a, var28);
                     throw var36;
                  } finally {
                     break label321;
                  }
               }

               if (var37 == var7) {
                  return var7;
               }
            }

            label308:
            try {
               c.u((AtomicReference)((bpe)var3).a, var28);
               break label322;
            } finally {
               break label308;
            }
         }

         ((rjo)var2).b();
         throw var28;
      }

   }

   public final que c(Object var1, que var2) {
      acp var3 = new acp(this.f, this.i, this.g, this.h, var2);
      var3.j = var1;
      return var3;
   }
}
