package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends .czy {
   public final .czv a(List var1) {
      HashMap var3 = new HashMap();
      LinkedHashMap var2 = new LinkedHashMap();
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         Map var4 = ((.czv)var5.next()).b();
         var4.getClass();
         var2.putAll(var4);
      }

      .cby.j(var2, var3);
      return .cby.i(var3);
   }
}
