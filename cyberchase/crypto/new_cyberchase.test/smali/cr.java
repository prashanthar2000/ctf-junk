class cr extends cv {
	 /* # direct methods */
	 cr ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcv;-><init>()V */
		 return;
	 } // .end method
	 private static java.io.File a ( android.os.ParcelFileDescriptor p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "/proc/self/fd/"; // const-string v2, "/proc/self/fd/"
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 p0 = 			 (( android.os.ParcelFileDescriptor ) p0 ).getFd ( ); // invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFd()I
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.system.Os .readlink ( p0 );
			 android.system.Os .stat ( p0 );
			 /* iget v1, v1, Landroid/system/StructStat;->st_mode:I */
			 v1 = 			 android.system.OsConstants .S_ISREG ( v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* new-instance v1, Ljava/io/File; */
				 /* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
				 /* :try_end_0 */
				 /* .catch Landroid/system/ErrnoException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
			 } // :cond_0
		 } // .end method
		 /* # virtual methods */
		 public android.graphics.Typeface a ( android.content.Context p0, dg$b[] p1, Integer p2 ) {
			 /* .locals 3 */
			 /* array-length v0, p2 */
			 int v1 = 0; // const/4 v1, 0x0
			 /* if-gtz v0, :cond_0 */
		 } // :cond_0
		 (( cr ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcr;->a([Ldg$b;I)Ldg$b;
		 (( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
		 try { // :try_start_0
			 p2 = this.a;
			 final String v0 = "r"; // const-string v0, "r"
			 (( android.content.ContentResolver ) p3 ).openFileDescriptor ( p2, v0, v1 ); // invoke-virtual {p3, p2, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_4 */
			 try { // :try_start_1
				 cr .a ( p2 );
				 if ( p3 != null) { // if-eqz p3, :cond_3
					 v0 = 					 (( java.io.File ) p3 ).canRead ( ); // invoke-virtual {p3}, Ljava/io/File;->canRead()Z
					 /* if-nez v0, :cond_1 */
				 } // :cond_1
				 android.graphics.Typeface .createFromFile ( p3 );
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_2 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
				 if ( p2 != null) { // if-eqz p2, :cond_2
					 try { // :try_start_2
						 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
						 /* :try_end_2 */
						 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_4 */
					 } // :cond_2
				 } // :cond_3
			 } // :goto_0
			 try { // :try_start_3
				 /* new-instance p3, Ljava/io/FileInputStream; */
				 (( android.os.ParcelFileDescriptor ) p2 ).getFileDescriptor ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
				 /* invoke-direct {p3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V */
				 /* :try_end_3 */
				 /* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_2 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
				 try { // :try_start_4
					 cv .a ( p1,p3 );
					 /* :try_end_4 */
					 /* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
					 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
					 try { // :try_start_5
						 (( java.io.FileInputStream ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
						 /* :try_end_5 */
						 /* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_2 */
						 /* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
						 if ( p2 != null) { // if-eqz p2, :cond_4
							 try { // :try_start_6
								 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
								 /* :try_end_6 */
								 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_4 */
							 } // :cond_4
							 /* :catchall_0 */
							 /* move-exception p1 */
							 /* move-object v0, v1 */
							 /* :catch_0 */
							 /* move-exception p1 */
							 try { // :try_start_7
								 /* throw p1 */
								 /* :try_end_7 */
								 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
								 /* :catchall_1 */
								 /* move-exception v0 */
								 /* move-object v2, v0 */
								 /* move-object v0, p1 */
								 /* move-object p1, v2 */
							 } // :goto_1
							 if ( v0 != null) { // if-eqz v0, :cond_5
								 try { // :try_start_8
									 (( java.io.FileInputStream ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
									 /* :try_end_8 */
									 /* .catch Ljava/lang/Throwable; {:try_start_8 ..:try_end_8} :catch_1 */
									 /* .catchall {:try_start_8 ..:try_end_8} :catchall_2 */
									 /* :catch_1 */
									 /* move-exception p3 */
									 try { // :try_start_9
										 (( java.lang.Throwable ) v0 ).addSuppressed ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
									 } // :cond_5
									 (( java.io.FileInputStream ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
								 } // :goto_2
								 /* throw p1 */
								 /* :try_end_9 */
								 /* .catch Ljava/lang/Throwable; {:try_start_9 ..:try_end_9} :catch_2 */
								 /* .catchall {:try_start_9 ..:try_end_9} :catchall_2 */
								 /* :catchall_2 */
								 /* move-exception p1 */
								 /* move-object p3, v1 */
								 /* :catch_2 */
								 /* move-exception p1 */
								 try { // :try_start_a
									 /* throw p1 */
									 /* :try_end_a */
									 /* .catchall {:try_start_a ..:try_end_a} :catchall_3 */
									 /* :catchall_3 */
									 /* move-exception p3 */
									 /* move-object v2, p3 */
									 /* move-object p3, p1 */
									 /* move-object p1, v2 */
								 } // :goto_3
								 if ( p2 != null) { // if-eqz p2, :cond_7
									 if ( p3 != null) { // if-eqz p3, :cond_6
										 try { // :try_start_b
											 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
											 /* :try_end_b */
											 /* .catch Ljava/lang/Throwable; {:try_start_b ..:try_end_b} :catch_3 */
											 /* .catch Ljava/io/IOException; {:try_start_b ..:try_end_b} :catch_4 */
											 /* :catch_3 */
											 /* move-exception p2 */
											 try { // :try_start_c
												 (( java.lang.Throwable ) p3 ).addSuppressed ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
											 } // :cond_6
											 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
										 } // :cond_7
									 } // :goto_4
									 /* throw p1 */
									 /* :try_end_c */
									 /* .catch Ljava/io/IOException; {:try_start_c ..:try_end_c} :catch_4 */
									 /* :catch_4 */
								 } // .end method
