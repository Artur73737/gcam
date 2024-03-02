package android.support.v8.renderscript;

public enum RenderScript$Priority {
   private static final RenderScript$Priority[] $VALUES;
   LOW,
   NORMAL;

   int mID;

   static {
      RenderScript$Priority var0 = new RenderScript$Priority("LOW", 0, 15);
      LOW = var0;
      RenderScript$Priority var1 = new RenderScript$Priority("NORMAL", 1, -4);
      NORMAL = var1;
      $VALUES = new RenderScript$Priority[]{var0, var1};
   }

   private RenderScript$Priority(int var3) {
      this.mID = var3;
   }
}
