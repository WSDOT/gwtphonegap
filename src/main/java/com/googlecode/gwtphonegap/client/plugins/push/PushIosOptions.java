/*
 * Copyright (c) 2016 Washington State Department of Transportation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package com.googlecode.gwtphonegap.client.plugins.push;

import com.google.gwt.core.client.JavaScriptObject;

public class PushIosOptions extends JavaScriptObject {

    protected PushIosOptions() {
    }

    public final native boolean isAlert() /*-{
        return this.alert;
    }-*/;

    /**
     * 
     * @param alert
     */
    public final native void setAlert(boolean alert) /*-{
        this.alert = alert;
    }-*/;

    public final native boolean isBadge() /*-{
        return this.badge;
    }-*/;

    /**
     * 
     * @param badge
     */
    public final native void setBadge(boolean badge) /*-{
        this.badge = badge;
    }-*/;

    public final native boolean isSound() /*-{
        return this.sound;
    }-*/;

    /**
     * 
     * @param sound
     */
    public final native void setSound(boolean sound) /*-{
        this.sound = sound;
    }-*/;

    public final native boolean isClearBadge() /*-{
        return this.clearBadge;
    }-*/;

    /**
     * 
     * @param clearBadge
     */
    public final native void setClearBadge(boolean clearBadge) /*-{
        this.clearBadge = clearBadge;
    }-*/;

}
