package android.support.v8.renderscript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ScriptGroup$Builder2 {
   private static final String TAG = "ScriptGroup.Builder2";
   List mClosures;
   List mInputs;
   RenderScript mRS;

   public ScriptGroup$Builder2(RenderScript var1) {
      this.mRS = var1;
      this.mClosures = new ArrayList();
      this.mInputs = new ArrayList();
   }

   private ScriptGroup$Closure addInvokeInternal(Script$InvokeID var1, Object[] var2, Map var3) {
      ScriptGroup$Closure var4 = new ScriptGroup$Closure(this.mRS, var1, var2, var3);
      this.mClosures.add(var4);
      return var4;
   }

   private ScriptGroup$Closure addKernelInternal(Script$KernelID var1, Type var2, Object[] var3, Map var4) {
      ScriptGroup$Closure var5 = new ScriptGroup$Closure(this.mRS, var1, var2, var3, var4);
      this.mClosures.add(var5);
      return var5;
   }

   private boolean seperateArgsAndBindings(Object[] var1, ArrayList var2, Map var3) {
      int var4 = 0;

      int var5;
      while(true) {
         var5 = var4;
         if (var4 >= var1.length) {
            break;
         }

         Object var6 = var1[var4];
         var5 = var4;
         if (var6 instanceof ScriptGroup$Binding) {
            break;
         }

         var2.add(var6);
         ++var4;
      }

      while(var5 < var1.length) {
         Object var7 = var1[var5];
         if (!(var7 instanceof ScriptGroup$Binding)) {
            return false;
         }

         ScriptGroup$Binding var8 = (ScriptGroup$Binding)var7;
         var3.put(var8.getField(), var8.getValue());
         ++var5;
      }

      return true;
   }

   public ScriptGroup$Input addInput() {
      ScriptGroup$Input var1 = new ScriptGroup$Input();
      this.mInputs.add(var1);
      return var1;
   }

   public ScriptGroup$Closure addInvoke(Script$InvokeID var1, Object... var2) {
      ArrayList var4 = new ArrayList();
      HashMap var3 = new HashMap();
      return !this.seperateArgsAndBindings(var2, var4, var3) ? null : this.addInvokeInternal(var1, var4.toArray(), var3);
   }

   public ScriptGroup$Closure addKernel(Script$KernelID var1, Type var2, Object... var3) {
      ArrayList var5 = new ArrayList();
      HashMap var4 = new HashMap();
      return !this.seperateArgsAndBindings(var3, var5, var4) ? null : this.addKernelInternal(var1, var2, var5.toArray(), var4);
   }

   public ScriptGroup create(String var1, ScriptGroup$Future... var2) {
      if (var1 != null && !var1.isEmpty() && var1.length() <= 100 && var1.equals(var1.replaceAll("[^a-zA-Z0-9-]", "_"))) {
         return new ScriptGroup(this.mRS, var1, this.mClosures, this.mInputs, var2);
      } else {
         throw new RSIllegalArgumentException("invalid script group name");
      }
   }
}
