package android.app.backup;

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
public class RestoreSession
{
  // Constructors

  RestoreSession(android.content.Context arg1, IRestoreSession arg2){
  }
  // Methods

  public int getAvailableRestoreSets(@com.francetelecom.rd.stubs.annotation.CallBackRegister("restoreObserver") RestoreObserver arg1){
    return 0;
  }
  public int restoreAll(long arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("restoreObserver") RestoreObserver arg2){
    return 0;
  }
  public int restoreSome(long arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("restoreObserver") RestoreObserver arg2, java.lang.String [] arg3){
    return 0;
  }
  public int restorePackage(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("restoreObserver") RestoreObserver arg2){
    return 0;
  }
  public void endRestoreSession(){
  }
}