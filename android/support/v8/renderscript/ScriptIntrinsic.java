package android.support.v8.renderscript;

public abstract class ScriptIntrinsic extends Script {
   public ScriptIntrinsic(long var1, RenderScript var3) {
      super(var1, var3);
      if (var1 == 0L) {
         throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
      }
   }
}
