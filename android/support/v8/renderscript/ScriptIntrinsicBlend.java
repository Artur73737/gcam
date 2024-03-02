package android.support.v8.renderscript;

public class ScriptIntrinsicBlend extends ScriptIntrinsic {
   private static final int INTRINSIC_API_LEVEL = 19;

   public ScriptIntrinsicBlend(long var1, RenderScript var3) {
      super(var1, var3);
   }

   private void blend(int var1, Allocation var2, Allocation var3) {
      if (var2.getElement().isCompatible(Element.U8_4(this.mRS))) {
         if (var3.getElement().isCompatible(Element.U8_4(this.mRS))) {
            this.forEach(var1, (Allocation)var2, var3, (FieldPacker)null);
         } else {
            throw new RSIllegalArgumentException("Output is not of expected format.");
         }
      } else {
         throw new RSIllegalArgumentException("Input is not of expected format.");
      }
   }

   public static ScriptIntrinsicBlend create(RenderScript var0, Element var1) {
      var0.isUseNative();
      ScriptIntrinsicBlend var2 = new ScriptIntrinsicBlend(var0.nScriptIntrinsicCreate(7, var1.getID(var0), false), var0);
      var2.setIncSupp(false);
      return var2;
   }

   public void forEachAdd(Allocation var1, Allocation var2) {
      this.blend(34, var1, var2);
   }

   public void forEachClear(Allocation var1, Allocation var2) {
      this.blend(0, var1, var2);
   }

   public void forEachDst(Allocation var1, Allocation var2) {
   }

   public void forEachDstAtop(Allocation var1, Allocation var2) {
      this.blend(10, var1, var2);
   }

   public void forEachDstIn(Allocation var1, Allocation var2) {
      this.blend(6, var1, var2);
   }

   public void forEachDstOut(Allocation var1, Allocation var2) {
      this.blend(8, var1, var2);
   }

   public void forEachDstOver(Allocation var1, Allocation var2) {
      this.blend(4, var1, var2);
   }

   public void forEachMultiply(Allocation var1, Allocation var2) {
      this.blend(14, var1, var2);
   }

   public void forEachSrc(Allocation var1, Allocation var2) {
      this.blend(1, var1, var2);
   }

   public void forEachSrcAtop(Allocation var1, Allocation var2) {
      this.blend(9, var1, var2);
   }

   public void forEachSrcIn(Allocation var1, Allocation var2) {
      this.blend(5, var1, var2);
   }

   public void forEachSrcOut(Allocation var1, Allocation var2) {
      this.blend(7, var1, var2);
   }

   public void forEachSrcOver(Allocation var1, Allocation var2) {
      this.blend(3, var1, var2);
   }

   public void forEachSubtract(Allocation var1, Allocation var2) {
      this.blend(35, var1, var2);
   }

   public void forEachXor(Allocation var1, Allocation var2) {
      this.blend(11, var1, var2);
   }

   public Script$KernelID getKernelIDAdd() {
      return this.createKernelID(34, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDClear() {
      return this.createKernelID(0, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDDst() {
      return this.createKernelID(2, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDDstAtop() {
      return this.createKernelID(10, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDDstIn() {
      return this.createKernelID(6, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDDstOut() {
      return this.createKernelID(8, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDDstOver() {
      return this.createKernelID(4, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDMultiply() {
      return this.createKernelID(14, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSrc() {
      return this.createKernelID(1, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSrcAtop() {
      return this.createKernelID(9, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSrcIn() {
      return this.createKernelID(5, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSrcOut() {
      return this.createKernelID(7, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSrcOver() {
      return this.createKernelID(3, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDSubtract() {
      return this.createKernelID(35, 3, (Element)null, (Element)null);
   }

   public Script$KernelID getKernelIDXor() {
      return this.createKernelID(11, 3, (Element)null, (Element)null);
   }
}
