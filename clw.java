import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;

public enum clw {
   a,
   b,
   c,
   d,
   e;

   private static final clw[] f;

   static {
      clw var2 = new clw("DESTROYED", 0);
      a = var2;
      clw var0 = new clw("INITIALIZED", 1);
      b = var0;
      clw var4 = new clw("CREATED", 2);
      c = var4;
      clw var1 = new clw(tRYpVduhjf.VWNHOaABV, 3);
      d = var1;
      clw var3 = new clw("RESUMED", 4);
      e = var3;
      f = new clw[]{var2, var0, var4, var1, var3};
   }

   public final boolean a(clw var1) {
      var1.getClass();
      return this.compareTo(var1) >= 0;
   }
}
