package android.support.v8.renderscript;

public class ScriptIntrinsicBlur extends ScriptIntrinsic {
   private static final int INTRINSIC_API_LEVEL = 19;
   private Allocation mInput;
   private final float[] mValues = new float[9];

   public ScriptIntrinsicBlur(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public static ScriptIntrinsicBlur create(RenderScript var0, Element var1) {
      if (!var1.isCompatible(Element.U8_4(var0)) && !var1.isCompatible(Element.U8(var0))) {
         throw new RSIllegalArgumentException("Unsuported element type.");
      } else {
         var0.isUseNative();
         ScriptIntrinsicBlur var2 = new ScriptIntrinsicBlur(var0.nScriptIntrinsicCreate(5, var1.getID(var0), false), var0);
         var2.setIncSupp(false);
         var2.setRadius(5.0F);
         return var2;
      }
   }

   public void forEach(Allocation var1) {
      this.forEach(0, (Allocation)null, var1, (FieldPacker)null);
   }

   public Script$FieldID getFieldID_Input() {
      return this.createFieldID(1, (Element)null);
   }

   public Script$KernelID getKernelID() {
      return this.createKernelID(0, 2, (Element)null, (Element)null);
   }

   public void setInput(Allocation var1) {
      this.mInput = var1;
      this.setVar(1, (BaseObj)var1);
   }

   public void setRadius(float var1) {
      if (!(var1 <= 0.0F) && !(var1 > 25.0F)) {
         this.setVar(0, var1);
      } else {
         throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
      }
   }
}
