package android.support.v8.renderscript;

import com.google.android.material.search.Ztp.sYWXtqVx;

public enum Type$CubemapFace {
   private static final Type$CubemapFace[] $VALUES;
   NEGATIVE_X,
   NEGATIVE_Y,
   NEGATIVE_Z,
   POSITIVE_X,
   POSITIVE_Y,
   POSITIVE_Z;

   int mID;

   static {
      Type$CubemapFace var5 = new Type$CubemapFace("POSITIVE_X", 0, 0);
      POSITIVE_X = var5;
      Type$CubemapFace var4 = new Type$CubemapFace("NEGATIVE_X", 1, 1);
      NEGATIVE_X = var4;
      Type$CubemapFace var2 = new Type$CubemapFace("POSITIVE_Y", 2, 2);
      POSITIVE_Y = var2;
      Type$CubemapFace var1 = new Type$CubemapFace("NEGATIVE_Y", 3, 3);
      NEGATIVE_Y = var1;
      Type$CubemapFace var3 = new Type$CubemapFace(sYWXtqVx.YGJOIiVnbGpTeN, 4, 4);
      POSITIVE_Z = var3;
      Type$CubemapFace var0 = new Type$CubemapFace("NEGATIVE_Z", 5, 5);
      NEGATIVE_Z = var0;
      $VALUES = new Type$CubemapFace[]{var5, var4, var2, var1, var3, var0};
   }

   private Type$CubemapFace(int var3) {
      this.mID = var3;
   }
}
