/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
    // ------------ START EDITING HERE ----------------------
        int x = 0
        int y = 0

    def left (){ x-=1 }
    def right (){ x+=1 }
    def up (){ y+=1 }
    def down (){ y-=1 }

    def invokeMethod (String name, Object args) {
        name.findAll(/Right/){x=x+1}
        name.findAll(/Left/){x=x-1}
        name.findAll(/Up/){y=y+1}
        name.findAll(/Down/){y=y-1}
    }

    // ------------ STOP EDITING HERE  ----------------------
}
