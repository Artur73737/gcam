package android.support.v8.renderscript;

public class ScriptIntrinsicConvolve5x5 extends ScriptIntrinsic {
   private static final int INTRINSIC_API_LEVEL = 19;
   private Allocation mInput;
   private final float[] mValues = new float[25];

   public ScriptIntrinsicConvolve5x5(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public static ScriptIntrinsicConvolve5x5 create(RenderScript var0, Element var1) {
      if (!var1.isCompatible(Element.U8(var0)) && !var1.isCompatible(Element.U8_2(var0)) && !var1.isCompatible(Element.U8_3(var0)) && !var1.isCompatible(Element.U8_4(var0)) && !var1.isCompatible(Element.F32(var0)) && !var1.isCompatible(Element.F32_2(var0)) && !var1.isCompatible(Element.F32_3(var0)) && !var1.isCompatible(Element.F32_4(var0))) {
         throw new RSIllegalArgumentException("Unsuported element type.");
      } else {
         var0.isUseNative();
         ScriptIntrinsicConvolve5x5 var2 = new ScriptIntrinsicConvolve5x5(var0.nScriptIntrinsicCreate(4, var1.getID(var0), false), var0);
         var2.setIncSupp(false);
         return var2;
      }
   }

   public void forEach(Allocation var1) {
      this.forEach(0, (Allocation)null, var1, (FieldPacker)null);
   }

   public void forEach(Allocation var1, Script$LaunchOptions var2) {
      this.forEach(0, (Allocation)null, var1, (FieldPacker)null, var2);
   }

   public Script$FieldID getFieldID_Input() {
      return this.createFieldID(1, (Element)null);
   }

   public Script$KernelID getKernelID() {
      return this.createKernelID(0, 2, (Element)null, (Element)null);
   }

   public void setCoefficients(float[] var1) {
      FieldPacker var5 = new FieldPacker(100);
      int var3 = 0;

      while(true) {
         float[] var4 = this.mValues;
         if (var3 >= var4.length) {
            this.setVar(0, (FieldPacker)var5);
            return;
         }

         float var2 = var1[var3];
         var4[var3] = var2;
         var5.addF32(var2);
         ++var3;
      }
   }

   public void setInput(Allocation var1) {
      this.mInput = var1;
      this.setVar(1, (BaseObj)var1);
   }
}
