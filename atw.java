import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

public final class atw implements Creator {
   private final int a;

   public atw(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object createFromParcel(Parcel var1) {
      int var3 = this.a;
      boolean var6 = false;
      int var2 = 0;
      ArrayList var9 = null;
      Object var10 = null;
      int var4;
      long var7;
      Object var11;
      Object var14;
      String var19;
      String var27;
      switch(var3) {
      case 0:
         var1.getClass();
         return new atx(var1.readFloat());
      case 1:
         var1.getClass();
         return new akc(var1.readInt());
      case 2:
         var1.getClass();
         return new aty(var1.readInt());
      case 3:
         var1.getClass();
         return new atz(var1.readLong());
      case 4:
         return new cip(var1);
      case 5:
         return new cpe(var1);
      case 6:
         return new cph(var1);
      case 7:
         return new cpk(var1);
      case 8:
         return new cpn(var1);
      case 9:
         return new cqb(var1);
      case 10:
         return new cqm(var1);
      case 11:
         return new cqo(var1);
      case 12:
         return new diu(var1);
      case 13:
         return new dre(var1);
      case 14:
         var7 = var1.readLong();
         jfv var26 = (jfv)var1.readParcelable(foj.class.getClassLoader());
         oyz var22 = oyz.k(var1.readArrayList(Long.class.getClassLoader()));
         var27 = var1.readString();
         String var28 = var1.readString();
         Instant var32 = (Instant)var1.readSerializable();
         Instant var24 = (Instant)var1.readSerializable();
         Uri var30 = (Uri)var1.readParcelable(foj.class.getClassLoader());
         var2 = var1.readInt();
         mhs var23 = (mhs)var1.readSerializable();
         if (var2 == 1) {
            var6 = true;
         } else {
            var6 = false;
         }

         return new fnx(var7, var26, var22, var27, var28, var32, var24, var30, var6, var23, var1.readInt());
      case 15:
         return new jfu(var1.readInt());
      case 16:
         var3 = mzx.cK(var1);
         String var18 = null;
         String var33 = null;
         var19 = var33;
         String var21 = var33;
         var11 = var33;
         String var25 = var33;
         var27 = var33;
         var14 = var33;
         String var29 = var33;
         String var31 = var33;
         var7 = 0L;
         var2 = 0;

         while(var1.dataPosition() < var3) {
            var4 = var1.readInt();
            switch(mzx.cG(var4)) {
            case 1:
               var2 = mzx.cI(var1, var4);
               break;
            case 2:
               var18 = mzx.cP(var1, var4);
               break;
            case 3:
               var33 = mzx.cP(var1, var4);
               break;
            case 4:
               var19 = mzx.cP(var1, var4);
               break;
            case 5:
               var21 = mzx.cP(var1, var4);
               break;
            case 6:
               var11 = (Uri)mzx.cO(var1, var4, Uri.CREATOR);
               break;
            case 7:
               var25 = mzx.cP(var1, var4);
               break;
            case 8:
               var7 = mzx.cL(var1, var4);
               break;
            case 9:
               var27 = mzx.cP(var1, var4);
               break;
            case 10:
               var14 = mzx.cS(var1, var4, Scope.CREATOR);
               break;
            case 11:
               var29 = mzx.cP(var1, var4);
               break;
            case 12:
               var31 = mzx.cP(var1, var4);
               break;
            default:
               mzx.cV(var1, var4);
            }
         }

         mzx.cT(var1, var3);
         return new GoogleSignInAccount(var2, var18, var33, var19, var21, (Uri)var11, var25, var7, var27, (List)var14, var29, var31);
      case 17:
         var3 = mzx.cK(var1);
         ljo var17 = null;
         byte[] var16 = null;
         Object var20 = var16;
         var10 = var16;
         var11 = var16;
         Object var12 = var16;
         Object var13 = var16;
         var14 = var16;
         Object var15 = var16;
         var6 = true;
         var2 = 0;

         while(var1.dataPosition() < var3) {
            var4 = var1.readInt();
            switch(mzx.cG(var4)) {
            case 2:
               var17 = (ljo)mzx.cO(var1, var4, ljo.CREATOR);
               break;
            case 3:
               var16 = mzx.cX(var1, var4);
               break;
            case 4:
               var20 = mzx.cY(var1, var4);
               break;
            case 5:
               var10 = mzx.da(var1, var4);
               break;
            case 6:
               var11 = mzx.cY(var1, var4);
               break;
            case 7:
               var12 = mzx.db(var1, var4);
               break;
            case 8:
               var6 = mzx.cW(var1, var4);
               break;
            case 9:
               var13 = (luq[])mzx.cZ(var1, var4, luq.CREATOR);
               break;
            case 10:
            default:
               mzx.cV(var1, var4);
               break;
            case 11:
               var14 = (ljn)mzx.cO(var1, var4, ljn.CREATOR);
               break;
            case 12:
               var15 = mzx.da(var1, var4);
               break;
            case 13:
               var2 = mzx.cI(var1, var4);
            }
         }

         mzx.cT(var1, var3);
         return new ljb(var17, var16, (int[])var20, (String[])var10, (int[])var11, (byte[][])var12, var6, (luq[])var13, (ljn)var14, (String[])var15, var2);
      case 18:
         var3 = mzx.cK(var1);

         while(var1.dataPosition() < var3) {
            var2 = var1.readInt();
            switch(mzx.cG(var2)) {
            case 1:
               var9 = mzx.cS(var1, var2, ljl.CREATOR);
               break;
            default:
               mzx.cV(var1, var2);
            }
         }

         mzx.cT(var1, var3);
         return new ljd(var9);
      case 19:
         var4 = mzx.cK(var1);
         var3 = 0;
         var19 = (String)var10;

         while(var1.dataPosition() < var4) {
            int var5 = var1.readInt();
            switch(mzx.cG(var5)) {
            case 1:
               var19 = mzx.cP(var1, var5);
               break;
            case 2:
               var2 = mzx.cI(var1, var5);
               break;
            case 3:
               var3 = mzx.cI(var1, var5);
               break;
            default:
               mzx.cV(var1, var5);
            }
         }

         mzx.cT(var1, var4);
         return new ljl(var19, var2, var3);
      default:
         var2 = mzx.cK(var1);

         while(var1.dataPosition() < var2) {
            var3 = var1.readInt();
            switch(mzx.cG(var3)) {
            case 1:
               var6 = mzx.cW(var1, var3);
               break;
            default:
               mzx.cV(var1, var3);
            }
         }

         mzx.cT(var1, var2);
         return new ljn(var6);
      }
   }

   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      switch(this.a) {
      case 0:
         return new atx[var1];
      case 1:
         return new akc[var1];
      case 2:
         return new aty[var1];
      case 3:
         return new atz[var1];
      case 4:
         return new cip[var1];
      case 5:
         return new cpe[var1];
      case 6:
         return new cph[var1];
      case 7:
         return new cpk[var1];
      case 8:
         return new cpn[var1];
      case 9:
         return new cqb[var1];
      case 10:
         return new cqm[var1];
      case 11:
         return new cqo[var1];
      case 12:
         return new diu[var1];
      case 13:
         return new dre[var1];
      case 14:
         return new fnx[var1];
      case 15:
         return new jfu[var1];
      case 16:
         return new GoogleSignInAccount[var1];
      case 17:
         return new ljb[var1];
      case 18:
         return new ljd[var1];
      case 19:
         return new ljl[var1];
      default:
         return new ljn[var1];
      }
   }
}
