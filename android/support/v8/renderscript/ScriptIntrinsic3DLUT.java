package android.support.v8.renderscript;

public class ScriptIntrinsic3DLUT extends ScriptIntrinsic {
   private static final int INTRINSIC_API_LEVEL = 19;
   private Element mElement;
   private Allocation mLUT;

   protected ScriptIntrinsic3DLUT(long var1, RenderScript var3, Element var4) {
      super(var1, var3);
      this.mElement = var4;
   }

   public static ScriptIntrinsic3DLUT create(RenderScript var0, Element var1) {
      if (var1.isCompatible(Element.U8_4(var0))) {
         var0.isUseNative();
         ScriptIntrinsic3DLUT var2 = new ScriptIntrinsic3DLUT(var0.nScriptIntrinsicCreate(8, var1.getID(var0), false), var0, var1);
         var2.setIncSupp(false);
         return var2;
      } else {
         throw new RSIllegalArgumentException("Element must be compatible with uchar4.");
      }
   }

   public void forEach(Allocation var1, Allocation var2) {
      this.forEach(0, (Allocation)var1, var2, (FieldPacker)null);
   }

   public Script$KernelID getKernelID() {
      return this.createKernelID(0, 3, (Element)null, (Element)null);
   }

   public void setLUT(Allocation var1) {
      Type var2 = var1.getType();
      if (var2.getZ() != 0) {
         if (var2.getElement().isCompatible(this.mElement)) {
            this.mLUT = var1;
            this.setVar(0, (BaseObj)var1);
         } else {
            throw new RSIllegalArgumentException("LUT element type must match.");
         }
      } else {
         throw new RSIllegalArgumentException("LUT must be 3d.");
      }
   }
}
