import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.CancellationSignal;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

public final class bos extends qwq implements qvt {
   final Object a;
   final Object b;
   private final int c;

   public bos(Object var1, Object var2, int var3) {
      super(1);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public bos(Object var1, Object var2, int var3, byte[] var4) {
      super(1);
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      Object var3;
      Object var4;
      Throwable var11;
      Object var15;
      switch(this.c) {
      case 0:
         ((nd)var1).getClass();
         ((Context)this.a).getApplicationContext().registerComponentCallbacks((ComponentCallbacks)this.b);
         return new aaj(this.a, this.b, 5);
      case 1:
         ((bkd)var1).getClass();
         var15 = this.b;
         qvt var16 = ((bds)this.a).k;
         bkd.g((bke)var15, 0, 0, var16, 4);
         return qsn.a;
      case 2:
         var11 = (Throwable)var1;
         var3 = this.b;
         var15 = this.a;
         var1 = ((boy)var3).e;
         synchronized(var1){}

         try {
            ((boy)var3).f.remove(var15);
         } finally {
            ;
         }

         return qsn.a;
      case 3:
         var11 = (Throwable)var1;
         var1 = ((bpa)this.b).a;
         var15 = this.a;
         ((Choreographer)var1).removeFrameCallback((FrameCallback)var15);
         return qsn.a;
      case 4:
         bpe var12 = (bpe)var1;
         var12.getClass();
         if (!((bqu)this.a).c) {
            clx var13 = ((cmc)var12.a).getLifecycle();
            var3 = this.a;
            var4 = this.b;
            bqu var14 = (bqu)var3;
            var14.e = (qvx)var4;
            if (var14.d == null) {
               var14.d = var13;
               var13.a((cmb)var3);
            } else if (var13.b.a(clw.c)) {
               var1 = this.a;
               ((bqu)var1).b.c(sr.r(-2000640158, true, new afh(var1, this.b, 9, (byte[])null)));
            }
         }

         return qsn.a;
      case 5:
         bvo var2 = (bvo)var1;
         var2.getClass();
         var3 = this.b;
         var1 = ((ebt)var3).a;
         var4 = this.a;
         synchronized(var1){}

         try {
            if (var2.b()) {
               ((bua)((ebt)var3).b).c(var4, var2);
            } else {
               ((bua)((ebt)var3).b).d(var4);
            }
         } finally {
            ;
         }

         return qsn.a;
      case 6:
         var11 = (Throwable)var1;
         ((CancellationSignal)this.a).cancel();
         qxb.r((rbd)this.b);
         return qsn.a;
      default:
         var11 = (Throwable)var1;
         ((rck)this.b).a.removeCallbacks((Runnable)this.a);
         return qsn.a;
      }
   }
}
