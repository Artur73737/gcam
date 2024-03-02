import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $FF: synthetic class
public final class cmw implements crw {
   public final cmx a;

   // $FF: synthetic method
   public cmw(cmx var1) {
      this.a = var1;
   }

   public final Bundle a() {
      cmx var5 = this.a;
      Map var4 = var5.c;
      Object var12;
      switch(var4.size()) {
      case 0:
         var12 = qtg.a;
         break;
      case 1:
         Entry var11 = (Entry)var4.entrySet().iterator().next();
         var12 = Collections.singletonMap(var11.getKey(), var11.getValue());
         var12.getClass();
         break;
      default:
         var12 = pwm.ag(var4);
      }

      Iterator var6 = ((Map)var12).entrySet().iterator();

      label147:
      while(true) {
         boolean var3 = var6.hasNext();
         cml var15 = null;
         byte var2 = 0;
         int var1 = 0;
         Bundle var20;
         Object var30;
         if (!var3) {
            Set var23 = var5.b.keySet();
            ArrayList var16 = new ArrayList(var23.size());
            ArrayList var24 = new ArrayList(var16.size());
            Iterator var27 = var23.iterator();

            String var25;
            while(var27.hasNext()) {
               var25 = (String)var27.next();
               var16.add(var25);
               var24.add(var5.b.get(var25));
            }

            qsg var17 = pwm.bq("keys", var16);
            qsg var28 = pwm.bq("values", var24);
            var20 = new Bundle(2);

            for(var1 = var2; var1 < 2; ++var1) {
               qsg var13 = (new qsg[]{var17, var28})[var1];
               String var26 = (String)var13.a;
               var30 = var13.b;
               if (var30 == null) {
                  var20.putString(var26, (String)null);
               } else if (var30 instanceof Boolean) {
                  var20.putBoolean(var26, (Boolean)var30);
               } else if (var30 instanceof Byte) {
                  var20.putByte(var26, ((Number)var30).byteValue());
               } else if (var30 instanceof Character) {
                  var20.putChar(var26, (Character)var30);
               } else if (var30 instanceof Double) {
                  var20.putDouble(var26, ((Number)var30).doubleValue());
               } else if (var30 instanceof Float) {
                  var20.putFloat(var26, ((Number)var30).floatValue());
               } else if (var30 instanceof Integer) {
                  var20.putInt(var26, ((Number)var30).intValue());
               } else if (var30 instanceof Long) {
                  var20.putLong(var26, ((Number)var30).longValue());
               } else if (var30 instanceof Short) {
                  var20.putShort(var26, ((Number)var30).shortValue());
               } else if (var30 instanceof Bundle) {
                  var20.putBundle(var26, (Bundle)var30);
               } else if (var30 instanceof CharSequence) {
                  var20.putCharSequence(var26, (CharSequence)var30);
               } else if (var30 instanceof Parcelable) {
                  var20.putParcelable(var26, (Parcelable)var30);
               } else if (var30 instanceof boolean[]) {
                  var20.putBooleanArray(var26, (boolean[])var30);
               } else if (var30 instanceof byte[]) {
                  var20.putByteArray(var26, (byte[])var30);
               } else if (var30 instanceof char[]) {
                  var20.putCharArray(var26, (char[])var30);
               } else if (var30 instanceof double[]) {
                  var20.putDoubleArray(var26, (double[])var30);
               } else if (var30 instanceof float[]) {
                  var20.putFloatArray(var26, (float[])var30);
               } else if (var30 instanceof int[]) {
                  var20.putIntArray(var26, (int[])var30);
               } else if (var30 instanceof long[]) {
                  var20.putLongArray(var26, (long[])var30);
               } else if (var30 instanceof short[]) {
                  var20.putShortArray(var26, (short[])var30);
               } else {
                  var3 = var30 instanceof Object[];
                  String var14 = TRoaEYDrhZZT.bXdPnjFQbFSQR;
                  if (var3) {
                     Class var31 = var30.getClass().getComponentType();
                     var31.getClass();
                     if (Parcelable.class.isAssignableFrom(var31)) {
                        var20.putParcelableArray(var26, (Parcelable[])var30);
                     } else if (String.class.isAssignableFrom(var31)) {
                        var20.putStringArray(var26, (String[])var30);
                     } else if (CharSequence.class.isAssignableFrom(var31)) {
                        var20.putCharSequenceArray(var26, (CharSequence[])var30);
                     } else {
                        if (!Serializable.class.isAssignableFrom(var31)) {
                           String var19 = var31.getCanonicalName();
                           StringBuilder var29 = new StringBuilder();
                           var29.append("Illegal value array type ");
                           var29.append(var19);
                           var29.append(var14);
                           var29.append(var26);
                           var29.append('"');
                           throw new IllegalArgumentException(var29.toString());
                        }

                        var20.putSerializable(var26, (Serializable)var30);
                     }
                  } else if (var30 instanceof Serializable) {
                     var20.putSerializable(var26, (Serializable)var30);
                  } else if (var30 instanceof IBinder) {
                     cea.a(var20, var26, (IBinder)var30);
                  } else if (var30 instanceof Size) {
                     ceb.a(var20, var26, (Size)var30);
                  } else {
                     if (!(var30 instanceof SizeF)) {
                        var25 = var30.getClass().getCanonicalName();
                        StringBuilder var22 = new StringBuilder();
                        var22.append("Illegal value type ");
                        var22.append(var25);
                        var22.append(var14);
                        var22.append(var26);
                        var22.append('"');
                        throw new IllegalArgumentException(var22.toString());
                     }

                     ceb.b(var20, var26, (SizeF)var30);
                  }
               }
            }

            return var20;
         }

         Entry var7 = (Entry)var6.next();
         String var8 = (String)var7.getKey();
         var20 = ((crw)var7.getValue()).a();
         var8.getClass();

         for(Class[] var10 = cmx.a; var1 < 29; ++var1) {
            Class var9 = var10[var1];
            var9.getClass();
            if (var9.isInstance(var20)) {
               var30 = var5.d.get(var8);
               if (var30 instanceof cml) {
                  var15 = (cml)var30;
               }

               if (var15 != null) {
                  var15.h(var20);
               } else {
                  var5.b.put(var8, var20);
               }

               rga var18 = (rga)var5.e.get(var8);
               if (var18 != null) {
                  var18.d(var20);
               }
               continue label147;
            }
         }

         StringBuilder var21 = new StringBuilder();
         var21.append("Can't put value with type ");
         var21.append(var20.getClass());
         var21.append(" into saved state");
         throw new IllegalArgumentException(var21.toString());
      }
   }
}
