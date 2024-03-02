package android.support.v8.renderscript;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ScriptGroup$Input {
   List mArgIndex = new ArrayList();
   List mFieldID = new ArrayList();
   Object mValue;

   public void addReference(ScriptGroup$Closure var1, int var2) {
      this.mArgIndex.add(Pair.create(var1, var2));
   }

   public void addReference(ScriptGroup$Closure var1, Script$FieldID var2) {
      this.mFieldID.add(Pair.create(var1, var2));
   }

   public Object get() {
      return this.mValue;
   }

   public void set(Object var1) {
      this.mValue = var1;
      Iterator var3 = this.mArgIndex.iterator();

      while(var3.hasNext()) {
         Pair var2 = (Pair)var3.next();
         ((ScriptGroup$Closure)var2.first).setArg((Integer)var2.second, var1);
      }

      Iterator var4 = this.mFieldID.iterator();

      while(var4.hasNext()) {
         Pair var5 = (Pair)var4.next();
         ((ScriptGroup$Closure)var5.first).setGlobal((Script$FieldID)var5.second, var1);
      }

   }
}
