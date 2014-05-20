package com.siemens.mp.color_game;

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
public abstract class GameCanvas extends javax.microedition.lcdui.Canvas {
    public static final int UP_PRESSED=0;
    public static final int DOWN_PRESSED=1;
    public static final int LEFT_PRESSED=2;
    public static final int RIGHT_PRESSED=3;
    public static final int FIRE_PRESSED=4;
    public static final int GAME_A_PRESSED=5;
    public static final int GAME_B_PRESSED=6;
    public static final int GAME_C_PRESSED=7;
    public static final int GAME_D_PRESSED=8;
    protected GameCanvas(boolean b) {};
    protected javax.microedition.lcdui.Graphics getGraphics() { return null; };
    public void flushGraphics(){};
    public void flushGraphics(int a, int a1, int a2, int a3){};
    public int getKeyStates(){ return 0;};
    public void paint(javax.microedition.lcdui.Graphics a){};
}
