package android.support.v8.renderscript;

public enum Allocation$MipmapControl {
   private static final Allocation$MipmapControl[] $VALUES;
   MIPMAP_FULL,
   MIPMAP_NONE,
   MIPMAP_ON_SYNC_TO_TEXTURE;

   int mID;

   static {
      Allocation$MipmapControl var0 = new Allocation$MipmapControl("MIPMAP_NONE", 0, 0);
      MIPMAP_NONE = var0;
      Allocation$MipmapControl var2 = new Allocation$MipmapControl("MIPMAP_FULL", 1, 1);
      MIPMAP_FULL = var2;
      Allocation$MipmapControl var1 = new Allocation$MipmapControl("MIPMAP_ON_SYNC_TO_TEXTURE", 2, 2);
      MIPMAP_ON_SYNC_TO_TEXTURE = var1;
      $VALUES = new Allocation$MipmapControl[]{var0, var2, var1};
   }

   private Allocation$MipmapControl(int var3) {
      this.mID = var3;
   }
}
