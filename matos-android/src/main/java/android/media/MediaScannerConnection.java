package android.media;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class MediaScannerConnection
  implements android.content.ServiceConnection
{
  // Classes

  public static interface OnScanCompletedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScanCompleted")
    public void onScanCompleted(java.lang.String arg1, android.net.Uri arg2);
  }
  public static interface MediaScannerConnectionClient
    extends MediaScannerConnection.OnScanCompletedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScan")
    public void onScanCompleted(java.lang.String arg1, android.net.Uri arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onScan")
    public void onMediaScannerConnected();
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MediaScannerConnection(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onScan") MediaScannerConnection.MediaScannerConnectionClient arg2){
  }
  // Methods

  public void connect(){
  }
  public synchronized boolean isConnected(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onServiceConnected(android.content.ComponentName arg1, android.os.IBinder arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onServiceDisconnected(android.content.ComponentName arg1){
  }
  public void disconnect(){
  }
  public void scanFile(java.lang.String arg1, java.lang.String arg2){
  }
  public static void scanFile(android.content.Context arg1, java.lang.String [] arg2, java.lang.String [] arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onScanCompleted") MediaScannerConnection.OnScanCompletedListener arg4){
  }
}
