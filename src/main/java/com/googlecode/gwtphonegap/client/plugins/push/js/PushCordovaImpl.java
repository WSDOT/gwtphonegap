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

package com.googlecode.gwtphonegap.client.plugins.push.js;

import com.googlecode.gwtphonegap.client.plugins.push.PushCallback;
import com.googlecode.gwtphonegap.client.plugins.push.Push;
import com.googlecode.gwtphonegap.client.plugins.push.PushOptions;

public class PushCordovaImpl implements Push {

    private boolean initialized;

    @Override
    public void initialize() {
        if (!testForPlugin()) {
            throw new IllegalStateException("cannot find Push plugin - did you include push.js?");
        }
        initialized = true;
    }

    private native boolean testForPlugin() /*-{
        if (!$wnd.push) {
            return false;
        }
        return true;
    }-*/;

    @Override
    public void init(PushOptions options) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Push plugin before using it");
        }
        initNative(options);
    }

    private native void initNative(PushOptions options) /*-{
        $wnd.push.init(options);
    }-*/;

    @Override
    public void on(String event, PushCallback callback) {
        onNative(event, callback);
    }

    private native void onNative(String event, PushCallback callback) /*-{
        var success = function(data) {
            callback.@com.googlecode.gwtphonegap.client.plugins.push.PushCallback::onSuccess(Lcom/googlecode/gwtphonegap/client/plugins/push/PushData;)(data);
        };
        
        $wnd.push.on($entry(event), $entry(success));
    }-*/;

    @Override
    public void off(String event, PushCallback callback) {
        offNative(event, callback);
    }

    private native void offNative(String event, PushCallback callback) /*-{
    }-*/;

}
