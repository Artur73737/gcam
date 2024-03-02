package android.support.v8.renderscript;

public enum RenderScript$ContextType {
   private static final RenderScript$ContextType[] $VALUES;
   DEBUG,
   NORMAL,
   PROFILE;

   int mID;

   static {
      RenderScript$ContextType var2 = new RenderScript$ContextType("NORMAL", 0, 0);
      NORMAL = var2;
      RenderScript$ContextType var0 = new RenderScript$ContextType("DEBUG", 1, 1);
      DEBUG = var0;
      RenderScript$ContextType var1 = new RenderScript$ContextType("PROFILE", 2, 2);
      PROFILE = var1;
      $VALUES = new RenderScript$ContextType[]{var2, var0, var1};
   }

   private RenderScript$ContextType(int var3) {
      this.mID = var3;
   }
}
