package org.apache.xpath.axes;

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


public interface ContextNodeList
{
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public int size();
  public void reset();
  public org.w3c.dom.Node getCurrentNode();
  public int getCurrentPos();
  public void setShouldCacheNodes(boolean arg1);
  public void setCurrentPos(int arg1);
  public boolean isFresh();
  public org.w3c.dom.traversal.NodeIterator cloneWithReset() throws java.lang.CloneNotSupportedException;
  public void runTo(int arg1);
  public int getLast();
  public void setLast(int arg1);
}
