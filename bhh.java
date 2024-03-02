import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

public final class bhh {
   public final SparseLongArray a = new SparseLongArray();
   public final SparseBooleanArray b = new SparseBooleanArray();
   private long c;
   private final List d = new ArrayList();
   private int e = -1;
   private int f = -1;

   public final blj a(MotionEvent var1, boa var2) {
      int var8 = var1.getActionMasked();
      if (var8 == 3) {
         this.a.clear();
         this.b.clear();
         return null;
      } else {
         int var6;
         int var7;
         if (var1.getPointerCount() == 1) {
            var7 = var1.getToolType(0);
            var6 = var1.getSource();
            if (var7 != this.e || var6 != this.f) {
               this.e = var7;
               this.f = var6;
               this.b.clear();
               this.a.clear();
            }
         }

         long var14;
         SparseLongArray var26;
         switch(var1.getActionMasked()) {
         case 0:
         case 5:
            var7 = var1.getActionIndex();
            var6 = var1.getPointerId(var7);
            if (this.a.indexOfKey(var6) < 0) {
               var26 = this.a;
               var14 = (long)(this.c++);
               var26.put(var6, var14);
               if (var1.getToolType(var7) == 3) {
                  this.b.put(var6, true);
               }
            }
            break;
         case 9:
            var6 = var1.getPointerId(0);
            if (this.a.indexOfKey(var6) < 0) {
               var26 = this.a;
               var14 = (long)(this.c++);
               var26.put(var6, var14);
            }
         }

         boolean var28;
         if (var8 != 10 && var8 != 7) {
            if (var8 == 9) {
               var8 = 9;
               var28 = true;
            } else {
               var28 = false;
            }
         } else {
            var28 = true;
         }

         if (var28) {
            var7 = var1.getPointerId(var1.getActionIndex());
            this.b.put(var7, true);
         }

         switch(var8) {
         case 1:
            var7 = 0;
            break;
         case 6:
            var7 = var1.getActionIndex();
            break;
         default:
            var7 = -1;
         }

         this.d.clear();
         int var12 = var1.getPointerCount();
         int var9 = 0;

         for(boolean var10 = var28; var9 < var12; ++var9) {
            boolean var24;
            List var27;
            label136: {
               var27 = this.d;
               if (!var10 && var9 != var7) {
                  if (var8 != 8) {
                     var24 = true;
                     break label136;
                  }

                  if (var1.getButtonState() != 0) {
                     var24 = true;
                     break label136;
                  }
               }

               var24 = false;
            }

            var6 = var1.getPointerId(var9);
            int var11 = this.a.indexOfKey(var6);
            if (var11 >= 0) {
               var14 = this.a.valueAt(var11);
            } else {
               var14 = (long)(this.c++);
               this.a.put(var6, var14);
            }

            float var5 = var1.getPressure(var9);
            es.i(var1.getX(var9), var1.getY(var9));
            long var16;
            long var18;
            if (var9 == 0) {
               var16 = es.i(var1.getRawX(), var1.getRawY());
               var18 = var2.c(var16);
            } else {
               var16 = bhi.a.a(var1, var9);
               var18 = var2.c(var16);
            }

            byte var29;
            switch(var1.getToolType(var9)) {
            case 0:
               var29 = 0;
               break;
            case 1:
               var29 = 1;
               break;
            case 2:
               var29 = 3;
               break;
            case 3:
               var29 = 2;
               break;
            case 4:
               var29 = 4;
               break;
            default:
               var29 = 0;
            }

            ArrayList var30 = new ArrayList(var1.getHistorySize());
            int var13 = var1.getHistorySize();

            long var20;
            for(var11 = 0; var11 < var13; ++var11) {
               float var3 = var1.getHistoricalX(var9, var11);
               float var4 = var1.getHistoricalY(var9, var11);
               if (!Float.isInfinite(var3) && !Float.isNaN(var3) && !Float.isInfinite(var4) && !Float.isNaN(var4)) {
                  long var22 = var1.getHistoricalEventTime(var11);
                  if (bio.c()) {
                     var20 = var2.c(es.i(var3, var4));
                  } else {
                     var20 = es.i(var3, var4);
                  }

                  var30.add(new bhg(var22, var20));
               }
            }

            if (var1.getActionMasked() == 8) {
               var20 = es.i(var1.getAxisValue(10), -var1.getAxisValue(9) + 0.0F);
            } else {
               var20 = bci.a;
            }

            boolean var25 = this.b.get(var1.getPointerId(var9), false);
            var27.add(new bhy(var14, var1.getEventTime(), var16, var18, var24, var5, var29, var25, var30, var20));
         }

         switch(var1.getActionMasked()) {
         case 1:
         case 6:
            var6 = var1.getPointerId(var1.getActionIndex());
            if (!this.b.get(var6, false)) {
               this.a.delete(var6);
               this.b.delete(var6);
            }
         }

         if (this.a.size() > var1.getPointerCount()) {
            label124:
            for(var6 = this.a.size() - 1; var6 >= 0; --var6) {
               var9 = this.a.keyAt(var6);
               var8 = var1.getPointerCount();

               for(var7 = 0; var7 < var8; ++var7) {
                  if (var1.getPointerId(var7) == var9) {
                     continue label124;
                  }
               }

               this.a.removeAt(var6);
               this.b.delete(var9);
            }
         }

         var1.getEventTime();
         return new blj(this.d, var1);
      }
   }
}
