package android.support.v8.renderscript;

public class ScriptIntrinsicLUT extends ScriptIntrinsic {
   private static final int INTRINSIC_API_LEVEL = 19;
   private final byte[] mCache = new byte[1024];
   private boolean mDirty = true;
   private final Matrix4f mMatrix = new Matrix4f();
   private Allocation mTables;

   public ScriptIntrinsicLUT(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public static ScriptIntrinsicLUT create(RenderScript var0, Element var1) {
      var0.isUseNative();
      ScriptIntrinsicLUT var5 = new ScriptIntrinsicLUT(var0.nScriptIntrinsicCreate(3, var1.getID(var0), false), var0);
      var5.setIncSupp(false);
      var5.mTables = Allocation.createSized(var0, Element.U8(var0), 1024);

      for(int var3 = 0; var3 < 256; ++var3) {
         byte[] var4 = var5.mCache;
         byte var2 = (byte)var3;
         var4[var3] = var2;
         var4[var3 + 256] = var2;
         var4[var3 + 512] = var2;
         var4[var3 + 768] = var2;
      }

      var5.setVar(0, (BaseObj)var5.mTables);
      return var5;
   }

   private void validate(int var1, int var2) {
      if (var1 >= 0 && var1 <= 255) {
         if (var2 < 0 || var2 > 255) {
            throw new RSIllegalArgumentException("Value out of range (0-255).");
         }
      } else {
         throw new RSIllegalArgumentException("Index out of range (0-255).");
      }
   }

   public void forEach(Allocation var1, Allocation var2) {
      if (this.mDirty) {
         this.mDirty = false;
         this.mTables.copyFromUnchecked(this.mCache);
      }

      this.forEach(0, (Allocation)var1, var2, (FieldPacker)null);
   }

   public Script$KernelID getKernelID() {
      return this.createKernelID(0, 3, (Element)null, (Element)null);
   }

   public void setAlpha(int var1, int var2) {
      this.validate(var1, var2);
      this.mCache[var1 + 768] = (byte)var2;
      this.mDirty = true;
   }

   public void setBlue(int var1, int var2) {
      this.validate(var1, var2);
      this.mCache[var1 + 512] = (byte)var2;
      this.mDirty = true;
   }

   public void setGreen(int var1, int var2) {
      this.validate(var1, var2);
      this.mCache[var1 + 256] = (byte)var2;
      this.mDirty = true;
   }

   public void setRed(int var1, int var2) {
      this.validate(var1, var2);
      byte var3 = (byte)var2;
      this.mCache[var1] = var3;
      this.mDirty = true;
   }
}
