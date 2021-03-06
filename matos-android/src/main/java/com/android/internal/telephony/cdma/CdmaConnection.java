package com.android.internal.telephony.cdma;

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
public class CdmaConnection
  extends com.android.internal.telephony.Connection{
  // Constructors

  CdmaConnection(android.content.Context arg1, com.android.internal.telephony.DriverCall arg2, CdmaCallTracker arg3, int arg4){
    super();
  }
  CdmaConnection(android.content.Context arg1, java.lang.String arg2, CdmaCallTracker arg3, CdmaCall arg4){
    super();
  }
  CdmaConnection(android.content.Context arg1, CdmaCallWaitingNotification arg2, CdmaCallTracker arg3, CdmaCall arg4){
    super();
  }
  // Methods

  protected void finalize(){
  }
  public java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  public com.android.internal.telephony.Call.State getState(){
    return (com.android.internal.telephony.Call.State) null;
  }
  public void dispose(){
  }
  public void hangup() throws com.android.internal.telephony.CallStateException{
  }
  public CdmaCall getCall(){
    return (CdmaCall) null;
  }
  public long getCreateTime(){
    return 0l;
  }
  public long getConnectTime(){
    return 0l;
  }
  public com.android.internal.telephony.Connection.DisconnectCause getDisconnectCause(){
    return (com.android.internal.telephony.Connection.DisconnectCause) null;
  }
  public boolean isIncoming(){
    return false;
  }
  public long getDisconnectTime(){
    return 0l;
  }
  public long getDurationMillis(){
    return 0l;
  }
  public long getHoldDurationMillis(){
    return 0l;
  }
  public com.android.internal.telephony.Connection.PostDialState getPostDialState(){
    return (com.android.internal.telephony.Connection.PostDialState) null;
  }
  public void proceedAfterWaitChar(){
  }
  public void proceedAfterWildChar(java.lang.String arg1){
  }
  public void cancelPostDial(){
  }
  public java.lang.String getRemainingPostDialString(){
    return (java.lang.String) null;
  }
  public int getNumberPresentation(){
    return 0;
  }
  public com.android.internal.telephony.UUSInfo getUUSInfo(){
    return (com.android.internal.telephony.UUSInfo) null;
  }
  public java.lang.String getCnapName(){
    return (java.lang.String) null;
  }
  public java.lang.String getOrigDialString(){
    return (java.lang.String) null;
  }
  public int getCnapNamePresentation(){
    return 0;
  }
  public void separate() throws com.android.internal.telephony.CallStateException{
  }
  public void updateParent(CdmaCall arg1, CdmaCall arg2){
  }
  public static java.lang.String formatDialString(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
