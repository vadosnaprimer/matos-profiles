package java.security;

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
public final class AllPermission
  extends Permission{
  // Constructors

  public AllPermission(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mActions") java.lang.String arg2){
    super((java.lang.String) null);
  }
  public AllPermission(){
    super((java.lang.String) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mActions")
  public java.lang.String getActions(){
    return (java.lang.String) null;
  }
  public boolean implies(Permission arg1){
    return false;
  }
}
