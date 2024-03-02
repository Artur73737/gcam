import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode.AmbientController;
import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class vi implements qrz {
   private final vj a;
   private final int b;

   public vi(vj var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object get() {
      Object var9;
      vj var12;
      vj var18;
      switch(this.b) {
      case 0:
         return new lmk((wu)this.a.n.get());
      case 1:
         var18 = this.a;
         var9 = var18.t.a;
         qrz var23 = var18.m;
         ((bwc)var18.b.get()).getClass();

         wu var26;
         try {
            Trace.beginSection("Initialize defaultCameraBackend");
            var26 = (wu)var23.get();
         } finally {
            Trace.endSection();
         }

         qw var27 = (qw)var9;
         StringBuilder var29;
         if (!((Map)var27.e.a).containsKey(qj.a())) {
            Map var28 = pwm.ae((Map)var27.e.a, pwm.bq(qj.a(), new AmbientController(var26, (byte[])null)));
            if (var28.containsKey(qj.a())) {
               return new wu(var28);
            }

            var29 = new StringBuilder();
            var29.append("Failed to find ");
            var29.append("CameraBackendId(value=CXCP-Camera2)");
            var29.append(" in the list of available CameraPipe backends! Available values are ");
            var29.append(var28.keySet());
            throw new IllegalStateException(var29.toString());
         }

         var29 = new StringBuilder();
         var29.append("CameraBackendConfig#cameraBackends should not contain a backend with ");
         var29.append("CameraBackendId(value=CXCP-Camera2)");
         var29.append(OtvMV.MxtE);
         throw new IllegalStateException(var29.toString());
      case 2:
         bwc var6 = (bwc)this.a.b.get();
         tg var21 = (tg)this.a.d.get();
         fwf var22 = (fwf)this.a.g.get();
         nwu var30 = (nwu)this.a.l.get();
         bnc var25 = new bnc(this.a);
         var18 = this.a;
         return new wu(var6, var21, var22, var30, var25, new lmk(var18.c, (bwc)var18.b.get()));
      case 3:
         rjf var15 = this.a.s;
         int[] var14 = vm.a;
         ExecutorService var16 = Executors.newCachedThreadPool(vm.b(vm.c(vm.b, "CXCP-IO-"), -1));
         var16.getClass();
         qxb.t(var16);
         qzr var19 = qxb.t(vm.a(vm.b(vm.c(vm.b, "CXCP-BG-"), -1), 4));
         ScheduledExecutorService var17 = vm.a(vm.b(vm.c(vm.b, "CXCP-"), -3), var15.a);
         qzr var20 = qxb.t(var17);
         vk var24 = new vk(0);
         vk var5 = new vk(1);
         return new bwc(qzy.h(qzy.n().plus(var20).plus(new qzu("CXCP"))), var19, var17, var20, var24, var5);
      case 4:
         vj var13 = this.a;
         return new tg(var13.c, (bwc)var13.b.get());
      case 5:
         var9 = this.a.a().getSystemService("camera");
         var9.getClass();
         return (CameraManager)var9;
      case 6:
         var12 = this.a;
         Context var11 = var12.a();
         bwc var4 = (bwc)var12.b.get();
         vo var3 = (vo)this.a.e.get();
         var12 = this.a;
         return new fwf(var11, var4, var3, ((qw)var12.t.a).d, (nl)var12.f.get());
      case 7:
         return new vo(this.a.a());
      case 8:
         return new nl();
      case 9:
         vo var10 = (vo)this.a.e.get();
         var12 = this.a;
         return new nwu(var10, new ul(new nwu(new bpe(var12.c, (bwc)var12.b.get()), (fwf)var12.g.get(), (blj)var12.h.get(), (bpe)var12.j.get(), (nl)var12.f.get(), ((qw)var12.t.a).c, (bwc)var12.b.get()), (blj)var12.h.get(), new bpe(var12.c, (bwc)var12.b.get(), (byte[])null), (nl)var12.f.get(), (lmk)var12.k.get()), (blj)this.a.h.get(), (bwc)this.a.b.get());
      case 10:
         return new blj((byte[])null, (char[])null);
      case 11:
         return new bpe((bwc)this.a.b.get(), (lmk)this.a.i.get());
      case 12:
         return new lmk((fwf)this.a.g.get());
      case 13:
         var9 = this.a.a().getSystemService("device_policy");
         var9.getClass();
         return new lmk((DevicePolicyManager)var9, (byte[])null);
      case 14:
         return new rf();
      case 15:
         bwc var2 = (bwc)this.a.b.get();
         wu var1 = (wu)this.a.n.get();
         var2.getClass();
         var1.getClass();
         return new li();
      default:
         return new fwf((bwc)this.a.b.get());
      }
   }
}
