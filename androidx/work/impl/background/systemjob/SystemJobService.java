package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements .dar {
   private static final String a = .dae.b("SystemJobService");
   private .dbu b;
   private final Map c = new HashMap();
   private .ebt d;
   private final .ebt e = new .ebt((int[])null);

   private static .deq b(JobParameters param0) {
      // $FF: Couldn't be decompiled
   }

   public final void a(.deq param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onCreate() {
      super.onCreate();

      try {
         .dbu var1 = .dbu.d(this.getApplicationContext());
         this.b = var1;
         .dbe var2 = var1.e;
         .ebt var3 = new .ebt(var2, var1.j);
         this.d = var3;
         var2.b(this);
      } catch (IllegalStateException var4) {
         if (Application.class.equals(this.getApplication().getClass())) {
            .dae.a();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
         } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
         }
      }
   }

   public final void onDestroy() {
      super.onDestroy();
      .dbu var1 = this.b;
      if (var1 != null) {
         var1.e.c(this);
      }

   }

   public final boolean onStartJob(JobParameters var1) {
      if (this.b == null) {
         .dae.a();
         this.jobFinished(var1, true);
         return false;
      } else {
         .deq var3 = b(var1);
         if (var3 == null) {
            .dae.a();
            Log.e(a, "WorkSpec id not found!");
            return false;
         } else {
            Map var2 = this.c;
            synchronized(var2){}

            Throwable var10000;
            boolean var10001;
            label201: {
               try {
                  if (this.c.containsKey(var3)) {
                     .dae.a();
                     StringBuilder var18 = new StringBuilder();
                     var18.append("Job is already being executed by SystemJobService: ");
                     var18.append(var3);
                     return false;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label201;
               }

               try {
                  .dae.a();
                  StringBuilder var4 = new StringBuilder();
                  var4.append("onStartJob for ");
                  var4.append(var3);
                  this.c.put(var3, var1);
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label201;
               }

               .ccb var19 = new .ccb();
               if (.dco.a(var1) != null) {
                  Arrays.asList(.dco.a(var1));
               }

               if (.dco.b(var1) != null) {
                  Arrays.asList(.dco.b(var1));
               }

               .dcp.a(var1);
               this.d.A(this.e.C(var3), var19);
               return true;
            }

            while(true) {
               Throwable var17 = var10000;

               try {
                  throw var17;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  continue;
               }
            }
         }
      }
   }

   public final boolean onStopJob(JobParameters param1) {
      // $FF: Couldn't be decompiled
   }
}
