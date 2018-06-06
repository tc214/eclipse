/*******************************************************************************
 * Copyright (c) 2007, 2015 Wind River Systems, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Michael Scharf (Wind River) - initial API and implementation
 * Anton Leherbauer (Wind River) - [294468] Fix scroller and text line rendering
 * Martin Oberhuber (Wind River) - [265352][api] Allow setting fonts programmatically
 *******************************************************************************/
package org.eclipse.tm.internal.terminal.textcanvas;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;

/**
 *
 */
public interface ILinelRenderer {
	int getCellWidth();
	int getCellHeight();
	void drawLine(ITextCanvasModel model, GC gc, int line, int x, int y, int colFirst, int colLast);
	/**
	 * Update for a font change from the global JFace Registry.
	 */
	void onFontChange();
	/**
	 * Set a new font
	 * @param fontName Jface name of the new font
	 * @since 3.2
	 */
	void updateFont(String fontName);
	void setInvertedColors(boolean invert);
	Color getDefaultBackgroundColor();
}
