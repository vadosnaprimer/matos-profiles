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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SecurityCertificateImpl", superClass = "")
public interface Certificate
{
  // Methods

  public java.lang.String toString(boolean arg1);
  public void decode(java.io.InputStream arg1) throws KeyException, java.io.IOException;
  public void encode(java.io.OutputStream arg1) throws KeyException, java.io.IOException;
  public PublicKey getPublicKey();
  public java.lang.String getFormat();
  public Principal getGuarantor();
  public Principal getPrincipal();
}
