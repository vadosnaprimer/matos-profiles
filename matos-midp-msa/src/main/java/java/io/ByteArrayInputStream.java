package java.io;

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
@ClassDone
public class ByteArrayInputStream extends InputStream {
    protected byte[] buf;
    protected int pos;
    protected int mark;
    protected int count;
    public ByteArrayInputStream(byte[] a0){}
    public ByteArrayInputStream(byte[] a0,int a1,int a2){}
    public synchronized int read(){ return 0;}
    public synchronized int read(byte[] a0,int a1,int a2){ return 0;}
    public synchronized long skip(long a0){ return 0L;}
    public synchronized int available(){ return 0;}
    public boolean markSupported(){ return true;}
    public void mark(int a0){ return; }
    public synchronized void reset(){ return; }
    public synchronized void close() throws IOException{ return; }
}

