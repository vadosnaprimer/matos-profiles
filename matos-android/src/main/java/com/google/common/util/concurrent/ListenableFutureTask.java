package com.google.common.util.concurrent;

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


public class ListenableFutureTask<V>
  extends java.util.concurrent.FutureTask<V>  implements ListenableFuture<V>
{
  // Constructors

  public ListenableFutureTask(java.util.concurrent.Callable<V> arg1){
    super((java.util.concurrent.Callable) null);
  }
  public ListenableFutureTask(java.lang.Runnable arg1, V arg2){
    super((java.util.concurrent.Callable) null);
  }
  // Methods

  protected void done(){
  }
  public void addListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, java.util.concurrent.Executor arg2){
  }
}
