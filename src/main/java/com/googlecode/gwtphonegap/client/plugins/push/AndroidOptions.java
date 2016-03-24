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
import com.google.gwt.core.client.JsArrayString;

public class AndroidOptions extends JavaScriptObject {
    protected AndroidOptions() {}

    public final native String getSenderId() /*-{
        return this.senderID;
    }-*/;

    /**
     * 
     * @param senderId
     */
    public final native void setSenderId(String senderId) /*-{
        this.senderID = senderId;
    }-*/;

    public final native String getIcon() /*-{
        return this.icon;
    }-*/;

    /**
     * 
     * @param icon
     */
    public final native void setIcon(String icon) /*-{
        this.icon = icon;
    }-*/;

    public final native String getIconColor() /*-{
        return this.iconColor;
    }-*/;

    /**
     * 
     * @param iconColor
     */
    public final native void setIconColor(String iconColor) /*-{
        this.iconColor = iconColor;
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

    public final native boolean isVibrate() /*-{
        return this.vibrate;
    }-*/;

    /**
     * 
     * @param vibrate
     */
    public final native void setVibrate(boolean vibrate) /*-{
        this.vibrate = vibrate;
    }-*/;

    public final native boolean isClearNotifications() /*-{
        return this.clearNotifications;
    }-*/;

    /**
     * 
     * @param clearNotifications
     */
    public final native void setClearNotifications(boolean clearNotifications) /*-{
        this.clearNotifications = clearNotifications;
    }-*/;

    public final native boolean isForceShow() /*-{
        return this.forceShow;
    }-*/;

    /**
     * 
     * @param forceShow
     */
    public final native void setForceShow(boolean forceShow) /*-{
        this.forceShow = forceShow;
    }-*/;

    public final native JsArrayString getTopics() /*-{
        return this.topics;
    }-*/;

    /**
     * 
     * @param topics
     */
    public final native void setTopics(JsArrayString topics) /*-{
        this.topics = topics;
    }-*/;

}
