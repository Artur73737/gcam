package android.support.v8.renderscript;

class ScriptGroup$ConnectLine {
   Allocation mAllocation;
   Type mAllocationType;
   Script$KernelID mFrom;
   Script$FieldID mToF;
   Script$KernelID mToK;

   public ScriptGroup$ConnectLine(Type var1, Script$KernelID var2, Script$FieldID var3) {
      this.mFrom = var2;
      this.mToF = var3;
      this.mAllocationType = var1;
   }

   public ScriptGroup$ConnectLine(Type var1, Script$KernelID var2, Script$KernelID var3) {
      this.mFrom = var2;
      this.mToK = var3;
      this.mAllocationType = var1;
   }
}
