package android.support.v8.renderscript;

import androidx.window.area.reflectionguard.TU.aGGlrXh;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;

public enum Sampler$Value {
   private static final Sampler$Value[] $VALUES;
   CLAMP,
   LINEAR,
   LINEAR_MIP_LINEAR,
   LINEAR_MIP_NEAREST,
   MIRRORED_REPEAT,
   NEAREST,
   WRAP;

   int mID;

   static {
      Sampler$Value var6 = new Sampler$Value("NEAREST", 0, 0);
      NEAREST = var6;
      Sampler$Value var5 = new Sampler$Value("LINEAR", 1, 1);
      LINEAR = var5;
      Sampler$Value var4 = new Sampler$Value(aGGlrXh.wyIUdQf, 2, 2);
      LINEAR_MIP_LINEAR = var4;
      Sampler$Value var0 = new Sampler$Value("LINEAR_MIP_NEAREST", 3, 5);
      LINEAR_MIP_NEAREST = var0;
      Sampler$Value var1 = new Sampler$Value(zBdGS.nTfMHQ, 4, 3);
      WRAP = var1;
      Sampler$Value var2 = new Sampler$Value("CLAMP", 5, 4);
      CLAMP = var2;
      Sampler$Value var3 = new Sampler$Value("MIRRORED_REPEAT", 6, 6);
      MIRRORED_REPEAT = var3;
      $VALUES = new Sampler$Value[]{var6, var5, var4, var0, var1, var2, var3};
   }

   private Sampler$Value(int var3) {
      this.mID = var3;
   }
}
