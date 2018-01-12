/*FreeMind - A Program for creating and viewing Mindmaps
 *Copyright (C) 2000-2006 Joerg Mueller, Daniel Polansky, Christian Foltin, Dimitri Polivaev and others.
 *
 *See COPYING for Details
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/*
 * Created on 17.09.2005
 * Copyright (C) 2005 Dimitri Polivaev
 */
package freemind.view.mindmapview.attributeview;

import java.awt.Dimension;

import javax.swing.JScrollPane;

class AttributeViewScrollPane extends JScrollPane {

	/**
     */
	AttributeViewScrollPane(AttributeTable attributeTable) {
		super(attributeTable);
		setAlignmentX(CENTER_ALIGNMENT);
	}

	public Dimension getPreferredSize() {
		validate();
		return super.getPreferredSize();
	}

	public Dimension getMaximumSize() {
		validate();
		return super.getPreferredSize();
	}

	public boolean isVisible() {
		return getViewport().getView().isVisible();
	}
}
