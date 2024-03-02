package android.support.v8.renderscript;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class ScriptGroup$Closure extends BaseObj {
   private static final String TAG = "Closure";
   private Object[] mArgs;
   private Map mBindings;
   private FieldPacker mFP;
   private Map mGlobalFuture;
   private ScriptGroup$Future mReturnFuture;
   private Allocation mReturnValue;

   public ScriptGroup$Closure(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public ScriptGroup$Closure(RenderScript var1, Script$InvokeID var2, Object[] var3, Map var4) {
      super(0L, var1);
      this.mFP = FieldPacker.createFromArray(var3);
      this.mArgs = var3;
      this.mBindings = var4;
      this.mGlobalFuture = new HashMap();
      int var5 = var4.size();
      long[] var6 = new long[var5];
      long[] var9 = new long[var5];
      int[] var7 = new int[var5];
      long[] var8 = new long[var5];
      long[] var13 = new long[var5];
      Iterator var14 = var4.entrySet().iterator();

      for(var5 = 0; var14.hasNext(); ++var5) {
         Entry var11 = (Entry)var14.next();
         Object var10 = var11.getValue();
         Script$FieldID var12 = (Script$FieldID)var11.getKey();
         var6[var5] = var12.getID(var1);
         this.retrieveValueAndDependenceInfo(var1, var5, var12, var10, var9, var7, var8, var13);
      }

      this.setID(var1.nInvokeClosureCreate(var2.getID(var1), this.mFP.getData(), var6, var9, var7));
   }

   public ScriptGroup$Closure(RenderScript var1, Script$KernelID var2, Type var3, Object[] var4, Map var5) {
      super(0L, var1);
      this.mArgs = var4;
      this.mReturnValue = Allocation.createTyped(var1, var3);
      this.mBindings = var5;
      this.mGlobalFuture = new HashMap();
      int var6 = var4.length + var5.size();
      long[] var10 = new long[var6];
      long[] var7 = new long[var6];
      int[] var13 = new int[var6];
      long[] var8 = new long[var6];
      long[] var9 = new long[var6];

      for(var6 = 0; var6 < var4.length; ++var6) {
         var10[var6] = 0L;
         this.retrieveValueAndDependenceInfo(var1, var6, (Script$FieldID)null, var4[var6], var7, var13, var8, var9);
      }

      for(Iterator var15 = var5.entrySet().iterator(); var15.hasNext(); ++var6) {
         Entry var11 = (Entry)var15.next();
         Object var14 = var11.getValue();
         Script$FieldID var12 = (Script$FieldID)var11.getKey();
         var10[var6] = var12.getID(var1);
         this.retrieveValueAndDependenceInfo(var1, var6, var12, var14, var7, var13, var8, var9);
      }

      this.setID(var1.nClosureCreate(var2.getID(var1), this.mReturnValue.getID(var1), var10, var7, var13, var8, var9));
   }

   private void retrieveValueAndDependenceInfo(RenderScript var1, int var2, Script$FieldID var3, Object var4, long[] var5, int[] var6, long[] var7, long[] var8) {
      if (var4 instanceof ScriptGroup$Future) {
         ScriptGroup$Future var11 = (ScriptGroup$Future)var4;
         var4 = var11.getValue();
         var7[var2] = var11.getClosure().getID(var1);
         Script$FieldID var14 = var11.getFieldID();
         long var9;
         if (var14 != null) {
            var9 = var14.getID(var1);
         } else {
            var9 = 0L;
         }

         var8[var2] = var9;
      } else {
         var7[var2] = 0L;
         var8[var2] = 0L;
      }

      if (var4 instanceof ScriptGroup$Input) {
         ScriptGroup$Input var13 = (ScriptGroup$Input)var4;
         if (var2 < this.mArgs.length) {
            var13.addReference(this, var2);
         } else {
            var13.addReference(this, var3);
         }

         var5[var2] = 0L;
         var6[var2] = 0;
      } else {
         ScriptGroup$Closure$ValueAndSize var12 = new ScriptGroup$Closure$ValueAndSize(var1, var4);
         var5[var2] = var12.value;
         var6[var2] = var12.size;
      }
   }

   public ScriptGroup$Future getGlobal(Script$FieldID var1) {
      ScriptGroup$Future var2 = (ScriptGroup$Future)this.mGlobalFuture.get(var1);
      ScriptGroup$Future var4;
      if (var2 == null) {
         Object var3 = this.mBindings.get(var1);
         Object var5 = var3;
         if (var3 instanceof ScriptGroup$Future) {
            var5 = ((ScriptGroup$Future)var3).getValue();
         }

         var2 = new ScriptGroup$Future(this, var1, var5);
         this.mGlobalFuture.put(var1, var2);
         var4 = var2;
      } else {
         var4 = var2;
      }

      return var4;
   }

   public ScriptGroup$Future getReturn() {
      if (this.mReturnFuture == null) {
         this.mReturnFuture = new ScriptGroup$Future(this, (Script$FieldID)null, this.mReturnValue);
      }

      return this.mReturnFuture;
   }

   public void setArg(int var1, Object var2) {
      Object var3 = var2;
      if (var2 instanceof ScriptGroup$Future) {
         var3 = ((ScriptGroup$Future)var2).getValue();
      }

      this.mArgs[var1] = var3;
      ScriptGroup$Closure$ValueAndSize var5 = new ScriptGroup$Closure$ValueAndSize(this.mRS, var3);
      RenderScript var4 = this.mRS;
      var4.nClosureSetArg(this.getID(var4), var1, var5.value, var5.size);
   }

   public void setGlobal(Script$FieldID var1, Object var2) {
      Object var3 = var2;
      if (var2 instanceof ScriptGroup$Future) {
         var3 = ((ScriptGroup$Future)var2).getValue();
      }

      this.mBindings.put(var1, var3);
      ScriptGroup$Closure$ValueAndSize var5 = new ScriptGroup$Closure$ValueAndSize(this.mRS, var3);
      RenderScript var4 = this.mRS;
      var4.nClosureSetGlobal(this.getID(var4), var1.getID(this.mRS), var5.value, var5.size);
   }
}
