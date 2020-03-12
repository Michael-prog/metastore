/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
 */
package test.java.org.pentaho.metastore.test.testclasses.my;


import org.pentaho.metastore.persist.MetaStoreAttribute;
import org.pentaho.metastore.persist.MetaStoreElementType;

@MetaStoreElementType(
    name = "ParentElement",
    description = "ParentElement" )
public class ParentElement {

  @MetaStoreAttribute
  private String name;

  @MetaStoreAttribute
  private ChildElement childElement;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public ChildElement getChildElement() {
    return childElement;
  }

  public void setChildElement( ChildElement childElement ) {
    this.childElement = childElement;
  }
}
