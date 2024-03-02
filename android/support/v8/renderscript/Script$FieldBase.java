package android.support.v8.renderscript;

public class Script$FieldBase {
   protected Allocation mAllocation;
   protected Element mElement;

   protected Script$FieldBase() {
   }

   public Allocation getAllocation() {
      return this.mAllocation;
   }

   public Element getElement() {
      return this.mElement;
   }

   public Type getType() {
      return this.mAllocation.getType();
   }

   protected void init(RenderScript var1, int var2) {
      this.mAllocation = Allocation.createSized(var1, this.mElement, var2, 1);
   }

   protected void init(RenderScript var1, int var2, int var3) {
      this.mAllocation = Allocation.createSized(var1, this.mElement, var2, var3 | 1);
   }

   public void updateAllocation() {
   }
}
