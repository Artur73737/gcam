import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;

public enum clv {
   private static final clv[] $VALUES;
   public static final clu Companion;
   ON_ANY,
   ON_CREATE,
   ON_DESTROY,
   ON_PAUSE,
   ON_RESUME,
   ON_START,
   ON_STOP;

   static {
      clv var1 = new clv("ON_CREATE", 0);
      ON_CREATE = var1;
      clv var0 = new clv(gREaEL.msVDaiAkCQ, 1);
      ON_START = var0;
      clv var3 = new clv("ON_RESUME", 2);
      ON_RESUME = var3;
      clv var5 = new clv("ON_PAUSE", 3);
      ON_PAUSE = var5;
      clv var4 = new clv("ON_STOP", 4);
      ON_STOP = var4;
      clv var2 = new clv("ON_DESTROY", 5);
      ON_DESTROY = var2;
      clv var6 = new clv("ON_ANY", 6);
      ON_ANY = var6;
      $VALUES = new clv[]{var1, var0, var3, var5, var4, var2, var6};
      Companion = new clu();
   }

   public final clw a() {
      switch(this.ordinal()) {
      case 0:
      case 4:
         return clw.c;
      case 1:
      case 3:
         return clw.d;
      case 2:
         return clw.e;
      case 5:
         return clw.a;
      default:
         StringBuilder var1 = new StringBuilder();
         var1.append(this);
         var1.append(" has no target state");
         throw new IllegalArgumentException(this.toString().concat(" has no target state"));
      }
   }
}
