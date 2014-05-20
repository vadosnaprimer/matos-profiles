package org.w3c.dom;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr226.NodeImplem")
public interface Node{
// Fields
// Methods
    public abstract String getNamespaceURI();
    public abstract String getLocalName();
    public abstract org.w3c.dom.Node getParentNode();
    public abstract org.w3c.dom.Node appendChild(org.w3c.dom.Node arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.Node removeChild(org.w3c.dom.Node arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2)
		throws org.w3c.dom.DOMException;
}
