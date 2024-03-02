import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.window.layout.adapter.sidecar.nk.OSGHH;

public final class bor extends qwq implements qvi {
   public static final bor a = new bor(0);
   public static final bor b = new bor(1);
   public static final bor c = new bor(2);
   public static final bor d = new bor(3);
   public static final bor e = new bor(4);
   public static final bor f = new bor(5);
   public static final bor g = new bor(6);
   public static final bor h = new bor(7);
   public static final bor i = new bor(8);
   public static final bor j = new bor(9);
   public static final bor k = new bor(10);
   public static final bor l = new bor(11);
   public static final bor m = new bor(12);
   public static final bor n = new bor(13);
   public static final bor o = new bor(14);
   public static final bor p = new bor(15);
   public static final bor q = new bor(16);
   public static final bor r = new bor(17);
   public static final bor s = new bor(18);
   public static final bor t = new bor(19);
   public static final bor u = new bor(20);
   private final int v;

   public bor(int var1) {
      super(0);
      this.v = var1;
   }

   // $FF: synthetic method
   public final Object a() {
      switch(this.v) {
      case 0:
         bou.b("LocalConfiguration");
         throw new qsc();
      case 1:
         return 0.0F;
      case 2:
         bou.b("LocalContext");
         throw new qsc();
      case 3:
         bou.b("LocalImageVectorCache");
         throw new qsc();
      case 4:
         bou.b("LocalLifecycleOwner");
         throw new qsc();
      case 5:
         bou.b("LocalSavedStateRegistryOwner");
         throw new qsc();
      case 6:
         bou.b("LocalView");
         throw new qsc();
      case 7:
         Choreographer var1;
         if (bod.c()) {
            var1 = Choreographer.getInstance();
         } else {
            qzr var3 = rah.a;
            var1 = (Choreographer)qwo.m(rij.a, new bov((que)null));
         }

         var1.getClass();
         Handler var2 = Handler.createAsync(Looper.getMainLooper());
         var2.getClass();
         boy var4 = new boy(var1, var2);
         return var4.plus(var4.j);
      case 8:
      case 9:
         return null;
      case 10:
         bpi.a("LocalAutofillTree");
         throw new qsc();
      case 11:
         bpi.a("LocalClipboardManager");
         throw new qsc();
      case 12:
         bpi.a("LocalDensity");
         throw new qsc();
      case 13:
         bpi.a("LocalFocusManager");
         throw new qsc();
      case 14:
         bpi.a("LocalFontFamilyResolver");
         throw new qsc();
      case 15:
         bpi.a("LocalFontLoader");
         throw new qsc();
      case 16:
         bpi.a("LocalHapticFeedback");
         throw new qsc();
      case 17:
         bpi.a("LocalInputManager");
         throw new qsc();
      case 18:
         bpi.a("LocalLayoutDirection");
         throw new qsc();
      case 19:
         throw new IllegalStateException(OSGHH.jUDIDDhsWvJqMc);
      default:
         return null;
      }
   }
}
