/*
 * Copyright 2006 JBoss Inc
 * 
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
 */

package org.drools;

import java.util.HashMap;
import java.util.Map;

/**
 * @author etirelli
 *
 */
public class Order {

    private int number;
    
    private Map items;

    public Order() {
        this( 0 );
    }

    public Order(final int number) {
        this.number = number;
        this.items = new HashMap();
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(final int number) {
        this.number = number;
    }
    
    public Map getItems() {
        return this.items;
    }
    
    public void addItem( OrderItem item ) {
        this.items.put( new Integer( item.getSeq() ), item );
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.number;
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object obj) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final Order other = (Order) obj;
        if ( this.number != other.number ) {
            return false;
        }
        return true;
    }

}
