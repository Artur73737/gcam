import com.google.android.apps.camera.facedeblur.deeprestore.jni.lt.SFjQQF;
import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;

public final class rkh extends qfn implements qgv {
   public static final rkh an;
   private static volatile qhb ao;
   public long A;
   public long B;
   public long C;
   public long D;
   public long E;
   public rkg F;
   public long G;
   public rkg H;
   public rkg I;
   public rkg J;
   public rkg K;
   public rkg L;
   public rkg M;
   public rkg N;
   public rkg O;
   public rkg P;
   public rkg Q;
   public rkg R;
   public rkg S;
   public rkg T;
   public long U;
   public long V;
   public long W;
   public long X;
   public long Y;
   public long Z;
   public int a;
   public long aa;
   public long ab;
   public long ac;
   public long ad;
   public long ae;
   public long af;
   public long ag;
   public long ah;
   public long ai;
   public rkg aj;
   public long ak;
   public long al;
   public long am;
   public int b;
   public long c;
   public long d;
   public long e;
   public long f;
   public qfw g;
   public qfw h;
   public qfw i;
   public qfw j;
   public qfw k;
   public qfw l;
   public rkg m;
   public qfw n;
   public qfw o;
   public qfw p;
   public qfw q;
   public long r;
   public long s;
   public long t;
   public long u;
   public long v;
   public long w;
   public long x;
   public long y;
   public long z;

   static {
      rkh var0 = new rkh();
      an = var0;
      qfn.ab(rkh.class, var0);
   }

   private rkh() {
      qhe var1 = qhe.b;
      this.g = var1;
      this.h = var1;
      this.i = var1;
      this.j = var1;
      this.k = var1;
      this.l = var1;
      this.n = var1;
      this.o = var1;
      this.p = var1;
      this.q = var1;
   }

   public final void A(rkg var1) {
      this.L = var1;
      this.a |= 33554432;
   }

   public final void B(rkg var1) {
      this.M = var1;
      this.a |= 67108864;
   }

   public final void C(rkg var1) {
      this.N = var1;
      this.a |= 134217728;
   }

   public final void D(rkg var1) {
      this.O = var1;
      this.a |= 268435456;
   }

   public final void E(rkg var1) {
      this.P = var1;
      this.a |= 536870912;
   }

   public final void F(rkg var1) {
      this.Q = var1;
      this.a |= 1073741824;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         String var27 = SFjQQF.okLE;
         String var5 = xKbMW.WYRcug;
         String var28 = PUdPFKr.QgExlFbeAPG;
         String var4 = diyLl.EoxP;
         return Y(an, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"a", "b", "c", "d", "e", "f", "g", rkg.class, "h", rkg.class, "i", rkg.class, "j", rkg.class, "k", rkg.class, "l", rkg.class, "m", "n", rkg.class, "o", rkd.class, "p", rke.class, "q", rkc.class, "r", var27, "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", var5, "ab", "ac", "ad", "ae", "af", var28, "ah", var4, "aj", "ak", "al", "am"});
      case 3:
         return new rkh();
      case 4:
         return new qfi(an);
      case 5:
         return an;
      case 6:
         qhb var3 = ao;
         var2 = var3;
         if (var3 == null) {
            synchronized(rkh.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = ao;
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(an);
                     ao = (qhb)var2;
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label266;
                  }
               }

               label251:
               try {
                  return var2;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label251;
               }
            }

            while(true) {
               Throwable var26 = var10000;

               try {
                  throw var26;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  continue;
               }
            }
         } else {
            return var2;
         }
      }
   }

   public final void ah(rkg var1) {
      this.R = var1;
      this.a |= Integer.MIN_VALUE;
   }

   public final void ai(rkg var1) {
      this.S = var1;
      this.b |= 1;
   }

   public final void aj(rkg var1) {
      this.T = var1;
      this.b |= 2;
   }

   public final void ak(long var1) {
      this.b |= 4;
      this.U = var1;
   }

   public final void al(long var1) {
      this.b |= 8;
      this.V = var1;
   }

   public final void am(long var1) {
      this.b |= 16;
      this.W = var1;
   }

   public final void an(long var1) {
      this.b |= 32;
      this.X = var1;
   }

   public final void ao(long var1) {
      this.b |= 64;
      this.Y = var1;
   }

   public final void ap(long var1) {
      this.b |= 128;
      this.Z = var1;
   }

   public final void aq(long var1) {
      this.b |= 256;
      this.aa = var1;
   }

   public final void ar(long var1) {
      this.b |= 512;
      this.ab = var1;
   }

   public final void as(long var1) {
      this.b |= 1024;
      this.ac = var1;
   }

   public final void at(long var1) {
      this.b |= 2048;
      this.ad = var1;
   }

   public final boolean au() {
      return (this.b & 131072) != 0;
   }

   public final rkg av() {
      rkg var2 = this.aj;
      rkg var1 = var2;
      if (var2 == null) {
         var1 = rkg.e;
      }

      return var1;
   }

   public final boolean aw() {
      return (this.b & 262144) != 0;
   }

   public final boolean ax() {
      return (this.b & 524288) != 0;
   }

   public final boolean ay() {
      return (this.b & 1048576) != 0;
   }

   public final void c() {
      qfw var1 = this.g;
      if (!var1.c()) {
         this.g = qfn.V(var1);
      }

   }

   public final void e() {
      qfw var1 = this.h;
      if (!var1.c()) {
         this.h = qfn.V(var1);
      }

   }

   public final void f() {
      qfw var1 = this.i;
      if (!var1.c()) {
         this.i = qfn.V(var1);
      }

   }

   public final void g() {
      qfw var1 = this.j;
      if (!var1.c()) {
         this.j = qfn.V(var1);
      }

   }

   public final void h() {
      qfw var1 = this.k;
      if (!var1.c()) {
         this.k = qfn.V(var1);
      }

   }

   public final void i() {
      qfw var1 = this.l;
      if (!var1.c()) {
         this.l = qfn.V(var1);
      }

   }

   public final void j() {
      qfw var1 = this.n;
      if (!var1.c()) {
         this.n = qfn.V(var1);
      }

   }

   public final void k(long var1) {
      this.a |= 2048;
      this.x = var1;
   }

   public final void l(long var1) {
      this.a |= 4096;
      this.y = var1;
   }

   public final void m(long var1) {
      this.a |= 8192;
      this.z = var1;
   }

   public final void o(long var1) {
      this.a |= 16384;
      this.A = var1;
   }

   public final void p(long var1) {
      this.a |= 32768;
      this.B = var1;
   }

   public final void r(long var1) {
      this.a |= 65536;
      this.C = var1;
   }

   public final void s(long var1) {
      this.a |= 131072;
      this.D = var1;
   }

   public final void t(long var1) {
      this.a |= 262144;
      this.E = var1;
   }

   public final void u(rkg var1) {
      this.F = var1;
      this.a |= 524288;
   }

   public final void v(long var1) {
      this.a |= 1048576;
      this.G = var1;
   }

   public final void w(rkg var1) {
      this.H = var1;
      this.a |= 2097152;
   }

   public final void x(rkg var1) {
      this.I = var1;
      this.a |= 4194304;
   }

   public final void y(rkg var1) {
      this.J = var1;
      this.a |= 8388608;
   }

   public final void z(rkg var1) {
      this.K = var1;
      this.a |= 16777216;
   }
}
