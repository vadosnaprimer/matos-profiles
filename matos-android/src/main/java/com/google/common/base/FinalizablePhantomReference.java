package com.google.common.base;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.FinalizablePhantomReferenceImplem", superClass = "")
public abstract class FinalizablePhantomReference<T>
  extends java.lang.ref.PhantomReference<T>  implements FinalizableReference
{
  // Constructors

  protected FinalizablePhantomReference(T arg1, FinalizableReferenceQueue arg2){
    super((T) null, (java.lang.ref.ReferenceQueue) null);
  }
}
